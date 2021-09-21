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
public class TestaLacos2 {
    public static void main(String[] args) {
       for(int linha = 0;linha <10;linha++){
            for(int coluna = 0;coluna <= linha; coluna++)
                System.out.print("*");   
            
            System.out.println();
        }
  }
}