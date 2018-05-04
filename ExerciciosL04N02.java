import javax.swing.JOptionPane;

public class ExerciciosL04N02{
    public static void main(String[] args) {
        
        String[] nomes = new String[10];
        nomes[0] = JOptionPane.showInputDialog(null, "Informe o primeiro nome");
        nomes[1] = JOptionPane.showInputDialog(null, "Informe o segundo nome");
        nomes[2] = JOptionPane.showInputDialog(null, "Informe o terceiro nome");
        nomes[3] = JOptionPane.showInputDialog(null, "Informe o quarto nome");
        nomes[4] = JOptionPane.showInputDialog(null, "Informe o quinto nome");
        nomes[5] = JOptionPane.showInputDialog(null, "Informe o sexto nome");
        nomes[6] = JOptionPane.showInputDialog(null, "Informe o sétimo nome");
        nomes[7] = JOptionPane.showInputDialog(null, "Informe o oitavo nome");
        nomes[8] = JOptionPane.showInputDialog(null, "Informe o nono nome");
        nomes[9] = JOptionPane.showInputDialog(null, "Informe o décimo nome");

       System.out.println();

       JOptionPane.showMessageDialog(null, "Primeiro nome: " + nomes[0] + 
       "\nSegundo nome: " + nomes[1] +
       "\nTerceiro nome: " + nomes[2] +
       "\nQuarto nome: " + nomes[3] +
       "\nQuinto nome: " + nomes[4] +
       "\nSexto nome: " + nomes[5] +
       "\nSétimo nome: " + nomes[6] +
       "\nOitavo nome: " + nomes[7] +
       "\nNono nome: " + nomes[8] +
       "\nDécimo nome: " + nomes[9]);
    }
}