package acadamia.devDojo.maratonaJava.javaCore.Metodos.test;

import acadamia.devDojo.maratonaJava.javaCore.Metodos.domain.Estudante;
import acadamia.devDojo.maratonaJava.javaCore.Metodos.domain.ImpressoraEstudantes;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Mariana";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Lucas";
        estudante02.idade = 13;
        estudante02.sexo = 'M';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);


    }

}
