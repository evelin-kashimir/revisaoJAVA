package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.Leitor;
import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.Leitor02;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }

    //Sem resources
    public static void lerArquivo02(){
        //Classe para ler arquivos
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                //só vai fechar se não for null, se o arquivo existir
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo() {
        try(Leitor leitor = new Leitor();
            Leitor02 leitor02 = new Leitor02()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
