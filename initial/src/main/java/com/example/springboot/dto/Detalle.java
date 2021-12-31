package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "detalle")
public class Dettalle {

    @JacksonXmlProperty(localName = "items")
    private Items items;

}
