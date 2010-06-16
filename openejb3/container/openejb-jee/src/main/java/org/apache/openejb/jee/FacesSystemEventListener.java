
package org.apache.openejb.jee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *         The presence of this element within the "application" element in
 *         an application configuration resource file indicates the
 *         developer wants to add an SystemEventListener to this
 *         application instance.  Elements nested within this element allow
 *         selecting the kinds of events that will be delivered to the
 *         listener instance, and allow selecting the kinds of classes that
 *         can be the source of events that are delivered to the listener
 *         instance.
 *         
 *       
 * 
 * <p>Java class for faces-config-system-event-listenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faces-config-system-event-listenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="system-event-listener-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="system-event-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="source-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faces-config-system-event-listenerType", propOrder = {
    "systemEventListenerClass",
    "systemEventClass",
    "sourceClass"
})
public class FacesSystemEventListener {

    @XmlElement(name = "system-event-listener-class", required = true)
    protected String systemEventListenerClass;
    @XmlElement(name = "system-event-class", required = true)
    protected String systemEventClass;
    @XmlElement(name = "source-class")
    protected String sourceClass;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the systemEventListenerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEventListenerClass() {
        return systemEventListenerClass;
    }

    /**
     * Sets the value of the systemEventListenerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEventListenerClass(String value) {
        this.systemEventListenerClass = value;
    }

    /**
     * Gets the value of the systemEventClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEventClass() {
        return systemEventClass;
    }

    /**
     * Sets the value of the systemEventClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEventClass(String value) {
        this.systemEventClass = value;
    }

    /**
     * Gets the value of the sourceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClass() {
        return sourceClass;
    }

    /**
     * Sets the value of the sourceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClass(String value) {
        this.sourceClass = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
