package acadamia.devDojo.maratonaJava.introducao;

//Imprimir todos os números pares de 0 até 1000000
public class Exercicio03 {
    public static void main(String[] args) {

        for( int l = 0; l < 1000000; l++){

            if( l % 2 == 0){
                System.out.println(l);
            }
        }
    }
}
