package acadamia.devDojo.maratonaJava.javaCore.Enume.test;

import acadamia.devDojo.maratonaJava.javaCore.Enume.domain.Cliente;
import acadamia.devDojo.maratonaJava.javaCore.Enume.domain.TipoCliente;
import acadamia.devDojo.maratonaJava.javaCore.Enume.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Adriana", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Joao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
