/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.matheus.testetecnicojava;

/**
 *
 * @author ma_fe
 */
public class TesteTecnicoJava2 {
    public static void main(String[] args) {
        
        // Removing white spaces from a string
        System.out.println("\nRemoving white spaces...");
        for (String s: Inputs.toRemoveWhiteSpace){
            System.out.printf("Input: '%s'\n", s);
            System.out.printf("Output: '%s'\n\n", execute(s));
        }
        
    }
    
    private static String execute(String str){

        return  str.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (subString, c) -> subString + c);
    }
}
