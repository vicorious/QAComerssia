//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.04 at 09:05:06 PM COT 
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
 *         &lt;element name="pi_sIdemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sParametros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSIdemp",
    "piSParametros"
})
@XmlRootElement(name = "wm_SolicitudDatos")
public class WmSolicitudDatos {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sParametros")
    protected String piSParametros;

    /**
     * Gets the value of the piSIdemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSIdemp() {
        return piSIdemp;
    }

    /**
     * Sets the value of the piSIdemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSIdemp(String value) {
        this.piSIdemp = value;
    }

    /**
     * Gets the value of the piSParametros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSParametros() {
        return piSParametros;
    }

    /**
     * Sets the value of the piSParametros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSParametros(String value) {
        this.piSParametros = value;
    }

}
