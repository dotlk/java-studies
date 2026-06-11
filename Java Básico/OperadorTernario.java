public class OperadorTernario {
    

    public static void main(String[] args) {
        //Variáveis
        int nota = 85;

        //Operador ternário
        String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);

        System.out.println(nota >= 60 ? "Parabéns! Você passou." : "Infelizmente, você não passou. Estude mais para a próxima vez.");
    }
}
