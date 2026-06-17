import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        /*
        Crie um vetor contendo três posições vazias.

        Em seguida crie um laço de repetição para pedir três nomes e armazenar no vetor.

        Após executar o laço, exiba os nomes contidos no vetor.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);
        //Entrada
        String[] nomes = new String[3];
        
        //Processamento
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = obj.nextLine();
        }

        //Saída
        System.out.println("Nomes digitados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i]);
        }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
