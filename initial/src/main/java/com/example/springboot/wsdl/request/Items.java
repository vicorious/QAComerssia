package com.example.springboot.wsdl.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "items")
public class Items {

@JacksonXmlProperty(localName = "item")
private List<Item> items;

    public void setItems(List<Item> items) {
        this.items = items;
    }
}