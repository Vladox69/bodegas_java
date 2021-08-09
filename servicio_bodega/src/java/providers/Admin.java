package providers;

import conexion.conexion;
import interfaces.BodegaInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import models.Bodega;
import models.Detalle;
import interfaces.ProductoInt;
import java.util.ArrayList;
import models.DetalleAdmin;
import models.Producto;

public class Admin implements BodegaInt, ProductoInt{

    PreparedStatement ps;
    Statement st;
    ResultSet result;
    Connection conexion;
    conexion conn = new conexion();
    Integer resp;
    String mensaje;
    List<DetalleAdmin> wineries;
    List<Bodega> city;
    List<Producto> productos;
    String sms;
    
    @Override
    public List listarBodegas() {
        wineries = new ArrayList<>();
        conexion = conn.getConexion();
        try{
            String select = "SELECT p.nombre, b.ciudad, db.cantidad, db.estado, p.precio \n"
                            + "FROM detalle_bodega db INNER JOIN bodega b ON db.idbod=b.id "
                            + "INNER JOIN producto p ON db.idprod=p.id";
            st = conexion.createStatement();
            result = st.executeQuery(select);
            while( result.next() ){
                wineries.add( new DetalleAdmin(result.getString("nombre"), result.getString("ciudad"), result.getString("cantidad"), result.getString("estado"), result.getString("precio")) );
            }
        }catch( Exception ex ){
            System.out.println("Error find: " +ex);
        }
        return wineries;
    }

    @Override
    public Bodega buscarBodega(String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //metdo para traer la cantidad old;
    private int oldCant(String idPro, String idBod){
        int cant=0;
        conexion = conn.getConexion();
        try{
            String select = "SELECT cantidad FROM detalle_bodega where idbod="+idBod+" and idprod="+idPro;
            st = conexion.createStatement();
            result = st.executeQuery(select);
            if( result.next() ){
                cant=Integer.parseInt(result.getString("cantidad"));
            }
        }catch( Exception ex ){
            System.out.println("Error find: " +ex);
        }
        return cant;
    }
    
    //metodo actualizar cantidad
    public String actualizarCantidad( String idPro, String idBod, int cantidad){
        try{
            conexion = conn.getConexion();
            int cant = oldCant(idPro, idBod);
            int newCant = cant + cantidad;
            String update1 = "UPDATE detalle_bodega set cantidad=? where idbod="+idBod+" and idprod="+idPro;
            ps = conexion.prepareStatement(update1);
            ps.setString(1, String.valueOf(newCant));
            int res = ps.executeUpdate();
            if( res > 0 ){
                sms = "Actualizado";
                System.out.println(sms);
            }else{
                sms = "No se pudo actualizar";
                System.out.println(sms);
            }
            
        }catch(Exception ex){
           System.out.println("Error find: " +ex); 
        }
        return sms;
    }
    
    public String actualizarPrecio( String idPro, double precio ){
        try{
            conexion = conn.getConexion();
            String update2 = "UPDATE producto set precio=? where id="+idPro;
            ps = conexion.prepareStatement(update2);
            ps.setString(1, String.valueOf(precio));
            int res = ps.executeUpdate();
            if( res > 0 ){
                sms = "Precio actualizado ";
                System.out.println(sms);
            }else{
                sms = "No se pudo actualizar precio ";
                System.out.println(sms);
            }
        }catch(Exception ex){
           System.out.println("Error find: " +ex); 
        }
        return sms;
    }

    //Metodo para cargar el comboBox
    @Override
    public List listarProductos() {
        productos = new ArrayList<>();
        conexion = conn.getConexion();
        try{
            String select = "SELECT * FROM producto";
            st = conexion.createStatement();
            result = st.executeQuery(select);
            while( result.next() ){
                productos.add(new Producto(result.getString("id"), result.getString("nombre"), result.getString("precio")));
            }
        }catch( Exception ex ){
            System.out.println("Error find: " +ex);
        }
        return productos;
    }
    
    public List listarBodegas2() {
        city = new ArrayList<>();
        conexion = conn.getConexion();
        try{
            String select = "SELECT * FROM bodega";
            st = conexion.createStatement();
            result = st.executeQuery(select);
            while( result.next() ){
                city.add( new Bodega(result.getString("id") ,result.getString("ciudad") ));
            }
        }catch( Exception ex ){
            System.out.println("Error find: " +ex);
        }
        return city;
    }

    @Override
    public Producto buscarProducto(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
