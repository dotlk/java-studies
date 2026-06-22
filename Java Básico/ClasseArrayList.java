import java.util.ArrayList;

public class ClasseArrayList {
    public static void main(String[] args) {

        //Arraylist é a famosa list, ela é uma coleção de objetos, onde podemos adicionar, remover e acessar os elementos de forma dinâmica.
        //Arraylist trabalha somente com objetos (String, Integer, Double, etc), não trabalha com tipos primitivos (int, double, char, etc)
        //OBS: Tipos primitivos podem ser convertido em objetos ao usar classes Wrapper
        
        //Criando um ArrayList de String
        ArrayList<String> lista = new ArrayList<>();

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

        //Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size()); //Tamanho da lista: 2
    }
}