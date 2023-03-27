/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10.newpackage;

import java.util.Arrays;

/**
 *
 * @author PAVILION
 */
public class ArrayService {
     int[] a = new int[50];
    int[] b = new int[20];

    public void llenarArrays() {
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() *100);
        }
            Arrays.sort(a, 0, 50);
            System.out.print(Arrays.toString(a) + " ");
    }

    public void copiarArrays() {
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                b[i] = a[i];
            } else {
                b[i] = 5;
            }
        }
            System.out.print(Arrays.toString(b) + " ");
    }
}
