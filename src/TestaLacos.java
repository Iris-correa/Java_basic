/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

/**
 *
 * @author Iris Correa
 */
public class TestaLacos {
    public static void main(String[] args) {
        for (int multiplicador = 1;multiplicador <= 10;multiplicador++){
            for(int contador = 0;contador<=10;contador++){
                System.out.println( multiplicador + " x " + contador + " = " + multiplicador*contador);
                    
            }
            System.out.println("\n");
        }
    }
}
