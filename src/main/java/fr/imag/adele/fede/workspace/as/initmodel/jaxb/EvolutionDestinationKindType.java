//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.08 at 07:29:05 PM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evolutionDestinationKind-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="evolutionDestinationKind-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="branch"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="mutable"/>
 *     &lt;enumeration value="immutable"/>
 *     &lt;enumeration value="effective"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "evolutionDestinationKind-type")
@XmlEnum
public enum EvolutionDestinationKindType {

    @XmlEnumValue("branch")
    BRANCH("branch"),
    @XmlEnumValue("final")
    FINAL("final"),
    @XmlEnumValue("mutable")
    MUTABLE("mutable"),
    @XmlEnumValue("immutable")
    IMMUTABLE("immutable"),
    @XmlEnumValue("effective")
    EFFECTIVE("effective");
    private final String value;

    EvolutionDestinationKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EvolutionDestinationKindType fromValue(String v) {
        for (EvolutionDestinationKindType c: EvolutionDestinationKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
