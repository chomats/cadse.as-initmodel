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
