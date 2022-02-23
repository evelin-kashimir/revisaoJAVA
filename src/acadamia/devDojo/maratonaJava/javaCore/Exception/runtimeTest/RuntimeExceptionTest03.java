package acadamia.devDojo.maratonaJava.javaCore.Exception.runtimeTest;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try{
            System.out.println("Abrindo Arquivo...");
            System.out.println("Escrevendo dados no arquivo...");

        }catch (Exception e){
            e.printStackTrace();

        //bloco que sempre será executado
        }finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
    }
}
