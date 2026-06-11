public class EstruturaDeEscolha {
    
    public static void main(String[] args) {
        //A estrutura de escolha é interessante para se usar com igualdades, por ser mais compacta, mas não é regra.

        //Variáveis
        int numero = 10;

        //Estrutura de escolha
        switch (numero) {
            case 1:
                System.out.println("O número é um.");
                break; //O break é importante para evitar que o código continue executando os próximos cases, mesmo que eles não sejam verdadeiros.
            case 5:
                System.out.println("O número é cinco.");
                break;
            case 10:
                System.out.println("O número é dez.");
                break;
            default:  //O default é opcional, mas é interessante para tratar casos em que nenhuma das opções anteriores seja verdadeira. (Similar ao else, mas para switch)
                System.out.println("O número não é um, cinco ou dez.");
        }


        //Expressões Switch - torna o código ainda mais compacto. (Java 14+)
        //Basicamente salva o valor do switch direto na variável.
        String dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Número inválido para dia da semana.";
        };

        System.out.println("O dia da semana é: " + dia);
    }
}
