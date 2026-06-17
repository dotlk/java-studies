import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
   
        /*
        Peça três números inteiros, em seguida retorne o menor informado.
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);
        double[] numeros = new double[3];

        //Entrada
        System.out.println("Digite um numero inteiro: ");
        numeros[0] = obj.nextDouble();

        System.out.println("Digite um numero inteiro: ");
        numeros[1] = obj.nextDouble();

        System.out.println("Digite um numero inteiro: ");
        numeros[2] = obj.nextDouble();

        //Processamento
        double menornumero = numeros[0];
        for (int i = 0; i <= 2; i++) {
            if (numeros[i] < menornumero) {
                menornumero = numeros[i];
            }
        }

        //Saída
        System.out.println("O menor numéro é " + menornumero);

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
