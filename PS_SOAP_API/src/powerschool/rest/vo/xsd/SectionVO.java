
package powerschool.rest.vo.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SectionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollments" type="{http://vo.rest.powerschool.pearson.com/xsd}SectionEnrollmentVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolCourseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sectionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startStopDates" type="{http://vo.rest.powerschool.pearson.com/xsd}StartStopDateVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teacherID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="termID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionVO", propOrder = {
    "courseCode",
    "description",
    "enrollments",
    "expression",
    "id",
    "roomName",
    "schoolCourseTitle",
    "schoolNumber",
    "sectionNum",
    "startStopDates",
    "teacherID",
    "termID"
})
public class SectionVO {

    @XmlElement(nillable = true)
    protected String courseCode;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    protected List<SectionEnrollmentVO> enrollments;
    @XmlElement(nillable = true)
    protected String expression;
    protected Long id;
    @XmlElement(nillable = true)
    protected String roomName;
    @XmlElement(nillable = true)
    protected String schoolCourseTitle;
    protected Long schoolNumber;
    @XmlElement(nillable = true)
    protected String sectionNum;
    @XmlElement(nillable = true)
    protected List<StartStopDateVO> startStopDates;
    protected Long teacherID;
    protected Long termID;

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCode(String value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enrollments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionEnrollmentVO }
     * 
     * 
     */
    public List<SectionEnrollmentVO> getEnrollments() {
        if (enrollments == null) {
            enrollments = new ArrayList<SectionEnrollmentVO>();
        }
        return this.enrollments;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the schoolCourseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCourseTitle() {
        return schoolCourseTitle;
    }

    /**
     * Sets the value of the schoolCourseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCourseTitle(String value) {
        this.schoolCourseTitle = value;
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

    /**
     * Gets the value of the sectionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionNum() {
        return sectionNum;
    }

    /**
     * Sets the value of the sectionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionNum(String value) {
        this.sectionNum = value;
    }

    /**
     * Gets the value of the startStopDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startStopDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartStopDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StartStopDateVO }
     * 
     * 
     */
    public List<StartStopDateVO> getStartStopDates() {
        if (startStopDates == null) {
            startStopDates = new ArrayList<StartStopDateVO>();
        }
        return this.startStopDates;
    }

    /**
     * Gets the value of the teacherID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeacherID() {
        return teacherID;
    }

    /**
     * Sets the value of the teacherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeacherID(Long value) {
        this.teacherID = value;
    }

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTermID(Long value) {
        this.termID = value;
    }

}
