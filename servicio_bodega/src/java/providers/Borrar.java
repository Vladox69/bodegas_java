/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import java.util.List;
import models.Detalle;
import models.Producto;

/**
 *
 * @author usuario1
 */
public class Borrar {
    public static void main(String[] args) {
        Admin ad = new Admin();
        List<Producto> dt = ad.listarProductos();
        for( Producto p:dt ){
            System.out.println(p.getId());
            System.out.println(p.getNombre());
            System.out.println(p.getPrecio());
        }
       DetalleProvider x=new DetalleProvider();
       List<Detalle> a= x.listadoProductosBodega("1");
        System.out.println(a.get(0).getIdprod());
        //vender
        System.out.println("VENDER");
        VenderProductos v = new VenderProductos();
        v.venderProducto("LSD", "QUITO", 2);
    }
}
