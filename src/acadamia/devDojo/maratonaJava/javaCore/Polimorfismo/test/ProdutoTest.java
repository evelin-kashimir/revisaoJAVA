package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.test;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Computador;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Tomate;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac 10 i7", 12000 );
        Tomate tomate = new Tomate("Tomate Nacional", 10 );
        CalculadoraImposto.calculandoImpostoTomate(tomate);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
