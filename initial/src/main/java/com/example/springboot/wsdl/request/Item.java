package com.example.springboot.wsdl.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "item")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Item {

    @JsonInclude
    @JacksonXmlProperty(isAttribute = true, localName = "Imprime")
    private String imprime;
    @JsonInclude
    @JacksonXmlProperty(isAttribute = true, localName = "Visible")
    private String visible;
    @JsonInclude
    @JacksonXmlProperty(isAttribute = true, localName = "Tipo")
    private String tipo;
    @JsonInclude
    @JacksonXmlProperty(isAttribute = true, localName = "nitem")
    private String nitem;
    @JsonInclude
    @JacksonXmlProperty(localName = "ICPPresentacion")
    private String ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPPresentacion2")
    private String ICPPresentacion2;
    @JsonInclude
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private String ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private String ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private String Icpletra;

    public void setImprime(String imprime) {
        this.imprime = imprime;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNitem(String nitem) {
        this.nitem = nitem;
    }

    public void setICPPresentacion(String ICPPresentacion) {
        this.ICPPresentacion = ICPPresentacion;
    }

    public void setICPPresentacion2(String ICPPresentacion2) {
        this.ICPPresentacion2 = ICPPresentacion2;
    }

    public void setICPDescripcion(String ICPDescripcion) {
        this.ICPDescripcion = ICPDescripcion;
    }

    public void setICPCadena(String ICPCadena) {
        this.ICPCadena = ICPCadena;
    }

    public void setIcpletra(String icpletra) {
        Icpletra = icpletra;
    }
}