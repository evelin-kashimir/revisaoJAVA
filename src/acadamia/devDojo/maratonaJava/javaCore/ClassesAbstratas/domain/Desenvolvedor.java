package acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return this.nome + " " + this.salario;
    }
}
