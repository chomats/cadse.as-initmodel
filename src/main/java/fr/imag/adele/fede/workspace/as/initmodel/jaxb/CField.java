//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.04 at 09:58:43 AM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-field">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-item">
 *       &lt;sequence>
 *         &lt;element name="sub-field" type="{http://fr.imag.adele/fede/workspace/model}c-field"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref-attribute" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="position" type="{http://fr.imag.adele/fede/workspace/model}positionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-field", propOrder = {
    "subField"
})
public class CField
    extends CItem
{

    @XmlElement(name = "sub-field", required = true)
    protected CField subField;
    @XmlAttribute
    protected String label;
    @XmlAttribute(name = "ref-attribute")
    protected String refAttribute;
    @XmlAttribute
    protected Boolean editable;
    @XmlAttribute
    protected PositionType position;

    /**
     * Gets the value of the subField property.
     * 
     * @return
     *     possible object is
     *     {@link CField }
     *     
     */
    public CField getSubField() {
        return subField;
    }

    /**
     * Sets the value of the subField property.
     * 
     * @param value
     *     allowed object is
     *     {@link CField }
     *     
     */
    public void setSubField(CField value) {
        this.subField = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the refAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAttribute() {
        return refAttribute;
    }

    /**
     * Sets the value of the refAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAttribute(String value) {
        this.refAttribute = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

}
