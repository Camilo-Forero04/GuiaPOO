/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9.MathsService;

import java.text.DecimalFormat;
import poo9.Maths;

/**
 *
 * @author PAVILION
 */
public class MathsService {
    float mayor, menor;
    double potencia, raiz;
    DecimalFormat df = new DecimalFormat("0.00");
    public void devolverMayor(Maths m){
    mayor=Math.max(m.getNum1(),m.getNum2());
    menor=Math.min(m.getNum1(),m.getNum2());
        System.out.println("El numero mayor es: "+mayor);
} 
   public void calcularPotencia(Maths m){
   mayor=(float) ((float)Math.round(mayor * 100.0) / 100.0);
    menor=(float) ((float)Math.round(menor * 100.0) / 100.0);
    potencia=Math.pow(mayor,menor);
       System.out.println("La potencia de: "+df.format(mayor)+" elevado a: "+df.format(menor)+" es: "+df.format(potencia));
           
} 
   public void caulcularRaiz(Maths m){
      menor=Math.abs(menor);
      raiz=Math.sqrt(menor);
       System.out.println("La raiz del numero menor es: "+ df.format(raiz));
            
}  
}
