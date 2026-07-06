//Upcasting é o princípio de utilizar uma referência da classe pai para armazenar um objeto da classe filha.
//Isso é possível porque toda classe filha também é considerada um objeto da classe pai.

//Ao chamar um método sobrescrito (@Override), o Java executa automaticamente
//a implementação da classe filha, mesmo utilizando uma referência da classe pai.

public class PolimorfismoUpcasting {

    public static void main(String[] args) {
        //A referência é da classe Animal.
        Animal animal = new Cachorro();

        //O método executado será o da classe Cachorro.
        animal.emitirSom();

        //A mesma referência agora aponta para um objeto da classe Gato.
        animal = new Gato();

        //O método executado será o da classe Gato.
        animal.emitirSom();

    }
}

class Animal {

    //Métodos
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {

    //Métodos
    //Sobrescrevendo o método da classe pai.
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {

    //Métodos
    //Sobrescrevendo o método da classe pai.
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

/* Explicação:

Animal animal = new Cachorro();

- A referência é do tipo Animal.
- O objeto criado é do tipo Cachorro.

Como Cachorro herda de Animal, essa atribuição é válida.

Ao executar:

animal.emitirSom();

o Java verifica qual é o objeto armazenado na referência.
Como o objeto é um Cachorro e o método foi sobrescrito (@Override),
o método da classe Cachorro é executado.

O mesmo acontece quando a referência passa a apontar para um objeto Gato.

Esse comportamento é conhecido como Polimorfismo.
*/