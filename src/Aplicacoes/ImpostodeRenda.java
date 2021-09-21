
package java_basic.Aplicacoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa 
 */
// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

public class ImpostodeRenda {
    public static void main(String[] args) {

    
    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário: "));
    
    if(salario <= 2800){
        JOptionPane.showMessageDialog(null,"Sua alíquota é de 7.5%.\n " + "Você pode deduzir até R$ 142 reais");
    }
    else if (salario <= 3751){
        JOptionPane.showMessageDialog(null,"Sua alíquota é de 15%.\n " + "Você pode deduzir até R$ 350 reais");
    }
    else{
        JOptionPane.showMessageDialog(null,"Sua alíquota é de 22.5%.\n " + "Você pode deduzir até R$ 636 reais");
    }
        
    }
}
