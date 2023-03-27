/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;

import java.util.Arrays;
import poo10.newpackage.ArrayService;


/**
 *
 * @author PAVILION
 */
public class POO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayService as = new ArrayService();
        as.llenarArrays();
        System.out.println("");
        as.copiarArrays();
    }
    
}
