package acadamia.devDojo.maratonaJava.javaCore.Metodos.exercicio.domain;

//Crie uma classe funcionario com os seguintes atributos
//Crie dois métodos
public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    //Método para imprimir os dados do funcionario
    public void imprimeDados(){
        System.out.println("Funcionário(a): " +this.nome);
        System.out.println("Idade: " +this.idade);

        for(double num: this.salario){
            System.out.println("Salário: R$ " +num);
        }
        System.out.println("-------------------------------------");
    }

    //Método para calcular a média dos salários e mostrar o resultado
    public void mediaSalario(double... salarios){
        double media = 0;
        for(double num: salarios){
           media += num;
        }
        System.out.printf("Média salarial: R$ %.2f", media / 3);
    }
}
