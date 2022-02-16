package acadamia.devDojo.maratonaJava.javaCore.Heranca.test;

import acadamia.devDojo.maratonaJava.javaCore.Heranca.domain.Endereco;
import acadamia.devDojo.maratonaJava.javaCore.Heranca.domain.Funcionario;
import acadamia.devDojo.maratonaJava.javaCore.Heranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("081584-693-36");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setCpf("444.555.666");
        pessoa.setEndero(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Amauri");
        funcionario.setCpf("444.666.999-85");
        funcionario.setEndero(endereco);
        funcionario.setSalario(2500.50);

        pessoa.imprime();
        System.out.println("----------");
        funcionario.imprime();
    }
}
