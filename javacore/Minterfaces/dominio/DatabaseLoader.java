package academy.arthur.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        this.checkPermission();
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        this.checkPermission();
        System.out.println("Removendo dados do banco de dados");
    }
}
