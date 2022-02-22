package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
      recursividade();
    }
}
