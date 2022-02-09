package acadamia.devDojo.maratonaJava.javaCore.Classes.test;

import acadamia.devDojo.maratonaJava.javaCore.Classes.domain.Estudante;

//Classe para criação de objetos
public class EstudanteTest {
    public static void main(String[] args) {

        //Criando um objeto da classe especificada
        Estudante estudante = new Estudante();

        //Atribuindo valores aos atributos
        estudante.nome = "Julia Gomes";
        estudante.idade = 16;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
