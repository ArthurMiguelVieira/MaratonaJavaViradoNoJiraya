package academy.arthur.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0- Bloco de inicialização estatico é executado quando a jvm carregar a classe
    // 1- alocado espaco em memoria para objeto
    // 2- cada atributo de classe é criado e inicializado
    // 3-bloco de inicializacao
    // 4- construtor é executado

    static{
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for (int episodio : Anime.episodios){
            System.out.print(" "+episodio);

        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
