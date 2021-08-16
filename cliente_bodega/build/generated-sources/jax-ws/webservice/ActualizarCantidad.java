
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarCantidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarCantidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idBod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ActualizarCantidad", propOrder = {
    "idPro",
    "idBod",
    "cantidad"
})
public class ActualizarCantidad {

    protected String idPro;
    protected String idBod;
    protected int cantidad;

    /**
     * Obtiene el valor de la propiedad idPro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPro() {
        return idPro;
    }

    /**
     * Define el valor de la propiedad idPro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPro(String value) {
        this.idPro = value;
    }

    /**
     * Obtiene el valor de la propiedad idBod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBod() {
        return idBod;
    }

    /**
     * Define el valor de la propiedad idBod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBod(String value) {
        this.idBod = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
