import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        /*
        Peça duas notas, exiba a média e a situação.

        Média 7 ou superior = Aprovado.
        Média inferior a 7 = Reprovado.
        */

        //Predefinições
        Scanner obj = new Scanner(System.in);

        //Entrada
        System.out.print("Digite a primeira nota: ");
        double nota1 = obj.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = obj.nextDouble();

        //Processamento
        double media = (nota1 + nota2) / 2;

        //Saída
        if (media >= 7) {
            System.out.println("Média: " + media + " - Aprovado.");
        } else {
            System.out.println("Média: " + media + " - Reprovado.");
        }

        //Fechar o objeto Scanner para evitar vazamento de memória
        obj.close();

    }
}
