
package powerschool.rest.publicportal.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="schoolNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "schoolNumber"
})
@XmlRootElement(name = "getSchoolMapBySchoolNumber")
public class GetSchoolMapBySchoolNumber {

    @XmlElement(nillable = true)
    protected UserSessionVO userSessionVO;
    protected Long schoolNumber;

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
     * Gets the value of the schoolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * Sets the value of the schoolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchoolNumber(Long value) {
        this.schoolNumber = value;
    }

}
