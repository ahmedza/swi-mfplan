//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Measure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Measure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataId" type="{eurocontrol/cfmu/b2b/CommonServices}PlanDataId" minOccurs="0"/&gt;
 *         &lt;element name="applicability" type="{eurocontrol/cfmu/b2b/CommonServices}DateTimeMinutePeriod" minOccurs="0"/&gt;
 *         &lt;element name="measureCherryPicked" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastUpdate" type="{eurocontrol/cfmu/b2b/FlowServices}LifeCycleEvent" minOccurs="0"/&gt;
 *         &lt;element name="externallyEditable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subType" type="{eurocontrol/cfmu/b2b/FlowServices}MeasureSubType" minOccurs="0"/&gt;
 *         &lt;element name="createdByFMP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mcdmRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sourceHotspot" type="{eurocontrol/cfmu/b2b/FlowServices}HotspotId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure", propOrder = {
    "dataId",
    "applicability",
    "measureCherryPicked",
    "lastUpdate",
    "externallyEditable",
    "subType",
    "createdByFMP",
    "mcdmRequired",
    "sourceHotspot"
})
@XmlSeeAlso({
    RegulationOrMCDMOnly.class,
    Rerouting.class
})
public abstract class Measure {

    protected String dataId;
    protected DateTimeMinutePeriod applicability;
    protected Boolean measureCherryPicked;
    protected LifeCycleEvent lastUpdate;
    protected Boolean externallyEditable;
    @XmlSchemaType(name = "anySimpleType")
    protected String subType;
    protected Boolean createdByFMP;
    protected Boolean mcdmRequired;
    protected HotspotId sourceHotspot;

    /**
     * Gets the value of the dataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * Sets the value of the dataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataId(String value) {
        this.dataId = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public DateTimeMinutePeriod getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeMinutePeriod }
     *     
     */
    public void setApplicability(DateTimeMinutePeriod value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the measureCherryPicked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasureCherryPicked() {
        return measureCherryPicked;
    }

    /**
     * Sets the value of the measureCherryPicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasureCherryPicked(Boolean value) {
        this.measureCherryPicked = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleEvent }
     *     
     */
    public LifeCycleEvent getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleEvent }
     *     
     */
    public void setLastUpdate(LifeCycleEvent value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the externallyEditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternallyEditable() {
        return externallyEditable;
    }

    /**
     * Sets the value of the externallyEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternallyEditable(Boolean value) {
        this.externallyEditable = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the createdByFMP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedByFMP() {
        return createdByFMP;
    }

    /**
     * Sets the value of the createdByFMP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedByFMP(Boolean value) {
        this.createdByFMP = value;
    }

    /**
     * Gets the value of the mcdmRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMcdmRequired() {
        return mcdmRequired;
    }

    /**
     * Sets the value of the mcdmRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMcdmRequired(Boolean value) {
        this.mcdmRequired = value;
    }

    /**
     * Gets the value of the sourceHotspot property.
     * 
     * @return
     *     possible object is
     *     {@link HotspotId }
     *     
     */
    public HotspotId getSourceHotspot() {
        return sourceHotspot;
    }

    /**
     * Sets the value of the sourceHotspot property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotspotId }
     *     
     */
    public void setSourceHotspot(HotspotId value) {
        this.sourceHotspot = value;
    }

}
