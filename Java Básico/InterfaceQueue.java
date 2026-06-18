import java.util.LinkedList;
import java.util.Queue;

public class InterfaceQueue {
    
    public static void main(String[] args) {
        
        //Queue é uma estrutura de dados que segue a regra FIFO (First In, First Out), ou seja, o primeiro elemento a ser adicionado é o primeiro a ser removido. 
        //Também é uma coleção de objetos, onde podemos adicionar, remover e acessar os elementos de forma dinâmica, mas não podemos alterar.
        //Queue trabalha somente com objetos (String, Integer, Double, etc), não trabalha com tipos primitivos (int, double, char, etc)
        //É uma interface, por isso, é implementada por outras classes do Collections. Neste caso, uma LinkedList

        //Criando um Queue de String
        Queue<String> fila = new LinkedList<>();

        //Adicionando elementos na fila
        fila.offer("Java");
        fila.offer("Python");
        fila.offer("C++");
        
        //Remove o primeiro elemento na fila
        fila.poll();

        //Acessando elementos na fila
        System.out.println(fila);
    }
}
