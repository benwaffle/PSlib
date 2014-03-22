
package powerschool.rest.vo.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AttendanceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttendanceVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adaValueCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="adaValueTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="admValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="attCodeid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attFlags" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attModeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="periodid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="schoolid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="studentid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalMinutes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendanceVO", propOrder = {
    "adaValueCode",
    "adaValueTime",
    "admValue",
    "attCodeid",
    "attComment",
    "attDate",
    "attFlags",
    "attInterval",
    "attModeCode",
    "ccid",
    "id",
    "periodid",
    "schoolid",
    "studentid",
    "totalMinutes",
    "transactionType",
    "yearid"
})
public class AttendanceVO {

    protected Double adaValueCode;
    protected Double adaValueTime;
    protected Double admValue;
    protected Long attCodeid;
    @XmlElement(nillable = true)
    protected String attComment;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attDate;
    protected Integer attFlags;
    protected Integer attInterval;
    @XmlElement(nillable = true)
    protected String attModeCode;
    protected Long ccid;
    protected Long id;
    protected Long periodid;
    protected Long schoolid;
    protected Long studentid;
    protected Double totalMinutes;
    @XmlElement(nillable = true)
    protected String transactionType;
    protected Integer yearid;

    /**
     * Gets the value of the adaValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdaValueCode() {
        return adaValueCode;
    }

    /**
     * Sets the value of the adaValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdaValueCode(Double value) {
        this.adaValueCode = value;
    }

    /**
     * Gets the value of the adaValueTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdaValueTime() {
        return adaValueTime;
    }

    /**
     * Sets the value of the adaValueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdaValueTime(Double value) {
        this.adaValueTime = value;
    }

    /**
     * Gets the value of the admValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdmValue() {
        return admValue;
    }

    /**
     * Sets the value of the admValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdmValue(Double value) {
        this.admValue = value;
    }

    /**
     * Gets the value of the attCodeid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttCodeid() {
        return attCodeid;
    }

    /**
     * Sets the value of the attCodeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttCodeid(Long value) {
        this.attCodeid = value;
    }

    /**
     * Gets the value of the attComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttComment() {
        return attComment;
    }

    /**
     * Sets the value of the attComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttComment(String value) {
        this.attComment = value;
    }

    /**
     * Gets the value of the attDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttDate() {
        return attDate;
    }

    /**
     * Sets the value of the attDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttDate(XMLGregorianCalendar value) {
        this.attDate = value;
    }

    /**
     * Gets the value of the attFlags property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttFlags() {
        return attFlags;
    }

    /**
     * Sets the value of the attFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttFlags(Integer value) {
        this.attFlags = value;
    }

    /**
     * Gets the value of the attInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttInterval() {
        return attInterval;
    }

    /**
     * Sets the value of the attInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttInterval(Integer value) {
        this.attInterval = value;
    }

    /**
     * Gets the value of the attModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttModeCode() {
        return attModeCode;
    }

    /**
     * Sets the value of the attModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttModeCode(String value) {
        this.attModeCode = value;
    }

    /**
     * Gets the value of the ccid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcid() {
        return ccid;
    }

    /**
     * Sets the value of the ccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcid(Long value) {
        this.ccid = value;
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
     * Gets the value of the periodid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodid() {
        return periodid;
    }

    /**
     * Sets the value of the periodid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodid(Long value) {
        this.periodid = value;
    }

    /**
     * Gets the value of the schoolid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchoolid() {
        return schoolid;
    }

    /**
     * Sets the value of the schoolid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchoolid(Long value) {
        this.schoolid = value;
    }

    /**
     * Gets the value of the studentid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudentid() {
        return studentid;
    }

    /**
     * Sets the value of the studentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudentid(Long value) {
        this.studentid = value;
    }

    /**
     * Gets the value of the totalMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMinutes() {
        return totalMinutes;
    }

    /**
     * Sets the value of the totalMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMinutes(Double value) {
        this.totalMinutes = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the yearid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearid() {
        return yearid;
    }

    /**
     * Sets the value of the yearid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearid(Integer value) {
        this.yearid = value;
    }

}
