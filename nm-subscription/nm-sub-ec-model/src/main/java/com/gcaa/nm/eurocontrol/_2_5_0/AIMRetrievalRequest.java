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
 * <p>Java class for AIMRetrievalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIMRetrievalRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/CommonServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimId" type="{eurocontrol/cfmu/b2b/GeneralinformationServices}AimId_DataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIMRetrievalRequest", namespace = "eurocontrol/cfmu/b2b/GeneralinformationServices", propOrder = {
    "aimId"
})
public class AIMRetrievalRequest
    extends Request
{

    @XmlElement(required = true)
    protected String aimId;

    /**
     * Gets the value of the aimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimId() {
        return aimId;
    }

    /**
     * Sets the value of the aimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimId(String value) {
        this.aimId = value;
    }

}
