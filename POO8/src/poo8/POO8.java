/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import java.util.Scanner;
import poo8.CadenaService.CadenaService;

/**
 *
 * @author PAVILION
 */
public class POO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaService cs = new CadenaService();
        Cadena c1= new Cadena();
        
        System.out.println("Introduzca una frase");
        c1.setFrase(leer.nextLine());
        c1.setLongitudDeLaFrase(c1.getFrase().length());
//        System.out.println("La frase es: "+c.getFrase());
//        System.out.println("La longitud de la frase es: "+ c.getLongitudDeLaFrase());


        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        System.out.println("Introduzca un caracter");
        cs.vecesRepetido(leer.nextLine(), c1);
        System.out.println("Introduzca otra frase");
        String segundaFrase=leer.nextLine();
        cs.compararLongitud(segundaFrase, c1);
        cs.unirFrases(segundaFrase, c1);
        System.out.println("Introduzca el caracter a reemplazar");
        cs.reemplazar(leer.nextLine(),c1);
        System.out.println("Introduzca el caracter que desee verificar");
        boolean condicion=cs.contiene(leer.nextLine(), c1);
        System.out.println("¿El caracter que introduciste esta en la primera frase? "+condicion);
        
        

}
    }
