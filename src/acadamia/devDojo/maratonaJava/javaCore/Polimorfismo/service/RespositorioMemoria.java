package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.repository.Repositorio;

public class RespositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memória...");
    }
}
