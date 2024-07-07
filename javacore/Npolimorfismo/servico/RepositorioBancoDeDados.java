package academy.arthur.maratonajava.javacore.Npolimorfismo.servico;

import academy.arthur.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando no Banco de Dados");
    }
}
