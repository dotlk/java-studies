//Herança é o mecanismo que permite uma classe herdar atributos e métodos de outra classe
//Isso é feito utilizando a palavra chave extends - Indica que uma classe está herdando de outra 

public class Heranca {
    
    public static void main(String[] args) {
        
        //Criando objeto da classe Colaborador
        Colaborador objetoColaborador = new Colaborador("Pedro", 23, "Professor", 3000.0);

        //O objeto da classe Colaborador, possui acesso aos atributos e aos métodos da classe Individuo
        objetoColaborador.apresentacaoIndividuo();
        objetoColaborador.apresentacaoColaborador();
    }
}

class Individuo {

    //Atributos
    /*O modificador protected permite que a própria classe, suas subclasses
      e as demais classes do mesmo pacote tenham acesso aos atributos.*/
    protected String nome;
    protected int idade;   

    //Construtor                          
    Individuo(String nome, int idade) {                  
        this.nome = nome;                   
        this.idade = idade;                 
    }                        

    //Métodos
    public void apresentacaoIndividuo() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }

}

class Colaborador extends Individuo {

    //Atributos
    private String cargo;
    private double salario;

    //Construtor
    Colaborador(String nome, int idade, String cargo, Double salario) {
        super(nome, idade); //super é utilizado DENTRO da classe filha para chamar construtores, acessar atributos ou métodos da classe pai.
        this.cargo = cargo;
        this.salario = salario;
    }

    /* Quando não existe um construtor definido na classe pai,
    o Java cria automaticamente um construtor vazio: Individuo().
 
    Ao criar um objeto da classe filha, em seu construtor, o Java tenta chamar automaticamente
    super() no início do construtor da classe filha, ou seja, o construtor vazio da classe pai.

    Entretanto, quando um construtor personalizado é criado na classe pai,
    o construtor vazio automático deixa de existir. >>Nesse caso, a classe
    filha deve chamar explicitamente um construtor da classe pai utilizando super(...)<<

    Antes de construir completamente a classe filha, o Java precisa construir
    a parte herdada da classe pai. Por isso, o construtor da classe pai é executado primeiro.
    
    Após a construção da classe pai, a classe filha pode utilizar
    this para acessar os atributos e métodos herdados. */

    //Métodos
    public void apresentacaoColaborador() {
        System.out.println("cargo: " + cargo);
        System.out.println("salario: " + salario);
    }
    
}
