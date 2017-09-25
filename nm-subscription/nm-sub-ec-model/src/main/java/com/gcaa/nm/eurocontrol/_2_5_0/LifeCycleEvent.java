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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventTime" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeSecond"/&gt;
 *         &lt;element name="userUpdateEventTime" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeSecond" minOccurs="0"/&gt;
 *         &lt;element name="userUpdateType" type="{eurocontrol/cfmu/b2b/FlowServices}LifeCycleEventType"/&gt;
 *         &lt;element name="userId" type="{eurocontrol/cfmu/b2b/CommonServices}UserId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleEvent", propOrder = {
    "eventTime",
    "userUpdateEventTime",
    "userUpdateType",
    "userId"
})
public class LifeCycleEvent {

    @XmlElement(required = true)
    protected String eventTime;
    protected String userUpdateEventTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String userUpdateType;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTime(String value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the userUpdateEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUpdateEventTime() {
        return userUpdateEventTime;
    }

    /**
     * Sets the value of the userUpdateEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUpdateEventTime(String value) {
        this.userUpdateEventTime = value;
    }

    /**
     * Gets the value of the userUpdateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUpdateType() {
        return userUpdateType;
    }

    /**
     * Sets the value of the userUpdateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUpdateType(String value) {
        this.userUpdateType = value;
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

}
