package acadamia.devDojo.maratonaJava.javaCore.Associacao.test;

import acadamia.devDojo.maratonaJava.javaCore.Associacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafú");

        Jogador[] jogadors = new Jogador[3];
        Jogador[]jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for(Jogador jog: jogadores){
            jog.imprime();
        }
    }
}
