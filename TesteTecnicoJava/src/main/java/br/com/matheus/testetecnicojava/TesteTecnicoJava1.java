/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.matheus.testetecnicojava;

import br.com.matheus.testetecnicojava.Inputs;
import java.util.List;

/**
 *
 * @author ma_fe
 */
public class TesteTecnicoJava1 {
    
    public static void main(String[] args) {
//      Filtering list of Strings starting with 'a' and with a total of 3 letters
        System.out.println("Filtering strings...");
        List<String> resultList = filterStringList(Inputs.toFilter);

        System.out.printf("Input: %s\n", Inputs.toFilter);
        System.out.printf("Output: %s\n", resultList);
    }
    
    
    /**
     * 
     * @param strings the list of strings to execute
     * @return List of filtered strings with str[0] == 'a' and lenght == 3
     */
    private static List<String> filterStringList(List<String> strings){
        return strings.stream()
                .filter(str -> str.charAt(0) == 'a' && str.length() == 3)
                .toList();
    }
}
