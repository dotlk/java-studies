import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        /*
        Crie um conversor de moedas.

        O cliente informa o tipo de conversão e o valor.

        Opções para conversão:
        1 - Dólar para Real.
        2 - Real para Dólar.
        3 - Euro para Real.
        4 - Real para Euro.

        Cotação sugerida:
        1 Dólar = R$5,50
        1 Euro  = R$6,00
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);
        //Entrada
        System.out.println("Selecione o tipo de conversão");
        System.out.println("");
        System.out.println("1 - Dólar para Real.");
        System.out.println("2 - Real para Dólar.");
        System.out.println("3 - Euro para Real.");
        System.out.println("4 - Real para Euro.");
        System.out.println("");
        int tipoConversao = obj.nextInt();

        System.out.println("Insira um valor");
        double valor = obj.nextDouble();

        //Processamento e Saída
        switch (tipoConversao) {
            case 1:
                System.out.println("O valor convertido é: R$" + (valor * 5.50));
                break;
            case 2:
                System.out.println("O valor convertido é: US$" + (valor / 5.50));
                break;
            case 3:
                System.out.println("O valor convertido é: R$" + (valor * 6));
                break;
            case 4:
               System.out.print("O valor convertido é: €" + (valor / 6));
               break;
            default:
                System.out.println("Opção inválida. Por favor, escolha entre 1 e 4.");
        }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
