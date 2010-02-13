//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.13 at 01:47:36 PM CET 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-binding-link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-binding-link">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sourceId" use="required" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="destinationId" use="required" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="link-type-id" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="link-type-shortname" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-binding-link")
public class CBindingLink {

    @XmlAttribute(required = true)
    protected String sourceId;
    @XmlAttribute(required = true)
    protected String destinationId;
    @XmlAttribute(name = "link-type-id")
    protected String linkTypeId;
    @XmlAttribute(name = "link-type-shortname")
    protected String linkTypeShortname;

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the destinationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationId(String value) {
        this.destinationId = value;
    }

    /**
     * Gets the value of the linkTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeId() {
        return linkTypeId;
    }

    /**
     * Sets the value of the linkTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeId(String value) {
        this.linkTypeId = value;
    }

    /**
     * Gets the value of the linkTypeShortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeShortname() {
        return linkTypeShortname;
    }

    /**
     * Sets the value of the linkTypeShortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeShortname(String value) {
        this.linkTypeShortname = value;
    }

}
