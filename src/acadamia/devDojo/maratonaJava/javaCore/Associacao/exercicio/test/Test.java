package acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.test;


import acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain.Aluno;
import acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain.Local;
import acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain.Professor;
import acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain.Seminario;

public class Test {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Amanda", 25);
        Aluno aluno02 = new Aluno("Pedro", 17);

        Professor professor01 = new Professor("João", "Filosofia");
        Professor professor02 = new Professor("Maria", "Biologia");

        Local local01 = new Local("Arujá");
        Local local02 = new Local("São Paulo");

        Aluno[] alunos = {aluno01, aluno02};

        Seminario seminario01 = new Seminario("Biologia Marinha",local01,professor02, alunos);
        Seminario seminario02 = new Seminario("A fé no Agora",local02, professor01);

        System.out.println(" ----- ALUNOS ------- ");
        aluno01.imprime();
        aluno02.imprime();
        System.out.println(" ----- PROFESSORES ------- ");
        professor01.imprime();
        professor02.imprime();
        System.out.println(" ----- SEMINARIOS ------- ");
        seminario01.imprime();
        seminario02.imprime();
    }
}
