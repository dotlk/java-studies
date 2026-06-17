import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        /*
        Crie um vetor contendo os números: 5, 8, 3, 1, 9.

        Implemente um laço de repetição para percorrer cada posição e contabilizar
        a quantidade de pares e ímpares.

        Em seguida exiba suas respectivas quantidades.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);
        //Entrada
        int[] numeros = {5, 8, 3, 1, 9};
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        //Processamento
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        //Saída
        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadeImpares);

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
