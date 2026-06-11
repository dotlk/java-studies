public class Conversao {

    public static void main(String[] args) {
        
        //Variáveis
        int numeroInteiro = 42;
        String numeroString = "3.14";

        //Conversão de int para String
        String numeroInteiroString = Integer.toString(numeroInteiro);
        System.out.println("Número inteiro como String: " + numeroInteiroString); //Número inteiro como String: 42

        //ou

        String numeroInteiroString2 = String.valueOf(numeroInteiro); //Esse é mais geral, pois pode ser usado para outros tipos de dados também.
        System.out.println("Número inteiro como String: " + numeroInteiroString2); //Número inteiro como String: 42

        //Conversão de String para double
        double numeroDouble = Double.parseDouble(numeroString);
        System.out.println("Número String como double: " + numeroDouble); //Número String como double: 3.14
    }
}
