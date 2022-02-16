package acadamia.devDojo.maratonaJava.javaCore.Associacao.test;

import acadamia.devDojo.maratonaJava.javaCore.Associacao.domain.Jogador;
import acadamia.devDojo.maratonaJava.javaCore.Associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador01, jogador02};

        time.setJogadores(jogadores);
        jogador01.setTime(time);
        jogador02.setTime(time);

        System.out.println("----- Jogador -----");
        jogador01.imprime();
        jogador02.imprime();
        System.out.println("----- Time -----");
        time.imprime();

    }
}
