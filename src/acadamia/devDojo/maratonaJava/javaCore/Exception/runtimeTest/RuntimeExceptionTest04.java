package acadamia.devDojo.maratonaJava.javaCore.Exception.runtimeTest;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        //Multiplas Exceções
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e ){
            System.out.println("Dentro do IllegalArgumentException");
        }
        //Exceções sempre devem ser tratadas no final, caso contrario aoutras exceções específicas serão ignoradas
        catch (RuntimeException e){

            System.out.println("Dentro do RuntimeException ");
        }
    }
}
