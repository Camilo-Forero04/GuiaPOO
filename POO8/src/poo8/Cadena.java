/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

/**
 *
 * @author PAVILION
 */
public class Cadena {
    private String frase;
    private int longitudDeLaFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitudDeLaFrase) {
        this.frase = frase;
        this.longitudDeLaFrase = longitudDeLaFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudDeLaFrase() {
        return longitudDeLaFrase;
    }

    public void setLongitudDeLaFrase(int longitudDeLaFrase) {
        this.longitudDeLaFrase = longitudDeLaFrase;
    }
    
}
