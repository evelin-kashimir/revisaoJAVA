package acadamia.devDojo.maratonaJava.javaCore.Metodos.test;

import acadamia.devDojo.maratonaJava.javaCore.Metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int []numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5); //atribui números diretament ao invés de criar um array
    }
}
