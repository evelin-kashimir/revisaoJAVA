package acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return this.nome + " " + this.salario ;
    }
}
