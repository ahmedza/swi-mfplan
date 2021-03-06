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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightPlanMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPlanMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/PublishsubscribeServices}BusinessPSMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventHistory" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}FlightPlanEventHistoryItem" maxOccurs="1000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="originatorAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="concernedUnits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FlightPlanMessage", namespace = "eurocontrol/cfmu/b2b/PublishsubscribeServices", propOrder = {
    "eventHistory",
    "originatorAddress",
    "concernedUnits"
})
public class FlightPlanMessage
    extends BusinessPSMessage
{

    protected FlightPlanMessage.EventHistory eventHistory;
    @XmlElement(required = true)
    protected String originatorAddress;
    protected FlightPlanMessage.ConcernedUnits concernedUnits;

    /**
     * Gets the value of the eventHistory property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPlanMessage.EventHistory }
     *     
     */
    public FlightPlanMessage.EventHistory getEventHistory() {
        return eventHistory;
    }

    /**
     * Sets the value of the eventHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPlanMessage.EventHistory }
     *     
     */
    public void setEventHistory(FlightPlanMessage.EventHistory value) {
        this.eventHistory = value;
    }

    /**
     * Gets the value of the originatorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorAddress() {
        return originatorAddress;
    }

    /**
     * Sets the value of the originatorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorAddress(String value) {
        this.originatorAddress = value;
    }

    /**
     * Gets the value of the concernedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPlanMessage.ConcernedUnits }
     *     
     */
    public FlightPlanMessage.ConcernedUnits getConcernedUnits() {
        return concernedUnits;
    }

    /**
     * Sets the value of the concernedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPlanMessage.ConcernedUnits }
     *     
     */
    public void setConcernedUnits(FlightPlanMessage.ConcernedUnits value) {
        this.concernedUnits = value;
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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ConcernedUnits {

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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/PublishsubscribeServices}FlightPlanEventHistoryItem" maxOccurs="1000"/&gt;
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
    public static class EventHistory {

        @XmlElement(required = true)
        protected List<FlightPlanEventHistoryItem> item;

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
         * {@link FlightPlanEventHistoryItem }
         * 
         * 
         */
        public List<FlightPlanEventHistoryItem> getItem() {
            if (item == null) {
                item = new ArrayList<FlightPlanEventHistoryItem>();
            }
            return this.item;
        }

    }

}
