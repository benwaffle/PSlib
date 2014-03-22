
package powerschool.rest.vo.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import powerschool.rest.model.xsd.BulletinLite;


/**
 * <p>Java class for StudentDataVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentDataVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activities" type="{http://vo.rest.powerschool.pearson.com/xsd}ActivityVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignmentCategories" type="{http://vo.rest.powerschool.pearson.com/xsd}AsmtCatVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignmentScores" type="{http://vo.rest.powerschool.pearson.com/xsd}AssignmentScoreVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignments" type="{http://vo.rest.powerschool.pearson.com/xsd}AssignmentVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attendance" type="{http://vo.rest.powerschool.pearson.com/xsd}AttendanceVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attendanceCodes" type="{http://vo.rest.powerschool.pearson.com/xsd}AttendanceCodeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bulletins" type="{http://model.rest.powerschool.pearson.com/xsd}BulletinLite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citizenCodes" type="{http://vo.rest.powerschool.pearson.com/xsd}CitizenCodeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citizenGrades" type="{http://vo.rest.powerschool.pearson.com/xsd}CitizenGradeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="courseRequests" type="{http://vo.rest.powerschool.pearson.com/xsd}CourseRequestVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enrollments" type="{http://vo.rest.powerschool.pearson.com/xsd}SectionEnrollmentVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feeBalance" type="{http://vo.rest.powerschool.pearson.com/xsd}FeeBalanceVO" minOccurs="0"/>
 *         &lt;element name="feeTransactions" type="{http://vo.rest.powerschool.pearson.com/xsd}FeeTransactionVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feeTypes" type="{http://vo.rest.powerschool.pearson.com/xsd}FeeTypeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="finalGrades" type="{http://vo.rest.powerschool.pearson.com/xsd}FinalGradeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gradeScales" type="{http://vo.rest.powerschool.pearson.com/xsd}GradeScaleVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lunchTransactions" type="{http://vo.rest.powerschool.pearson.com/xsd}LunchTransactionVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notInSessionDays" type="{http://vo.rest.powerschool.pearson.com/xsd}NotInSessionDayVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notificationSettingsVO" type="{http://vo.rest.powerschool.pearson.com/xsd}NotificationSettingsVO" minOccurs="0"/>
 *         &lt;element name="periods" type="{http://vo.rest.powerschool.pearson.com/xsd}PeriodVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportingTerms" type="{http://vo.rest.powerschool.pearson.com/xsd}ReportingTermVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schools" type="{http://vo.rest.powerschool.pearson.com/xsd}SchoolVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sections" type="{http://vo.rest.powerschool.pearson.com/xsd}SectionVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="standards" type="{http://vo.rest.powerschool.pearson.com/xsd}StandardVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="standardsGrades" type="{http://vo.rest.powerschool.pearson.com/xsd}StandardGradeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="student" type="{http://vo.rest.powerschool.pearson.com/xsd}StudentVO" minOccurs="0"/>
 *         &lt;element name="studentDcid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="teachers" type="{http://vo.rest.powerschool.pearson.com/xsd}TeacherVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terms" type="{http://vo.rest.powerschool.pearson.com/xsd}TermVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yearId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentDataVO", propOrder = {
    "activities",
    "assignmentCategories",
    "assignmentScores",
    "assignments",
    "attendance",
    "attendanceCodes",
    "bulletins",
    "citizenCodes",
    "citizenGrades",
    "courseRequests",
    "enrollments",
    "feeBalance",
    "feeTransactions",
    "feeTypes",
    "finalGrades",
    "gradeScales",
    "lunchTransactions",
    "notInSessionDays",
    "notificationSettingsVO",
    "periods",
    "reportingTerms",
    "schools",
    "sections",
    "standards",
    "standardsGrades",
    "student",
    "studentDcid",
    "studentId",
    "teachers",
    "terms",
    "yearId"
})
public class StudentDataVO {

    @XmlElement(nillable = true)
    protected List<ActivityVO> activities;
    @XmlElement(nillable = true)
    protected List<AsmtCatVO> assignmentCategories;
    @XmlElement(nillable = true)
    protected List<AssignmentScoreVO> assignmentScores;
    @XmlElement(nillable = true)
    protected List<AssignmentVO> assignments;
    @XmlElement(nillable = true)
    protected List<AttendanceVO> attendance;
    @XmlElement(nillable = true)
    protected List<AttendanceCodeVO> attendanceCodes;
    @XmlElement(nillable = true)
    protected List<BulletinLite> bulletins;
    @XmlElement(nillable = true)
    protected List<CitizenCodeVO> citizenCodes;
    @XmlElement(nillable = true)
    protected List<CitizenGradeVO> citizenGrades;
    @XmlElement(nillable = true)
    protected List<CourseRequestVO> courseRequests;
    @XmlElement(nillable = true)
    protected List<SectionEnrollmentVO> enrollments;
    @XmlElement(nillable = true)
    protected FeeBalanceVO feeBalance;
    @XmlElement(nillable = true)
    protected List<FeeTransactionVO> feeTransactions;
    @XmlElement(nillable = true)
    protected List<FeeTypeVO> feeTypes;
    @XmlElement(nillable = true)
    protected List<FinalGradeVO> finalGrades;
    @XmlElement(nillable = true)
    protected List<GradeScaleVO> gradeScales;
    @XmlElement(nillable = true)
    protected List<LunchTransactionVO> lunchTransactions;
    @XmlElement(nillable = true)
    protected List<NotInSessionDayVO> notInSessionDays;
    @XmlElement(nillable = true)
    protected NotificationSettingsVO notificationSettingsVO;
    @XmlElement(nillable = true)
    protected List<PeriodVO> periods;
    @XmlElement(nillable = true)
    protected List<ReportingTermVO> reportingTerms;
    @XmlElement(nillable = true)
    protected List<SchoolVO> schools;
    @XmlElement(nillable = true)
    protected List<SectionVO> sections;
    @XmlElement(nillable = true)
    protected List<StandardVO> standards;
    @XmlElement(nillable = true)
    protected List<StandardGradeVO> standardsGrades;
    @XmlElement(nillable = true)
    protected StudentVO student;
    protected Long studentDcid;
    protected Long studentId;
    @XmlElement(nillable = true)
    protected List<TeacherVO> teachers;
    @XmlElement(nillable = true)
    protected List<TermVO> terms;
    protected Integer yearId;

    /**
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityVO }
     * 
     * 
     */
    public List<ActivityVO> getActivities() {
        if (activities == null) {
            activities = new ArrayList<ActivityVO>();
        }
        return this.activities;
    }

    /**
     * Gets the value of the assignmentCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsmtCatVO }
     * 
     * 
     */
    public List<AsmtCatVO> getAssignmentCategories() {
        if (assignmentCategories == null) {
            assignmentCategories = new ArrayList<AsmtCatVO>();
        }
        return this.assignmentCategories;
    }

    /**
     * Gets the value of the assignmentScores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentScores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentScores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentScoreVO }
     * 
     * 
     */
    public List<AssignmentScoreVO> getAssignmentScores() {
        if (assignmentScores == null) {
            assignmentScores = new ArrayList<AssignmentScoreVO>();
        }
        return this.assignmentScores;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentVO }
     * 
     * 
     */
    public List<AssignmentVO> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<AssignmentVO>();
        }
        return this.assignments;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attendance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttendance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendanceVO }
     * 
     * 
     */
    public List<AttendanceVO> getAttendance() {
        if (attendance == null) {
            attendance = new ArrayList<AttendanceVO>();
        }
        return this.attendance;
    }

    /**
     * Gets the value of the attendanceCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attendanceCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttendanceCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendanceCodeVO }
     * 
     * 
     */
    public List<AttendanceCodeVO> getAttendanceCodes() {
        if (attendanceCodes == null) {
            attendanceCodes = new ArrayList<AttendanceCodeVO>();
        }
        return this.attendanceCodes;
    }

    /**
     * Gets the value of the bulletins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulletins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulletins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulletinLite }
     * 
     * 
     */
    public List<BulletinLite> getBulletins() {
        if (bulletins == null) {
            bulletins = new ArrayList<BulletinLite>();
        }
        return this.bulletins;
    }

    /**
     * Gets the value of the citizenCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenCodeVO }
     * 
     * 
     */
    public List<CitizenCodeVO> getCitizenCodes() {
        if (citizenCodes == null) {
            citizenCodes = new ArrayList<CitizenCodeVO>();
        }
        return this.citizenCodes;
    }

    /**
     * Gets the value of the citizenGrades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenGrades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenGrades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenGradeVO }
     * 
     * 
     */
    public List<CitizenGradeVO> getCitizenGrades() {
        if (citizenGrades == null) {
            citizenGrades = new ArrayList<CitizenGradeVO>();
        }
        return this.citizenGrades;
    }

    /**
     * Gets the value of the courseRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseRequestVO }
     * 
     * 
     */
    public List<CourseRequestVO> getCourseRequests() {
        if (courseRequests == null) {
            courseRequests = new ArrayList<CourseRequestVO>();
        }
        return this.courseRequests;
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
     * Gets the value of the feeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link FeeBalanceVO }
     *     
     */
    public FeeBalanceVO getFeeBalance() {
        return feeBalance;
    }

    /**
     * Sets the value of the feeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeBalanceVO }
     *     
     */
    public void setFeeBalance(FeeBalanceVO value) {
        this.feeBalance = value;
    }

    /**
     * Gets the value of the feeTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeTransactionVO }
     * 
     * 
     */
    public List<FeeTransactionVO> getFeeTransactions() {
        if (feeTransactions == null) {
            feeTransactions = new ArrayList<FeeTransactionVO>();
        }
        return this.feeTransactions;
    }

    /**
     * Gets the value of the feeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeTypeVO }
     * 
     * 
     */
    public List<FeeTypeVO> getFeeTypes() {
        if (feeTypes == null) {
            feeTypes = new ArrayList<FeeTypeVO>();
        }
        return this.feeTypes;
    }

    /**
     * Gets the value of the finalGrades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalGrades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalGrades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalGradeVO }
     * 
     * 
     */
    public List<FinalGradeVO> getFinalGrades() {
        if (finalGrades == null) {
            finalGrades = new ArrayList<FinalGradeVO>();
        }
        return this.finalGrades;
    }

    /**
     * Gets the value of the gradeScales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gradeScales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGradeScales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GradeScaleVO }
     * 
     * 
     */
    public List<GradeScaleVO> getGradeScales() {
        if (gradeScales == null) {
            gradeScales = new ArrayList<GradeScaleVO>();
        }
        return this.gradeScales;
    }

    /**
     * Gets the value of the lunchTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lunchTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLunchTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LunchTransactionVO }
     * 
     * 
     */
    public List<LunchTransactionVO> getLunchTransactions() {
        if (lunchTransactions == null) {
            lunchTransactions = new ArrayList<LunchTransactionVO>();
        }
        return this.lunchTransactions;
    }

    /**
     * Gets the value of the notInSessionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notInSessionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotInSessionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotInSessionDayVO }
     * 
     * 
     */
    public List<NotInSessionDayVO> getNotInSessionDays() {
        if (notInSessionDays == null) {
            notInSessionDays = new ArrayList<NotInSessionDayVO>();
        }
        return this.notInSessionDays;
    }

    /**
     * Gets the value of the notificationSettingsVO property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSettingsVO }
     *     
     */
    public NotificationSettingsVO getNotificationSettingsVO() {
        return notificationSettingsVO;
    }

    /**
     * Sets the value of the notificationSettingsVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSettingsVO }
     *     
     */
    public void setNotificationSettingsVO(NotificationSettingsVO value) {
        this.notificationSettingsVO = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodVO }
     * 
     * 
     */
    public List<PeriodVO> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<PeriodVO>();
        }
        return this.periods;
    }

    /**
     * Gets the value of the reportingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingTermVO }
     * 
     * 
     */
    public List<ReportingTermVO> getReportingTerms() {
        if (reportingTerms == null) {
            reportingTerms = new ArrayList<ReportingTermVO>();
        }
        return this.reportingTerms;
    }

    /**
     * Gets the value of the schools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolVO }
     * 
     * 
     */
    public List<SchoolVO> getSchools() {
        if (schools == null) {
            schools = new ArrayList<SchoolVO>();
        }
        return this.schools;
    }

    /**
     * Gets the value of the sections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionVO }
     * 
     * 
     */
    public List<SectionVO> getSections() {
        if (sections == null) {
            sections = new ArrayList<SectionVO>();
        }
        return this.sections;
    }

    /**
     * Gets the value of the standards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardVO }
     * 
     * 
     */
    public List<StandardVO> getStandards() {
        if (standards == null) {
            standards = new ArrayList<StandardVO>();
        }
        return this.standards;
    }

    /**
     * Gets the value of the standardsGrades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardsGrades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardsGrades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardGradeVO }
     * 
     * 
     */
    public List<StandardGradeVO> getStandardsGrades() {
        if (standardsGrades == null) {
            standardsGrades = new ArrayList<StandardGradeVO>();
        }
        return this.standardsGrades;
    }

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link StudentVO }
     *     
     */
    public StudentVO getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentVO }
     *     
     */
    public void setStudent(StudentVO value) {
        this.student = value;
    }

    /**
     * Gets the value of the studentDcid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudentDcid() {
        return studentDcid;
    }

    /**
     * Sets the value of the studentDcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudentDcid(Long value) {
        this.studentDcid = value;
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
     * Gets the value of the teachers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teachers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeachers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeacherVO }
     * 
     * 
     */
    public List<TeacherVO> getTeachers() {
        if (teachers == null) {
            teachers = new ArrayList<TeacherVO>();
        }
        return this.teachers;
    }

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermVO }
     * 
     * 
     */
    public List<TermVO> getTerms() {
        if (terms == null) {
            terms = new ArrayList<TermVO>();
        }
        return this.terms;
    }

    /**
     * Gets the value of the yearId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearId() {
        return yearId;
    }

    /**
     * Sets the value of the yearId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearId(Integer value) {
        this.yearId = value;
    }

}
