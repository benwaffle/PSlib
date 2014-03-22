
package powerschool.rest.vo.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResultsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResultsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageVOs" type="{http://vo.rest.powerschool.pearson.com/xsd}MessageVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResultsVO", propOrder = {
    "messageVOs"
})
@XmlSeeAlso({
    ResultsVO.class
})
public class BaseResultsVO {

    @XmlElement(nillable = true)
    protected List<MessageVO> messageVOs;

    /**
     * Gets the value of the messageVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageVO }
     * 
     * 
     */
    public List<MessageVO> getMessageVOs() {
        if (messageVOs == null) {
            messageVOs = new ArrayList<MessageVO>();
        }
        return this.messageVOs;
    }

}
