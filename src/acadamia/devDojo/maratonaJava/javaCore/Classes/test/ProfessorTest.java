package acadamia.devDojo.maratonaJava.javaCore.Classes.test;

import acadamia.devDojo.maratonaJava.javaCore.Classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Kamikaze";
        professor.idade = 85;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " | Idade: " + professor.idade + " | Sexo: " + professor.sexo);
    }
}
