/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

import poo4.newpackage.RectanguloService;

/**
 *
 * @author PAVILION
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RectanguloService rs = new RectanguloService();
       Rectangulo r1 = rs.crearRectangulo();
       rs.superficie(r1);
       rs.perimetro(r1);
       rs.dibujar(r1);
  }          
}
