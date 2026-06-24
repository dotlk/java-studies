public class Construtor {
    
    //Um construtor é um método especial executado automaticamente quando um objeto é criado.
    //Ele é usado principalmente para inicializar os atributos do objeto.
    
    public static void main(String[] args) {
        
        //Ao criar o objeto, o construtor é chamado automaticamente
        Carro Civic = new Carro("Honda", 100.000);

        //Se houver mais de um construtor na mesma classe, pode alternar
        Carro Chevrolet = new Carro();

        System.out.println(Civic);
        System.out.println(Chevrolet);
    }
}

//Exemplo - Classe Carro
class Carro {

    //Atributos
    private String marca;
    private Double preco;

    //Definindo o Construtor
    //Todo construtor deve ter o mesmo nome que a classe.
    Carro(String marca, Double preco) {
        this.marca = marca;
        this.preco = preco;
        System.out.println("A marca do carro é " + marca + " com preço de " + preco + " reais");
    }

    //Pode haver mais de um Construtor desde que sejam diferentes, EX: Por parâmetros
    Carro() {
        marca = "Desconhecida";
        preco = 0.0;
        System.out.println("A marca do carro é " + marca + " com preço de " + preco + " reais");
    }

    // OBS: A existência de múltiplos construtores com parâmetros diferentes é chamada de sobrecarga de construtores (Constructor Overloading).
}
