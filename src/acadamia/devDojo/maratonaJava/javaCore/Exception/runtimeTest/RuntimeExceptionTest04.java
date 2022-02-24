package acadamia.devDojo.maratonaJava.javaCore.Exception.runtimeTest;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        //Multiplas Exceções
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
            System.out.println("Dentro do IllegalArgumentException");

        }catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

        //Exceções sempre devem ser tratadas no final, caso contrario aoutras exceções específicas serão ignoradas
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException ");
        }

        try{
            talvezLanceExcecao();
            //Utilizando pipes
        }catch (SQLException | FileNotFoundException e ){
            e.printStackTrace();
        }


    }
    private static void talvezLanceExcecao() throws SQLException,FileNotFoundException{

    }
}
