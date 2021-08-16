/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import conexion.conexion;
import interfaces.DetalleInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Detalle;

/**
 *
 * @author ASUS
 */
public class DetalleProvider implements DetalleInt {

    PreparedStatement prepared;
    ResultSet result;
    Connection conexion;
    conexion conn = new conexion();
    Integer resp;
    String mensaje;

    @Override
    public List listarDetalle() {
        List<Detalle> detalles = new ArrayList<>();
        String sql = "select * from detalle_bodega";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Detalle detalle = new Detalle();
                detalle.setIdbod(result.getString("idbod"));
                detalle.setIdprod(result.getString("idprod"));
                detalle.setCantidad(result.getString("cantidad"));
                detalle.setEstado(result.getString("estado"));
                detalles.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return detalles;
    }

    @Override
    public List listadoProductosStock() {
        List<Detalle> detalles = new ArrayList<>();
        String sql = "select * from detalle_bodega where estado='S'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Detalle detalle = new Detalle();
                detalle.setIdbod(result.getString("idbod"));
                detalle.setIdprod(result.getString("idprod"));
                detalle.setCantidad(result.getString("cantidad"));
                detalle.setEstado(result.getString("estado"));
                detalles.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return detalles;
    }

    @Override
    public List listadoProductoBuscado(String idprod) {
         List<Detalle> detalles_productos = new ArrayList<>();
        String sql = "SELECT p.nombre, d.cantidad, b.ciudad,d.estado "
                + "FROM bodega as b, producto as p, detalle_bodega as d "
                + "where p.nombre='"+idprod+"' and b.id=d.idbod and p.id=d.idprod and d.estado='s' order by p.nombre";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Detalle detalle = new Detalle();
                detalle.setIdbod(result.getString("ciudad"));
                detalle.setIdprod(result.getString("nombre"));
                detalle.setCantidad(result.getString("cantidad"));
                detalle.setEstado(result.getString("estado"));
                detalles_productos.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return detalles_productos;
    }

    @Override
    public List listadoProductosBodega(String idbod) {
          List<Detalle> detalles_bodega = new ArrayList<>();
        String sql = "SELECT p.nombre, b.ciudad, db.cantidad, db.estado \n"
                            + "FROM detalle_bodega db INNER JOIN bodega b ON db.idbod=b.id "
                            + "INNER JOIN producto p ON db.idprod=p.id where estado='S' and idbod='"+idbod+"'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Detalle detalle = new Detalle();
                detalle.setIdbod(result.getString("ciudad"));
                detalle.setIdprod(result.getString("nombre"));
                detalle.setCantidad(result.getString("cantidad"));
                detalle.setEstado(result.getString("estado"));
                detalles_bodega.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return detalles_bodega;  
    }

}
