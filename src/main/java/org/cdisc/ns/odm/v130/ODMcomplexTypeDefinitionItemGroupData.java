//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.09 at 11:44:30 AM EST 
//


package org.cdisc.ns.odm.v130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemGroupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemGroupData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataGroup" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupData", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "itemDataGroup",
    "itemDataStarGroup"
})
public class ODMcomplexTypeDefinitionItemGroupData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemData")
    protected List<ODMcomplexTypeDefinitionItemData> itemDataGroup;
    @XmlElementRefs({
        @XmlElementRef(name = "ItemDataFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataBase64Binary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataPartialDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataHexBinary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataBoolean", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataBase64Float", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataDouble", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataAny", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataInteger", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataHexFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataPartialTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataURI", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataString", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataIntervalDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataDurationDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataIncompleteDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class),
        @XmlElementRef(name = "ItemDataPartialDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> itemDataStarGroup;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the itemDataGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemData> getItemDataGroup() {
        if (itemDataGroup == null) {
            itemDataGroup = new ArrayList<ODMcomplexTypeDefinitionItemData>();
        }
        return this.itemDataGroup;
    }

    /**
     * Gets the value of the itemDataStarGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataStarGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataStarGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Binary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexBinary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Float }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDouble }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataURI }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIntervalDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDurationDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIncompleteDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDate }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getItemDataStarGroup() {
        if (itemDataStarGroup == null) {
            itemDataStarGroup = new ArrayList<JAXBElement<?>>();
        }
        return this.itemDataStarGroup;
    }

    /**
     * Gets the value of the itemGroupOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    /**
     * Sets the value of the itemGroupOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    /**
     * Gets the value of the itemGroupRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    /**
     * Sets the value of the itemGroupRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}