package acadamia.devDojo.maratonaJava.javaCore.ModificadorFinal.test;

import acadamia.devDojo.maratonaJava.javaCore.ModificadorFinal.domain.Carro;
import acadamia.devDojo.maratonaJava.javaCore.ModificadorFinal.domain.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        carro.COMPRADOR.setNome("Caio");
        System.out.println(carro.COMPRADOR);

    }
}
