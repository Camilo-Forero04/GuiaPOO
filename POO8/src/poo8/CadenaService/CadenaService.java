/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8.CadenaService;

import poo8.Cadena;

/**
 *
 * @author PAVILION
 */
public class CadenaService {
//    Cadena c1= new Cadena();
    public void mostrarVocales(Cadena c1){
        String letra;
        int cont=0;
        for (int i = 0; i <c1.getLongitudDeLaFrase() ; i++) {
            letra=c1.getFrase().substring(i,i+1).toLowerCase();
            if (letra.equals("a")||letra.equals("e")|| letra.equals("i")||letra.equals("o")|| letra.equals("u")) {
            cont++;
        }
        }
        System.out.println("La cantidad de vocales de su frase es de: "+cont);
    }
    public void invertirFrase(Cadena c1){
        String letra;
        for (int i = c1.getLongitudDeLaFrase(); i!=0 ; i--) {
            letra=c1.getFrase().substring(i-1,i);
            System.out.print(""+letra);
        }
        System.out.println("");
        }
    public void vecesRepetido(String letraUsuario, Cadena c1){
        String letraFrase;
        int cont=0;
        for (int i = 0; i <c1.getLongitudDeLaFrase() ; i++) {
            letraFrase=c1.getFrase().substring(i,i+1).toLowerCase();
            if (letraFrase.equals(letraUsuario)) {
            cont++;
        }
        }
        System.out.println("La letra: "+letraUsuario+"Se repite la modica suma de: "+cont);

    }
    public void compararLongitud(String segundaFrase, Cadena c1){
        if (c1.getLongitudDeLaFrase()>segundaFrase.length()){
            System.out.println("La primera frase es mayor, pues tiene esta cantidad de letras:"+c1.getLongitudDeLaFrase()+ " mientras que la segunda tiene: "+segundaFrase.length());
        }else{
            System.out.println("La segunda frase es mayor, pues tiene esta cantidad de letras:"+segundaFrase.length()+ " mientras que la primera tiene: "+c1.getLongitudDeLaFrase());
        }
    }
    public void unirFrases(String segundaFrase, Cadena c1){
        System.out.println("Las dos frases unidas quedan asi: "+c1.getFrase()+" "+segundaFrase);
    }
    public void reemplazar(String LetraUsuario, Cadena c1){
        String letraFrase;
        for (int i = 0; i <c1.getLongitudDeLaFrase() ; i++) {
            letraFrase=c1.getFrase().substring(i,i+1).toLowerCase();
            if (letraFrase.equals("a")) {
                System.out.print(""+LetraUsuario);
        }else{
                System.out.print(""+letraFrase);
            }
        }
        System.out.println("");
    }
    public boolean contiene(String letraUsuario, Cadena c1){
        boolean condicion=false;
        String letraFrase;
        for (int i = 0; i <c1.getLongitudDeLaFrase() ; i++) {
            letraFrase=c1.getFrase().substring(i,i+1).toLowerCase();
            if (letraFrase.equals(letraUsuario)) {
                condicion=true;
                break;
        }
        }
        return condicion;
    }
    }
    
    

