//Static é utilizado para tornar atributos ou métodos disponíveis sem precisar criar um objeto da classe.

public class Estatico {

    public static void main(String[] args) {
        System.out.println(Exemplo.Nome);
        Exemplo.somar(10, 39);

    }
}

class Exemplo {

    //Atributos
    public static String Nome = "Gabriel";

    //Métodos
    public static void somar(int n1, int n2) {
        System.out.println(n1+n2);
    }
}
