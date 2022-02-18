package acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.test;

import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.repository.Repositorio;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service.RespositorioArquivo;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service.RespositorioBancoDeDados;
import acadamia.devDojo.maratonaJava.javaCore.Polimorfismo.service.RespositorioMemoria;

public class RepositorioTes {
    public static void main(String[] args) {

        Repositorio repositorio_db = new RespositorioBancoDeDados();
        Repositorio repositorio_ar = new RespositorioArquivo();
        Repositorio repositorio_me = new RespositorioMemoria();

        repositorio_db.salvar();
        repositorio_ar.salvar();
        repositorio_me.salvar();

    }
}
