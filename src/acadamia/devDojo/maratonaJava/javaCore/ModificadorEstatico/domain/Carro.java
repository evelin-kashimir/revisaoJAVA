package acadamia.devDojo.maratonaJava.javaCore.ModificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; //deixa o atributo definitivo a classe carro

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Méxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }


    public void setNome(String nome) {this.nome = nome;}
    public void setVelocidadeMaxima(double velocidadeMaxima) {this.velocidadeMaxima = velocidadeMaxima;}

    public String getNome() {return nome;}
    public double getVelocidadeMaxima() {return velocidadeMaxima;}

}
