/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.matheus.testetecnicojava;

/**
 *
 * @author ma_fe
 */
public class TesteTecnicoJava3 {

    public static void main(String[] args) {
        // Swapping two numbers without a third variable
        int a, b;
        
        a = 35;
        b = 10;
        
        System.out.printf("Before switching: A = %d, B = %d\n", a, b);
        
        a += b;
        b = a - b;
        a -= b;
        
        System.out.printf("After switching: A = %d, B = %d", a, b);
    }
}
