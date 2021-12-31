package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "encabezado")
public class Encabezado {

    @JacksonXmlProperty(localName = "ENCDescripcion")
    private String ENCDescripcion;
    @JacksonXmlProperty(localName = "GMVCodigo")
    private String GMVCodigo;
    @JacksonXmlProperty(localName = "MOVCodigo")
    private String MOVCodigo;
    @JacksonXmlProperty(localName = "movimiento")
    private String movimiento;
    @JacksonXmlProperty(localName = "USUCodigo")
    private String USUCodigo;
    @JacksonXmlProperty(localName = "CAJCodigo")
    private String CAJCodigo;
    @JacksonXmlProperty(localName = "IDEMP")
    private String IDEMP;
    @JacksonXmlProperty(localName = "ALMCodigo")
    private String ALMCodigo;
    @JacksonXmlProperty(localName = "ALMNombre")
    private String ALMNombre;
    @JacksonXmlProperty(localName = "MONCodigo")
    private String MONCodigo;
    @JacksonXmlProperty(localName = "ENCFechaTrx")
    private String ENCFechaTrx;
    @JacksonXmlProperty(localName = "ENCHoraTrx")
    private String ENCHoraTrx;
    @JacksonXmlProperty(localName = "ENCModo")
    private String ENCModo;
    @JacksonXmlProperty(localName = "ENCTipoProc")
    private String ENCTipoProc;
    @JacksonXmlProperty(localName = "ENCConsTrx")
    private String ENCConsTrx;
    @JacksonXmlProperty(localName = "ENCTasaConversion")
    private String ENCTasaConversion;
    @JacksonXmlProperty(localName = "ENCTotalReferencias")
    private String ENCTotalReferencias;
    @JacksonXmlProperty(localName = "ENCBruto")
    private String ENCBruto;
    @JacksonXmlProperty(localName = "ENCDescuento")
    private String ENCDescuento;
    @JacksonXmlProperty(localName = "ENCPagNoVenta")
    private String ENCPagNoVenta;
    @JacksonXmlProperty(localName = "ENCVenta")
    private String ENCVenta;
    @JacksonXmlProperty(localName = "ENCImpuestos")
    private String ENCImpuestos;
    @JacksonXmlProperty(localName = "ENCComision")
    private String ENCComision;
    @JacksonXmlProperty(localName = "ENCNeto")
    private String ENCNeto;
    @JacksonXmlProperty(localName = "ENCRecaudo")
    private String ENCRecaudo;
    @JacksonXmlProperty(localName = "ENCImpuestoAsumido")
    private String ENCImpuestoAsumido;
    @JacksonXmlProperty(localName = "ENCPuntos")
    private String ENCPuntos;
    @JacksonXmlProperty(localName = "ENCEstadoLinea")
    private String ENCEstadoLinea;
    @JacksonXmlProperty(localName = "ENCRespuesta")
    private String ENCRespuesta;
    @JacksonXmlProperty(localName = "ENCDescRespuesta")
    private String ENCDescRespuesta;

}
    