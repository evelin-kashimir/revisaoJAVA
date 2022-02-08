package acadamia.devDojo.maratonaJava.introducao;

public class OperadoresDois {
    public static void main(String[] args) {

        //Resto da divisão %
        int resto = 20 % 2;
        System.out.println(resto);

        //Operadores Relacionais
        boolean testeMaior = 10 > 20;
        boolean testeMenor = 10 < 20;
        boolean testeMaiorIgual = 10 >= 20;
        boolean testeMenorIgual = 10 <= 20;
        boolean testeDiferente = 10 != 20;
        boolean testeIgualdade = 10 == 20;

        System.out.println("10 é maior que 20? " +testeMaior);
        System.out.println("10 é menor que 20? " +testeMenor);
        System.out.println("10 é maior ou igual a 20? " +testeMaiorIgual);
        System.out.println("10 é menor ou igual a 20? " +testeMenorIgual);
        System.out.println("10 é diferente de 20? " +testeDiferente);
        System.out.println("10 é igual a 20? " +testeIgualdade);
    }
}
