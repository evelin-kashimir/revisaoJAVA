package acadamia.devDojo.maratonaJava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {

        /*  Tipos Primitivos
           int, double, float, char byte, short, long, boolean */

        int age = 25;
        String name = "Evelin Ferraz";
        double weight = 60.0;
        float height =  1.63F;
        boolean smart = true;
        char gender = 'F';
        double numberCasting = (int) 25.5;

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Peso:"+ weight);
        System.out.println("Altura: "+ height );
        System.out.println("Inteligente: " + smart );
        System.out.println("Sexo: " + gender );
        System.out.println("Casting: " + numberCasting);
    }
}
