//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.18 at 03:36:59 PM COT 
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
 *         &lt;element name="wm_PruebaServiceConParametroResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "wmPruebaServiceConParametroResult"
})
@XmlRootElement(name = "wm_PruebaServiceConParametroResponse")
public class WmPruebaServiceConParametroResponse {

    @XmlElement(name = "wm_PruebaServiceConParametroResult")
    protected String wmPruebaServiceConParametroResult;

    /**
     * Gets the value of the wmPruebaServiceConParametroResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmPruebaServiceConParametroResult() {
        return wmPruebaServiceConParametroResult;
    }

    /**
     * Sets the value of the wmPruebaServiceConParametroResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmPruebaServiceConParametroResult(String value) {
        this.wmPruebaServiceConParametroResult = value;
    }

}
