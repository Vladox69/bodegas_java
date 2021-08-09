package models;

/**
 *
 * @author usuario1
 */
public class DetalleAdmin extends Detalle {
    private String precio;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public DetalleAdmin(String idbod, String idprod, String cantidad, String estado, String precio) {
        super(idbod, idprod, cantidad, estado);
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleAmin{" + "idbod=" + getIdbod() + ", idprod=" + getIdprod() + ", cantidad=" + getCantidad() + ", estado=" + getEstado() + ", precio=" + getPrecio()+'}';
    }
    
    
}
