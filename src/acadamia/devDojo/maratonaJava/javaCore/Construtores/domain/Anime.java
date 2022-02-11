package acadamia.devDojo.maratonaJava.javaCore.Construtores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    //Construtor
    public Anime(String nome, String tipo, String genero, int episodios ){
        this.nome = nome;
        this.tipo = tipo ;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios); //referenciando o primeiro construtor da classe
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {this.nome = nome;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setEpisodios(int episodios) {this.episodios = episodios;}

    public String getNome() {return nome;}
    public String getTipo() {return tipo;}
    public String getGenero() {return genero;}
    public int getEpisodios() {return episodios;}

}
