//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationInitialConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationInitialConstraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="constraintPeriod" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinutePeriod"/&gt;
 *         &lt;element name="normalRate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pendingRate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="equipmentRate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="exceptionalConstraint" type="{eurocontrol/cfmu/b2b/FlowServices}RegulationExceptionalConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationInitialConstraint", propOrder = {
    "constraintPeriod",
    "normalRate",
    "pendingRate",
    "equipmentRate",
    "exceptionalConstraint"
})
public class RegulationInitialConstraint {

    @XmlElement(required = true)
    protected DateTimeMinutePeriod constraintPeriod;
    protected int normalRate;
    protected int pendingRate;
    protected int equipmentRate;
    protected RegulationExceptionalConstraint exceptionalConstraint;

    /**
     * Gets the value of the constraintPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public DateTimeMinutePeriod getConstraintPeriod() {
        return constraintPeriod;
    }

    /**
     * Sets the value of the constraintPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public void setConstraintPeriod(DateTimeMinutePeriod value) {
        this.constraintPeriod = value;
    }

    /**
     * Gets the value of the normalRate property.
     * 
     */
    public int getNormalRate() {
        return normalRate;
    }

    /**
     * Sets the value of the normalRate property.
     * 
     */
    public void setNormalRate(int value) {
        this.normalRate = value;
    }

    /**
     * Gets the value of the pendingRate property.
     * 
     */
    public int getPendingRate() {
        return pendingRate;
    }

    /**
     * Sets the value of the pendingRate property.
     * 
     */
    public void setPendingRate(int value) {
        this.pendingRate = value;
    }

    /**
     * Gets the value of the equipmentRate property.
     * 
     */
    public int getEquipmentRate() {
        return equipmentRate;
    }

    /**
     * Sets the value of the equipmentRate property.
     * 
     */
    public void setEquipmentRate(int value) {
        this.equipmentRate = value;
    }

    /**
     * Gets the value of the exceptionalConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationExceptionalConstraint }
     *     
     */
    public RegulationExceptionalConstraint getExceptionalConstraint() {
        return exceptionalConstraint;
    }

    /**
     * Sets the value of the exceptionalConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationExceptionalConstraint }
     *     
     */
    public void setExceptionalConstraint(RegulationExceptionalConstraint value) {
        this.exceptionalConstraint = value;
    }

}
