package academy.arthur.maratonajava.javacore.Npolimorfismo.servico;

import academy.arthur.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo  implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um arquivo");
    }
}
