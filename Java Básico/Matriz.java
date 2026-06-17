public class Matriz {

    public static void main(String[] args) {
        
        //Uma Matriz é uma estrutura de dados bidimensional que pode armazenar elementos em linhas e colunas.
        //Em Java, as matrizes são representadas por arrays multidimensionais.

        //Criando uma matriz de strings com 2 linhas e 3 colunas - utiliza-se dois colchetes [] para declarar uma matriz.
        String[][] matriz = new String[2][3];

        //Criando uma matriz de inteiros com capacidade dinâmoica - inicializando com valores pré-definidos.
        int[][] numeros = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        //Os índices das matrizes em Java começam em 0, o primeiro índice representa a linha, o segundo índice representa a coluna.

        //Acessando um elemento específico da matriz de strings - utilizando os índices para acessar o valor.
        System.out.println(matriz[0][0]);

        //Acessando um elemento específico da matriz de inteiros - utilizando os índices para acessar o valor.
        System.out.println(numeros[0][2]);

        //Exibindo os elementos da matriz de inteiros - passando pelos índices de cada linha e coluna.
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(); // Para pular para a próxima linha após imprimir cada linha da matriz.
        }
    }
}
