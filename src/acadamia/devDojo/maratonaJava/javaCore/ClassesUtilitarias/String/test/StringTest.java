package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.String.test;

public class StringTest {
    //String são imutáveis
    public static void main(String[] args) {
        String nome = "Evelin"; //String constant pool
        String nome2 = "Evelin";
        nome = nome.concat(" Kashimir");

        //mesmos tipos - String literal
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));

        String nome3 = new String("Evelin"); //criando um objeto
        System.out.println(nome2 == nome3); // tipos diferentes um é objeto o outro é variavel
        System.out.println(nome2 == nome3.intern()); //intern pega o valor
    }
}
