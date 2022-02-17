package acadamia.devDojo.maratonaJava.javaCore.Interfaces.domain;

public interface DataRemover {
    public static final int MAX_DATA_SIZE = 10;
    void remove();

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface");
    }
}
