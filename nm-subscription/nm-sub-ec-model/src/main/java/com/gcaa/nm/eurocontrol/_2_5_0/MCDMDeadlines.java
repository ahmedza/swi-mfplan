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
 * <p>Java class for MCDMDeadlines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMDeadlines"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeToCoordinate" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinute" minOccurs="0"/&gt;
 *         &lt;element name="timeToStartImplement" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinute" minOccurs="0"/&gt;
 *         &lt;element name="timeToImplement" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinute" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCDMDeadlines", propOrder = {
    "timeToCoordinate",
    "timeToStartImplement",
    "timeToImplement"
})
public class MCDMDeadlines {

    protected String timeToCoordinate;
    protected String timeToStartImplement;
    protected String timeToImplement;

    /**
     * Gets the value of the timeToCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToCoordinate() {
        return timeToCoordinate;
    }

    /**
     * Sets the value of the timeToCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToCoordinate(String value) {
        this.timeToCoordinate = value;
    }

    /**
     * Gets the value of the timeToStartImplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToStartImplement() {
        return timeToStartImplement;
    }

    /**
     * Sets the value of the timeToStartImplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToStartImplement(String value) {
        this.timeToStartImplement = value;
    }

    /**
     * Gets the value of the timeToImplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToImplement() {
        return timeToImplement;
    }

    /**
     * Sets the value of the timeToImplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToImplement(String value) {
        this.timeToImplement = value;
    }

}
