//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.30 at 10:39:25 AM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-operation-param-link-ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-operation-param-link-ref">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-operation-param-linktype-ref">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://fr.imag.adele/fede/workspace/model}c-operation-param-item-ref"/>
 *         &lt;element name="destination" type="{http://fr.imag.adele/fede/workspace/model}c-operation-param-item-ref"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-operation-param-link-ref", propOrder = {
    "source",
    "destination"
})
public class COperationParamLinkRef
    extends COperationParamLinktypeRef
{

    @XmlElement(required = true)
    protected COperationParamItemRef source;
    @XmlElement(required = true)
    protected COperationParamItemRef destination;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link COperationParamItemRef }
     *     
     */
    public COperationParamItemRef getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link COperationParamItemRef }
     *     
     */
    public void setSource(COperationParamItemRef value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link COperationParamItemRef }
     *     
     */
    public COperationParamItemRef getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link COperationParamItemRef }
     *     
     */
    public void setDestination(COperationParamItemRef value) {
        this.destination = value;
    }

}