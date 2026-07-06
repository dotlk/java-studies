//Polimorfismo por Overriding (Sobrescrita) é a capacidade de uma classe herdar métodos de uma classe pai e sobrescrever o comportamento desses métodos na classe filha.
//Isso ocorre ao definir um método na classe filha com o mesmo nome, tipo de retorno e parâmetros do método da classe pai.
//A anotação @Override indica que o método da classe filha está sobrescrevendo o método da classe pai. (Ajuda o compilador a detectar erros)

public class PolimorfismoOverriding {
    
    public static void main(String[] args) {
        
        //Criando objeto da classe DescontoPadrao
        DescontoPadrao obj = new DescontoPadrao();

        System.out.println("Desconto do Imposto de Renda: " + obj.impostoRenda(1000.0));
        System.out.println("Desconto do Vale Transporte: " + obj.valeTransporte(1000.0));   

        //Criando objeto da classe DescontoGerente
        //O objeto da classe DescontoGerente, possui acesso aos métodos da classe DescontoPadrao, mas sobrescreve o método impostoRenda
        //logo, o seu comportamento será diferente.
        DescontoGerente obj2 = new DescontoGerente();

        System.out.println("Desconto do Imposto de Renda: " + obj2.impostoRenda(1000.0));
        System.out.println("Desconto do Vale Transporte: " + obj2.valeTransporte(1000.0));

        //Criando objeto da classe DescontoDesenvolvedor
        //O objeto da classe DescontoDesenvolvedor, possui acesso aos métodos da classe DescontoPadrao, mas sobrescreve o método valeTransporte
        //logo, o seu comportamento será diferente.
        DescontoDesenvolvedor obj3 = new DescontoDesenvolvedor();

        System.out.println("Desconto do Imposto de Renda: " + obj3.impostoRenda(1000.0));
        System.out.println("Desconto do Vale Transporte: " + obj3.valeTransporte(1000.0));
        
    }
}


class DescontoPadrao {

    //Métodos
    public double impostoRenda (double salario) {

        return salario * 0.10;
    }

    public double valeTransporte (double salario) {

        return salario * 0.06;
    }
}

class DescontoGerente extends DescontoPadrao {
    //Métodos
    @Override
    public double impostoRenda (double salario) {

        return salario * 0.15;
    }
}

class DescontoDesenvolvedor extends DescontoPadrao {
    //Métodos
    @Override
    public double valeTransporte (double salario) {

        return salario * 0.12;
    }
}