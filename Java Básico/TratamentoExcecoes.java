public class TratamentoExcecoes {
    
    public static void main(String[] args) {

        //Você pode usar o bloco try-catch para capturar erros de exceptions e tratá-las de forma adequada.
         
        try {
            int resultado = 10 / 0; // Isso causará uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {  // O bloco finally é opcional e será executado independentemente de uma exceção ter sido lançada ou não.
            System.out.println("Bloco finally executado.");
        }
    }
}
