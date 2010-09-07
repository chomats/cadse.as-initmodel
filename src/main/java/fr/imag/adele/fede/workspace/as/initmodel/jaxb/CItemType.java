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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-item-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-item-type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-type-definition">
 *       &lt;attribute name="has-content" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="intID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="is-root-element" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is-abstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="display-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manager-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="error-valid-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pattern-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pattern-valid-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="default-short-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-item-type")
public class CItemType
    extends CTypeDefinition
{

    @XmlAttribute(name = "has-content", required = true)
    protected boolean hasContent;
    @XmlAttribute(required = true)
    protected int intID;
    @XmlAttribute(name = "is-root-element")
    protected Boolean isRootElement;
    @XmlAttribute(name = "is-abstract", required = true)
    protected boolean isAbstract;
    @XmlAttribute(name = "display-name")
    protected String displayName;
    @XmlAttribute(name = "manager-class")
    protected String managerClass;
    @XmlAttribute
    protected String icon;
    @XmlAttribute(name = "error-valid-id")
    protected String errorValidId;
    @XmlAttribute(name = "pattern-id")
    protected String patternId;
    @XmlAttribute(name = "pattern-valid-id")
    protected String patternValidId;
    @XmlAttribute
    protected Boolean hidden;
    @XmlAttribute(name = "default-short-name")
    protected String defaultShortName;

    /**
     * Gets the value of the hasContent property.
     * 
     */
    public boolean isHasContent() {
        return hasContent;
    }

    /**
     * Sets the value of the hasContent property.
     * 
     */
    public void setHasContent(boolean value) {
        this.hasContent = value;
    }

    /**
     * Gets the value of the intID property.
     * 
     */
    public int getIntID() {
        return intID;
    }

    /**
     * Sets the value of the intID property.
     * 
     */
    public void setIntID(int value) {
        this.intID = value;
    }

    /**
     * Gets the value of the isRootElement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRootElement() {
        return isRootElement;
    }

    /**
     * Sets the value of the isRootElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRootElement(Boolean value) {
        this.isRootElement = value;
    }

    /**
     * Gets the value of the isAbstract property.
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
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

    /**
     * Gets the value of the managerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerClass() {
        return managerClass;
    }

    /**
     * Sets the value of the managerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerClass(String value) {
        this.managerClass = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the errorValidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorValidId() {
        return errorValidId;
    }

    /**
     * Sets the value of the errorValidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorValidId(String value) {
        this.errorValidId = value;
    }

    /**
     * Gets the value of the patternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternId() {
        return patternId;
    }

    /**
     * Sets the value of the patternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternId(String value) {
        this.patternId = value;
    }

    /**
     * Gets the value of the patternValidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternValidId() {
        return patternValidId;
    }

    /**
     * Sets the value of the patternValidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternValidId(String value) {
        this.patternValidId = value;
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

}
