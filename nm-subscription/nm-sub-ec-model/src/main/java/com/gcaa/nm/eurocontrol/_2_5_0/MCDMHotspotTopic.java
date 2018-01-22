//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCDMHotspotTopic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMHotspotTopic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}MCDMTopic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotspotId" type="{eurocontrol/cfmu/b2b/FlowServices}HotspotId" minOccurs="0"/&gt;
 *         &lt;element name="measureTopics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMMeasureTopic" maxOccurs="10000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "MCDMHotspotTopic", propOrder = {
    "hotspotId",
    "measureTopics"
})
public class MCDMHotspotTopic
    extends MCDMTopic
{

    protected HotspotId hotspotId;
    protected MCDMHotspotTopic.MeasureTopics measureTopics;

    /**
     * Gets the value of the hotspotId property.
     * 
     * @return
     *     possible object is
     *     {@link HotspotId }
     *     
     */
    public HotspotId getHotspotId() {
        return hotspotId;
    }

    /**
     * Sets the value of the hotspotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotspotId }
     *     
     */
    public void setHotspotId(HotspotId value) {
        this.hotspotId = value;
    }

    /**
     * Gets the value of the measureTopics property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMHotspotTopic.MeasureTopics }
     *     
     */
    public MCDMHotspotTopic.MeasureTopics getMeasureTopics() {
        return measureTopics;
    }

    /**
     * Sets the value of the measureTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMHotspotTopic.MeasureTopics }
     *     
     */
    public void setMeasureTopics(MCDMHotspotTopic.MeasureTopics value) {
        this.measureTopics = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMMeasureTopic" maxOccurs="10000"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class MeasureTopics {

        @XmlElement(required = true)
        protected List<MCDMMeasureTopic> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCDMMeasureTopic }
         * 
         * 
         */
        public List<MCDMMeasureTopic> getItem() {
            if (item == null) {
                item = new ArrayList<MCDMMeasureTopic>();
            }
            return this.item;
        }

    }

}
