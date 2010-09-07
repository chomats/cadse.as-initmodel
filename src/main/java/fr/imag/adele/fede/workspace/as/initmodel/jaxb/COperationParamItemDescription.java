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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-operation-param-item-description complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-operation-param-item-description">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-operation-param-itemtype-ref">
 *       &lt;sequence>
 *         &lt;element name="outgoing-link" type="{http://fr.imag.adele/fede/workspace/model}c-link-description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributes-value" type="{http://fr.imag.adele/fede/workspace/model}c-values-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://fr.imag.adele/fede/workspace/model}c-operation-param-item-ref" minOccurs="0"/>
 *         &lt;element name="parent-link-type" type="{http://fr.imag.adele/fede/workspace/model}c-operation-param-linktype-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="short-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-operation-param-item-description", propOrder = {
    "outgoingLink",
    "attributesValue",
    "parent",
    "parentLinkType"
})
public class COperationParamItemDescription
    extends COperationParamItemtypeRef
{

    @XmlElement(name = "outgoing-link")
    protected List<CLinkDescription> outgoingLink;
    @XmlElement(name = "attributes-value")
    protected List<CValuesType> attributesValue;
    protected COperationParamItemRef parent;
    @XmlElement(name = "parent-link-type")
    protected COperationParamLinktypeRef parentLinkType;
    @XmlAttribute(name = "short-name")
    protected String shortName;

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
     * {@link CLinkDescription }
     * 
     * 
     */
    public List<CLinkDescription> getOutgoingLink() {
        if (outgoingLink == null) {
            outgoingLink = new ArrayList<CLinkDescription>();
        }
        return this.outgoingLink;
    }

    /**
     * Gets the value of the attributesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CValuesType }
     * 
     * 
     */
    public List<CValuesType> getAttributesValue() {
        if (attributesValue == null) {
            attributesValue = new ArrayList<CValuesType>();
        }
        return this.attributesValue;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link COperationParamItemRef }
     *     
     */
    public COperationParamItemRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link COperationParamItemRef }
     *     
     */
    public void setParent(COperationParamItemRef value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link COperationParamLinktypeRef }
     *     
     */
    public COperationParamLinktypeRef getParentLinkType() {
        return parentLinkType;
    }

    /**
     * Sets the value of the parentLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link COperationParamLinktypeRef }
     *     
     */
    public void setParentLinkType(COperationParamLinktypeRef value) {
        this.parentLinkType = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

}
