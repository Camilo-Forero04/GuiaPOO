/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidad;

/**
 *
 * @author PAVILION
 */
public class Persona {

   

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public int getiQ() {
        return iQ;
    }
    
    public String name;
    public int age;
    public String zodiacSign;
    public int iQ;
 @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + ", zodiacSign=" + zodiacSign + ", iQ=" + iQ + '}';
    }
    
}
