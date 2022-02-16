package acadamia.devDojo.maratonaJava.javaCore.Heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endero;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização 1");
    }
    {
        System.out.println("Bloco de inicialização 2 ");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(endero.getRua() + " - " + endero.getCep());
    }

    public Endereco getEndero() {
        return endero;
    }

    public void setEndero(Endereco endero) {
        this.endero = endero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
