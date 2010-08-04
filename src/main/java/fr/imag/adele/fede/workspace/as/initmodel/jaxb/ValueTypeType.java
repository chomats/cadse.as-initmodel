//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.04 at 09:59:12 AM CEST 
//


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
