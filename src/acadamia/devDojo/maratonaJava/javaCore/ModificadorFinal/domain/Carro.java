package acadamia.devDojo.maratonaJava.javaCore.ModificadorFinal.domain;

//a partir do momento que você torna a sua classe como final, ela não pode ser extendida
public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //constante
    public final Comprador COMPRADOR = new Comprador(); //objeto constante, não pode ser alterado

    public void setNome(String nome) {
        this.nome = nome;
    }

    //esse metodo vai ser sobreescrito na sub classe, porém não pode ser alterado
    public final void imprime(){
        System.out.println(this.nome);
        System.out.println(this.COMPRADOR);
    }

    public String getNome() {
        return nome;
    }
}
