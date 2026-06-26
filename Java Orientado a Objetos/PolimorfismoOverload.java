//Polimorfismo por Overload (Sobrecarga) é a capacidade de uma classe possuir múltiplos métodos com mesmo nome e com parâmetros diferentes.
//isso resulta em diferentes comportamentos.

public class PolimorfismoOverload {

    public static void main(String[] args) {
        calculadora teste = new calculadora();
        teste.somar(10, 20);
        teste.somar(10, 30, 40);
    }
   
}

class calculadora {
    
    //Métodos
    public int somar(int n1, int n2) {
        
        return n1+n2;
    }

    public int somar(int n1, int n2, int n3) {

        return n1+n2+n3;
    }
}