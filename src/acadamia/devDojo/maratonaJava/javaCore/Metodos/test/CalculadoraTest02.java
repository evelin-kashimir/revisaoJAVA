package acadamia.devDojo.maratonaJava.javaCore.Metodos.test;

import acadamia.devDojo.maratonaJava.javaCore.Metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTest2");
        System.out.println(num1);
        System.out.println(num2);
    }
}
