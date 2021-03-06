//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCDMTopicListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMTopicListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/CommonServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataset" type="{eurocontrol/cfmu/b2b/CommonServices}Dataset"/&gt;
 *         &lt;element name="date" type="{eurocontrol/cfmu/b2b/CommonServices}DateYearMonthDay"/&gt;
 *         &lt;element name="selector" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMTopicListRequestSelector"/&gt;
 *         &lt;element name="activeOnly"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="messagesSince" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeSecond" minOccurs="0"/&gt;
 *         &lt;element name="requestedMCDMTopicFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMTopicField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "MCDMTopicListRequest", propOrder = {
    "dataset",
    "date",
    "selector",
    "activeOnly",
    "messagesSince",
    "requestedMCDMTopicFields"
})
public class MCDMTopicListRequest
    extends Request
{

    @XmlElement(required = true)
    protected Dataset dataset;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected MCDMTopicListRequestSelector selector;
    protected boolean activeOnly;
    protected String messagesSince;
    protected MCDMTopicListRequest.RequestedMCDMTopicFields requestedMCDMTopicFields;

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link Dataset }
     *     
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset }
     *     
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMTopicListRequestSelector }
     *     
     */
    public MCDMTopicListRequestSelector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMTopicListRequestSelector }
     *     
     */
    public void setSelector(MCDMTopicListRequestSelector value) {
        this.selector = value;
    }

    /**
     * Gets the value of the activeOnly property.
     * 
     */
    public boolean isActiveOnly() {
        return activeOnly;
    }

    /**
     * Sets the value of the activeOnly property.
     * 
     */
    public void setActiveOnly(boolean value) {
        this.activeOnly = value;
    }

    /**
     * Gets the value of the messagesSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagesSince() {
        return messagesSince;
    }

    /**
     * Sets the value of the messagesSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagesSince(String value) {
        this.messagesSince = value;
    }

    /**
     * Gets the value of the requestedMCDMTopicFields property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMTopicListRequest.RequestedMCDMTopicFields }
     *     
     */
    public MCDMTopicListRequest.RequestedMCDMTopicFields getRequestedMCDMTopicFields() {
        return requestedMCDMTopicFields;
    }

    /**
     * Sets the value of the requestedMCDMTopicFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMTopicListRequest.RequestedMCDMTopicFields }
     *     
     */
    public void setRequestedMCDMTopicFields(MCDMTopicListRequest.RequestedMCDMTopicFields value) {
        this.requestedMCDMTopicFields = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMTopicField" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class RequestedMCDMTopicFields {

        @XmlSchemaType(name = "anySimpleType")
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }

}
