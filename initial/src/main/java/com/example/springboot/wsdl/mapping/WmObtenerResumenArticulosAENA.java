//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.31 a las 09:26:49 AM COT 
//


package com.example.springboot.wsdl.mapping;

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
 *         &lt;element name="pi_sPlantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSPlantilla"
})
@XmlRootElement(name = "wm_ObtenerResumenArticulosAENA")
public class WmObtenerResumenArticulosAENA {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sMes")
    protected String piSMes;
    @XmlElement(name = "pi_sAnio")
    protected String piSAnio;
    @XmlElement(name = "pi_sPlantilla")
    protected String piSPlantilla;

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
     * Obtiene el valor de la propiedad piSPlantilla.
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
     * Define el valor de la propiedad piSPlantilla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSPlantilla(String value) {
        this.piSPlantilla = value;
    }

}
