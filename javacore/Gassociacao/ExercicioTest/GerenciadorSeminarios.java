package academy.arthur.maratonajava.javacore.Gassociacao.ExercicioTest;

import academy.arthur.maratonajava.javacore.Gassociacao.Exercicio.Estudantes;
import academy.arthur.maratonajava.javacore.Gassociacao.Exercicio.Local;
import academy.arthur.maratonajava.javacore.Gassociacao.Exercicio.Professores;
import academy.arthur.maratonajava.javacore.Gassociacao.Exercicio.Seminarios;

public class GerenciadorSeminarios {
    public static void main(String[] args) {
        Local local = new Local("São Paulo");
        Estudantes estudante1 = new Estudantes("João",18);
        Estudantes estudante2 = new Estudantes("Pedro",18);
        Professores professor1 = new Professores("Kleber","Matématica");
        Professores professor2 = new Professores("Matheus","Física");
        
        Professores[] professores = {professor1,professor2};
        Estudantes[] estudantes = {estudante1,estudante2};
        
        Seminarios seminario1 = new Seminarios("Palestra",local,estudantes,professores);

        seminario1.imprimir();

    }
}
