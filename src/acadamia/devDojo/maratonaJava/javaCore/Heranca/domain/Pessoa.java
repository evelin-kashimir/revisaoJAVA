package acadamia.devDojo.maratonaJava.javaCore.Heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endero;

    public Pessoa(String nome){
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
