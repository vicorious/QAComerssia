//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 11:34:46 AM COT 
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
 *         &lt;element name="wm_ObtenerResumenAnualAENAResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "wmObtenerResumenAnualAENAResult"
})
@XmlRootElement(name = "wm_ObtenerResumenAnualAENAResponse")
public class WmObtenerResumenAnualAENAResponse {

    @XmlElement(name = "wm_ObtenerResumenAnualAENAResult")
    protected byte[] wmObtenerResumenAnualAENAResult;

    /**
     * Gets the value of the wmObtenerResumenAnualAENAResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWmObtenerResumenAnualAENAResult() {
        return wmObtenerResumenAnualAENAResult;
    }

    /**
     * Sets the value of the wmObtenerResumenAnualAENAResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWmObtenerResumenAnualAENAResult(byte[] value) {
        this.wmObtenerResumenAnualAENAResult = value;
    }

}
