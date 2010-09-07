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
 * <p>Java class for c-ext-biding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-ext-biding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="uuid_it" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="uuid_ext" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-ext-biding")
public class CExtBiding {

    @XmlAttribute(name = "uuid_it")
    protected String uuidIt;
    @XmlAttribute(name = "uuid_ext")
    protected String uuidExt;

    /**
     * Gets the value of the uuidIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidIt() {
        return uuidIt;
    }

    /**
     * Sets the value of the uuidIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidIt(String value) {
        this.uuidIt = value;
    }

    /**
     * Gets the value of the uuidExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidExt() {
        return uuidExt;
    }

    /**
     * Sets the value of the uuidExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidExt(String value) {
        this.uuidExt = value;
    }

}
