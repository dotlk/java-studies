public class LoopWhile {
    
    public static void main(String[] args) {
        int contador = 0; //variável de controle


        //Enquanto a condição for verdadeira, o bloco de código dentro do while será executado.
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        

        contador = 0; //resetando o contador para usar no do-while

        //O do-while é semelhante ao while, mas a diferença é que o bloco de código dentro do do-while será executado pelo menos uma vez, mesmo que a condição seja falsa, pois a verificação da condição ocorre após a execução do bloco de código.
        do {
            System.out.println("Contador no do-while: " + contador);
            contador++;
        } while (contador < 10);
    }
}
