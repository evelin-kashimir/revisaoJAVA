package acadamia.devDojo.maratonaJava.javaCore.ClassesAbstratas.domain;

//Classe abstrata é como se fosse um template, algo inexistente, não é possível ser instanciada
//não pode ser um objeto, somente uma sub classe pode ser instanciada, no caso da classe Gerente
//foi criada para se extendida, criada para ser uma super classe
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
