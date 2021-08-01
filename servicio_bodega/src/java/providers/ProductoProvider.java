/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import conexion.conexion;
import interfaces.ProductoInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Producto;

/**
 *
 * @author ASUS
 */
public class ProductoProvider implements ProductoInt {

    PreparedStatement prepared;
    ResultSet result;
    Connection conexion;
    conexion conn = new conexion();
    Integer resp;
    String mensaje;

    @Override
    public List listarProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "select * from producto";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Producto producto = new Producto();
                producto.setId(result.getString("id"));
                producto.setNombre(result.getString("nombre"));
                producto.setPrecio(result.getString("precio"));
               productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return productos;
    }

    @Override
    public Producto buscarProducto(String nombre) {
        Producto producto = new Producto();
        String sql = "select * from producto where nombre ='" + nombre + "'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                producto.setId(result.getString("id"));
                producto.setNombre(result.getString("nombre"));
                producto.setPrecio(result.getString("precio"));
            }
        } catch (SQLException ex) {
            System.out.println("Problema en "+ex.getMessage());
        }
        return producto;}

}
