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
public class Usuario {
    private String id;
    private String nombre;
    private String password;
    private String idbod;
    private String perfil;

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", password=" + password + ", idbod=" + idbod + ", perfil=" + perfil + '}';
    }

    public Usuario(String id, String nombre, String password, String idbod, String perfil) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.idbod = idbod;
        this.perfil = perfil;
    }
    
    public Usuario(){
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdbod() {
        return idbod;
    }

    public void setIdbod(String idbod) {
        this.idbod = idbod;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
