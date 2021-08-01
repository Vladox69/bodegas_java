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
public class Bodega {
    private String id;
    private String ciudad;

    public Bodega(String id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return "Bodega{" + "id=" + id + ", ciudad=" + ciudad + '}';
    }

    public Bodega() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    

}
