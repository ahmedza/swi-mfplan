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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Regulation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Regulation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}RegulationOrMCDMOnly"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regulationState" type="{eurocontrol/cfmu/b2b/FlowServices}RegulationState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Regulation", propOrder = {
    "regulationState"
})
public class Regulation
    extends RegulationOrMCDMOnly
{

    @XmlSchemaType(name = "anySimpleType")
    protected String regulationState;

    /**
     * Gets the value of the regulationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationState() {
        return regulationState;
    }

    /**
     * Sets the value of the regulationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationState(String value) {
        this.regulationState = value;
    }

}