import javax.swing.JOptionPane;

import org.omg.CORBA.ULongLongSeqHelper;

public class ExerciciosL04N03{
    public static void main(String[] args){
        String[] produtos = new String[7];
        produtos[0] = JOptionPane.showInputDialog(
            null, 
            "Informe o primeiro produto"
            );
        produtos[1] = JOptionPane.showInputDialog(
            null, 
            "Informe o segundo produto"
            );
        produtos[2] = JOptionPane.showInputDialog(
            null, 
            "Informe o terceiro produto"
            );
        produtos[3] = JOptionPane.showInputDialog(
            null, 
            "Informe o quarto produto"
            );
        produtos[4] = JOptionPane.showInputDialog(
            null, 
            "Informe o quinto produto"
            );
        produtos[5] = JOptionPane.showInputDialog(
            null, 
            "Informe o sexto produto"
            );
        produtos[6] = JOptionPane.showInputDialog(
            null, 
            "Informe o sétimo produto"
            );
            
        
        double[] precos = new double[7];
        precos[0] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do primeiro produto"
            ));
        precos[1] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do segundo produto"
            ));
        precos[2] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do terceiro produto"
            ));
        precos[3] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do quarto produto"
            ));
        precos[4] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do quinto produto"
            ));
        precos[5] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do sexto produto"
            ));
        precos[6] = Double.parseDouble(
            JOptionPane.showInputDialog(
            null, 
            "Informe o preço do sétimo produto"
            ));

        JOptionPane.showMessageDialog(null, "Primeiro produto: " + produtos[0] + "     " + "R$" + precos[0] +
        "\nSegundo produto: " + produtos[1] + "     " + "R$" + precos[1] +
        "\nTerceiro produto: " + produtos[2] + "     " + "R$" + precos[2] +
        "\nQuarto produto: " + produtos[3] + "     " + "R$" + precos[3] +
        "\nQuinto produto: " + produtos[4] + "     " + "R$" + precos[4] +
        "\nSexto produto: " + produtos[5] + "     " + "R$" + precos[5] +
        "\nSétimo produto: " + produtos[6] + "     " + "R$" + precos[6]);

    }
}