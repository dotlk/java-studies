import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        /*
        Peça dois números inteiros.

        Se forem iguais, faça a soma, caso contrário faça a multiplicação.
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);

        //Entrada
        System.out.println("Escreva um número inteiro");
        double n1 = obj.nextDouble();
        System.out.println("Escreva um número inteiro");
        double n2 = obj.nextDouble();

        //Processamento
        double resultado = 0;
        String metodo = null;

        if (n1 == n2) {
            resultado = n1 + n2;
            metodo = "Soma";
        } else {
            resultado = n1 * n2;
            metodo = "Multiplicação";
        }

        //Saída
        System.out.println("Resultado: " + resultado + " Metodo: " + metodo);

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();
    }
}
