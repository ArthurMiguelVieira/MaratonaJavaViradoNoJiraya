package academy.arthur.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    public String nome;
    private Time time;
    public void imprime(){
        System.out.println(nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
