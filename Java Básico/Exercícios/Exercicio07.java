import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        /*
        Peça diversos números, até que seja informado zero.

        Após informar o número zero, exiba a soma de todos os números.
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);

        //Entrada
        double numero = 0;
        double soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = obj.nextDouble();
            soma += numero; 

        } while (numero != 0);

        //Saída
        System.out.println("A soma dos números é: " + soma);

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
