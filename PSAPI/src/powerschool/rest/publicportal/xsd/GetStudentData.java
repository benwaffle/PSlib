
package powerschool.rest.publicportal.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import powerschool.rest.vo.xsd.QueryIncludeListVO;
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
 *         &lt;element name="studentIDs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qil" type="{http://vo.rest.powerschool.pearson.com/xsd}QueryIncludeListVO" minOccurs="0"/>
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
    "studentIDs",
    "qil"
})
@XmlRootElement(name = "getStudentData")
public class GetStudentData {

    @XmlElement(nillable = true)
    protected UserSessionVO userSessionVO;
    @XmlElement(type = Long.class)
    protected List<Long> studentIDs;
    @XmlElement(nillable = true)
    protected QueryIncludeListVO qil;

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
     * Gets the value of the studentIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getStudentIDs() {
        if (studentIDs == null) {
            studentIDs = new ArrayList<Long>();
        }
        return this.studentIDs;
    }

    /**
     * Gets the value of the qil property.
     * 
     * @return
     *     possible object is
     *     {@link QueryIncludeListVO }
     *     
     */
    public QueryIncludeListVO getQil() {
        return qil;
    }

    /**
     * Sets the value of the qil property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryIncludeListVO }
     *     
     */
    public void setQil(QueryIncludeListVO value) {
        this.qil = value;
    }

}
