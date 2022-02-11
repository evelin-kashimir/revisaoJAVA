package acadamia.devDojo.maratonaJava.javaCore.BlocosInicializacao.test;

import acadamia.devDojo.maratonaJava.javaCore.BlocosInicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime();

        for(int episodios: anime.getEpisodios()){
            System.out.print(" "+episodios);
        }


    }
}
