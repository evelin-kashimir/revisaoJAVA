package acadamia.devDojo.maratonaJava.javaCore.Enume.test;

import acadamia.devDojo.maratonaJava.javaCore.Enume.domain.Cliente;
import acadamia.devDojo.maratonaJava.javaCore.Enume.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Adriana", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Matias",  TipoCliente.PESSOA_FISICA );
        Cliente cliente03 = new Cliente("Lucas",  TipoCliente.PESSOA_FISICA);
        Cliente cliente04 = new Cliente("Joao", TipoCliente.PESSOA_JURIDICA );
        Cliente cliente05 = new Cliente("Daniela", TipoCliente.PESSOA_JURIDICA );

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
        System.out.println(cliente05);
    }
}
