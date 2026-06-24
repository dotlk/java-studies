//As classes funcionam como moldes para gerar objetos
//OBS - Boa Prática: Toda classe começa com letra maiúscula

//Todo arquivo pode possuir várias classes, porém, apenas uma delas pode ser public,
//A classe public deve ter o mesmo nome que o arquivo.

//Na presença do método main, qualquer classe poderá iniciar a execução do programa.

public class Classes {
    
    public static void main(String[] args) {

        //Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        //Atribuindo valores aos atributos do objeto criado
        pessoa1.nome = "Pedro";
        pessoa1.idade = 10;

        //Exibindo informações
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        //Chamando um método
        pessoa1.apresentacao();
        System.out.println(pessoa1.situacao());

    }
}

//Exemplo - classe Pessoa
class Pessoa {

    //Definindo Atributos - Variáveis internas da classe, que todos os objetos possuem individualmente
    String nome;
    int idade;

    //Definindo Métodos - Funções internas da classe, que todos os objetos podem chamar individualmente
    //OBS - Boa Prática: Todo método começa com a letra minúscula

    //Método sem retorno de valor
    void apresentacao() {
        System.out.println("Olá " + nome + " Você possui " + idade + " anos!");
    }

    //Método com retorno de valor
    String situacao() {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
}


