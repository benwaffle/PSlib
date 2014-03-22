
package powerschool.rest.vo.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultsVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vo.rest.powerschool.pearson.com/xsd}BaseResultsVO">
 *       &lt;sequence>
 *         &lt;element name="courseRequestGroupsVOs" type="{http://vo.rest.powerschool.pearson.com/xsd}CourseRequestGroupVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="courseRequestRulesVO" type="{http://vo.rest.powerschool.pearson.com/xsd}CourseRequestRulesVO" minOccurs="0"/>
 *         &lt;element name="studentDataVOs" type="{http://vo.rest.powerschool.pearson.com/xsd}StudentDataVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userSessionVO" type="{http://vo.rest.powerschool.pearson.com/xsd}UserSessionVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsVO", propOrder = {
    "courseRequestGroupsVOs",
    "courseRequestRulesVO",
    "studentDataVOs",
    "userSessionVO"
})
public class ResultsVO
    extends BaseResultsVO
{

    @XmlElement(nillable = true)
    protected List<CourseRequestGroupVO> courseRequestGroupsVOs;
    @XmlElement(nillable = true)
    protected CourseRequestRulesVO courseRequestRulesVO;
    @XmlElement(nillable = true)
    protected List<StudentDataVO> studentDataVOs;
    @XmlElement(nillable = true)
    protected UserSessionVO userSessionVO;

    /**
     * Gets the value of the courseRequestGroupsVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseRequestGroupsVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseRequestGroupsVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseRequestGroupVO }
     * 
     * 
     */
    public List<CourseRequestGroupVO> getCourseRequestGroupsVOs() {
        if (courseRequestGroupsVOs == null) {
            courseRequestGroupsVOs = new ArrayList<CourseRequestGroupVO>();
        }
        return this.courseRequestGroupsVOs;
    }

    /**
     * Gets the value of the courseRequestRulesVO property.
     * 
     * @return
     *     possible object is
     *     {@link CourseRequestRulesVO }
     *     
     */
    public CourseRequestRulesVO getCourseRequestRulesVO() {
        return courseRequestRulesVO;
    }

    /**
     * Sets the value of the courseRequestRulesVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseRequestRulesVO }
     *     
     */
    public void setCourseRequestRulesVO(CourseRequestRulesVO value) {
        this.courseRequestRulesVO = value;
    }

    /**
     * Gets the value of the studentDataVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentDataVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentDataVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentDataVO }
     * 
     * 
     */
    public List<StudentDataVO> getStudentDataVOs() {
        if (studentDataVOs == null) {
            studentDataVOs = new ArrayList<StudentDataVO>();
        }
        return this.studentDataVOs;
    }

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

}
