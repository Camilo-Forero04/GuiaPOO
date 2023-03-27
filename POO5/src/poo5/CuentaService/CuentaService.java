/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5.CuentaService;

import java.util.Scanner;
import poo5.Cuenta;

/**
 *
 * @author PAVILION
 */

public class CuentaService {
    
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        Cuenta datos = new Cuenta();
        System.out.println("Digite su DNI: ");
        datos.setDNI(leer.nextInt());
         System.out.println("Digite su numero de cuenta: ");
        datos.setNumeroCuenta(leer.nextInt());
         System.out.println("Digite su saldo actual: ");
        datos.setSaldoActual(leer.nextInt());
        return datos;
    }
    public void ingresar(Cuenta datos){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de dinero que quiera añadir: ");
        int ingresar = leer.nextInt();
       datos.setSaldoActual(datos.getSaldoActual()+ingresar);
        System.out.println("Su saldo ahora es de: "+datos.getSaldoActual());
    }
     public void retirar(Cuenta datos){
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de dinero que desee retirar: ");
        int retirar = leer.nextInt();
         if (retirar>datos.getSaldoActual()) {
             datos.setSaldoActual(0);
        System.out.println("Su saldo ahora es de: "+datos.getSaldoActual());
         }else{
             datos.setSaldoActual(datos.getSaldoActual()-retirar);
        System.out.println("Su saldo ahora es de: "+datos.getSaldoActual());
         }
    }
      public void extraccionRapida(Cuenta datos){
       datos.setSaldoActual(datos.getSaldoActual()-((datos.getSaldoActual()*20)/100));
        System.out.println("Su saldo ahora es de: "+datos.getSaldoActual());
    }
       public void consultarSaldo(Cuenta datos){
        System.out.println("Su saldo ahora es de: "+datos.getSaldoActual());
    }
        public void consultarDatos(Cuenta datos){
        System.out.println("Su DNI es : "+datos.getDNI());
         System.out.println("Su numero de cuenta es : "+datos.getNumeroCuenta());
    }
}
