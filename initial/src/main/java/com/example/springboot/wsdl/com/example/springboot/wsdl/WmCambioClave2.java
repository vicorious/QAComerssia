//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.29 at 12:41:06 PM COT 
//


package com.example.springboot.wsdl;

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
 *         &lt;element name="pi_sCodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_CodigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sUsuarioClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sUsuarioClaveNueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sUsuarioWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sClaveWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSCodigoCliente",
    "piCodigoUsuario",
    "piSUsuarioClave",
    "piSUsuarioClaveNueva",
    "piSUsuarioWS",
    "piSClaveWS"
})
@XmlRootElement(name = "wm_CambioClave2")
public class WmCambioClave2 {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sCodigoCliente")
    protected String piSCodigoCliente;
    @XmlElement(name = "pi_CodigoUsuario")
    protected String piCodigoUsuario;
    @XmlElement(name = "pi_sUsuarioClave")
    protected String piSUsuarioClave;
    @XmlElement(name = "pi_sUsuarioClaveNueva")
    protected String piSUsuarioClaveNueva;
    @XmlElement(name = "pi_sUsuarioWS")
    protected String piSUsuarioWS;
    @XmlElement(name = "pi_sClaveWS")
    protected String piSClaveWS;

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
     * Gets the value of the piSCodigoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSCodigoCliente() {
        return piSCodigoCliente;
    }

    /**
     * Sets the value of the piSCodigoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSCodigoCliente(String value) {
        this.piSCodigoCliente = value;
    }

    /**
     * Gets the value of the piCodigoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiCodigoUsuario() {
        return piCodigoUsuario;
    }

    /**
     * Sets the value of the piCodigoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiCodigoUsuario(String value) {
        this.piCodigoUsuario = value;
    }

    /**
     * Gets the value of the piSUsuarioClave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSUsuarioClave() {
        return piSUsuarioClave;
    }

    /**
     * Sets the value of the piSUsuarioClave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSUsuarioClave(String value) {
        this.piSUsuarioClave = value;
    }

    /**
     * Gets the value of the piSUsuarioClaveNueva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSUsuarioClaveNueva() {
        return piSUsuarioClaveNueva;
    }

    /**
     * Sets the value of the piSUsuarioClaveNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSUsuarioClaveNueva(String value) {
        this.piSUsuarioClaveNueva = value;
    }

    /**
     * Gets the value of the piSUsuarioWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSUsuarioWS() {
        return piSUsuarioWS;
    }

    /**
     * Sets the value of the piSUsuarioWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSUsuarioWS(String value) {
        this.piSUsuarioWS = value;
    }

    /**
     * Gets the value of the piSClaveWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSClaveWS() {
        return piSClaveWS;
    }

    /**
     * Sets the value of the piSClaveWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSClaveWS(String value) {
        this.piSClaveWS = value;
    }

}
