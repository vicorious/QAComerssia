//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.31 a las 08:54:31 AM COT 
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
 *         &lt;element name="pi_sTipoProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSTipoProceso",
    "piSBusqueda",
    "piSParametros"
})
@XmlRootElement(name = "wm_ConsultaProcesosClientes")
public class WmConsultaProcesosClientes {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sTipoProceso")
    protected String piSTipoProceso;
    @XmlElement(name = "pi_sBusqueda")
    protected String piSBusqueda;
    @XmlElement(name = "pi_sParametros")
    protected String piSParametros;

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
     * Obtiene el valor de la propiedad piSTipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSTipoProceso() {
        return piSTipoProceso;
    }

    /**
     * Define el valor de la propiedad piSTipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSTipoProceso(String value) {
        this.piSTipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad piSBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSBusqueda() {
        return piSBusqueda;
    }

    /**
     * Define el valor de la propiedad piSBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSBusqueda(String value) {
        this.piSBusqueda = value;
    }

    /**
     * Obtiene el valor de la propiedad piSParametros.
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
     * Define el valor de la propiedad piSParametros.
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
