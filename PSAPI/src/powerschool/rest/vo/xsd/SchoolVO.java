
package powerschool.rest.vo.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SchoolVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabledFeatures" type="{http://vo.rest.powerschool.pearson.com/xsd}DisabledFeaturesVO" minOccurs="0"/>
 *         &lt;element name="highGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lowGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mapMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="schoolMapModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="schoolNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="schooladdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolcountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolfax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolzip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolVO", propOrder = {
    "abbreviation",
    "address",
    "disabledFeatures",
    "highGrade",
    "lowGrade",
    "mapMimeType",
    "name",
    "schoolId",
    "schoolMapModifiedDate",
    "schoolNumber",
    "schooladdress",
    "schoolcity",
    "schoolcountry",
    "schoolfax",
    "schoolphone",
    "schoolstate",
    "schoolzip"
})
public class SchoolVO {

    @XmlElement(nillable = true)
    protected String abbreviation;
    @XmlElement(nillable = true)
    protected String address;
    @XmlElement(nillable = true)
    protected DisabledFeaturesVO disabledFeatures;
    @XmlElement(nillable = true)
    protected Integer highGrade;
    @XmlElement(nillable = true)
    protected Integer lowGrade;
    @XmlElement(nillable = true)
    protected String mapMimeType;
    @XmlElement(nillable = true)
    protected String name;
    protected Long schoolId;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar schoolMapModifiedDate;
    protected Long schoolNumber;
    @XmlElement(nillable = true)
    protected String schooladdress;
    @XmlElement(nillable = true)
    protected String schoolcity;
    @XmlElement(nillable = true)
    protected String schoolcountry;
    @XmlElement(nillable = true)
    protected String schoolfax;
    @XmlElement(nillable = true)
    protected String schoolphone;
    @XmlElement(nillable = true)
    protected String schoolstate;
    @XmlElement(nillable = true)
    protected String schoolzip;

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the disabledFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link DisabledFeaturesVO }
     *     
     */
    public DisabledFeaturesVO getDisabledFeatures() {
        return disabledFeatures;
    }

    /**
     * Sets the value of the disabledFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledFeaturesVO }
     *     
     */
    public void setDisabledFeatures(DisabledFeaturesVO value) {
        this.disabledFeatures = value;
    }

    /**
     * Gets the value of the highGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighGrade() {
        return highGrade;
    }

    /**
     * Sets the value of the highGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighGrade(Integer value) {
        this.highGrade = value;
    }

    /**
     * Gets the value of the lowGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowGrade() {
        return lowGrade;
    }

    /**
     * Sets the value of the lowGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowGrade(Integer value) {
        this.lowGrade = value;
    }

    /**
     * Gets the value of the mapMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapMimeType() {
        return mapMimeType;
    }

    /**
     * Sets the value of the mapMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapMimeType(String value) {
        this.mapMimeType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the schoolId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchoolId() {
        return schoolId;
    }

    /**
     * Sets the value of the schoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchoolId(Long value) {
        this.schoolId = value;
    }

    /**
     * Gets the value of the schoolMapModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolMapModifiedDate() {
        return schoolMapModifiedDate;
    }

    /**
     * Sets the value of the schoolMapModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolMapModifiedDate(XMLGregorianCalendar value) {
        this.schoolMapModifiedDate = value;
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
     * Gets the value of the schooladdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchooladdress() {
        return schooladdress;
    }

    /**
     * Sets the value of the schooladdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchooladdress(String value) {
        this.schooladdress = value;
    }

    /**
     * Gets the value of the schoolcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolcity() {
        return schoolcity;
    }

    /**
     * Sets the value of the schoolcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolcity(String value) {
        this.schoolcity = value;
    }

    /**
     * Gets the value of the schoolcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolcountry() {
        return schoolcountry;
    }

    /**
     * Sets the value of the schoolcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolcountry(String value) {
        this.schoolcountry = value;
    }

    /**
     * Gets the value of the schoolfax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolfax() {
        return schoolfax;
    }

    /**
     * Sets the value of the schoolfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolfax(String value) {
        this.schoolfax = value;
    }

    /**
     * Gets the value of the schoolphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolphone() {
        return schoolphone;
    }

    /**
     * Sets the value of the schoolphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolphone(String value) {
        this.schoolphone = value;
    }

    /**
     * Gets the value of the schoolstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolstate() {
        return schoolstate;
    }

    /**
     * Sets the value of the schoolstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolstate(String value) {
        this.schoolstate = value;
    }

    /**
     * Gets the value of the schoolzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolzip() {
        return schoolzip;
    }

    /**
     * Sets the value of the schoolzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolzip(String value) {
        this.schoolzip = value;
    }

}
