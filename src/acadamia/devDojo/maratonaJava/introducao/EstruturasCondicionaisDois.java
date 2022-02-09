package acadamia.devDojo.maratonaJava.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisDois {
    public static void main(String[] args) {

        //Switch Case (Escolha Caso)

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda!");
                break;
            case 3:
                System.out.println("Hoje é terça!");
                break;
            case 4:
                System.out.println("Hoje é quarta!");
                break;
            case 5:
                System.out.println("Hoje é quinta!");
                break;
            case 6:
                System.out.println("Hoje é sexta!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;
        }

        System.out.println("Qual o seu sexo: (F) / (M)");
        String sexo = sc.next();

        switch (sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}
