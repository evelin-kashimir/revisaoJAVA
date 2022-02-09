package acadamia.devDojo.maratonaJava.introducao;

//Dado um determinado salário, calcular o imposto a ser pago;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por mês: R$");
        double salario = sc.nextDouble();

        if (salario > 0 && salario < 35.0) {
            System.out.println("Imposto: 9.70%");
        } else if (salario > 35 && salario < 68) {
            System.out.println("Imposto: 37.35%");
        } else {
            System.out.println("Imposto: 49.50%");
        }
        sc.close();
    }
}
