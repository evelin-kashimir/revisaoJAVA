package acadamia.devDojo.maratonaJava.javaCore.Heranca.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endero;

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
