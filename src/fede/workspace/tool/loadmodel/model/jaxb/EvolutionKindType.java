//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.05 at 05:39:02 PM CEST 
//


package fede.workspace.tool.loadmodel.model.jaxb;

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
