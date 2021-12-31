package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "itemReferencia")
public class ItemReferencia {

    @JacksonXmlProperty(localName = "REFCodClasificacion")
    private String REFCodClasificacion;
    @JacksonXmlProperty(localName = "REFCodigo1")
    private String REFCodigo1;
    @JacksonXmlProperty(localName = "REFCodigo2")
    private String REFCodigo2;
    @JacksonXmlProperty(localName = "REFNombreCorto")
    private String REFNombreCorto;
    @JacksonXmlProperty(localName = "REFNombreLargo")
    private String REFNombreLargo;
    @JacksonXmlProperty(localName = "CARCodigo1")
    private String CARCodigo1;
    @JacksonXmlProperty(localName = "REFPrecioLista")
    private String REFPrecioLista;
    @JacksonXmlProperty(localName = "IRFBruto")
    private String IRFBruto;
    @JacksonXmlProperty(localName = "IRFDescuento")
    private String IRFDescuento;
    @JacksonXmlProperty(localName = "IRFPago")
    private String IRFPago;
    @JacksonXmlProperty(localName = "IRFCantidad")
    private String IRFCantidad;
    @JacksonXmlProperty(localName = "IRFValorImpuesto")
    private String IRFValorImpuesto;
    @JacksonXmlProperty(localName = "IRFImpuesto")
    private String IRFImpuesto;
    @JacksonXmlProperty(localName = "REFEsCombo")
    private String REFEsCombo;
    @JacksonXmlProperty(localName = "REFUltimoCosto")
    private String REFUltimoCosto;
    @JacksonXmlProperty(localName = "PRVCodigo")
    private String PRVCodigo;
    @JacksonXmlProperty(localName = "REFManejaLotes")
    private String REFManejaLotes;
    @JacksonXmlProperty(localName = "REFFactorConversion")
    private String REFFactorConversion;
    @JacksonXmlProperty(localName = "REFInventario")
    private String REFInventario;
    @JacksonXmlProperty(localName = "REFEsParaVenta")
    private String REFEsParaVenta;
    @JacksonXmlProperty(localName = "estado")
    private String estado;
    @JacksonXmlProperty(localName = "IRFPagNoVenta")
    private String IRFPagNoVenta;
    @JacksonXmlProperty(localName = "IRFVenta")
    private String IRFVenta;
    @JacksonXmlProperty(localName = "IRFValorImpuestoNeto")
    private String IRFValorImpuestoNeto;
    @JacksonXmlProperty(localName = "IRFComision")
    private String IRFComision;
    @JacksonXmlProperty(localName = "IRFNeto")
    private String IRFNeto;
    @JacksonXmlProperty(localName = "REFCodigoIngresado")
    private String REFCodigoIngresado;
    @JacksonXmlProperty(localName = "RREFPuntos")
    private String RREFPuntos;
    @JacksonXmlProperty(localName = "ICPPresentacion")
    private String ICPpresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private String ICPdescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private String ICPcadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private String ICPletra;

}