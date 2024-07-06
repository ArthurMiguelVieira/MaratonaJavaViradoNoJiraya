package academy.arthur.maratonajava.javacore.Gassociacao.Exercicio;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminarios seminarios;

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Estudantes(Seminarios seminarios, int idade, String nome) {
        this.seminarios = seminarios;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
