package academy.arthur.maratonajava.javacore.Minterfaces.test;

import academy.arthur.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.arthur.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

    }
}
