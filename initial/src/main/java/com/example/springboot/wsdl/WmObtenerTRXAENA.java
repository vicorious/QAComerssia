//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.30 a las 11:34:14 AM COT 
//


package com.example.springboot.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pi_sIdemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sMes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sAnio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sAeropuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_snombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSAeropuerto",
    "piSnombreArchivo"
})
@XmlRootElement(name = "wm_ObtenerTRXAENA")
public class WmObtenerTRXAENA {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sMes")
    protected String piSMes;
    @XmlElement(name = "pi_sAnio")
    protected String piSAnio;
    @XmlElement(name = "pi_sAeropuerto")
    protected String piSAeropuerto;
    @XmlElement(name = "pi_snombreArchivo")
    protected String piSnombreArchivo;

    /**
     * Obtiene el valor de la propiedad piSIdemp.
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
     * Define el valor de la propiedad piSIdemp.
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
     * Obtiene el valor de la propiedad piSMes.
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
     * Define el valor de la propiedad piSMes.
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
     * Obtiene el valor de la propiedad piSAnio.
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
     * Define el valor de la propiedad piSAnio.
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
     * Obtiene el valor de la propiedad piSAeropuerto.
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
     * Define el valor de la propiedad piSAeropuerto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSAeropuerto(String value) {
        this.piSAeropuerto = value;
    }

    /**
     * Obtiene el valor de la propiedad piSnombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSnombreArchivo() {
        return piSnombreArchivo;
    }

    /**
     * Define el valor de la propiedad piSnombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSnombreArchivo(String value) {
        this.piSnombreArchivo = value;
    }

}
