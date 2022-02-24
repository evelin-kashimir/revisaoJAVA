package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.Wrapper.test;

public class WrapperTest {

    //Wrappers são objetos que incapsulam os tipos primitivos
    byte bite = 1;
    short shoti = 1;
    int inteiro = 1; //unboxing
    long longi = 1L;
    float floati = 1.0f;
    double doubli = 1.5;
    char chart = 'P';
    boolean boleano = true;

    //Classes Wrappers
    Byte biteC = 127;
    Short shotC = 1;
    Integer inteiroC = 1; //Boxing
    Long longC = 1L;
    Float floatC = 1.0f;
    Double doubleC = 1.5;
    Character charC = 'P';
    Boolean boleanoC = true;

    Integer intw = Integer.parseInt("1"); //convertendo o valor pra inteiro

    public static void main(String[] args) {
        //Métodos de wrapper
        System.out.println(Character.isLetter('4'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
    }

}
