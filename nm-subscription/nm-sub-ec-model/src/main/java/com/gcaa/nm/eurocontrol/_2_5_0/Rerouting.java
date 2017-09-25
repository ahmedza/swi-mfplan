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
 * <p>Java class for Rerouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rerouting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}Measure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reroutingId" type="{eurocontrol/cfmu/b2b/FlowServices}ReroutingId"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="location-AirspaceLocation" type="{eurocontrol/cfmu/b2b/FlowServices}AirspaceLocation"/&gt;
 *           &lt;element name="location-SegmentLocation" type="{eurocontrol/cfmu/b2b/FlowServices}SegmentLocation"/&gt;
 *           &lt;element name="location-AerodromeLocation" type="{eurocontrol/cfmu/b2b/FlowServices}AerodromeLocation"/&gt;
 *           &lt;element name="location-DelayLocation" type="{eurocontrol/cfmu/b2b/FlowServices}DelayLocation"/&gt;
 *           &lt;element name="location-AllFlightsLocation" type="{eurocontrol/cfmu/b2b/FlowServices}AllFlightsLocation"/&gt;
 *           &lt;element name="location-SetOfAerodromesLocation" type="{eurocontrol/cfmu/b2b/FlowServices}SetOfAerodromesLocation"/&gt;
 *           &lt;element name="location-RestrictionLocation" type="{eurocontrol/cfmu/b2b/FlowServices}RestrictionLocation"/&gt;
 *           &lt;element name="location-PointLocation" type="{eurocontrol/cfmu/b2b/FlowServices}PointLocation"/&gt;
 *           &lt;element name="location-TrafficVolumeLocation" type="{eurocontrol/cfmu/b2b/FlowServices}TrafficVolumeLocation"/&gt;
 *           &lt;element name="location-CherryPickedLocation" type="{eurocontrol/cfmu/b2b/FlowServices}CherryPickedLocation"/&gt;
 *           &lt;element name="location-AoLocation" type="{eurocontrol/cfmu/b2b/FlowServices}AoLocation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="flowId" type="{eurocontrol/cfmu/b2b/FlowServices}FlowId" minOccurs="0"/&gt;
 *         &lt;element name="reroutingApplyKind" type="{eurocontrol/cfmu/b2b/FlowServices}ReroutingApplyKind" minOccurs="0"/&gt;
 *         &lt;element name="reroutingState" type="{eurocontrol/cfmu/b2b/FlowServices}ReroutingMeasureState" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="constraints-HorizontalReroutingConstraints" type="{eurocontrol/cfmu/b2b/FlowServices}HorizontalReroutingConstraints"/&gt;
 *           &lt;element name="constraints-ManualReroutingConstraints" type="{eurocontrol/cfmu/b2b/FlowServices}ManualReroutingConstraints"/&gt;
 *           &lt;element name="constraints-VerticalOrSpeedReroutingConstraints" type="{eurocontrol/cfmu/b2b/FlowServices}VerticalOrSpeedReroutingConstraints"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="remark" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;pattern value="([a-zA-Z0-9_ \-\+\\\|\*=,.;:?!'@#$%^\(\)\[\]\{\}]{1,128}([ \t\r\n][a-zA-Z0-9_ \-\+\\\|\*=,.;:?!'@#$%^\(\)\[\]\{\}]){0,1})"/&gt;
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
@XmlType(name = "Rerouting", propOrder = {
    "reroutingId",
    "locationAirspaceLocation",
    "locationSegmentLocation",
    "locationAerodromeLocation",
    "locationDelayLocation",
    "locationAllFlightsLocation",
    "locationSetOfAerodromesLocation",
    "locationRestrictionLocation",
    "locationPointLocation",
    "locationTrafficVolumeLocation",
    "locationCherryPickedLocation",
    "locationAoLocation",
    "flowId",
    "reroutingApplyKind",
    "reroutingState",
    "constraintsHorizontalReroutingConstraints",
    "constraintsManualReroutingConstraints",
    "constraintsVerticalOrSpeedReroutingConstraints",
    "remark"
})
public class Rerouting
    extends Measure
{

    @XmlElement(required = true)
    protected String reroutingId;
    @XmlElement(name = "location-AirspaceLocation")
    protected AirspaceLocation locationAirspaceLocation;
    @XmlElement(name = "location-SegmentLocation")
    protected SegmentLocation locationSegmentLocation;
    @XmlElement(name = "location-AerodromeLocation")
    protected AerodromeLocation locationAerodromeLocation;
    @XmlElement(name = "location-DelayLocation")
    protected DelayLocation locationDelayLocation;
    @XmlElement(name = "location-AllFlightsLocation")
    protected AllFlightsLocation locationAllFlightsLocation;
    @XmlElement(name = "location-SetOfAerodromesLocation")
    protected SetOfAerodromesLocation locationSetOfAerodromesLocation;
    @XmlElement(name = "location-RestrictionLocation")
    protected RestrictionLocation locationRestrictionLocation;
    @XmlElement(name = "location-PointLocation")
    protected PointLocation locationPointLocation;
    @XmlElement(name = "location-TrafficVolumeLocation")
    protected TrafficVolumeLocation locationTrafficVolumeLocation;
    @XmlElement(name = "location-CherryPickedLocation")
    protected CherryPickedLocation locationCherryPickedLocation;
    @XmlElement(name = "location-AoLocation")
    protected AoLocation locationAoLocation;
    protected String flowId;
    @XmlSchemaType(name = "anySimpleType")
    protected String reroutingApplyKind;
    @XmlSchemaType(name = "anySimpleType")
    protected String reroutingState;
    @XmlElement(name = "constraints-HorizontalReroutingConstraints")
    protected HorizontalReroutingConstraints constraintsHorizontalReroutingConstraints;
    @XmlElement(name = "constraints-ManualReroutingConstraints")
    protected ManualReroutingConstraints constraintsManualReroutingConstraints;
    @XmlElement(name = "constraints-VerticalOrSpeedReroutingConstraints")
    protected VerticalOrSpeedReroutingConstraints constraintsVerticalOrSpeedReroutingConstraints;
    protected String remark;

    /**
     * Gets the value of the reroutingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReroutingId() {
        return reroutingId;
    }

    /**
     * Sets the value of the reroutingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReroutingId(String value) {
        this.reroutingId = value;
    }

    /**
     * Gets the value of the locationAirspaceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLocation }
     *     
     */
    public AirspaceLocation getLocationAirspaceLocation() {
        return locationAirspaceLocation;
    }

    /**
     * Sets the value of the locationAirspaceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLocation }
     *     
     */
    public void setLocationAirspaceLocation(AirspaceLocation value) {
        this.locationAirspaceLocation = value;
    }

    /**
     * Gets the value of the locationSegmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentLocation }
     *     
     */
    public SegmentLocation getLocationSegmentLocation() {
        return locationSegmentLocation;
    }

    /**
     * Sets the value of the locationSegmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentLocation }
     *     
     */
    public void setLocationSegmentLocation(SegmentLocation value) {
        this.locationSegmentLocation = value;
    }

    /**
     * Gets the value of the locationAerodromeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeLocation }
     *     
     */
    public AerodromeLocation getLocationAerodromeLocation() {
        return locationAerodromeLocation;
    }

    /**
     * Sets the value of the locationAerodromeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeLocation }
     *     
     */
    public void setLocationAerodromeLocation(AerodromeLocation value) {
        this.locationAerodromeLocation = value;
    }

    /**
     * Gets the value of the locationDelayLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DelayLocation }
     *     
     */
    public DelayLocation getLocationDelayLocation() {
        return locationDelayLocation;
    }

    /**
     * Sets the value of the locationDelayLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayLocation }
     *     
     */
    public void setLocationDelayLocation(DelayLocation value) {
        this.locationDelayLocation = value;
    }

    /**
     * Gets the value of the locationAllFlightsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AllFlightsLocation }
     *     
     */
    public AllFlightsLocation getLocationAllFlightsLocation() {
        return locationAllFlightsLocation;
    }

    /**
     * Sets the value of the locationAllFlightsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllFlightsLocation }
     *     
     */
    public void setLocationAllFlightsLocation(AllFlightsLocation value) {
        this.locationAllFlightsLocation = value;
    }

    /**
     * Gets the value of the locationSetOfAerodromesLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfAerodromesLocation }
     *     
     */
    public SetOfAerodromesLocation getLocationSetOfAerodromesLocation() {
        return locationSetOfAerodromesLocation;
    }

    /**
     * Sets the value of the locationSetOfAerodromesLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfAerodromesLocation }
     *     
     */
    public void setLocationSetOfAerodromesLocation(SetOfAerodromesLocation value) {
        this.locationSetOfAerodromesLocation = value;
    }

    /**
     * Gets the value of the locationRestrictionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionLocation }
     *     
     */
    public RestrictionLocation getLocationRestrictionLocation() {
        return locationRestrictionLocation;
    }

    /**
     * Sets the value of the locationRestrictionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionLocation }
     *     
     */
    public void setLocationRestrictionLocation(RestrictionLocation value) {
        this.locationRestrictionLocation = value;
    }

    /**
     * Gets the value of the locationPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getLocationPointLocation() {
        return locationPointLocation;
    }

    /**
     * Sets the value of the locationPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setLocationPointLocation(PointLocation value) {
        this.locationPointLocation = value;
    }

    /**
     * Gets the value of the locationTrafficVolumeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficVolumeLocation }
     *     
     */
    public TrafficVolumeLocation getLocationTrafficVolumeLocation() {
        return locationTrafficVolumeLocation;
    }

    /**
     * Sets the value of the locationTrafficVolumeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficVolumeLocation }
     *     
     */
    public void setLocationTrafficVolumeLocation(TrafficVolumeLocation value) {
        this.locationTrafficVolumeLocation = value;
    }

    /**
     * Gets the value of the locationCherryPickedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CherryPickedLocation }
     *     
     */
    public CherryPickedLocation getLocationCherryPickedLocation() {
        return locationCherryPickedLocation;
    }

    /**
     * Sets the value of the locationCherryPickedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CherryPickedLocation }
     *     
     */
    public void setLocationCherryPickedLocation(CherryPickedLocation value) {
        this.locationCherryPickedLocation = value;
    }

    /**
     * Gets the value of the locationAoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AoLocation }
     *     
     */
    public AoLocation getLocationAoLocation() {
        return locationAoLocation;
    }

    /**
     * Sets the value of the locationAoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AoLocation }
     *     
     */
    public void setLocationAoLocation(AoLocation value) {
        this.locationAoLocation = value;
    }

    /**
     * Gets the value of the flowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowId(String value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the reroutingApplyKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReroutingApplyKind() {
        return reroutingApplyKind;
    }

    /**
     * Sets the value of the reroutingApplyKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReroutingApplyKind(String value) {
        this.reroutingApplyKind = value;
    }

    /**
     * Gets the value of the reroutingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReroutingState() {
        return reroutingState;
    }

    /**
     * Sets the value of the reroutingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReroutingState(String value) {
        this.reroutingState = value;
    }

    /**
     * Gets the value of the constraintsHorizontalReroutingConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link HorizontalReroutingConstraints }
     *     
     */
    public HorizontalReroutingConstraints getConstraintsHorizontalReroutingConstraints() {
        return constraintsHorizontalReroutingConstraints;
    }

    /**
     * Sets the value of the constraintsHorizontalReroutingConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorizontalReroutingConstraints }
     *     
     */
    public void setConstraintsHorizontalReroutingConstraints(HorizontalReroutingConstraints value) {
        this.constraintsHorizontalReroutingConstraints = value;
    }

    /**
     * Gets the value of the constraintsManualReroutingConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ManualReroutingConstraints }
     *     
     */
    public ManualReroutingConstraints getConstraintsManualReroutingConstraints() {
        return constraintsManualReroutingConstraints;
    }

    /**
     * Sets the value of the constraintsManualReroutingConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualReroutingConstraints }
     *     
     */
    public void setConstraintsManualReroutingConstraints(ManualReroutingConstraints value) {
        this.constraintsManualReroutingConstraints = value;
    }

    /**
     * Gets the value of the constraintsVerticalOrSpeedReroutingConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalOrSpeedReroutingConstraints }
     *     
     */
    public VerticalOrSpeedReroutingConstraints getConstraintsVerticalOrSpeedReroutingConstraints() {
        return constraintsVerticalOrSpeedReroutingConstraints;
    }

    /**
     * Sets the value of the constraintsVerticalOrSpeedReroutingConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalOrSpeedReroutingConstraints }
     *     
     */
    public void setConstraintsVerticalOrSpeedReroutingConstraints(VerticalOrSpeedReroutingConstraints value) {
        this.constraintsVerticalOrSpeedReroutingConstraints = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
