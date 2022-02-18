package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto :" +produto.getNome());
        System.out.println("Valor :" +produto.getValor());
        System.out.println("Imposto a ser pago :" +imposto);
    }
}
