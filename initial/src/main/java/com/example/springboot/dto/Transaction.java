package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.example.springboot.dto.Encabezado;


@JacksonXmlRootElement(localName = "transaccion")
public class Transaction {

    @JacksonXmlProperty(localName = "USUARIO")
    private String usuario;
    @JacksonXmlProperty(localName = "CLAVE")
    private String clave;

    @JacksonXmlProperty(localName = "encabezado")
    private Encabezado encabezado;

    @JacksonXmlProperty(localName = "detalle")
    private Detalle detalle;

}