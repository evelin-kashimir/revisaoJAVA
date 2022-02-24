package acadamia.devDojo.maratonaJava.javaCore.Exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }
}
