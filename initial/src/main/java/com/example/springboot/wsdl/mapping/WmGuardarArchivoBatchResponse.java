//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.04 at 05:56:49 PM COT 
//


package com.example.springboot.wsdl.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wm_GuardarArchivoBatchResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wmGuardarArchivoBatchResult"
})
@XmlRootElement(name = "wm_GuardarArchivoBatchResponse")
public class WmGuardarArchivoBatchResponse {

    @XmlElement(name = "wm_GuardarArchivoBatchResult")
    protected boolean wmGuardarArchivoBatchResult;

    /**
     * Gets the value of the wmGuardarArchivoBatchResult property.
     * 
     */
    public boolean isWmGuardarArchivoBatchResult() {
        return wmGuardarArchivoBatchResult;
    }

    /**
     * Sets the value of the wmGuardarArchivoBatchResult property.
     * 
     */
    public void setWmGuardarArchivoBatchResult(boolean value) {
        this.wmGuardarArchivoBatchResult = value;
    }

}
