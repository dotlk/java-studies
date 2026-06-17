import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        /*
         Informe o código do produto e a quantidade, em seguida retorne o total a pagar.

         Produtos:
         1 | Camisa Masculina Azul   | R$59,90
         2 | Calça Jeans Feminina    | R$129,90
         3 | Bermuda Masculina       | R$79,90
         4 | Blusa Feminina Amarela  | R$57,70
         5 | Camisa Masculina Verde  | R$64,90
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o código do produto e a quantidade, em seguida retorne o total a pagar.");
        System.out.println("Produtos:");
        System.out.println("1 | Camisa Masculina Azul   | R$59,90");
        System.out.println("2 | Calça Jeans Feminina    | R$129,90");
        System.out.println("3 | Bermuda Masculina       | R$79,90");
        System.out.println("4 | Blusa Feminina Amarela  | R$57,70");
        System.out.println("5 | Camisa Masculina Verde  | R$64,90");
        System.out.println("");

        System.out.print("Código do produto: ");
        int codigo = obj.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = obj.nextInt();

        //Processamento
        double precoUnitario = switch (codigo) {
            case 1 -> 59.90 * quantidade;
            case 2 -> 129.90 * quantidade;
            case 3 -> 79.90 * quantidade;
            case 4 -> 57.70 * quantidade;
            case 5 -> 64.90 * quantidade;
            default -> {
                System.out.println("Código de produto inválido.");
                yield 0.0; // Retorna 0.0 para código inválido
            }
        };

        //Saída
            System.out.println("Total a pagar: R$" + precoUnitario);
        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
