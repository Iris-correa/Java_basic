
package java_basic;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */
public class TesteCondicional2 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Testando condicionais 2");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
        int quantidadePessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantas pessoas estão de acompanhante: "));
        boolean acompanhado;
        
        if (quantidadePessoas >= 2){
           acompanhado = true;
        } // A variável só existe enquanto estiver no bloco 
        else{
            acompanhado = false; //Por isso declaramos 2 vezes - mas sem necessidade.
        }
        JOptionPane.showMessageDialog(null,"Valor de acompanhado " + acompanhado);
        
        if(idade >= 18 || quantidadePessoas >=2){
            JOptionPane.showMessageDialog(null, "Seja muito bem-vindo(a)");
        }
        else{
            JOptionPane.showMessageDialog(null, "Infelizmente você não pode entrar! esteja com acompanhante ou seja maior de 18 anos.");
        }
        
    }
    
    
}
