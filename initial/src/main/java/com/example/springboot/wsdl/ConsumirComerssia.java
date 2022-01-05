package com.example.springboot.wsdl;

import com.example.springboot.utils.Constantes;
import com.example.springboot.wsdl.mapping.*;

import com.example.springboot.wsdl.requesreportes.DATOS;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import com.example.springboot.wsdl.request.Transaction;

public class ConsumirComerssia extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(ConsumirComerssia.class);

  private String callBack = "http://localhost:8080//servicioqueespererespuesta";

  /**
   * 
   * @param pi_sIdemp
   * @param pi_sEnvio
   * @return
   */
  public WmEnvioTransaccionesResponse envioTransacciones(String pi_sIdemp, Transaction pi_sEnvio) throws Exception
  {
      XmlMapper xmlMapper = new XmlMapper();
      String xml = xmlMapper.writeValueAsString(pi_sEnvio);
      log.info("XML: "+ xml);
      WmEnvioTransacciones envioTransacciones = new WmEnvioTransacciones();
      envioTransacciones.setPiSIdemp(pi_sIdemp);
      envioTransacciones.setPiSEnvio(xml.getBytes());

      WmEnvioTransaccionesResponse response = (WmEnvioTransaccionesResponse) getWebServiceTemplate()
        .marshalSendAndReceive(Constantes.WSDL, envioTransacciones,
            new SoapActionCallback(
                this.callBack));

      return response;

  }

    /**
     *
     * @param datos
     * @return
     * @throws JsonProcessingException
     */
  public WmReporteResponse reportes(DATOS datos) throws JsonProcessingException {
      XmlMapper xmlMapper = new XmlMapper();
      String xml = xmlMapper.writeValueAsString(datos);
      log.info("XML REPORTE: "+ xml);
      WmReporte wmReporte = new WmReporte();
      wmReporte.setPiSEntrada(xml);

      WmReporteResponse response = (WmReporteResponse) getWebServiceTemplate()
              .marshalSendAndReceive(Constantes.WSDL, wmReporte,
                      new SoapActionCallback(
                              this.callBack));

      return response;

  }
  

}