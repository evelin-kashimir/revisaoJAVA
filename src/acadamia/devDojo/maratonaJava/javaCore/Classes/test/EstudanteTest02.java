package acadamia.devDojo.maratonaJava.javaCore.Classes.test;

import acadamia.devDojo.maratonaJava.javaCore.Classes.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "sandy";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
