import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        /*
          Peça um número, em seguida exiba a tabuada.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);
        //Entrada
            System.out.println("Digite um número: ");
            double numero = obj.nextDouble();

        //Processamento
        double[] tabuada = new double[10];

        for (int i = 0; i < 10; i++) {
            tabuada[i] = numero * (i + 1);
        }

        //Saída
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + tabuada[i]);
        }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
