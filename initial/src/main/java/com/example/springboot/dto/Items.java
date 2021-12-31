package com.example.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "items")
public class Items {

@JacksonXmlProperty(localName = "item")
private List<Item> items;   

}