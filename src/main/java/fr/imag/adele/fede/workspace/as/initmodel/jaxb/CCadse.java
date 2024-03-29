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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadse-ref" type="{http://fr.imag.adele/fede/workspace/model}c-cadse-ref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item-type" type="{http://fr.imag.adele/fede/workspace/model}c-item-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ext-item-type" type="{http://fr.imag.adele/fede/workspace/model}c-extension-item-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item" type="{http://fr.imag.adele/fede/workspace/model}c-item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="test-operation" type="{http://fr.imag.adele/fede/workspace/model}c-operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="test-operation-type" type="{http://fr.imag.adele/fede/workspace/model}c-operation-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="link-binding" type="{http://fr.imag.adele/fede/workspace/model}c-binding-link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ext-binding" type="{http://fr.imag.adele/fede/workspace/model}c-ext-biding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="id_cadse_definition" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cst-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bundle-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auto-load" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="test-cadse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="display-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cadseRef",
    "itemType",
    "extItemType",
    "item",
    "testOperation",
    "testOperationType",
    "linkBinding",
    "extBinding",
    "initClasses"
})
@XmlRootElement(name = "c-cadse")
public class CCadse {

    @XmlElement(name = "cadse-ref")
    protected List<CCadseRef> cadseRef;
    @XmlElement(name = "item-type")
    protected List<CItemType> itemType;
    @XmlElement(name = "ext-item-type")
    protected List<CExtensionItemType> extItemType;
    protected List<CItem> item;
    @XmlElement(name = "test-operation")
    protected List<COperation> testOperation;
    @XmlElement(name = "test-operation-type")
    protected List<COperationType> testOperationType;
    @XmlElement(name = "link-binding")
    protected List<CBindingLink> linkBinding;
    @XmlElement(name = "ext-binding")
    protected List<CExtBiding> extBinding;
    protected List<String> initClasses;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String id;
    @XmlAttribute(name = "id_cadse_definition")
    protected String idCadseDefinition;
    @XmlAttribute(required = true)
    protected int version;
    @XmlAttribute(name = "cst-class")
    protected String cstClass;
    @XmlAttribute(name = "bundle-id")
    protected String bundleId;
    @XmlAttribute
    protected Boolean hidden;
    @XmlAttribute
    protected String description;
    @XmlAttribute(name = "auto-load")
    protected Boolean autoLoad;
    @XmlAttribute(name = "test-cadse")
    protected Boolean testCadse;
    @XmlAttribute(name = "display-name")
    protected String displayName;

    /**
     * Gets the value of the cadseRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cadseRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCadseRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCadseRef }
     * 
     * 
     */
    public List<CCadseRef> getCadseRef() {
        if (cadseRef == null) {
            cadseRef = new ArrayList<CCadseRef>();
        }
        return this.cadseRef;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CItemType }
     * 
     * 
     */
    public List<CItemType> getItemType() {
        if (itemType == null) {
            itemType = new ArrayList<CItemType>();
        }
        return this.itemType;
    }

    /**
     * Gets the value of the extItemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extItemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CExtensionItemType }
     * 
     * 
     */
    public List<CExtensionItemType> getExtItemType() {
        if (extItemType == null) {
            extItemType = new ArrayList<CExtensionItemType>();
        }
        return this.extItemType;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CItem }
     * 
     * 
     */
    public List<CItem> getItem() {
        if (item == null) {
            item = new ArrayList<CItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the testOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COperation }
     * 
     * 
     */
    public List<COperation> getTestOperation() {
        if (testOperation == null) {
            testOperation = new ArrayList<COperation>();
        }
        return this.testOperation;
    }

    /**
     * Gets the value of the testOperationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testOperationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestOperationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COperationType }
     * 
     * 
     */
    public List<COperationType> getTestOperationType() {
        if (testOperationType == null) {
            testOperationType = new ArrayList<COperationType>();
        }
        return this.testOperationType;
    }

    /**
     * Gets the value of the linkBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBindingLink }
     * 
     * 
     */
    public List<CBindingLink> getLinkBinding() {
        if (linkBinding == null) {
            linkBinding = new ArrayList<CBindingLink>();
        }
        return this.linkBinding;
    }

    /**
     * Gets the value of the extBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CExtBiding }
     * 
     * 
     */
    public List<CExtBiding> getExtBinding() {
        if (extBinding == null) {
            extBinding = new ArrayList<CExtBiding>();
        }
        return this.extBinding;
    }

    /**
     * Gets the value of the initClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInitClasses() {
        if (initClasses == null) {
            initClasses = new ArrayList<String>();
        }
        return this.initClasses;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idCadseDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCadseDefinition() {
        return idCadseDefinition;
    }

    /**
     * Sets the value of the idCadseDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCadseDefinition(String value) {
        this.idCadseDefinition = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * Gets the value of the cstClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstClass() {
        return cstClass;
    }

    /**
     * Sets the value of the cstClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstClass(String value) {
        this.cstClass = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the autoLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLoad() {
        return autoLoad;
    }

    /**
     * Sets the value of the autoLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLoad(Boolean value) {
        this.autoLoad = value;
    }

    /**
     * Gets the value of the testCadse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestCadse() {
        return testCadse;
    }

    /**
     * Sets the value of the testCadse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestCadse(Boolean value) {
        this.testCadse = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}
