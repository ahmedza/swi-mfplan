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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessPSMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessPSMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/PublishsubscribeServices}PSMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="topic" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}SubscriptionTopic"/&gt;
 *         &lt;element name="subscriptionUuid" type="{eurocontrol/cfmu/b2b/CommonServices}UUID" minOccurs="0"/&gt;
 *         &lt;element name="parentMessageId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPSMessage", namespace = "eurocontrol/cfmu/b2b/PublishsubscribeServices", propOrder = {
    "topic",
    "subscriptionUuid",
    "parentMessageId"
})
@XmlSeeAlso({
    FlightDataMessage.class,
    FlightPlanMessage.class,
    RegulationMessage.class
})
public abstract class BusinessPSMessage
    extends PSMessage
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String topic;
    protected String subscriptionUuid;
    @XmlElement(required = true)
    protected String parentMessageId;

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the subscriptionUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionUuid() {
        return subscriptionUuid;
    }

    /**
     * Sets the value of the subscriptionUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionUuid(String value) {
        this.subscriptionUuid = value;
    }

    /**
     * Gets the value of the parentMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMessageId() {
        return parentMessageId;
    }

    /**
     * Sets the value of the parentMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMessageId(String value) {
        this.parentMessageId = value;
    }

}
