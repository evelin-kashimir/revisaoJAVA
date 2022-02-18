package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.test;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Computador;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Produto;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Tomate;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Raizen9", 3000);
        Tomate tomate = new Tomate("Havaiano", 15);
        tomate.setDataValidade("11/12/2022");

       CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
       CalculadoraImposto.calcularImposto(produto);


    }
}
