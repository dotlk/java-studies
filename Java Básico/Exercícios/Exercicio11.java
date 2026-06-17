import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        /*
        Crie uma matriz 3x2 vazia.

        Em um laço de repetição, peça três estados e três cidades.

        Armazene cada informação em uma posição da matriz.

        Exiba os valores contidos na matriz.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);
        //Entrada
            String[][] EstadosxCidades = new String[3][2];

        //Processamento
            for (int i = 0; i < EstadosxCidades.length; i++) {
                System.out.print("Digite o nome do estado " + (i + 1) + ": ");
                EstadosxCidades[i][0] = obj.nextLine();

                System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
                EstadosxCidades[i][1] = obj.nextLine();
            }


            System.out.println(""); 
        //Saída
            System.out.println("Estados e Cidades:");
            for (int i = 0; i < EstadosxCidades.length; i++) {
                System.out.println("Estado: " + EstadosxCidades[i][0] + " - Cidade: " + EstadosxCidades[i][1]);
            }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
