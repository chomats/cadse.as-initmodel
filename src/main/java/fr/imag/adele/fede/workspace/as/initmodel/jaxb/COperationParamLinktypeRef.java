//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.02 at 04:24:28 PM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-operation-param-linktype-ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-operation-param-linktype-ref">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-operation-param-itemtype-ref">
 *       &lt;attribute name="link-type-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-operation-param-linktype-ref")
@XmlSeeAlso({
    COperationParamLinkRef.class
})
public class COperationParamLinktypeRef
    extends COperationParamItemtypeRef
{

    @XmlAttribute(name = "link-type-name")
    protected String linkTypeName;

    /**
     * Gets the value of the linkTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeName() {
        return linkTypeName;
    }

    /**
     * Sets the value of the linkTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeName(String value) {
        this.linkTypeName = value;
    }

}
