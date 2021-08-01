/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Usuario;

/**
 *
 * @author ASUS
 */
public interface UsuarioInt {
    List listarUsuario();
    Usuario buscarUsuario(String nombre);
}
