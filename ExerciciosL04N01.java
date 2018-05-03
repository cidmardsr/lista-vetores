import javax.swing.JOptionPane;

public class ExerciciosL04N01{
    public static void main(String[] args) {
        int[] numeros = new int[16];
        numeros[0] = 13;
        numeros[1] = 85;
        numeros[2] = 99;
        numeros[3] = 4;
        numeros[4] = 610;
        numeros[5] = 34;
        numeros[6] = 7;
        numeros[7] = 1290;
        numeros[8] = 8406;
        numeros[9] = 21;
        numeros[10] = 56;
        numeros[11] = 12563;
        numeros[12] = 1;
        numeros[13] = 47;
        numeros[14] = 1748096;
        numeros[15] = 358;
        
        int soma = numeros[0] + 
                   numeros[1] + 
                   numeros[2] + 
                   numeros[3] + 
                   numeros[4] + 
                   numeros[5] + 
                   numeros[6] +
                   numeros[7] +
                   numeros[8] +
                   numeros[9] +
                   numeros[10] +
                   numeros[11] +
                   numeros[12] +
                   numeros[13] +
                   numeros[14] +
                   numeros[15];
        
        System.out.println("A soma dos números é: " + soma);
    }
}