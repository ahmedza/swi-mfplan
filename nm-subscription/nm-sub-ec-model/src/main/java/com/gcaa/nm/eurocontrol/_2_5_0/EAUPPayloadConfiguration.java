//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAUPPayloadConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAUPPayloadConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/PublishsubscribeServices}SubscriptionPayloadConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeCDROpeningsClosures"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="includeRSAAllocations"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
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
@XmlType(name = "EAUPPayloadConfiguration", namespace = "eurocontrol/cfmu/b2b/PublishsubscribeServices", propOrder = {
    "includeCDROpeningsClosures",
    "includeRSAAllocations"
})
public class EAUPPayloadConfiguration
    extends SubscriptionPayloadConfiguration
{

    protected boolean includeCDROpeningsClosures;
    protected boolean includeRSAAllocations;

    /**
     * Gets the value of the includeCDROpeningsClosures property.
     * 
     */
    public boolean isIncludeCDROpeningsClosures() {
        return includeCDROpeningsClosures;
    }

    /**
     * Sets the value of the includeCDROpeningsClosures property.
     * 
     */
    public void setIncludeCDROpeningsClosures(boolean value) {
        this.includeCDROpeningsClosures = value;
    }

    /**
     * Gets the value of the includeRSAAllocations property.
     * 
     */
    public boolean isIncludeRSAAllocations() {
        return includeRSAAllocations;
    }

    /**
     * Sets the value of the includeRSAAllocations property.
     * 
     */
    public void setIncludeRSAAllocations(boolean value) {
        this.includeRSAAllocations = value;
    }

}