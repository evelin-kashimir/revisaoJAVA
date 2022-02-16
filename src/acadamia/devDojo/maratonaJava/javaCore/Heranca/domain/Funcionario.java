package acadamia.devDojo.maratonaJava.javaCore.Heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização Funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização Funcionario 2 ");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println(this.nome);
    }
}
