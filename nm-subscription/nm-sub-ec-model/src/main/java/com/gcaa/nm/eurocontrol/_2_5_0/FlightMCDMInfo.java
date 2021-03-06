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
 * <p>Java class for FlightMCDMInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightMCDMInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstAssociatedMCDMMeasure" type="{eurocontrol/cfmu/b2b/FlowServices}MeasureId"/&gt;
 *         &lt;element name="nrAssociatedMCDMRegulations"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nrAssociatedMCDMReroutings"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nrAssociatedMCDMOnlyMeasures"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="worstMCDMState" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMState"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightMCDMInfo", propOrder = {
    "firstAssociatedMCDMMeasure",
    "nrAssociatedMCDMRegulations",
    "nrAssociatedMCDMReroutings",
    "nrAssociatedMCDMOnlyMeasures",
    "worstMCDMState"
})
public class FlightMCDMInfo {

    @XmlElement(required = true)
    protected MeasureId firstAssociatedMCDMMeasure;
    protected int nrAssociatedMCDMRegulations;
    protected int nrAssociatedMCDMReroutings;
    protected int nrAssociatedMCDMOnlyMeasures;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String worstMCDMState;

    /**
     * Gets the value of the firstAssociatedMCDMMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureId }
     *     
     */
    public MeasureId getFirstAssociatedMCDMMeasure() {
        return firstAssociatedMCDMMeasure;
    }

    /**
     * Sets the value of the firstAssociatedMCDMMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureId }
     *     
     */
    public void setFirstAssociatedMCDMMeasure(MeasureId value) {
        this.firstAssociatedMCDMMeasure = value;
    }

    /**
     * Gets the value of the nrAssociatedMCDMRegulations property.
     * 
     */
    public int getNrAssociatedMCDMRegulations() {
        return nrAssociatedMCDMRegulations;
    }

    /**
     * Sets the value of the nrAssociatedMCDMRegulations property.
     * 
     */
    public void setNrAssociatedMCDMRegulations(int value) {
        this.nrAssociatedMCDMRegulations = value;
    }

    /**
     * Gets the value of the nrAssociatedMCDMReroutings property.
     * 
     */
    public int getNrAssociatedMCDMReroutings() {
        return nrAssociatedMCDMReroutings;
    }

    /**
     * Sets the value of the nrAssociatedMCDMReroutings property.
     * 
     */
    public void setNrAssociatedMCDMReroutings(int value) {
        this.nrAssociatedMCDMReroutings = value;
    }

    /**
     * Gets the value of the nrAssociatedMCDMOnlyMeasures property.
     * 
     */
    public int getNrAssociatedMCDMOnlyMeasures() {
        return nrAssociatedMCDMOnlyMeasures;
    }

    /**
     * Sets the value of the nrAssociatedMCDMOnlyMeasures property.
     * 
     */
    public void setNrAssociatedMCDMOnlyMeasures(int value) {
        this.nrAssociatedMCDMOnlyMeasures = value;
    }

    /**
     * Gets the value of the worstMCDMState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorstMCDMState() {
        return worstMCDMState;
    }

    /**
     * Sets the value of the worstMCDMState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorstMCDMState(String value) {
        this.worstMCDMState = value;
    }

}
