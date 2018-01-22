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
 * <p>Java class for FlightSetDefinitionElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSetDefinitionElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aircraftOperators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aircraftRegistrations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="anuIds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="20" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flightPlanOriginators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="20" minOccurs="0"/&gt;
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
@XmlType(name = "FlightSetDefinitionElement", namespace = "eurocontrol/cfmu/b2b/PublishsubscribeServices", propOrder = {
    "aircraftOperators",
    "aircraftRegistrations",
    "anuIds",
    "flightPlanOriginators"
})
public class FlightSetDefinitionElement {

    protected FlightSetDefinitionElement.AircraftOperators aircraftOperators;
    protected FlightSetDefinitionElement.AircraftRegistrations aircraftRegistrations;
    protected FlightSetDefinitionElement.AnuIds anuIds;
    protected FlightSetDefinitionElement.FlightPlanOriginators flightPlanOriginators;

    /**
     * Gets the value of the aircraftOperators property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSetDefinitionElement.AircraftOperators }
     *     
     */
    public FlightSetDefinitionElement.AircraftOperators getAircraftOperators() {
        return aircraftOperators;
    }

    /**
     * Sets the value of the aircraftOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSetDefinitionElement.AircraftOperators }
     *     
     */
    public void setAircraftOperators(FlightSetDefinitionElement.AircraftOperators value) {
        this.aircraftOperators = value;
    }

    /**
     * Gets the value of the aircraftRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSetDefinitionElement.AircraftRegistrations }
     *     
     */
    public FlightSetDefinitionElement.AircraftRegistrations getAircraftRegistrations() {
        return aircraftRegistrations;
    }

    /**
     * Sets the value of the aircraftRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSetDefinitionElement.AircraftRegistrations }
     *     
     */
    public void setAircraftRegistrations(FlightSetDefinitionElement.AircraftRegistrations value) {
        this.aircraftRegistrations = value;
    }

    /**
     * Gets the value of the anuIds property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSetDefinitionElement.AnuIds }
     *     
     */
    public FlightSetDefinitionElement.AnuIds getAnuIds() {
        return anuIds;
    }

    /**
     * Sets the value of the anuIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSetDefinitionElement.AnuIds }
     *     
     */
    public void setAnuIds(FlightSetDefinitionElement.AnuIds value) {
        this.anuIds = value;
    }

    /**
     * Gets the value of the flightPlanOriginators property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSetDefinitionElement.FlightPlanOriginators }
     *     
     */
    public FlightSetDefinitionElement.FlightPlanOriginators getFlightPlanOriginators() {
        return flightPlanOriginators;
    }

    /**
     * Sets the value of the flightPlanOriginators property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSetDefinitionElement.FlightPlanOriginators }
     *     
     */
    public void setFlightPlanOriginators(FlightSetDefinitionElement.FlightPlanOriginators value) {
        this.flightPlanOriginators = value;
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
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AircraftOperators {


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
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AircraftRegistrations {


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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="20" minOccurs="0"/&gt;
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
    public static class AnuIds {

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
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId" maxOccurs="20" minOccurs="0"/&gt;
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
    public static class FlightPlanOriginators {

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