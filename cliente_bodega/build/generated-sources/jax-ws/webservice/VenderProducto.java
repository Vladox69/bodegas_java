
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VenderProducto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VenderProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VenderProducto", propOrder = {
    "producto",
    "bodega",
    "cantidad"
})
public class VenderProducto {

    protected String producto;
    protected String bodega;
    protected int cantidad;

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the bodega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodega() {
        return bodega;
    }

    /**
     * Sets the value of the bodega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodega(String value) {
        this.bodega = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
