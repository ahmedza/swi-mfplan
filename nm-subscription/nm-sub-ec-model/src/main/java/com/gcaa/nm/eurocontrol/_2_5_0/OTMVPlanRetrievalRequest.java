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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTMVPlanRetrievalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTMVPlanRetrievalRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}TacticalConfigurationRetrievalRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficVolume" type="{eurocontrol/cfmu/b2b/FlowServices}TrafficVolumeId"/&gt;
 *         &lt;element name="otmvDuration" type="{eurocontrol/cfmu/b2b/CommonServices}DurationHourMinute" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTMVPlanRetrievalRequest", propOrder = {
    "trafficVolume",
    "otmvDuration"
})
public class OTMVPlanRetrievalRequest
    extends TacticalConfigurationRetrievalRequest
{

    @XmlElement(required = true)
    protected String trafficVolume;
    protected String otmvDuration;

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
     * Gets the value of the otmvDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtmvDuration() {
        return otmvDuration;
    }

    /**
     * Sets the value of the otmvDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtmvDuration(String value) {
        this.otmvDuration = value;
    }

}
