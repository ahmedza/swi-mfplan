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
 * <p>Java class for SubscriptionTechnicalMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTechnicalMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/PublishsubscribeServices}TechnicalPSMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionUuid" type="{eurocontrol/cfmu/b2b/CommonServices}UUID"/&gt;
 *         &lt;element name="subscriptionTopic" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}SubscriptionTopic" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value=".{1,500}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subscriptionState" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}SubscriptionState"/&gt;
 *         &lt;element name="lastUpdatedBy"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value=".{1,100}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastUpdatedOn" type="{eurocontrol/cfmu/b2b/CommonServices}Timestamp"/&gt;
 *         &lt;element name="lastUpdateReason" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}SubscriptionUpdateReason"/&gt;
 *         &lt;element name="lastUpdateComment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
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
@XmlType(name = "SubscriptionTechnicalMessage", namespace = "eurocontrol/cfmu/b2b/PublishsubscribeServices", propOrder = {
    "subscriptionUuid",
    "subscriptionTopic",
    "subscriptionDescription",
    "subscriptionState",
    "lastUpdatedBy",
    "lastUpdatedOn",
    "lastUpdateReason",
    "lastUpdateComment"
})
public class SubscriptionTechnicalMessage
    extends TechnicalPSMessage
{

    @XmlElement(required = true)
    protected String subscriptionUuid;
    @XmlSchemaType(name = "anySimpleType")
    protected String subscriptionTopic;
    protected String subscriptionDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String subscriptionState;
    @XmlElement(required = true)
    protected String lastUpdatedBy;
    @XmlElement(required = true)
    protected String lastUpdatedOn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String lastUpdateReason;
    protected String lastUpdateComment;

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
     * Gets the value of the subscriptionTopic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionTopic() {
        return subscriptionTopic;
    }

    /**
     * Sets the value of the subscriptionTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionTopic(String value) {
        this.subscriptionTopic = value;
    }

    /**
     * Gets the value of the subscriptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    /**
     * Sets the value of the subscriptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionDescription(String value) {
        this.subscriptionDescription = value;
    }

    /**
     * Gets the value of the subscriptionState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Sets the value of the subscriptionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionState(String value) {
        this.subscriptionState = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the lastUpdatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    /**
     * Sets the value of the lastUpdatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedOn(String value) {
        this.lastUpdatedOn = value;
    }

    /**
     * Gets the value of the lastUpdateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateReason() {
        return lastUpdateReason;
    }

    /**
     * Sets the value of the lastUpdateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateReason(String value) {
        this.lastUpdateReason = value;
    }

    /**
     * Gets the value of the lastUpdateComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateComment() {
        return lastUpdateComment;
    }

    /**
     * Sets the value of the lastUpdateComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateComment(String value) {
        this.lastUpdateComment = value;
    }

}