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
 * <p>Java class for RegulationCancelReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationCancelReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/CommonServices}Reply"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{eurocontrol/cfmu/b2b/FlowServices}RegulationCancelReplyData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationCancelReply", propOrder = {
    "data"
})
public class RegulationCancelReply
    extends Reply
{

    protected RegulationCancelReplyData data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationCancelReplyData }
     *     
     */
    public RegulationCancelReplyData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationCancelReplyData }
     *     
     */
    public void setData(RegulationCancelReplyData value) {
        this.data = value;
    }

}
