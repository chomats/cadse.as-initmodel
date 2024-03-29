//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.08 at 11:19:31 AM CEST 
//


package fr.imag.adele.fede.workspace.as.initmodel.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c-link-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c-link-type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fr.imag.adele/fede/workspace/model}c-link">
 *       &lt;sequence>
 *         &lt;element name="constraints" type="{http://fr.imag.adele/fede/workspace/model}c-constraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isAggregation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isAnnotation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isComposition" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isGroup" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRequire" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isMapping" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isPart" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="destination" use="required" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="selection-expression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inverse-link" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="association-item-type" type="{http://fr.imag.adele/fede/workspace/model}uuid" />
 *       &lt;attribute name="intID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cst-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manager-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isNatif" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tw-evolution" type="{http://fr.imag.adele/fede/workspace/model}evolutionKind-type" />
 *       &lt;attribute name="tw-update" type="{http://fr.imag.adele/fede/workspace/model}updateKind-type" />
 *       &lt;attribute name="tw-commit" type="{http://fr.imag.adele/fede/workspace/model}commitKind-type" />
 *       &lt;attribute name="tw-rev-specific" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tw-evol-destination" type="{http://fr.imag.adele/fede/workspace/model}evolutionDestinationKind-type" />
 *       &lt;attribute name="tw-coupled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="flag" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-link-type", propOrder = {
    "constraints"
})
public class CLinkType
    extends CLink
{

    protected List<CConstraint> constraints;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected int min;
    @XmlAttribute(required = true)
    protected int max;
    @XmlAttribute(required = true)
    protected boolean isAggregation;
    @XmlAttribute(required = true)
    protected boolean isAnnotation;
    @XmlAttribute(required = true)
    protected boolean isComposition;
    @XmlAttribute(required = true)
    protected boolean isGroup;
    @XmlAttribute(required = true)
    protected boolean isRequire;
    @XmlAttribute(required = true)
    protected boolean isMapping;
    @XmlAttribute(required = true)
    protected boolean isPart;
    @XmlAttribute(required = true)
    protected String destination;
    @XmlAttribute(name = "selection-expression")
    protected String selectionExpression;
    @XmlAttribute(name = "inverse-link")
    protected String inverseLink;
    @XmlAttribute(name = "association-item-type")
    protected String associationItemType;
    @XmlAttribute(required = true)
    protected int intID;
    @XmlAttribute(name = "cst-name")
    protected String cstName;
    @XmlAttribute(name = "manager-class")
    protected String managerClass;
    @XmlAttribute
    protected Boolean isNatif;
    @XmlAttribute(name = "tw-evolution")
    protected EvolutionKindType twEvolution;
    @XmlAttribute(name = "tw-update")
    protected UpdateKindType twUpdate;
    @XmlAttribute(name = "tw-commit")
    protected CommitKindType twCommit;
    @XmlAttribute(name = "tw-rev-specific", required = true)
    protected boolean twRevSpecific;
    @XmlAttribute(name = "tw-evol-destination")
    protected EvolutionDestinationKindType twEvolDestination;
    @XmlAttribute(name = "tw-coupled", required = true)
    protected boolean twCoupled;
    @XmlAttribute
    protected Boolean hidden;
    @XmlAttribute
    protected Integer flag;

    /**
     * Gets the value of the constraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CConstraint }
     * 
     * 
     */
    public List<CConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new ArrayList<CConstraint>();
        }
        return this.constraints;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the min property.
     * 
     */
    public int getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     */
    public void setMin(int value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

    /**
     * Gets the value of the isAggregation property.
     * 
     */
    public boolean isIsAggregation() {
        return isAggregation;
    }

    /**
     * Sets the value of the isAggregation property.
     * 
     */
    public void setIsAggregation(boolean value) {
        this.isAggregation = value;
    }

    /**
     * Gets the value of the isAnnotation property.
     * 
     */
    public boolean isIsAnnotation() {
        return isAnnotation;
    }

    /**
     * Sets the value of the isAnnotation property.
     * 
     */
    public void setIsAnnotation(boolean value) {
        this.isAnnotation = value;
    }

    /**
     * Gets the value of the isComposition property.
     * 
     */
    public boolean isIsComposition() {
        return isComposition;
    }

    /**
     * Sets the value of the isComposition property.
     * 
     */
    public void setIsComposition(boolean value) {
        this.isComposition = value;
    }

    /**
     * Gets the value of the isGroup property.
     * 
     */
    public boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     */
    public void setIsGroup(boolean value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the isRequire property.
     * 
     */
    public boolean isIsRequire() {
        return isRequire;
    }

    /**
     * Sets the value of the isRequire property.
     * 
     */
    public void setIsRequire(boolean value) {
        this.isRequire = value;
    }

    /**
     * Gets the value of the isMapping property.
     * 
     */
    public boolean isIsMapping() {
        return isMapping;
    }

    /**
     * Sets the value of the isMapping property.
     * 
     */
    public void setIsMapping(boolean value) {
        this.isMapping = value;
    }

    /**
     * Gets the value of the isPart property.
     * 
     */
    public boolean isIsPart() {
        return isPart;
    }

    /**
     * Sets the value of the isPart property.
     * 
     */
    public void setIsPart(boolean value) {
        this.isPart = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the selectionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionExpression() {
        return selectionExpression;
    }

    /**
     * Sets the value of the selectionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionExpression(String value) {
        this.selectionExpression = value;
    }

    /**
     * Gets the value of the inverseLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverseLink() {
        return inverseLink;
    }

    /**
     * Sets the value of the inverseLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverseLink(String value) {
        this.inverseLink = value;
    }

    /**
     * Gets the value of the associationItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationItemType() {
        return associationItemType;
    }

    /**
     * Sets the value of the associationItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationItemType(String value) {
        this.associationItemType = value;
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
     * Gets the value of the isNatif property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNatif() {
        return isNatif;
    }

    /**
     * Sets the value of the isNatif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNatif(Boolean value) {
        this.isNatif = value;
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

    /**
     * Gets the value of the twEvolDestination property.
     * 
     * @return
     *     possible object is
     *     {@link EvolutionDestinationKindType }
     *     
     */
    public EvolutionDestinationKindType getTwEvolDestination() {
        return twEvolDestination;
    }

    /**
     * Sets the value of the twEvolDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvolutionDestinationKindType }
     *     
     */
    public void setTwEvolDestination(EvolutionDestinationKindType value) {
        this.twEvolDestination = value;
    }

    /**
     * Gets the value of the twCoupled property.
     * 
     */
    public boolean isTwCoupled() {
        return twCoupled;
    }

    /**
     * Sets the value of the twCoupled property.
     * 
     */
    public void setTwCoupled(boolean value) {
        this.twCoupled = value;
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

}
