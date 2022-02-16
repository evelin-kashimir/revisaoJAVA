package acadamia.devDojo.maratonaJava.javaCore.ModificadorFinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //constante

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
