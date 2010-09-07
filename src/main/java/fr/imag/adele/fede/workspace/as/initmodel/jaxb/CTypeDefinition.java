/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-type-definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-type-definition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-item">
 *       &lt;sequence>
 *         &lt;element name="outgoing-link" type="{http://fr.imag.adele/fede/workspace/model}c-link-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute-type" type="{http://fr.imag.adele/fede/workspace/model}c-values-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute-definition" type="{http://fr.imag.adele/fede/workspace/model}c-att-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute-value" type="{http://fr.imag.adele/fede/workspace/model}c-att-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="meta-attribute" type="{http://fr.imag.adele/fede/workspace/model}c-meta-attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creation-pages" type="{http://fr.imag.adele/fede/workspace/model}c-pages" minOccurs="0"/>
 *         &lt;element name="modification-pages" type="{http://fr.imag.adele/fede/workspace/model}c-pages" minOccurs="0"/>
 *         &lt;element name="action" type="{http://fr.imag.adele/fede/workspace/model}c-action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="menu" type="{http://fr.imag.adele/fede/workspace/model}c-menu-action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action-contributor" type="{http://fr.imag.adele/fede/workspace/model}c-action-contributor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constraints" type="{http://fr.imag.adele/fede/workspace/model}c-constraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cst-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qualified-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="meta-type" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="super-type-name" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="factory-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="package-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-type-definition", propOrder = {
    "outgoingLink",
    "attributeType",
    "attributeDefinition",
    "attributeValue",
    "metaAttribute",
    "creationPages",
    "modificationPages",
    "action",
    "menu",
    "actionContributor",
    "constraints"
})
@XmlSeeAlso({
    CItemType.class,
    CExtensionItemType.class
})
public abstract class CTypeDefinition
    extends CItem
{

    @XmlElement(name = "outgoing-link")
    protected List<CLinkType> outgoingLink;
    @XmlElement(name = "attribute-type")
    protected List<CValuesType> attributeType;
    @XmlElement(name = "attribute-definition")
    protected List<CAttType> attributeDefinition;
    @XmlElement(name = "attribute-value")
    protected List<CAttType> attributeValue;
    @XmlElement(name = "meta-attribute")
    protected List<CMetaAttribute> metaAttribute;
    @XmlElement(name = "creation-pages")
    protected CPages creationPages;
    @XmlElement(name = "modification-pages")
    protected CPages modificationPages;
    protected List<CAction> action;
    protected List<CMenuAction> menu;
    @XmlElement(name = "action-contributor")
    protected List<CActionContributor> actionContributor;
    protected List<CConstraint> constraints;
    @XmlAttribute(name = "cst-name")
    protected String cstName;
    @XmlAttribute(name = "qualified-name")
    protected String qualifiedName;
    @XmlAttribute
    protected String name;
    @XmlAttribute(name = "meta-type")
    protected String metaType;
    @XmlAttribute(name = "super-type-name")
    protected String superTypeName;
    @XmlAttribute(name = "factory-class")
    protected String factoryClass;
    @XmlAttribute(name = "package-name")
    protected String packageName;

    /**
     * Gets the value of the outgoingLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outgoingLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutgoingLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLinkType }
     * 
     * 
     */
    public List<CLinkType> getOutgoingLink() {
        if (outgoingLink == null) {
            outgoingLink = new ArrayList<CLinkType>();
        }
        return this.outgoingLink;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CValuesType }
     * 
     * 
     */
    public List<CValuesType> getAttributeType() {
        if (attributeType == null) {
            attributeType = new ArrayList<CValuesType>();
        }
        return this.attributeType;
    }

    /**
     * Gets the value of the attributeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAttType }
     * 
     * 
     */
    public List<CAttType> getAttributeDefinition() {
        if (attributeDefinition == null) {
            attributeDefinition = new ArrayList<CAttType>();
        }
        return this.attributeDefinition;
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAttType }
     * 
     * 
     */
    public List<CAttType> getAttributeValue() {
        if (attributeValue == null) {
            attributeValue = new ArrayList<CAttType>();
        }
        return this.attributeValue;
    }

    /**
     * Gets the value of the metaAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMetaAttribute }
     * 
     * 
     */
    public List<CMetaAttribute> getMetaAttribute() {
        if (metaAttribute == null) {
            metaAttribute = new ArrayList<CMetaAttribute>();
        }
        return this.metaAttribute;
    }

    /**
     * Gets the value of the creationPages property.
     * 
     * @return
     *     possible object is
     *     {@link CPages }
     *     
     */
    public CPages getCreationPages() {
        return creationPages;
    }

    /**
     * Sets the value of the creationPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPages }
     *     
     */
    public void setCreationPages(CPages value) {
        this.creationPages = value;
    }

    /**
     * Gets the value of the modificationPages property.
     * 
     * @return
     *     possible object is
     *     {@link CPages }
     *     
     */
    public CPages getModificationPages() {
        return modificationPages;
    }

    /**
     * Sets the value of the modificationPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPages }
     *     
     */
    public void setModificationPages(CPages value) {
        this.modificationPages = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAction }
     * 
     * 
     */
    public List<CAction> getAction() {
        if (action == null) {
            action = new ArrayList<CAction>();
        }
        return this.action;
    }

    /**
     * Gets the value of the menu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMenuAction }
     * 
     * 
     */
    public List<CMenuAction> getMenu() {
        if (menu == null) {
            menu = new ArrayList<CMenuAction>();
        }
        return this.menu;
    }

    /**
     * Gets the value of the actionContributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionContributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CActionContributor }
     * 
     * 
     */
    public List<CActionContributor> getActionContributor() {
        if (actionContributor == null) {
            actionContributor = new ArrayList<CActionContributor>();
        }
        return this.actionContributor;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CConstraint }
     * 
     * 
     */
    public List<CConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new ArrayList<CConstraint>();
        }
        return this.constraints;
    }

    /**
     * Gets the value of the cstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstName() {
        return cstName;
    }

    /**
     * Sets the value of the cstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstName(String value) {
        this.cstName = value;
    }

    /**
     * Gets the value of the qualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    /**
     * Sets the value of the qualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedName(String value) {
        this.qualifiedName = value;
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
     * Gets the value of the metaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaType() {
        return metaType;
    }

    /**
     * Sets the value of the metaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaType(String value) {
        this.metaType = value;
    }

    /**
     * Gets the value of the superTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperTypeName() {
        return superTypeName;
    }

    /**
     * Sets the value of the superTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperTypeName(String value) {
        this.superTypeName = value;
    }

    /**
     * Gets the value of the factoryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryClass() {
        return factoryClass;
    }

    /**
     * Sets the value of the factoryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryClass(String value) {
        this.factoryClass = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

}
