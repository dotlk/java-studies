import java.util.Scanner;

public class TreinoScanner {
    

    public static void main(String[] args) {
        //criar objeto Scanner para ler a entrada do usuário
        Scanner obj = new java.util.Scanner(System.in);

        //obter nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = obj.nextLine();

        //obter idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = obj.nextInt();

        //retornar mensagem com os dados do usuário
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        //finalizar o objeto Scanner, para evitar vazamento de memória
        obj.close(); 
    }


}
