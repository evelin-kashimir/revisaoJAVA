package acadamia.devDojo.maratonaJava.javaCore.Metodos.exercicio.test;

import acadamia.devDojo.maratonaJava.javaCore.Metodos.exercicio.domain.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Insira o primeiro salario: R$");
        double sal1 = sc.nextDouble();

        System.out.print("Insira o segundo: R$");
        double sal2 = sc.nextDouble();

        System.out.print("Insira o terceiro: R$");
        double sal3 = sc.nextDouble();

        funcionario.setNome(nome);
        funcionario.setIdade(idade);
        funcionario.setSalario(new double[]{sal1, sal2, sal3});

        funcionario.imprimeDados();
        funcionario.mediaSalario(sal1, sal2, sal3);

        sc.close();


    }
}
