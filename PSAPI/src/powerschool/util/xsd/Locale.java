
package powerschool.util.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISO3Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISO3Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayVariant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionKeys" type="{http://util.java/xsd}Set" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="script" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unicodeLocaleAttributes" type="{http://util.java/xsd}Set" minOccurs="0"/>
 *         &lt;element name="unicodeLocaleKeys" type="{http://util.java/xsd}Set" minOccurs="0"/>
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locale", propOrder = {
    "iso3Country",
    "iso3Language",
    "country",
    "displayCountry",
    "displayLanguage",
    "displayName",
    "displayScript",
    "displayVariant",
    "extensionKeys",
    "language",
    "script",
    "unicodeLocaleAttributes",
    "unicodeLocaleKeys",
    "variant"
})
public class Locale {

    @XmlElement(name = "ISO3Country", nillable = true)
    protected String iso3Country;
    @XmlElement(name = "ISO3Language", nillable = true)
    protected String iso3Language;
    @XmlElement(nillable = true)
    protected String country;
    @XmlElement(nillable = true)
    protected String displayCountry;
    @XmlElement(nillable = true)
    protected String displayLanguage;
    @XmlElement(nillable = true)
    protected String displayName;
    @XmlElement(nillable = true)
    protected String displayScript;
    @XmlElement(nillable = true)
    protected String displayVariant;
    @XmlElement(nillable = true)
    protected Set extensionKeys;
    @XmlElement(nillable = true)
    protected String language;
    @XmlElement(nillable = true)
    protected String script;
    @XmlElement(nillable = true)
    protected Set unicodeLocaleAttributes;
    @XmlElement(nillable = true)
    protected Set unicodeLocaleKeys;
    @XmlElement(nillable = true)
    protected String variant;

    /**
     * Gets the value of the iso3Country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISO3Country() {
        return iso3Country;
    }

    /**
     * Sets the value of the iso3Country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISO3Country(String value) {
        this.iso3Country = value;
    }

    /**
     * Gets the value of the iso3Language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISO3Language() {
        return iso3Language;
    }

    /**
     * Sets the value of the iso3Language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISO3Language(String value) {
        this.iso3Language = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the displayCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCountry() {
        return displayCountry;
    }

    /**
     * Sets the value of the displayCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCountry(String value) {
        this.displayCountry = value;
    }

    /**
     * Gets the value of the displayLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLanguage() {
        return displayLanguage;
    }

    /**
     * Sets the value of the displayLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLanguage(String value) {
        this.displayLanguage = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayScript() {
        return displayScript;
    }

    /**
     * Sets the value of the displayScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayScript(String value) {
        this.displayScript = value;
    }

    /**
     * Gets the value of the displayVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayVariant() {
        return displayVariant;
    }

    /**
     * Sets the value of the displayVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayVariant(String value) {
        this.displayVariant = value;
    }

    /**
     * Gets the value of the extensionKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getExtensionKeys() {
        return extensionKeys;
    }

    /**
     * Sets the value of the extensionKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setExtensionKeys(Set value) {
        this.extensionKeys = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the unicodeLocaleAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getUnicodeLocaleAttributes() {
        return unicodeLocaleAttributes;
    }

    /**
     * Sets the value of the unicodeLocaleAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setUnicodeLocaleAttributes(Set value) {
        this.unicodeLocaleAttributes = value;
    }

    /**
     * Gets the value of the unicodeLocaleKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getUnicodeLocaleKeys() {
        return unicodeLocaleKeys;
    }

    /**
     * Sets the value of the unicodeLocaleKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setUnicodeLocaleKeys(Set value) {
        this.unicodeLocaleKeys = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

}
