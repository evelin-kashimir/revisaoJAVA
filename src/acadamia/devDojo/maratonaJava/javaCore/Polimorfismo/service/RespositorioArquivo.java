package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.repository.Repositorio;

public class RespositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Arquivo...");
    }
}
