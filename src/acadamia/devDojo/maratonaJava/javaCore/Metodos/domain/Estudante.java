package acadamia.devDojo.maratonaJava.javaCore.Metodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //this - esse
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
