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
 *         &lt;element name="pi_sIdemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sLogDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_eLogTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_sLogObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_eLogFlujo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_eLogEstado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_eLogFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sLogRutaArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSLogID",
    "piSLogDescripcion",
    "piELogTipo",
    "piSLogObjeto",
    "piELogFlujo",
    "piELogEstado",
    "piELogFecha",
    "piSLogRutaArchivo"
})
@XmlRootElement(name = "wm_IngresoLogSAP")
public class WmIngresoLogSAP {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sLogID")
    protected String piSLogID;
    @XmlElement(name = "pi_sLogDescripcion")
    protected String piSLogDescripcion;
    @XmlElement(name = "pi_eLogTipo")
    protected int piELogTipo;
    @XmlElement(name = "pi_sLogObjeto")
    protected String piSLogObjeto;
    @XmlElement(name = "pi_eLogFlujo")
    protected int piELogFlujo;
    @XmlElement(name = "pi_eLogEstado")
    protected int piELogEstado;
    @XmlElement(name = "pi_eLogFecha")
    protected String piELogFecha;
    @XmlElement(name = "pi_sLogRutaArchivo")
    protected String piSLogRutaArchivo;

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
     * Gets the value of the piSLogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogID() {
        return piSLogID;
    }

    /**
     * Sets the value of the piSLogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogID(String value) {
        this.piSLogID = value;
    }

    /**
     * Gets the value of the piSLogDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogDescripcion() {
        return piSLogDescripcion;
    }

    /**
     * Sets the value of the piSLogDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogDescripcion(String value) {
        this.piSLogDescripcion = value;
    }

    /**
     * Gets the value of the piELogTipo property.
     * 
     */
    public int getPiELogTipo() {
        return piELogTipo;
    }

    /**
     * Sets the value of the piELogTipo property.
     * 
     */
    public void setPiELogTipo(int value) {
        this.piELogTipo = value;
    }

    /**
     * Gets the value of the piSLogObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogObjeto() {
        return piSLogObjeto;
    }

    /**
     * Sets the value of the piSLogObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogObjeto(String value) {
        this.piSLogObjeto = value;
    }

    /**
     * Gets the value of the piELogFlujo property.
     * 
     */
    public int getPiELogFlujo() {
        return piELogFlujo;
    }

    /**
     * Sets the value of the piELogFlujo property.
     * 
     */
    public void setPiELogFlujo(int value) {
        this.piELogFlujo = value;
    }

    /**
     * Gets the value of the piELogEstado property.
     * 
     */
    public int getPiELogEstado() {
        return piELogEstado;
    }

    /**
     * Sets the value of the piELogEstado property.
     * 
     */
    public void setPiELogEstado(int value) {
        this.piELogEstado = value;
    }

    /**
     * Gets the value of the piELogFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiELogFecha() {
        return piELogFecha;
    }

    /**
     * Sets the value of the piELogFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiELogFecha(String value) {
        this.piELogFecha = value;
    }

    /**
     * Gets the value of the piSLogRutaArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogRutaArchivo() {
        return piSLogRutaArchivo;
    }

    /**
     * Sets the value of the piSLogRutaArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogRutaArchivo(String value) {
        this.piSLogRutaArchivo = value;
    }

}
