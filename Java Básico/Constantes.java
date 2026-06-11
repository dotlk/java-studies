public class Constantes {
    
    public static void main(String[] args) {
        //diferente de variáveis, as constantes não podem ter seu valor alterado após serem inicializadas
        //para declarar uma constante, utilizamos a palavra-chave "final" seguida do tipo de dado e do nome da constante
        final String NOME = "João";
        final int IDADE = 30;

        //tentando alterar o valor de uma constante resultará em um erro de compilação
        //NOME = "Maria"; Erro: cannot assign a value to final variable NOME
      
        System.out.println("Nome: " + NOME);
        System.out.println("Idade: " + IDADE);
    }
}
