package acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.test;

import acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain.Desenvolvedor;
import acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain.Funcionario;
import acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Namy", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Evelin", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
