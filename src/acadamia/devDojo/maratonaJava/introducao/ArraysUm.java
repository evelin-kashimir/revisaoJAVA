package acadamia.devDojo.maratonaJava.introducao;

import java.util.Scanner;

public class ArraysUm {

    public static void main(String[] args) {

       //Array - Tipo Int
        int [] idades = new int[3];
        for(int i = 0; i < 3; i++){
            idades[i] = i*2;
            System.out.println(idades[i]);
        }

        //Tipo String
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos nomes quer cadastrar? ");
        String [] nomes = new String[sc.nextInt()];

        for (int j = 0; j < nomes.length; j++){
            System.out.println("Digite um nome:");
            nomes[j] = sc.next();
        }

        for (int l = 0; l < nomes.length; l++){
            System.out.println(nomes[l]);
        }

        sc.close();
    }
}
