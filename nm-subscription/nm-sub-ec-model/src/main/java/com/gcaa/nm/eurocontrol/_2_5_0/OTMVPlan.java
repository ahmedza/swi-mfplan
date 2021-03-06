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
 * <p>Java class for OTMVPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTMVPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}TacticalConfigurationPlan"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficVolume" type="{eurocontrol/cfmu/b2b/FlowServices}TrafficVolumeId"/&gt;
 *         &lt;element name="otmvPlans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{eurocontrol/cfmu/b2b/CommonServices}DurationHourMinute"/&gt;
 *                             &lt;element name="value" type="{eurocontrol/cfmu/b2b/FlowServices}OTMVPlanForDuration"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "OTMVPlan", propOrder = {
    "trafficVolume",
    "otmvPlans"
})
public class OTMVPlan
    extends TacticalConfigurationPlan
{

    @XmlElement(required = true)
    protected String trafficVolume;
    protected OTMVPlan.OtmvPlans otmvPlans;

    /**
     * Gets the value of the trafficVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficVolume() {
        return trafficVolume;
    }

    /**
     * Sets the value of the trafficVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficVolume(String value) {
        this.trafficVolume = value;
    }

    /**
     * Gets the value of the otmvPlans property.
     * 
     * @return
     *     possible object is
     *     {@link OTMVPlan.OtmvPlans }
     *     
     */
    public OTMVPlan.OtmvPlans getOtmvPlans() {
        return otmvPlans;
    }

    /**
     * Sets the value of the otmvPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTMVPlan.OtmvPlans }
     *     
     */
    public void setOtmvPlans(OTMVPlan.OtmvPlans value) {
        this.otmvPlans = value;
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{eurocontrol/cfmu/b2b/CommonServices}DurationHourMinute"/&gt;
     *                   &lt;element name="value" type="{eurocontrol/cfmu/b2b/FlowServices}OTMVPlanForDuration"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class OtmvPlans {

        protected List<OTMVPlan.OtmvPlans.Item> item;

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
         * {@link OTMVPlan.OtmvPlans.Item }
         * 
         * 
         */
        public List<OTMVPlan.OtmvPlans.Item> getItem() {
            if (item == null) {
                item = new ArrayList<OTMVPlan.OtmvPlans.Item>();
            }
            return this.item;
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
         *         &lt;element name="key" type="{eurocontrol/cfmu/b2b/CommonServices}DurationHourMinute"/&gt;
         *         &lt;element name="value" type="{eurocontrol/cfmu/b2b/FlowServices}OTMVPlanForDuration"/&gt;
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
            "key",
            "value"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String key;
            @XmlElement(required = true)
            protected OTMVPlanForDuration value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link OTMVPlanForDuration }
             *     
             */
            public OTMVPlanForDuration getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTMVPlanForDuration }
             *     
             */
            public void setValue(OTMVPlanForDuration value) {
                this.value = value;
            }

        }

    }

}
