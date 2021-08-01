/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import conexion.conexion;
import interfaces.BodegaInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Bodega;

/**
 *
 * @author ASUS
 */
public class BodegaProvider implements BodegaInt{
    
    PreparedStatement prepared;
    ResultSet result;
    Connection conexion;
    conexion conn = new conexion();
    Integer resp;
    String mensaje;

    @Override
    public List listarBodegas() {
       List<Bodega> bodegas = new ArrayList<>();
        String sql = "select * from bodega";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                Bodega bodega = new Bodega();
                bodega.setId(result.getString("id"));
                bodega.setCiudad(result.getString("ciudad"));
                bodegas.add(bodega);
            }
        } catch (SQLException ex) {
            System.out.println("Problema en " + ex.getMessage());
        }
        return bodegas;
    }

    @Override
    public Bodega buscarBodega(String ciudad) {
        Bodega bodega = new Bodega();
        String sql = "select * from bodega where ciudad ='" + ciudad + "'";
        try {
            conexion = conn.getConexion();
            prepared = (PreparedStatement) conexion.prepareStatement(sql);
            result = prepared.executeQuery();
            while (result.next()) {
                bodega.setId(result.getString("id"));
                bodega.setCiudad(result.getString("ciudad"));
            }
        } catch (SQLException ex) {
            System.out.println("Problema en "+ex.getMessage());
        }
        return bodega;
    }
    
}
