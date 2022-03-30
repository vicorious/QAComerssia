package com.example.springboot.service;

import com.example.springboot.dto.CustomResponse;
import com.example.springboot.email.EmailBody;
import com.example.springboot.dto.EmailDone;
import com.example.springboot.entity.Comerssia;
import com.example.springboot.entity.ReporteComerssia;
import com.example.springboot.exception.XMLNotBuiltGoodException;
import com.example.springboot.repository.ReporteRepository;
import com.example.springboot.utils.Constantes;
import com.example.springboot.utils.YAMLConfig;
import com.example.springboot.wsdl.ConsumirComerssia;
import com.example.springboot.wsdl.mapping.WmEnvioTransaccionesResponse;
import com.example.springboot.wsdl.requesreportes.DATOS;
import com.example.springboot.wsdl.request.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.springboot.repository.QADRepository;
import org.springframework.web.client.RestTemplate;

import javax.xml.soap.SOAPException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Service
public class QADService
{
    @Autowired
    QADRepository repository;

    @Autowired
    ReporteRepository reporteRepository;

    @Autowired
    YAMLConfig yamlConfig;

    String usuario = Constantes.USUARIO;
    String pass = Constantes.PASSWORD;
    String emailURI = "";

    public QADService() {
        this.yamlConfig = new YAMLConfig();
        this.emailURI = "http://"+(this.yamlConfig.getServerPort() == null ? "localhost" : this.yamlConfig.getServerPort())+":8082/notificaciones/enviarEmailComerssia";

    }

