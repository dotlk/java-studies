import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        /*
        Crie uma matriz 3x3.

        Essa matriz terá os seguintes números:
        4 6 8
        9 1 3
        2 7 5

        Exiba a matriz.
        Exiba a soma de todos os valores contidos na matriz.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);
        //Entrada
            int[][] matriz = {
                {4, 6, 8},
                {9, 1, 3},
                {2, 7, 5}
            };

        //Processamento
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    soma += matriz[i][j];
                }
            }

        //Saída
            System.out.println("Matriz:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Soma dos valores: " + soma);

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
