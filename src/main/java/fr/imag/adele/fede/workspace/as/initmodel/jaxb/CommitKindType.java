//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.05 at 05:39:02 PM CEST 
//

package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for commitKind-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="commitKind-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="conflict"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="reconcile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commitKind-type")
@XmlEnum
public enum CommitKindType {

	@XmlEnumValue("conflict")
	CONFLICT("conflict"), @XmlEnumValue("none")
	NONE("none"), @XmlEnumValue("reconcile")
	RECONCILE("reconcile");
	private final String	value;

	CommitKindType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static CommitKindType fromValue(String v) {
		for (CommitKindType c : CommitKindType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}