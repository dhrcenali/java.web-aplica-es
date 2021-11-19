//7.2 Operadores

import javax.swing.*;

public class programa_java03 {

    public static void main (String args[]){
        String strIdade;
        int intIdade;
         strIdade = JOptionPane.
                showInputDialog("Digite sua idade");
                intIdade = Integer.parseInt(strIdade);
                if (intIdade < 18)
                    JOptionPane.
                            showMessageDialog(null,"Voce é menor de Idade!, não pode dirigir", "Atenção",
                                    JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.
                            showMessageDialog(null,"Voce é maior da idade, pode dirigir", "Atenção", JOptionPane.INFORMATION_MESSAGE);

    }
}
