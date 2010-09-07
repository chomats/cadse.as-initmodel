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
 * <p>Java class for evolutionKind-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="evolutionKind-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="transient"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="mutable"/>
 *     &lt;enumeration value="immutable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "evolutionKind-type")
@XmlEnum
public enum EvolutionKindType {

    @XmlEnumValue("transient")
    TRANSIENT("transient"),
    @XmlEnumValue("final")
    FINAL("final"),
    @XmlEnumValue("mutable")
    MUTABLE("mutable"),
    @XmlEnumValue("immutable")
    IMMUTABLE("immutable");
    private final String value;

    EvolutionKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EvolutionKindType fromValue(String v) {
        for (EvolutionKindType c: EvolutionKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
