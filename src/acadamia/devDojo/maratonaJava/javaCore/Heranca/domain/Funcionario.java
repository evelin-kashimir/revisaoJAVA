package acadamia.devDojo.maratonaJava.javaCore.Heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;



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
}
