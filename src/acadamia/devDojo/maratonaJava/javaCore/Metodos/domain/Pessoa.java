package acadamia.devDojo.maratonaJava.javaCore.Metodos.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){this.nome = nome;}
    public void setIdade(int idade){
        if (idade < 0 ){
            System.out.println("Idade Inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {return nome;}
    public int getIdade() {return idade;}

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }
}
