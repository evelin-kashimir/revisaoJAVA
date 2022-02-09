package acadamia.devDojo.maratonaJava.introducao.exercicios;

//Dado um determinado valor de um carro, descubra até em quantas vezes ele pode ser parcelado
//Condição valor parcela >= 1000

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o valor do carro: R$");
        double valorTotal = sc.nextDouble();

        for(int parcela = 1; parcela < valorTotal; parcela++ ){
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " +parcela+ " Valor R$ " +valorParcela);
        }
        sc.close();
    }
}
