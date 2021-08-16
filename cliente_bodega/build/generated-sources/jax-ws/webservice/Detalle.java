
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idbod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idprod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalle", propOrder = {
    "cantidad",
    "estado",
    "idbod",
    "idprod"
})
@XmlSeeAlso({
    DetalleAdmin.class
})
public class Detalle {

    protected String cantidad;
    protected String estado;
    protected String idbod;
    protected String idprod;

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

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

    /**
     * Gets the value of the idprod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdprod() {
        return idprod;
    }

    /**
     * Sets the value of the idprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdprod(String value) {
        this.idprod = value;
    }

}
