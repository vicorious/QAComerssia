package com.example.springboot.service;

import com.example.springboot.dto.CustomResponse;
import com.example.springboot.utils.Constantes;
import com.example.springboot.wsdl.ConsumirComerssia;
import com.example.springboot.wsdl.requesreportes.DATOS;
import com.example.springboot.wsdl.request.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.springboot.repository.QADRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class QADService
{
    @Autowired
    QADRepository repository;

    String usuario = Constantes.USUARIO;
    String pass = Constantes.PASSWORD;

    public void getQADInfo() throws Exception {
        //List<CustomResponse> resultado = this.repository.getInfoFromQAD();


        //for(CustomResponse custom: resultado)
        //{
        Transaction transaction = new Transaction();
        transaction.setUsuario(this.usuario);
        transaction.setClave(this.pass);

        Encabezado encabezado = new Encabezado();
        encabezado.setENCDescripcion("Entre Bodega y Punto de Venta");
        encabezado.setGMVCodigo("INV");
        encabezado.setMOVCodigo("TRASBOD");
        encabezado.setMovimiento("Standar");
        encabezado.setUSUCodigo("IMPLE");
        encabezado.setCAJCodigo("ADM0101");
        encabezado.setIDEMP("aaco");
        encabezado.setALMCodigo("ADM01");
        encabezado.setALMNombre("ADMINISTRATIVO");
        encabezado.setMONCodigo("1");
        encabezado.setENCFechaTrx("2021/04/23");
        encabezado.setENCHoraTrx("13:28:48");
        encabezado.setENCModo("L-C");
        encabezado.setENCTipoProc("Standar");
        encabezado.setENCConsTrx("3");
        encabezado.setENCTasaConversion("1");
        encabezado.setENCTotalReferencias("2");
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

        Detalle detalle = new Detalle();
        Items items = new Items();
        List<Item> itemsl = new ArrayList<Item>();

        Item item1 = new Item();
        item1.setImprime(Boolean.FALSE);
        item1.setVisible(Boolean.TRUE);
        item1.setTipo("Letra");
        item1.setNitem("1");
        item1.setICPPresentacion("Show Room Colina");
        item1.setICPDescripcion("Almacen Destino");
        item1.setICPCadena("S101");
        item1.setICPPresentacion2("SHOW ROOM COLINA");
        item1.setIcpletra("ALMD");

        Item item2 = new Item();
        item2.setImprime(Boolean.FALSE);
        item2.setVisible(Boolean.TRUE);
        item2.setTipo("Letra");
        item2.setNitem("2");
        item2.setICPPresentacion("Pruebas Traslado WS");
        item2.setICPDescripcion("Observaciones");
        item2.setICPCadena("Pruebas Traslado WS");
        item2.setIcpletra("OBS");

        Item item3 = new Item();
        item3.setImprime(Boolean.FALSE);
        item3.setVisible(Boolean.TRUE);
        item3.setTipo("Letra");
        item3.setNitem("2");
        item3.setICPPresentacion("Pruebas Traslado WS");
        item3.setICPDescripcion("Observaciones");
        item3.setICPCadena("Pruebas Traslado WS");
        item3.setIcpletra("OBS");

        itemsl.add(item1);
        itemsl.add(item2);
        itemsl.add(item3);

        items.setItems(itemsl);

        detalle.setItems(items);

        transaction.setDetalle(detalle);


        ConsumirComerssia comerssia = new ConsumirComerssia();
        comerssia.envioTransacciones("", transaction);
    }

    public void reportes() throws JsonProcessingException {
        DATOS datos = new DATOS();
        datos.setUSUARIO(this.usuario);
        datos.setCLAVE(this.pass);
        datos.setNOMBRE("nombre de reporte valores específicos");
        datos.setIDEMP("nombre de reporte valores específicos");

        ConsumirComerssia consumirComerssia = new ConsumirComerssia();
        consumirComerssia.reportes(datos);

    }



}