    /**
     *
     * @return Response
     * @throws Exception excepciones del servicio
     */
    public String getQADInfo()  {

        Transaction transaction = new Transaction();
        transaction.setUsuario(this.usuario);
        transaction.setClave(this.pass);

        Encabezado encabezado = new Encabezado();
        encabezado.setENCDescripcion("Traslado Entre Bodega y Punto de Venta");
        encabezado.setGMVCodigo("INV");
        encabezado.setMOVCodigo("TRASBOD");
        encabezado.setMovimiento("Standar");
        encabezado.setUSUCodigo("S100");
        encabezado.setCAJCodigo("ADM0101");
        encabezado.setIDEMP("aaco");
        encabezado.setALMCodigo("ADM01");
        encabezado.setALMNombre("ADMINISTRATIVO");
        encabezado.setMONCodigo("1");
        //Fecha actual
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd");
        encabezado.setENCFechaTrx(DateFor.format(date));
        //Hora actual
        encabezado.setENCHoraTrx(LocalTime.now().toString().split("\\.")[0]);
        encabezado.setENCModo("L-C");
        encabezado.setENCTipoProc("Standar");

        encabezado.setENCTasaConversion("1");

        encabezado.setENCBruto("0");
        encabezado.setENCDescuento("0");
        encabezado.setENCPagNoVenta("0");
        encabezado.setENCVenta("0");
        encabezado.setENCImpuestos("0");
        encabezado.setENCComision("0");
        encabezado.setENCNeto("0");
        encabezado.setENCRecaudo("0");
        encabezado.setENCImpuestoAsumido("0");
        encabezado.setENCPuntos("0");
        encabezado.setENCEstadoLinea("L");
        encabezado.setENCRespuesta("OK");
        encabezado.setENCDescRespuesta("NO APLICA");

        transaction.setEncabezado(encabezado);

        Item item2 = new Item();
        item2.setImprime("False");
        item2.setVisible("True");
        item2.setTipo("Letra");
        item2.setNitem("1");
        item2.setICPPresentacion("Show Room Colina");
        item2.setICPDescripcion("Almacen Destino");
        item2.setICPCadena("S101");
        item2.setICPPresentacion2("SHOW ROOM COLINA");
        item2.setIcpletra("ALMD");

        Item item3 = new Item();
        item3.setImprime("False");
        item3.setVisible("True");
        item3.setTipo("Letra");
        item3.setNitem("2");
        item3.setICPPresentacion("Pruebas Traslado WS");
        item3.setICPDescripcion("Observaciones");
        item3.setICPCadena("Pruebas Traslado WS");
        item3.setIcpletra("OBS");

        Item item4 = new Item();
        item4.setImprime("False");
        item4.setVisible("True");
        item4.setTipo("Letra");
        item4.setNitem("3");
        item4.setICPPresentacion(encabezado.getUSUCodigo());
        item4.setICPDescripcion("Vendedor");
        item4.setICPCadena(encabezado.getUSUCodigo());
        item4.setIcpletra("VEN");

        Detalle detalle = new Detalle();
        List<Object> itemsl = new ArrayList<>();

        List<EmailDone> dones = new ArrayList<EmailDone>();
        EmailBody email = new EmailBody();

        List<Comerssia> resultado = this.repository.getInfoFromQAD();

        System.out.println(resultado.size());

        int i = 4;
        int cantidades = 0;
        String consecutivo = "";

        for(Comerssia custom: resultado)
        {
            EmailDone emailDone =  new EmailDone();
            
            if(i == 4)
            {
                consecutivo = custom.getConsecutivo();
            }

            emailDone.setConsecutivo(consecutivo);
            emailDone.setOrigen(custom.getE_ld_loc());
            emailDone.setDestino(custom.getE_ld_loc());
            emailDone.setTraslado(custom.getPt_article());
            emailDone.setFecha(new Date().toString());
            emailDone.setCantidad(custom.getE_ld_qty_oh());
            emailDone.setSku(custom.getPt_part());
            emailDone.setStatus(custom.getPt_status());
            emailDone.setDescripcion(custom.getPt_desc1());

            dones.add(emailDone);

            cantidades += Integer.parseInt(custom.getCantidad());

            ItemReferencia item1 = new ItemReferencia();

            item1.setImprime("False");
            item1.setVisible("True");
            item1.setTipo("Letra");
            item1.setNitem(i + "");

            item1.setREFCodClasificacion("");
            item1.setREFCodigo1(custom.getPt_part());
            item1.setREFCodigo2(custom.getPt_article());

            item1.setREFNombreCorto(custom.getPt_desc1());
            item1.setREFNombreLargo(custom.getPt_desc2());

            item1.setCARCodigo1("");

            item1.setREFPrecioLista(custom.getPt_domain());
            item1.setIRFBruto(custom.getPt_domain());
            item1.setIRFDescuento("0");
            item1.setIRFPago(custom.getPt_domain());

            item1.setIRFCantidad(custom.getE_ld_qty_oh());

            item1.setIRFValorImpuesto(custom.getPt_status());
            item1.setIRFImpuesto("19");
            try{
                item1.setREFEsCombo(Integer.parseInt(custom.getE_ld_qty_oh()) <= 1 ? "0" : "1");
                item1.setTiporef("combo");
            }catch(Exception e){
                item1.setREFEsCombo("0");
                item1.setTiporef("normal");
            }
            item1.setREFUltimoCosto("0");

            item1.setPRVCodigo(custom.getPt_domain());
            item1.setREFManejaLotes("false");
            item1.setREFCapturaSerial("false");
            item1.setREFFactorConversion("1");

            item1.setREFInventario("");
            item1.setREFEsParaVenta("");

            item1.setEstado("ACTIVO");

            item1.setIRFPagNoVenta("0");
            item1.setIRFVenta("0");
            item1.setIRFValorImpuestoNeto("0");
            item1.setIRFComision("0");
            item1.setIRFNeto("0");
            
            item1.setRREFPuntos("0");

            itemsl.add(item1);
            i++;
        }
        //Total de productos en el encabezado
        encabezado.setENCTotalReferencias(cantidades + "");
        //Consecutivo
        encabezado.setENCConsTrx(consecutivo);

        itemsl.add(item2);
        itemsl.add(item3);
        itemsl.add(item4);

        detalle.setItems(itemsl);
        transaction.setDetalle(detalle);

        ConsumirComerssia comerssia = new ConsumirComerssia();
        try {
            String result = "";
            WmEnvioTransaccionesResponse response = comerssia.envioTransacciones("TR001", transaction);
            for(Object itera : response.getWmEnvioTransaccionesResult().getContent())
            {
                result.concat(itera.toString());
            }
            System.out.print(result);
            this.saveReport(dones);
            this.email(dones);            
            return "OK";

        } catch (JsonProcessingException e) {
            this.failedEmail(dones, "Problemas en el mapeo de los datos desde la base de datos"+e.getMessage());
        } catch (SOAPException e) {
            this.failedEmail(dones, "Problemas al consumir el servicio de comerssia"+ e.getMessage());
        } catch (XMLNotBuiltGoodException e) {
            this.failedEmail(dones, "Problemas al construir el XML:"+ e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAIL";

    }

    /**
     *
     * @throws Exception excepciones
     */
    public void reportes() throws Exception {
        DATOS datos = new DATOS();
        datos.setUSUARIO(this.usuario);
        datos.setCLAVE(this.pass);
        datos.setNOMBRE("nombre de reporte valores específicos");
        datos.setIDEMP("nombre de reporte valores específicos");

        ConsumirComerssia consumirComerssia = new ConsumirComerssia();
        consumirComerssia.reportes(datos);

    }

    /**
     * 
     * @param emailDones
     * @throws Exception
     */
    private void saveReport(List<EmailDone> emailDones) throws Exception
    {        
        for(EmailDone done: emailDones)
        {
            ReporteComerssia reporte = new ReporteComerssia();
            reporte.setR_Bodega_Destino(done.getDestino());
            reporte.setR_Bodega_Origen(done.getOrigen());
            reporte.setR_Fecha(done.getFecha());
            reporte.setR_CD(done.getStatus());
            reporte.setR_sku(done.getSku());
            reporte.setR_Descripcion(done.getDescripcion());
            reporte.setR_CantidadEnviada(done.getCantidad());
            reporte.setR_FechaRegistroEnvio(done.getFecha());

            this.reporteRepository.save(reporte);
        }
        
    }

    /**
     *
     * @param emailDones
     */
    public void email(List<EmailDone> emailDones) throws Exception
    {
        String contenido = "<p>Se informa que el día de hoy %s se ha generado un despacho con los siguientes resultados:"+
        "número de orden de traslado: %s, desde %s, con destino %s, "+
        "con las siguientes características</p>";
        String emails = "carlosjavier.tejerorojas@assaabloy.com,alejandro.lindarte@assaabloy.com";       
        EmailBody emailBody = new EmailBody();
        emailBody.setEmail(emails);
        emailBody.setContent(contenido);
        emailBody.setSubject("Orden de traslado N°: %s Origen: %s    Destino: %s.");
        emailBody.setEmailDoneList(emailDones);
        System.out.print(emailBody.getEmailDoneList());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<EmailBody> request = new HttpEntity<EmailBody>(emailBody, headers);
        RestTemplate template = new RestTemplate();
        template.postForObject(this.emailURI, request, String.class);
    }

    /**
     *
     * @param emailDones
     */
    public void failedEmail(List<EmailDone> emailDones, String contenidoExtra)
    {
        String contenido = "<p>Se informa que el día de hoy %s se ha generado un ERROR (%s) con orden de traslado: %s, desde %s, con destino %s."+
        "con las siguientes características</p>".concat("<p>"+contenidoExtra+"</p>");

        /*String emails = "Sebastian.Trujillo@assaabloy.com,Nelson.Gonzalez@assaabloy.com,Harol.Unriza@assaabloy.com,Oscar.forero@assaabloy.com,carlosjavier.tejerorojas@assaabloy.com,alejandro.lindarte@assaabloy.com";       */
        String emails = "carlosjavier.tejerorojas@assaabloy.com,alejandro.lindarte@assaabloy.com";       
        EmailBody emailBody = new EmailBody();
        emailBody.setEmail(emails);
        emailBody.setContent(contenido);
        emailBody.setSubject("Orden de traslado N°:%s Origen: %s    Destino: %s.");
        emailBody.setEmailDoneList(emailDones);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<EmailBody> request = new HttpEntity<>(emailBody, headers);
        RestTemplate template = new RestTemplate();
        template.postForObject(this.emailURI, request, String.class);
    }    



}