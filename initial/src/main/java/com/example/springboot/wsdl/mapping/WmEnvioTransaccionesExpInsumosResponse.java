//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 11:34:46 AM COT 
//


package com.example.springboot.wsdl.mapping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="wm_EnvioTransaccionesExpInsumosResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "wmEnvioTransaccionesExpInsumosResult"
})
@XmlRootElement(name = "wm_EnvioTransaccionesExpInsumosResponse")
public class WmEnvioTransaccionesExpInsumosResponse {

    @XmlElement(name = "wm_EnvioTransaccionesExpInsumosResult")
    protected WmEnvioTransaccionesExpInsumosResponse.WmEnvioTransaccionesExpInsumosResult wmEnvioTransaccionesExpInsumosResult;

    /**
     * Gets the value of the wmEnvioTransaccionesExpInsumosResult property.
     * 
     * @return
     *     possible object is
     *     {@link WmEnvioTransaccionesExpInsumosResponse.WmEnvioTransaccionesExpInsumosResult }
     *     
     */
    public WmEnvioTransaccionesExpInsumosResponse.WmEnvioTransaccionesExpInsumosResult getWmEnvioTransaccionesExpInsumosResult() {
        return wmEnvioTransaccionesExpInsumosResult;
    }

    /**
     * Sets the value of the wmEnvioTransaccionesExpInsumosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WmEnvioTransaccionesExpInsumosResponse.WmEnvioTransaccionesExpInsumosResult }
     *     
     */
    public void setWmEnvioTransaccionesExpInsumosResult(WmEnvioTransaccionesExpInsumosResponse.WmEnvioTransaccionesExpInsumosResult value) {
        this.wmEnvioTransaccionesExpInsumosResult = value;
    }


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
     *         &lt;any/&gt;
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
        "content"
    })
    public static class WmEnvioTransaccionesExpInsumosResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
