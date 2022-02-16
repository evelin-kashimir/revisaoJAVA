package acadamia.devDojo.maratonaJava.javaCore.ModificadorEstatico.domain;

//1 -Alocado espaço em memória para cada objeto
//2 -Cada atributo de classe é criado e inicializado com valores default ou o que for passado
//3 -Bloco de inicialização é executado
//4 -Construtor é executado

public class Anime {
    private String nome;
    private static int[]episodios;

    //tornando o bloco estático ele é executado somente uma vez, toda vez que o objeto é instanciado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i =0; i < episodios.length; i++){
            episodios[i] = i +1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        episodios = new int[10];
        for(int i =0; i < episodios.length; i++){
            episodios[i] = i +1;
        }
        for(int num : Anime.episodios){

            System.out.print(" " +num);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
