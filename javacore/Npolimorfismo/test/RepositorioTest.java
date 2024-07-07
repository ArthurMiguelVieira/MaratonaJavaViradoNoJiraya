package academy.arthur.maratonajava.javacore.Npolimorfismo.test;

import academy.arthur.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.arthur.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
