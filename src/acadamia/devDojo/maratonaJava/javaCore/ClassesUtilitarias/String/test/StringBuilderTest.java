package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.String.test;

public class StringBuilderTest {

    public static void main(String[] args) {

        String nome = "Evelin Kashimir";
        nome.concat(" Ferraz");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Evelin"); //Classe que trabalha com Strings
        sb.append(" Kashimir").append(" Ferraz");
        sb.reverse(); //reverte a ordem da string
        sb.reverse();
        sb.delete(0, 3); //deleta os caracteres de um a outro;
        System.out.println(sb);
    }
}
