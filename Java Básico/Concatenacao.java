public class Concatenacao {
    
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 25;
        double salario = 5000.50;

        //Concatenando strings
        String mensagem = "Olá, meu nome é " + nome + ", tenho " + idade + " anos e meu salário é R$ " + salario + ".";
        System.out.println(mensagem);

        System.out.println(String.format("Olá, meu nome é %s, tenho %d anos e meu salário é R$ %.2f.", nome, idade, salario));
    }
}
