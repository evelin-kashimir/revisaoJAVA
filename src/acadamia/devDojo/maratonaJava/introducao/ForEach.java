package acadamia.devDojo.maratonaJava.introducao;

public class ForEach {

    public static void main(String[] args) {

        //ForEach
        int[]numeros = {1,2,3,4,5}; //criando e populando

        //Não recomendado para acessar indices específicos - num age como um índice
        for(int num:numeros){
            System.out.println(num);
        }

        String []nomes = {"Mariana", "Lívia", "Juliane"};
        for(String nome:nomes){
            System.out.println(nome);
        }
    }
}
