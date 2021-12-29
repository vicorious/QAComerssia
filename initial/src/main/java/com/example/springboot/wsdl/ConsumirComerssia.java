package com.example.springboot.wsdl;

import com.example.springboot.utils.Constantes;
import com.example.springboot.wsdl.com.example.springboot.wsdl.WmEnvioTransacciones;
import com.example.springboot.wsdl.com.example.springboot.wsdl.WmEnvioTransaccionesResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ConsumirComerssia extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(ConsumirComerssia.class);

  private String callBack = "http://localhost:8080//servicioqueespererespuesta";

  /**
   * 
   * @param pi_sIdemp
   * @param pi_sEnvio
   * @return
   */
  public WmEnvioTransaccionesResponse envioTransacciones(String pi_sIdemp, Object pi_sEnvio)
  {
      WmEnvioTransacciones envioTransacciones = new WmEnvioTransacciones();
      envioTransacciones.setPiSIdemp(pi_sIdemp);
      envioTransacciones.setPiSEnvio(pi_sEnvio.toString().getBytes());

      log.info("Requesting location for " + country);

      WmEnvioTransaccionesResponse response = (WmEnvioTransaccionesResponse) getWebServiceTemplate()
        .marshalSendAndReceive(Constantes.WSDL, request,
            new SoapActionCallback(
                this.callBack));

    return response;

  }
  

}