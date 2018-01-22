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
 * <p>Java class for PlannedCapacity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlannedCapacity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicabilityPeriod" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinutePeriod"/&gt;
 *         &lt;element name="dataSource" type="{eurocontrol/cfmu/b2b/FlowServices}PlanDataSource"/&gt;
 *         &lt;element name="capacity" type="{eurocontrol/cfmu/b2b/FlowServices}Capacity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedCapacity", propOrder = {
    "applicabilityPeriod",
    "dataSource",
    "capacity"
})
public class PlannedCapacity {

    @XmlElement(required = true)
    protected DateTimeMinutePeriod applicabilityPeriod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanDataSource dataSource;
    protected Integer capacity;

    /**
     * Gets the value of the applicabilityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public DateTimeMinutePeriod getApplicabilityPeriod() {
        return applicabilityPeriod;
    }

    /**
     * Sets the value of the applicabilityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public void setApplicabilityPeriod(DateTimeMinutePeriod value) {
        this.applicabilityPeriod = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link PlanDataSource }
     *     
     */
    public PlanDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanDataSource }
     *     
     */
    public void setDataSource(PlanDataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

}
