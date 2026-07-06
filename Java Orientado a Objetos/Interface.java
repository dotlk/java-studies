//Uma interface define um conjunto de métodos que uma classe deve implementar.
//Ela funciona como um contrato, determinando quais comportamentos uma classe deve possuir. ("deve fazer" ou "é capaz de")

//OBS: Interface é de fato muito similar a uma classe abstrata, porém, dependendo da situação, cada uma se torna mais adequada para o projeto.

//Diferenças entre interface e classe abstrata:
//1. Uma interface é utilizada principalmente para definir métodos obrigatórios (abstratos) - a partir do Java 8, também é possível ter métodos default (com implementação) e métodos estáticos.
//2. Uma interface pode ter herança múltipla, ou seja, uma classe pode implementar várias interfaces, enquanto uma classe comum só pode herdar de uma classe (abstrata ou concreta) por vez.

//Uma classe pode implementar várias interfaces utilizando a palavra-chave implements.


public class Interface {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Subtração: " + calculadora.subtrair(10, 5));
        System.out.println("Potência: " + calculadora.potencia(2, 3));
        System.out.println("Raiz Quadrada: " + calculadora.raizQuadrada(16));
    }
    
}

interface CalculadoraSimples {

    public int somar (int numero1, int numero2);

    public int subtrair (int numero1, int numero2);
}

interface CalculadoraCientifica {

    public double potencia (double base, double expoente);

    public double raizQuadrada (double numero);
}



class Calculadora implements CalculadoraSimples, CalculadoraCientifica {

    @Override
    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    @Override
    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }
}
