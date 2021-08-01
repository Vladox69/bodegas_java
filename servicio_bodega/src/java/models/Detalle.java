/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ASUS
 */
public class Detalle {
    private String idbod;
    private String idprod;
    private String cantidad;
    private String estado;

    public Detalle() {
    }
    
    public Detalle(String idbod, String idprod, String cantidad, String estado) {
        this.idbod = idbod;
        this.idprod = idprod;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public String getIdbod() {
        return idbod;
    }

    public void setIdbod(String idbod) {
        this.idbod = idbod;
    }

    public String getIdprod() {
        return idprod;
    }

    public void setIdprod(String idprod) {
        this.idprod = idprod;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idbod=" + idbod + ", idprod=" + idprod + ", cantidad=" + cantidad + ", estado=" + estado + '}';
    }
    
}
