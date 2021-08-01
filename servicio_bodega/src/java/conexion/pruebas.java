/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.util.ArrayList;
import models.Bodega;
import models.Producto;
import models.Usuario;
import providers.BodegaProvider;
import providers.ProductoProvider;
import providers.UsuarioProvider;

/**
 *
 * @author ASUS
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioProvider x = new UsuarioProvider();
        ArrayList c = (ArrayList) x.listarUsuario();
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).toString());
        }
        Usuario a = x.buscarUsuario("GUA");
        System.out.println(a.toString());

        BodegaProvider y = new BodegaProvider();
        ArrayList d = (ArrayList) y.listarBodegas();
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i).toString());
        }
        Bodega p = y.buscarBodega("ADMIN");
        System.out.println(p.toString());
        
        
        ProductoProvider y1 = new ProductoProvider();
        ArrayList d1 = (ArrayList) y1.listarProductos();
        for (int i = 0; i < d1.size(); i++) {
            System.out.println(d1.get(i).toString());
        }
        Producto p1 = y1.buscarProducto("VELA");
        System.out.println(p1.toString());
    }

}
