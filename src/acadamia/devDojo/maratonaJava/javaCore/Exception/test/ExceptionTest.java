package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File(".idea/arquivo\\teste.txt");

        // Try - Tenta fazer isso
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Criado " +isCriado);
            // Catch - Se não der, Pega;
       } catch (IOException e){
            //mostra a linha que está com problema
            e.printStackTrace();
        }
        //NUNCA deixar o Catch em branco, dessa forma ele fica inútil pois não está sendo tratado;

    }
}
