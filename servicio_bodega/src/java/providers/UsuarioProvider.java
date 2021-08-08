/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import com.mysql.jdbc.Connection;
import conexion.conexion;
import interfaces.UsuarioInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;

/**
 *
 * @author ASUS
 */
public class UsuarioProvider implements UsuarioInt {

    PreparedStatement prepared;
    ResultSet result;
    Connection conexion;
    conexion conn = new conexion();
    Integer resp;
    String mensaje;
    Usuario usuario;

    @Override
    public List listarUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "select * from usuarios";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(result.getString("id"));
                usuario.setNombre(result.getString("nombre"));
                usuario.setPassword(result.getString("contra"));
                usuario.setIdbod(result.getString("idbod"));
                usuario.setPerfil(result.getString("perfil"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario buscarUsuario(String nombre) {
        usuario = new Usuario();
        String sql = "select * from usuarios where nombre ='" + nombre + "'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                usuario.setId(result.getString("id"));
                usuario.setNombre(result.getString("nombre"));
                usuario.setPassword(result.getString("contra"));
                usuario.setIdbod(result.getString("idbod"));
                usuario.setPerfil(result.getString("perfil"));
            }
        } catch (SQLException ex) {
            System.out.println("Problema en "+ex.getMessage());
        }
        return usuario;
    }

    @Override
    public Usuario validarUsuario(String nombre, String contra) {
       Usuario us = null;
       String sql = "select * from usuarios where nombre ='" + nombre + "'and contra ='" + contra + "'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            
            if(result.next()){
                String id, nom, pass, idbod, perfil;
                id = result.getString("id");
                nom = result.getString("nombre");
                pass = result.getString("contra");
                idbod = result.getString("idbod");
                perfil = result.getString("perfil");
                
                us = new Usuario(id, nombre, pass, idbod, perfil);
            }

        } catch (SQLException ex) {
            System.out.println("Problema en "+ex.getMessage());
        }
        return us;
    }

}
