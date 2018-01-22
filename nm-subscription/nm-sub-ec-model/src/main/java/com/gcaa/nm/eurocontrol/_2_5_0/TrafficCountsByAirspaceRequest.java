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
 * <p>Java class for TrafficCountsByAirspaceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficCountsByAirspaceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}TrafficCountsRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculationType" type="{eurocontrol/cfmu/b2b/FlowServices}CountsCalculationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficCountsByAirspaceRequest", propOrder = {
    "calculationType"
})
public class TrafficCountsByAirspaceRequest
    extends TrafficCountsRequest
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String calculationType;

    /**
     * Gets the value of the calculationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationType() {
        return calculationType;
    }

    /**
     * Sets the value of the calculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationType(String value) {
        this.calculationType = value;
    }

}
