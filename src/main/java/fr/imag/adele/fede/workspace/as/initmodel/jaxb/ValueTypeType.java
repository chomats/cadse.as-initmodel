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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for value-type-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="value-type-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="enumeration"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="map"/>
 *     &lt;enumeration value="struct"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="item"/>
 *     &lt;enumeration value="itemtype"/>
 *     &lt;enumeration value="nullValue"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="symbolic-bit-map"/>
 *     &lt;enumeration value="uuid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "value-type-type")
@XmlEnum
public enum ValueTypeType {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("enumeration")
    ENUMERATION("enumeration"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("struct")
    STRUCT("struct"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("item")
    ITEM("item"),
    @XmlEnumValue("itemtype")
    ITEMTYPE("itemtype"),
    @XmlEnumValue("nullValue")
    NULL_VALUE("nullValue"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("symbolic-bit-map")
    SYMBOLIC_BIT_MAP("symbolic-bit-map"),
    @XmlEnumValue("uuid")
    UUID("uuid");
    private final String value;

    ValueTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypeType fromValue(String v) {
        for (ValueTypeType c: ValueTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
