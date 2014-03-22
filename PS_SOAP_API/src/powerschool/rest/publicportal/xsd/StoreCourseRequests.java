
package powerschool.rest.publicportal.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import powerschool.rest.vo.xsd.CourseRequestGroupVO;
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
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="courseRequestGroups" type="{http://vo.rest.powerschool.pearson.com/xsd}CourseRequestGroupVO" maxOccurs="unbounded" minOccurs="0"/>
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
    "studentId",
    "courseRequestGroups"
})
@XmlRootElement(name = "storeCourseRequests")
public class StoreCourseRequests {

    @XmlElement(nillable = true)
    protected UserSessionVO userSessionVO;
    protected Long studentId;
    @XmlElement(nillable = true)
    protected List<CourseRequestGroupVO> courseRequestGroups;

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
     * Gets the value of the studentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudentId(Long value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the courseRequestGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseRequestGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseRequestGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseRequestGroupVO }
     * 
     * 
     */
    public List<CourseRequestGroupVO> getCourseRequestGroups() {
        if (courseRequestGroups == null) {
            courseRequestGroups = new ArrayList<CourseRequestGroupVO>();
        }
        return this.courseRequestGroups;
    }

}
