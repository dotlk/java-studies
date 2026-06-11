public class Vetor {

    public static void main(String[] args) {
        
        //Um vetor é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
        //Em Java, os vetores são representados por arrays.


        //Criando um vetor de inteiros com capacidade para 5 elementos - utiliza-se colchetes [] para declarar um vetor.
        int[] numeros = new int[5];

        //Criando um vetor de strings com capacidade dinâmica - inicializando com valores pré-definidos.
        String[] nomes = {"Alice", "Bob", "Charlie"};

        //Os índices dos vetores em Java começam em 0.

        //Acessando um elemento específico do vetor de inteiros - utilizando o índice para acessar o valor.
        System.out.println(numeros[0]); 

        //Acessando um elemento específico do vetor de strings - utilizando o índice para acessar o valor.
        System.out.println(nomes[1]); 

        //Exibindo os elementos do vetor de strings - passando pelos índices de cada valor.
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
