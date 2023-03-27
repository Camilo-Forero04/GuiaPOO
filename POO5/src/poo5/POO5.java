/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import poo5.CuentaService.CuentaService;

/**
 *
 * @author PAVILION
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.crearCuenta();
        cs.ingresar(c1);
         cs.retirar(c1);
          cs.extraccionRapida(c1);
           cs.consultarSaldo(c1);
            cs.consultarDatos(c1);
    }
    
}
