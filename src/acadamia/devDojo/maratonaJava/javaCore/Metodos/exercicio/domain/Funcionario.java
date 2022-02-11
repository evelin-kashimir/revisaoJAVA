package acadamia.devDojo.maratonaJava.javaCore.Metodos.exercicio.domain;

//Crie uma classe funcionario com os seguintes atributos
//Crie dois métodos
public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setSalario(double[] salario) {this.salario = salario;}

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public double[] getSalario() {return salario;}
    public double getMedia() {return media;}
}
