
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetalleBodega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetalleBodega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idbod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleBodega", propOrder = {
    "idbod"
})
public class DetalleBodega {

    protected String idbod;

    /**
     * Gets the value of the idbod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdbod() {
        return idbod;
    }

    /**
     * Sets the value of the idbod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdbod(String value) {
        this.idbod = value;
    }

}
