package acadamia.devDojo.maratonaJava.javaCore.Classes.exercicio01.test;

import acadamia.devDojo.maratonaJava.javaCore.Classes.exercicio01.domain.Carro;

//Criar dois objetos distintos e imprimir os valores
public class CarroTest {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.nome = "Gol";
        carro01.modelo = "SUV";
        carro01.ano = 2000;

        System.out.println("Carro: " + carro01.nome + " | Modelo: " + carro01.modelo + " | Ano: " + carro01.ano);

        Carro carro02 = new Carro();
        carro02.nome = "Pálio";
        carro02.modelo = "Esportivo";
        carro02.ano = 2002;

        System.out.println("Carro: " + carro02.nome + " | Modelo: " + carro02.modelo + " | Ano: " + carro02.ano);
    }
}
