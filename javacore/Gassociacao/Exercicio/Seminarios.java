package academy.arthur.maratonajava.javacore.Gassociacao.Exercicio;

public class Seminarios {
    private String titulo;
    private Estudantes[] estudantes;
    private Professores[] professores;
    private Local local;

    public void imprimir(){
        System.out.println("--TITULO--");
        System.out.println(titulo);
        System.out.println("--ENDEREÇO--");
        System.out.println(local.getEndereco());
        System.out.println("--ESTUDANTES--");
        for (Estudantes estudante : estudantes) {
            System.out.println(estudante.getNome());
            System.out.println(estudante.getIdade());
        }
        System.out.println("--PROFESSORES--");
        for (Professores professor : professores) {
            System.out.println(professor.getNome());
            System.out.println(professor.getEspecialidade());
        }


    }
    public Seminarios(String titulo,Local local,Estudantes[] estudantes,Professores[] professores) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
        this.professores = professores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
