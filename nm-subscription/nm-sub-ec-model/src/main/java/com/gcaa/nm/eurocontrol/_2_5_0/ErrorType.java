//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSUPPORTED_VERSION"/&gt;
 *     &lt;enumeration value="ATTRIBUTE_CANNOT_BE_NULL"/&gt;
 *     &lt;enumeration value="ATTRIBUTE_MUST_BE_NULL"/&gt;
 *     &lt;enumeration value="INVALID_COLLECTION_SIZE"/&gt;
 *     &lt;enumeration value="INVALID_ATTRIBUTE_VALUE"/&gt;
 *     &lt;enumeration value="MISSING_CHOICE_VALUE"/&gt;
 *     &lt;enumeration value="CHOICE_OVERFLOW"/&gt;
 *     &lt;enumeration value="REQUESTED_ATTRIBUTE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorType", namespace = "eurocontrol/cfmu/b2b/CommonServices")
@XmlEnum
public enum ErrorType {

    UNSUPPORTED_VERSION,
    ATTRIBUTE_CANNOT_BE_NULL,
    ATTRIBUTE_MUST_BE_NULL,
    INVALID_COLLECTION_SIZE,
    INVALID_ATTRIBUTE_VALUE,
    MISSING_CHOICE_VALUE,
    CHOICE_OVERFLOW,
    REQUESTED_ATTRIBUTE_NOT_ALLOWED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ErrorType fromValue(String v) {
        return valueOf(v);
    }

}
