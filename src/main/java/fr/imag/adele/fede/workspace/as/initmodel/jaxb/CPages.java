//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.26 at 05:36:36 PM CET 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-pages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-pages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://fr.imag.adele/fede/workspace/model}c-page" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="default-short-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="main-action-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-pages", propOrder = {
    "page"
})
public class CPages {

    @XmlElement(required = true)
    protected List<CPage> page;
    @XmlAttribute(name = "default-short-name")
    protected String defaultShortName;
    @XmlAttribute(name = "main-action-class")
    protected String mainActionClass;

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPage }
     * 
     * 
     */
    public List<CPage> getPage() {
        if (page == null) {
            page = new ArrayList<CPage>();
        }
        return this.page;
    }

    /**
     * Gets the value of the defaultShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultShortName() {
        return defaultShortName;
    }

    /**
     * Sets the value of the defaultShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultShortName(String value) {
        this.defaultShortName = value;
    }

    /**
     * Gets the value of the mainActionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainActionClass() {
        return mainActionClass;
    }

    /**
     * Sets the value of the mainActionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainActionClass(String value) {
        this.mainActionClass = value;
    }

}
