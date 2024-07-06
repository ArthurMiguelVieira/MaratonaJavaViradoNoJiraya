package academy.arthur.maratonajava.javacore.Gassociacao.test;

import academy.arthur.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.arthur.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogador.setTime(time);
        jogador2.setTime(time);
        Jogador[] jogadores={jogador,jogador2};
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador.imprime();
        System.out.println("---Time---");
        time.imprime();

    }
}
