import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        /*
        Peça dois números inteiros e um tipo de cálculo.

         As opções de cálculos são:
         1 - Somar
         2 - Subtrair
         3 - Multiplicar
         4 - Dividir

          Em seguida, retorne o valor.
        */

        //Predefinições
            Scanner obj = new Scanner(System.in);

        //Entrada
        System.out.println("Digite um número inteiro: ");
        double n1 = obj.nextDouble();
        System.out.println("Digite outro número inteiro: ");
        double n2 = obj.nextDouble();

        System.out.println("");
        System.out.println("Digite o tipo de cálculo (1-4): ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("");
        
        int opcao = obj.nextInt();

        //Processamento e Saída
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha entre 1 e 4.");
        }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
