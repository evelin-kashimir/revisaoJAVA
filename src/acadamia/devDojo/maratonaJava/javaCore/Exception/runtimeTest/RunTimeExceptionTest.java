package acadamia.devDojo.maratonaJava.javaCore.Exception.runtimeTest;

public class RunTimeExceptionTest {
    public static void main(String[] args) {

        //RuntimeException - Unchecked
        Object object = null;
        System.out.println(object);
        int[] array = {1,2};
        System.out.println(array[2]);
    }
    //Checked
    // Filhas da classe Exception diretamente, se não tratadas lançam um erro em tempo de produção e
    // o código não compila, devem ser obrigatóriamente tratadas;

    //Unchecked
    //Filhas de Runtime Exception, problemas de sintaxe, problemas feitos pelo dev, digitação errada
    // e exceções não tratadas, não precisa ser tratada porém dará erro na execução;
}
