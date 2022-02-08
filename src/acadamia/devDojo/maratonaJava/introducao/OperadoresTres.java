package acadamia.devDojo.maratonaJava.introducao;

public class OperadoresTres {
    public static void main(String[] args) {

        //Operadores Lógicos

        //AND &&  - OR ||
        int idade = 25;
        double peso = 60.0;

        boolean maiorIdade = idade > 18 && idade < 60;
        boolean obesa = idade > 18 && peso > 90.0;
        boolean pesoIdeal = peso > 60.0 || peso < 70.0;

        System.out.println("Maior de Idade? " + maiorIdade);
        System.out.println("Obeso? " + obesa);
        System.out.println("Peso Ideal? " + pesoIdeal);
        System.out.println("==============================");

        //Operadores de Atribuição

        // = += -= *= %= ++ --
        double bonus = 2000;
        System.out.println(bonus);
        bonus += 800;
        System.out.println(bonus);
        bonus -= 500;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);
        bonus++;
        System.out.println(bonus);
        bonus--;
        System.out.println(bonus);
    }
}
