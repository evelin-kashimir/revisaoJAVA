package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.test;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Computador;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Produto;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Raizen9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------------");

        Produto produtoDois = new Tomate("Havaiano", 15);
        System.out.println(produtoDois.getNome());
        System.out.println(produtoDois.getValor());
        System.out.println(produtoDois.calcularImposto());
    }
}
