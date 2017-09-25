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
 * <p>Java class for LastUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeSecond"/&gt;
 *         &lt;element name="userId" type="{eurocontrol/cfmu/b2b/CommonServices}UserId"/&gt;
 *         &lt;element name="airNavigationUnitId" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastUpdate", namespace = "eurocontrol/cfmu/b2b/CommonServices", propOrder = {
    "timestamp",
    "userId",
    "airNavigationUnitId"
})
public class LastUpdate {

    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(required = true)
    protected String userId;
    protected String airNavigationUnitId;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the airNavigationUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirNavigationUnitId() {
        return airNavigationUnitId;
    }

    /**
     * Sets the value of the airNavigationUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirNavigationUnitId(String value) {
        this.airNavigationUnitId = value;
    }

}
