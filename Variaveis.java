public class Variaveis {
    
    public static void main(String[] args) {

        //Tipos de dados numéricos inteiros

        byte idadeByte = 25; 
        short idadeShort = 25; 
        int idadeInt = 25; 
        long idadeLoncg = 25L; 

        //Tipos de dados numéricos de ponto flutuante
        float salarioFloat = 5000.50f; 
        double salarioDouble = 5000.50; 

        //Tipos de dados textuais
        String nome = "Lucas";
        char letra = 'A'; 
 
       //Tipos de dados booleanos
        boolean isEstudante = true; 


        
       //Exibindo os valores das variáveis
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Idade (short): " + idadeShort);
        System.out.println("Idade (int): " + idadeInt);
        System.out.println("Idade (long): " + idadeLoncg);
        System.out.println("Salário (float): " + salarioFloat);
        System.out.println("Salário (double): " + salarioDouble);
        System.out.println("Nome: " + nome);
        System.out.println("Letra: " + letra);
        System.out.println("É estudante: " + isEstudante);
    }
}
