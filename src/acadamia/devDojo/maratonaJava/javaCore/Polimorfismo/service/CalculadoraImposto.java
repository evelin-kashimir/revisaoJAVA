package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Produto;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Valor: R$" +produto.getValor());
        System.out.println("Imposto a ser pago: R$" +imposto);

        //Verificando se a instancia do objeto que está sendo verificado pretence a classe 'Tomate'
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade: " +tomate.getDataValidade());
        }
    }
}
