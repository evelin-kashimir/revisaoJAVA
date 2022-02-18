package acadamia.devDojo.maratonaJava.javaCore.Interfaces.test;

import acadamia.devDojo.maratonaJava.javaCore.Interfaces.domain.DatabaseLoader;
import acadamia.devDojo.maratonaJava.javaCore.Interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        fileLoader.remove();
        databaseLoader.remove();
        databaseLoader.metodoConcreto();
        databaseLoader.metodoConcreto();
    }
}
