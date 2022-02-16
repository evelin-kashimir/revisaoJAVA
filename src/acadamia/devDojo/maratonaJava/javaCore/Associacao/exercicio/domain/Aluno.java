package acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
