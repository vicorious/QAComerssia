//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 08:32:35 PM COT 
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
 *         &lt;element name="pi_sMes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sAnio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sPlantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sAeropuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSMes",
    "piSAnio",
    "piSPlantilla",
    "piSAeropuerto"
})
@XmlRootElement(name = "wm_ObtenerResumenAENA")
public class WmObtenerResumenAENA {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sMes")
    protected String piSMes;
    @XmlElement(name = "pi_sAnio")
    protected String piSAnio;
    @XmlElement(name = "pi_sPlantilla")
    protected String piSPlantilla;
    @XmlElement(name = "pi_sAeropuerto")
    protected String piSAeropuerto;

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
     * Gets the value of the piSMes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSMes() {
        return piSMes;
    }

    /**
     * Sets the value of the piSMes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSMes(String value) {
        this.piSMes = value;
    }

    /**
     * Gets the value of the piSAnio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSAnio() {
        return piSAnio;
    }

    /**
     * Sets the value of the piSAnio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSAnio(String value) {
        this.piSAnio = value;
    }

    /**
     * Gets the value of the piSPlantilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSPlantilla() {
        return piSPlantilla;
    }

    /**
     * Sets the value of the piSPlantilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSPlantilla(String value) {
        this.piSPlantilla = value;
    }

    /**
     * Gets the value of the piSAeropuerto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSAeropuerto() {
        return piSAeropuerto;
    }

    /**
     * Sets the value of the piSAeropuerto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSAeropuerto(String value) {
        this.piSAeropuerto = value;
    }

}
