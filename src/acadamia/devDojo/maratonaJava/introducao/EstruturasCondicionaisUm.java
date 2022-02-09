package acadamia.devDojo.maratonaJava.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();

        //Condição IF ELSE
       if(idade > 20){
           System.out.println("Pode comprar bebida alcólica");
       } else {
           System.out.println("Não autorizado a comprar bebida alcólica");
       }

       //Condição ELSE IF
        if(idade >= 18 && idade < 50){
            System.out.println("Pode Dirigir");
        } else if (idade > 50 && idade < 70){
            System.out.println("Pode dirigir porém, atenção!");
        } else {
            System.out.println("Não pode dirigir");
        }

        //Operador TERNÁRIO
        System.out.println("Quanto você recebe de salário? R$");
        double salario = sc.nextDouble();
                                                //true          //false
        String resultado = salario > 5000.0 ? "Posso Doar!" : "Não posso doar";
        System.out.println(resultado);
    }
}
