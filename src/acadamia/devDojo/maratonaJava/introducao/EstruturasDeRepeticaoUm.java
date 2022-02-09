package acadamia.devDojo.maratonaJava.introducao;

public class EstruturasDeRepeticaoUm {
    public static void main(String[] args) {

        //while - Enquanto
        int count = 0;
        while(count <= 10){
            System.out.println(count++);
        }

        //do while - Faça enquanto
        do {
            System.out.println("do while" + count++);
        } while (count < 20 );

        //for - De , Para
        for(int i = 0; i < 10; i++){
            System.out.println("Contando..." + i);
        }
    }
}
