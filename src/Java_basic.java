
package java_basic;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */
public class Java_basic {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Testando condicionais");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
        int quantidadePessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantas pessoas estão de acompanhante: "));
        
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Você tem mais de 18 anos, pode entrar!");
        }
        else {
            if(quantidadePessoas > 1){
               JOptionPane.showMessageDialog(null, "Você não tem 18 anos, mas como está acompanhado pode entrar!");
            }
        
        else{
             JOptionPane.showMessageDialog(null, "Você é menor de idade e está sem acompanhante, portanto não pode entrar!");
        }
      }
    }
    
}
