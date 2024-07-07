package academy.arthur.maratonajava.javacore.Npolimorfismo.test;

import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);
        System.out.println(produto.calcularImposto());
    }
}
