/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4.newpackage;

import java.util.Scanner;
import poo4.Rectangulo;

/**
 *
 * @author PAVILION
 */
public class RectanguloService {
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner (System.in);
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese el alto del rectangulo");
        R1.setAlto(leer.nextInt());
        System.out.println("Ingrese la base del rectangulo");
        R1.setBase(leer.nextInt());
        return R1;
    }
    public void superficie (Rectangulo R1){
        double S = R1.getAlto()*R1.getAlto();
        System.out.println("La superficie es: "+S);
    }
    public void perimetro (Rectangulo R1){
         double P = R1.getAlto()*R1.getAlto(); 
         System.out.println("El Perimetro es: "+P);
    }
    public void dibujar (Rectangulo R1){
            for (int i = 1; i <= R1.getAlto(); i++) {
            for (int j = 1; j <= R1.getBase(); j++) {
                if (i == 1 || i == R1.getAlto() || j == 1 || j == R1.getBase()) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

