//Encapsulamento é o princípio de proteger os dados de uma classe e controlar como eles podem ser acessados ou modificados.
//É feito tornando os atributos private e criando métodos com modificadores pré-definidos para acessar ou alterar esses atributos de forma controlada.
//Dessa forma, os atributos só podem ser modificados dentro daquela classe, por meio de seus métodos.

public class Encapsulamento {
    public static void main(String[] args) {

        Aluno gabriel = new Aluno();
        gabriel.adicionarnotas(10, 30);

    }
}


//Exemplo - classe Aluno
class Aluno {

    //Atributos
    private double nota1;
    private double nota2;

    //Métodos
    private double media() {
        return (nota1 + nota2)/2;
    }
    //OBS: Só é possível utilizar o método media dentro da classe Aluno, através de outros métodos.

    public void adicionarnotas(double n1, double n2) {
        nota1 = n1;
        nota2 = n2;
        double media = media();

        System.out.println(media > 7 ? "Aprovado com média " + media : "Reprovado com média " + media);

    }
} 

    
