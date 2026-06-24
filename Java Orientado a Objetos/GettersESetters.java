//É o princípio de utilizar métodos criados para acessar ou modificar atributos privados de uma classe

public class GettersESetters {
    
    public static void main(String[] args) {
        
        Humano pessoa = new Humano();
        //Chamando Setter e Getter da classe Pessoa
        pessoa.setNome("gabriel");
        pessoa.getNome();
    }
}

//Exemplo - Classe Pessoa
class Humano {

    //Atributos
    private String nome;

    //Métodos Set e Get
    public void setNome(String nome) {
        this.nome = nome; //this é usado para se referenciar ao atributo do objeto - Útil para diferenciar parâmetros de atributos.
    }

    public void getNome() {
        System.out.println("O nome deste aluno é " + nome);
    }

}
