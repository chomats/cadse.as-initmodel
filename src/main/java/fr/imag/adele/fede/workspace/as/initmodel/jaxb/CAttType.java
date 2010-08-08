//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.08 at 07:29:05 PM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-att-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-att-type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-item">
 *       &lt;sequence>
 *         &lt;element name="sub-att-type" type="{http://fr.imag.adele/fede/workspace/model}c-att-type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type-value" type="{http://fr.imag.adele/fede/workspace/model}value-type-type" />
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cst-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flag" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tw-evolution" type="{http://fr.imag.adele/fede/workspace/model}evolutionKind-type" />
 *       &lt;attribute name="tw-update" type="{http://fr.imag.adele/fede/workspace/model}updateKind-type" />
 *       &lt;attribute name="tw-commit" type="{http://fr.imag.adele/fede/workspace/model}commitKind-type" />
 *       &lt;attribute name="tw-rev-specific" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-att-type", propOrder = {
    "subAttType"
})
public class CAttType
    extends CItem
{

    @XmlElement(name = "sub-att-type")
    protected List<CAttType> subAttType;
    @XmlAttribute
    protected String value;
    @XmlAttribute(name = "type-value")
    protected ValueTypeType typeValue;
    @XmlAttribute
    protected Integer min;
    @XmlAttribute
    protected Integer max;
    @XmlAttribute(name = "cst-name")
    protected String cstName;
    @XmlAttribute
    protected Integer flag;
    @XmlAttribute(name = "tw-evolution")
    protected EvolutionKindType twEvolution;
    @XmlAttribute(name = "tw-update")
    protected UpdateKindType twUpdate;
    @XmlAttribute(name = "tw-commit")
    protected CommitKindType twCommit;
    @XmlAttribute(name = "tw-rev-specific", required = true)
    protected boolean twRevSpecific;

    /**
     * Gets the value of the subAttType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAttType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAttType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAttType }
     * 
     * 
     */
    public List<CAttType> getSubAttType() {
        if (subAttType == null) {
            subAttType = new ArrayList<CAttType>();
        }
        return this.subAttType;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the typeValue property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeType }
     *     
     */
    public ValueTypeType getTypeValue() {
        return typeValue;
    }

    /**
     * Sets the value of the typeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeType }
     *     
     */
    public void setTypeValue(ValueTypeType value) {
        this.typeValue = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMin(Integer value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMax(Integer value) {
        this.max = value;
    }

    /**
     * Gets the value of the cstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstName() {
        return cstName;
    }

    /**
     * Sets the value of the cstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstName(String value) {
        this.cstName = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlag(Integer value) {
        this.flag = value;
    }

    /**
     * Gets the value of the twEvolution property.
     * 
     * @return
     *     possible object is
     *     {@link EvolutionKindType }
     *     
     */
    public EvolutionKindType getTwEvolution() {
        return twEvolution;
    }

    /**
     * Sets the value of the twEvolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvolutionKindType }
     *     
     */
    public void setTwEvolution(EvolutionKindType value) {
        this.twEvolution = value;
    }

    /**
     * Gets the value of the twUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateKindType }
     *     
     */
    public UpdateKindType getTwUpdate() {
        return twUpdate;
    }

    /**
     * Sets the value of the twUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateKindType }
     *     
     */
    public void setTwUpdate(UpdateKindType value) {
        this.twUpdate = value;
    }

    /**
     * Gets the value of the twCommit property.
     * 
     * @return
     *     possible object is
     *     {@link CommitKindType }
     *     
     */
    public CommitKindType getTwCommit() {
        return twCommit;
    }

    /**
     * Sets the value of the twCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitKindType }
     *     
     */
    public void setTwCommit(CommitKindType value) {
        this.twCommit = value;
    }

    /**
     * Gets the value of the twRevSpecific property.
     * 
     */
    public boolean isTwRevSpecific() {
        return twRevSpecific;
    }

    /**
     * Sets the value of the twRevSpecific property.
     * 
     */
    public void setTwRevSpecific(boolean value) {
        this.twRevSpecific = value;
    }

}
