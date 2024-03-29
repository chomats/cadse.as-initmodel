//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.08 at 11:19:31 AM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://fr.imag.adele/fede/workspace/model}c-operation-param" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ex" type="{http://fr.imag.adele/fede/workspace/model}c-operation-ex" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shoulBeStopIfError" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-operation", propOrder = {
    "param",
    "ex"
})
public class COperation {

    protected List<COperationParam> param;
    protected COperationEx ex;
    @XmlAttribute
    protected String type;
    @XmlAttribute
    protected String comment;
    @XmlAttribute(required = true)
    protected boolean shoulBeStopIfError;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COperationParam }
     * 
     * 
     */
    public List<COperationParam> getParam() {
        if (param == null) {
            param = new ArrayList<COperationParam>();
        }
        return this.param;
    }

    /**
     * Gets the value of the ex property.
     * 
     * @return
     *     possible object is
     *     {@link COperationEx }
     *     
     */
    public COperationEx getEx() {
        return ex;
    }

    /**
     * Sets the value of the ex property.
     * 
     * @param value
     *     allowed object is
     *     {@link COperationEx }
     *     
     */
    public void setEx(COperationEx value) {
        this.ex = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the shoulBeStopIfError property.
     * 
     */
    public boolean isShoulBeStopIfError() {
        return shoulBeStopIfError;
    }

    /**
     * Sets the value of the shoulBeStopIfError property.
     * 
     */
    public void setShoulBeStopIfError(boolean value) {
        this.shoulBeStopIfError = value;
    }

}
