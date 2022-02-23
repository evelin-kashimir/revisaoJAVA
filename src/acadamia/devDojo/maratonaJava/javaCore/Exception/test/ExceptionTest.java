package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {        //Deixando explicito globalmente a necessidade de tratar o método
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IOException{
        File file = new File(".idea/arquivo\\teste.txt");

        // Try - Tenta fazer isso
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Criado " +isCriado);

            // Catch - Se não der, Pega;
       } catch (IOException e){

            //mostra a linha que está com problema
            e.printStackTrace();

            //joga novamente a exceção
            throw e;
        }
        //NUNCA deixar o Catch em branco, dessa forma ele fica inútil pois não está sendo tratado;
    }
}
