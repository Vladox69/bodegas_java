/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Bodega;

/**
 *
 * @author ASUS
 */
public interface BodegaInt {
    List listarBodegas();
    Bodega buscarBodega(String ciudad);
}
