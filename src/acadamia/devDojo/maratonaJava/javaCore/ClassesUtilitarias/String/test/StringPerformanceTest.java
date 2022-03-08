package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.String.test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();//tranforma o horario atual em milissegundos
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução String Buffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i); //pendura no objeto sb, quase que uma iteração
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbu = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sbu.append(i); //pendura no objeto sb, quase que uma iteração
        }
    }
}
