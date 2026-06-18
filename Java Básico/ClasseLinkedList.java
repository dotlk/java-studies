import java.util.LinkedList;

public class ClasseLinkedList {
    
    public static void main(String[] args) {
        
        //linkedlist é uma estrutura de dados que armazena os elementos em nós, onde cada nó contém um valor e uma referência para o próximo nó. 
        //Também é uma coleção de objetos, onde podemos adicionar, remover e acessar os elementos de forma dinâmica.
        //Linkedlist trabalha somente com objetos (String, Integer, Double, etc), não trabalha com tipos primitivos (int, double, char, etc)

        //Diferenças entre ArrayList e LinkedList:
        //Arraylist é uma estrutura de dados que armazena os elementos em um array, onde cada elemento é acessado por meio de um índice.
        //Linkedlist é uma estrutura de dados que armazena os elementos em nós, pode acessar o primeiro elemento, o último elemento e o próximo elemento 

        //Criando um LinkedList de String
        LinkedList<String> lista = new LinkedList<>();

        //Adicionando elementos na lista
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        //Acessando elementos da lista
        System.out.println("Primeiro elemento: " + lista.get(0)); //Java
        System.out.println("Segundo elemento: " + lista.get(1)); //Python
        System.out.println("Terceiro elemento: " + lista.get(2)); //C++

        //Alterando um elemento da lista
        lista.set(2, "JavaScript"); //Altera o elemento "Python" para "JavaScript"
        System.out.println("Lista após alteração: " + lista); //Lista após alteração: [Java, JavaScript, C++]

        //Removendo um elemento da lista
        lista.remove(1); //Remove o elemento "Python"
        System.out.println("Lista após remoção: " + lista); //Lista após remoção: [Java, C++]

        //Removendo o primeiro elemento da lista
        lista.removeFirst(); //Remove o primeiro elemento "Java"
        System.out.println("Lista após remoção do primeiro elemento: " + lista); //Lista após remoção do primeiro elemento: [C++]

        //Removendo o último elemento da lista
        lista.removeLast(); //Remove o último elemento "C++"
        System.out.println("Lista após remoção do último elemento: " + lista); //Lista após remoção do último elemento: []

        //Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size()); //Tamanho da lista: 0
    }
}
