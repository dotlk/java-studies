public class Condicional {
    
    public static void main(String[] args) {
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
