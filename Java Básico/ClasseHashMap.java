import java.util.HashMap;

public class ClasseHashMap {
    
    public static void main(String[] args) {
        
        //Hashmap é o famoso dictionary, uma coleção que armazena pares chave-valor
        //Hashmap trabalha somente com objetos (String, Integer, Double, etc), não trabalha com tipos primitivos (int, double, char, etc)
        //OBS: Tipos primitivos podem ser convertido em objetos ao usar classes Wrapper

        //Criando um Hashmap de String
        //É preciso definir a tipagem tanto da chave quanto para o valor
        HashMap<String, String> linguagens = new HashMap<>();

        //Adicionando elementos no Hashmap 
        linguagens.put("Java", "Linguagem multi plataformas");
        linguagens.put("HTML", "Linguagem de marcação");
        linguagens.put("CSS", "Linguagem de estilização");

        //Removendo elementos no Hashmap
        linguagens.remove("Java");

        //Acessando elementos do Hashmap
        System.out.println(linguagens.get("Java"));
        System.out.println(linguagens.get("HTML"));
        System.out.println(linguagens.get("CSS"));

        //Tamanho do hashmap
        System.out.println(linguagens.size());


    }
}
