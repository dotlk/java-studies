import java.util.Stack;

public class ClasseStack {

    public static void main(String[] args) {


        //Stack é uma estrutura de dados que segue a regra LIFO (Last in, First Out), ou seja, o último a entrar é o primeiro a ser removido.
        //Stack trabalha somente com objetos (String, Integer, Double, etc), não trabalha com tipos primitivos (int, double, char, etc)
        //OBS: Tipos primitivos podem ser convertido em objetos ao usar classes Wrapper


        //Criando um stack de string
        Stack<String> pilha = new Stack<>();

        //Adicionando elementos na stack
        pilha.push("prato 1");
        pilha.push("prato 2");
        pilha.push("prato 3");

        //Acessando elementos da stack
        System.out.println(pilha);
        System.out.println(pilha.get(1));

        //Remove o último elemento na stack
        pilha.pop();

        //Peek - exibe o próximo registro a ser removido
        System.out.println(pilha.peek());
        

        
    }
}