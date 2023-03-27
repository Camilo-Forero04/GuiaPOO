/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;

import poo9.MathsService.MathsService;

/**
 *
 * @author PAVILION
 */
public class POO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maths m = new Maths();
        MathsService ms = new MathsService();
        m.setNum1((float)(Math.random()*10));
        m.setNum2((float)(Math.random())*10);
        System.out.println("el primer numero es: "+m.getNum1()+" Y el segundo es: "+m.getNum2());
        ms.devolverMayor(m);
        ms.calcularPotencia(m);
        ms.caulcularRaiz(m);
    }
    
}
