package acadamia.devDojo.maratonaJava.javaCore.Metodos.test;

import acadamia.devDojo.maratonaJava.javaCore.Metodos.domain.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();
        calculadora.soma();

        int opt = 0, num1 = 0, num2 = 2;

        System.out.println("Escolha uma operação: ");
        System.out.println("1 :[+] | 2 :[-] | 3:[x] | 4:[/]");
        opt = sc.nextInt();

        switch (opt){
            case 1: System.out.println("Digite um número: ");
                    num1 = sc.nextInt();

                    System.out.println("Digite outro numero: ");
                    num2 = sc.nextInt();
                    System.out.println(calculadora.somaParametro(num1, num2));
                    break;
            case 2: System.out.println("Digite um número: ");
                    num1 = sc.nextInt();

                    System.out.println("Digite outro numero: ");
                    num2 = sc.nextInt();
                    System.out.println(calculadora.subtracao(num1, num2));
                    break;
            case 3: System.out.println("Digite um número: ");
                    num1 = sc.nextInt();

                    System.out.println("Digite outro numero: ");
                    num2 = sc.nextInt();
                    System.out.println(calculadora.multiplicacao(num1, num2));
                    break;
            case 4: System.out.println("Digite um número: ");
                    num1 = sc.nextInt();

                    System.out.println("Digite outro numero: ");
                    num2 = sc.nextInt();
                    System.out.println(calculadora.divisao(num1, num2));
                    break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
