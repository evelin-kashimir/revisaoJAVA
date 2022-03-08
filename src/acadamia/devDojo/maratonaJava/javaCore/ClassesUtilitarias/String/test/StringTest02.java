package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.String.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Lufy  -";
        String numeros = "012345";

        System.out.println(nome.charAt(2)); //baseado em array acessa a posição 6 da palavra no caso 'f'
        System.out.println(nome.length()); //traz o tamanho da palavra, baseado em array;
        System.out.println(nome.replace("u", "r")); //repara todos o l por r
        System.out.println(nome.toLowerCase(Locale.ROOT)); //deixa tudo em minuscula
        System.out.println(numeros.substring(0,2)); //lê as posicoes de uma citada a outra
        System.out.println(nome.trim()); //remove valores em branco no começo e no fim da string
    }
}
