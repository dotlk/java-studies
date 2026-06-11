public class EstruturaCondicional {
    
    public static void main(String[] args) {
        //A estrutura condicional é interessante para se usar com operadores relacionais e lógicos, mas não é regra.

        //Variáveis
        int nota = 85;

        //Estrutura condicional if-else
        if (nota >= 90) {
            System.out.println("Parabéns! Você tirou uma nota excelente.");
        } else if (nota >= 60) {
            System.out.println("Bom trabalho! Você passou.");
        } else {
            System.out.println("Infelizmente, você não passou. Estude mais para a próxima vez.");
        }

    }
}
