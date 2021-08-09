package modelo;


import webservices.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cliente {
    public Cliente(){}

    public static Usuario validarUsuario(java.lang.String nombre, java.lang.String contra) {
        webservices.ServicioUsuario_Service service = new webservices.ServicioUsuario_Service();
        webservices.ServicioUsuario port = service.getServicioUsuarioPort();
        return port.validarUsuario(nombre, contra);
    }
    
}
