//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.02 at 04:23:04 PM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-ext-biding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-ext-biding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="uuid_it" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="uuid_ext" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-ext-biding")
public class CExtBiding {

    @XmlAttribute(name = "uuid_it")
    protected String uuidIt;
    @XmlAttribute(name = "uuid_ext")
    protected String uuidExt;

    /**
     * Gets the value of the uuidIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidIt() {
        return uuidIt;
    }

    /**
     * Sets the value of the uuidIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidIt(String value) {
        this.uuidIt = value;
    }

    /**
     * Gets the value of the uuidExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidExt() {
        return uuidExt;
    }

    /**
     * Sets the value of the uuidExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidExt(String value) {
        this.uuidExt = value;
    }

}
