package providers;

import conexion.conexion;
import interfaces.BodegaInt;
import interfaces.ProductoInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Bodega;
import models.DetalleAdmin;
import models.Producto;

public class VenderProductos {

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

    public String BuscaridBOD(String ciudad) {
        String id = "";
        conexion = conn.getConexion();
        try {
            String selectID = "SELECT id FROM bodega WHERE ciudad=?";
            ps = conexion.prepareStatement(selectID);
            ps.setString(1, ciudad);
            result = ps.executeQuery();
            if (result.next()) {
                id = result.getString("id");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return id;
    }

    public String busacrIDPRO(String nombre) {
        String id = "";
        conexion = conn.getConexion();
        try {
            String selectID = "SELECT id FROM producto WHERE nombre=?";
            ps = conexion.prepareStatement(selectID);
            ps.setString(1, nombre);
            result = ps.executeQuery();
            if (result.next()) {
                id = result.getString("id");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return id;
    }

    private int oldCant(String idPro, String idBod) {
        int cant = 0;
        conexion = conn.getConexion();
        try {
            String select = "SELECT cantidad FROM detalle_bodega where idbod=" + idBod + " and idprod=" + idPro;
            st = conexion.createStatement();
            result = st.executeQuery(select);
            if (result.next()) {
                cant = Integer.parseInt(result.getString("cantidad"));
            }
        } catch (Exception ex) {
            System.out.println("Error find: " + ex);
        }
        return cant;
    }

    public String venderProducto(String nomPro, String nomBod, int cantidad) {
        int newCatidad = 0;
        String estado = "";
        conexion = conn.getConexion();
        String bodega = BuscaridBOD(nomBod);
        String producto = busacrIDPRO(nomPro);
        int auxCan = oldCant(producto, bodega);
        try {
            if ( cantidad < auxCan  ) {
                newCatidad = auxCan - cantidad;
                estado = "S";
            }else if( cantidad > auxCan ){
                newCatidad = auxCan;
                estado = "S";
            }else{
                newCatidad = 0;
                estado = "A";
                
            }
            String aux2Cant = String.valueOf(newCatidad);
            String actualizar = "update detalle_bodega set cantidad=?, estado=? where idprod=? and idbod=?";
            ps = conexion.prepareStatement(actualizar);
            ps.setString(1, aux2Cant);
            ps.setString(2, estado);
            ps.setString(3, producto);
            ps.setString(4, bodega);
            
            int res = ps.executeUpdate();
            if( res > 0 ){
                sms = "Vendido";
            }else{
                sms = "No se pudo vender";
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return sms;
    }

}
