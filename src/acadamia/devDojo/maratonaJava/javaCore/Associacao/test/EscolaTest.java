package acadamia.devDojo.maratonaJava.javaCore.Associacao.test;

import acadamia.devDojo.maratonaJava.javaCore.Associacao.domain.Escola;
import acadamia.devDojo.maratonaJava.javaCore.Associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Renato");
        Professor[] professores = {professor};
        Escola escola = new Escola("Madureira", professores);

    }
}
