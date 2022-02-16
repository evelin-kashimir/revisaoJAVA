package acadamia.devDojo.maratonaJava.javaCore.Interfaces.domain;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
}
