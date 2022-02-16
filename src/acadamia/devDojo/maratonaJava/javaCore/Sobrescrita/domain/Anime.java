package acadamia.devDojo.maratonaJava.javaCore.Sobrescrita.domain;

public class Anime extends Object {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
