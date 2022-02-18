package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Computador;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " +computador.getNome());
        System.out.println("Valor: " +computador.getValor());
        System.out.println("Imposto a ser pago: R$" +imposto);
    }

    public static void calculandoImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " +tomate.getNome());
        System.out.println("Valor: " +tomate.getValor());
        System.out.println("Imposto a ser pago: R$" +imposto);
    }
}
