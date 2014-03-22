
package powerschool.rest.publicportal.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import powerschool.rest.vo.xsd.NotificationSettingsVO;
import powerschool.rest.vo.xsd.UserSessionVO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userSessionVO" type="{http://vo.rest.powerschool.pearson.com/xsd}UserSessionVO" minOccurs="0"/>
 *         &lt;element name="ns" type="{http://vo.rest.powerschool.pearson.com/xsd}NotificationSettingsVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userSessionVO",
    "ns"
})
@XmlRootElement(name = "storeNotificationSettings")
public class StoreNotificationSettings {

    @XmlElement(nillable = true)
    protected UserSessionVO userSessionVO;
    @XmlElement(nillable = true)
    protected NotificationSettingsVO ns;

    /**
     * Gets the value of the userSessionVO property.
     * 
     * @return
     *     possible object is
     *     {@link UserSessionVO }
     *     
     */
    public UserSessionVO getUserSessionVO() {
        return userSessionVO;
    }

    /**
     * Sets the value of the userSessionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSessionVO }
     *     
     */
    public void setUserSessionVO(UserSessionVO value) {
        this.userSessionVO = value;
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSettingsVO }
     *     
     */
    public NotificationSettingsVO getNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSettingsVO }
     *     
     */
    public void setNs(NotificationSettingsVO value) {
        this.ns = value;
    }

}
