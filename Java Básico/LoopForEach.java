public class LoopForEach {
    
    public static void main(String[] args) {

        //O loop for-each é uma forma simplificada de iterar sobre elementos de uma coleção ou array.
        //Ele é especialmente útil quando você não precisa acessar os índices dos elementos.

        //Criando um vetor de strings para demonstrar o loop for-each
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        //Usando o loop for-each para imprimir cada fruta do vetor
        //Os dois pontos referenciam o vetor.
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }        
}