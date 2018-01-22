//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationExceptionalConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationExceptionalConstraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="runwayVisualRange" type="{eurocontrol/cfmu/b2b/CommonServices}DistanceM" minOccurs="0"/&gt;
 *         &lt;element name="fcmMandatory"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shift"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationExceptionalConstraint", propOrder = {
    "runwayVisualRange",
    "fcmMandatory",
    "shift"
})
public class RegulationExceptionalConstraint {

    protected Integer runwayVisualRange;
    protected boolean fcmMandatory;
    protected boolean shift;

    /**
     * Gets the value of the runwayVisualRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunwayVisualRange() {
        return runwayVisualRange;
    }

    /**
     * Sets the value of the runwayVisualRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunwayVisualRange(Integer value) {
        this.runwayVisualRange = value;
    }

    /**
     * Gets the value of the fcmMandatory property.
     * 
     */
    public boolean isFcmMandatory() {
        return fcmMandatory;
    }

    /**
     * Sets the value of the fcmMandatory property.
     * 
     */
    public void setFcmMandatory(boolean value) {
        this.fcmMandatory = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     */
    public boolean isShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     */
    public void setShift(boolean value) {
        this.shift = value;
    }

}