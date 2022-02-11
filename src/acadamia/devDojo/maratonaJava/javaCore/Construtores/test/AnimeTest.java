package acadamia.devDojo.maratonaJava.javaCore.Construtores.test;

import acadamia.devDojo.maratonaJava.javaCore.Construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Boruto", "Netflix", "Ação", 100, "Warner");

        anime.imprime();
    }
}
