//Uma classe abstrata é uma classe utilizada como modelo para outras classes. (Padronização em projetos de software)
//Ela não pode ser instanciada (criar objetos), apenas herdada.

//Classes abstratas podem possuir métodos não obrigatórios e métodos obrigatórios (abstratos).

//Métodos abstratos não possuem implementação e obrigam as classes filhas a implementarem esse método, por meio da sobrescrita (Override).

public class Abstracao {
    
    public static void main(String[] args) {

        Crud produto = new Produto();
        produto.cadastrar();
        produto.selecionar();
        produto.alterar();
        produto.remover();
        produto.mensagem();
        
    }
}

abstract class Crud {

    //Métodos Obrigatórios (Abstratos)
    public abstract void cadastrar();
    public abstract void selecionar();
    public abstract void alterar();
    public abstract void remover();

    //Métodos opcionais (Comuns)
    public void mensagem() {
        System.out.println("Método opcional...");
    }

}

class Produto extends Crud {
    
    @Override
    public void cadastrar() {
        System.out.println("Cadastrando produto...");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando produto...");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando produto...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo produto...");
    }

}