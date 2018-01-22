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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCDMMeasureTopic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMMeasureTopic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}MCDMStatefulTopic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userCategories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMRoleUserCategory" maxOccurs="1000" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deadlines" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMDeadlines" minOccurs="0"/&gt;
 *         &lt;element name="flightTopics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMFlightTopic" maxOccurs="1000" minOccurs="0"/&gt;
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
@XmlType(name = "MCDMMeasureTopic", propOrder = {
    "userCategories",
    "deadlines",
    "flightTopics"
})
public class MCDMMeasureTopic
    extends MCDMStatefulTopic
{

    protected MCDMMeasureTopic.UserCategories userCategories;
    protected MCDMDeadlines deadlines;
    protected MCDMMeasureTopic.FlightTopics flightTopics;

    /**
     * Gets the value of the userCategories property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMMeasureTopic.UserCategories }
     *     
     */
    public MCDMMeasureTopic.UserCategories getUserCategories() {
        return userCategories;
    }

    /**
     * Sets the value of the userCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMMeasureTopic.UserCategories }
     *     
     */
    public void setUserCategories(MCDMMeasureTopic.UserCategories value) {
        this.userCategories = value;
    }

    /**
     * Gets the value of the deadlines property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMDeadlines }
     *     
     */
    public MCDMDeadlines getDeadlines() {
        return deadlines;
    }

    /**
     * Sets the value of the deadlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMDeadlines }
     *     
     */
    public void setDeadlines(MCDMDeadlines value) {
        this.deadlines = value;
    }

    /**
     * Gets the value of the flightTopics property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMMeasureTopic.FlightTopics }
     *     
     */
    public MCDMMeasureTopic.FlightTopics getFlightTopics() {
        return flightTopics;
    }

    /**
     * Sets the value of the flightTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMMeasureTopic.FlightTopics }
     *     
     */
    public void setFlightTopics(MCDMMeasureTopic.FlightTopics value) {
        this.flightTopics = value;
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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMFlightTopic" maxOccurs="1000" minOccurs="0"/&gt;
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
    public static class FlightTopics {

        protected List<MCDMFlightTopic> item;

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
         * {@link MCDMFlightTopic }
         * 
         * 
         */
        public List<MCDMFlightTopic> getItem() {
            if (item == null) {
                item = new ArrayList<MCDMFlightTopic>();
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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMRoleUserCategory" maxOccurs="1000" minOccurs="0"/&gt;
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
    public static class UserCategories {

        protected List<MCDMRoleUserCategory> item;

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
         * {@link MCDMRoleUserCategory }
         * 
         * 
         */
        public List<MCDMRoleUserCategory> getItem() {
            if (item == null) {
                item = new ArrayList<MCDMRoleUserCategory>();
            }
            return this.item;
        }

    }

}
