package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "item")
public class Item extends ItemReferencia{

    @JacksonXmlProperty(localName = "ICPPresentacion")
    private String ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private String ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private String ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private String Icpletra;
}