
package powerschool.rest.vo.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationSettingsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationSettingsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyToAllStudents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="balanceAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="detailedAssignments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="detailedAttendance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gradeAndAttSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="guardianStudentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mainEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolAnnouncements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSettingsVO", propOrder = {
    "applyToAllStudents",
    "balanceAlerts",
    "detailedAssignments",
    "detailedAttendance",
    "emailAddresses",
    "frequency",
    "gradeAndAttSummary",
    "guardianStudentId",
    "mainEmail",
    "schoolAnnouncements",
    "sendNow"
})
public class NotificationSettingsVO {

    protected Boolean applyToAllStudents;
    protected Boolean balanceAlerts;
    protected Boolean detailedAssignments;
    protected Boolean detailedAttendance;
    @XmlElement(nillable = true)
    protected List<String> emailAddresses;
    protected Integer frequency;
    protected Boolean gradeAndAttSummary;
    protected Long guardianStudentId;
    @XmlElement(nillable = true)
    protected String mainEmail;
    protected Boolean schoolAnnouncements;
    protected Boolean sendNow;

    /**
     * Gets the value of the applyToAllStudents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToAllStudents() {
        return applyToAllStudents;
    }

    /**
     * Sets the value of the applyToAllStudents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToAllStudents(Boolean value) {
        this.applyToAllStudents = value;
    }

    /**
     * Gets the value of the balanceAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceAlerts() {
        return balanceAlerts;
    }

    /**
     * Sets the value of the balanceAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceAlerts(Boolean value) {
        this.balanceAlerts = value;
    }

    /**
     * Gets the value of the detailedAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedAssignments() {
        return detailedAssignments;
    }

    /**
     * Sets the value of the detailedAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedAssignments(Boolean value) {
        this.detailedAssignments = value;
    }

    /**
     * Gets the value of the detailedAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedAttendance() {
        return detailedAttendance;
    }

    /**
     * Sets the value of the detailedAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedAttendance(Boolean value) {
        this.detailedAttendance = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddresses() {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<String>();
        }
        return this.emailAddresses;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the gradeAndAttSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGradeAndAttSummary() {
        return gradeAndAttSummary;
    }

    /**
     * Sets the value of the gradeAndAttSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGradeAndAttSummary(Boolean value) {
        this.gradeAndAttSummary = value;
    }

    /**
     * Gets the value of the guardianStudentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuardianStudentId() {
        return guardianStudentId;
    }

    /**
     * Sets the value of the guardianStudentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuardianStudentId(Long value) {
        this.guardianStudentId = value;
    }

    /**
     * Gets the value of the mainEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainEmail() {
        return mainEmail;
    }

    /**
     * Sets the value of the mainEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainEmail(String value) {
        this.mainEmail = value;
    }

    /**
     * Gets the value of the schoolAnnouncements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchoolAnnouncements() {
        return schoolAnnouncements;
    }

    /**
     * Sets the value of the schoolAnnouncements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchoolAnnouncements(Boolean value) {
        this.schoolAnnouncements = value;
    }

    /**
     * Gets the value of the sendNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendNow() {
        return sendNow;
    }

    /**
     * Sets the value of the sendNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendNow(Boolean value) {
        this.sendNow = value;
    }

}
