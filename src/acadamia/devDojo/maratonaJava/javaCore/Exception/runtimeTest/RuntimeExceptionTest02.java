package acadamia.devDojo.maratonaJava.javaCore.Exception.runtimeTest;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        //Tratando erro em classe de execução
        try{
            System.out.println(divisao(1,0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código Finalizado");

    }

    //pode ser tratada na linha da assinatura do metodo Ex:
    //  public static int divisao(int a, int b) throw IllegalArgumentException{

    public static int divisao(int a, int b){
        if(b == 0){
            //lançando uma excessão se o if for verdadeiro
            //throw new RuntimeException("Argumento inválido! Não pode ser zero");
            //excecao para argumento ilegal ou inválido
            throw new IllegalArgumentException("Argumento inválido! Não pode ser 0");
        }
        try{
            return a / b;
        }catch (RuntimeException e){
           e.printStackTrace();
        }
        return 0;
    }
}
