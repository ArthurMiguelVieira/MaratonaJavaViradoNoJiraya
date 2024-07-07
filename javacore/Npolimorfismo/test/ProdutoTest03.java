package academy.arthur.maratonajava.javacore.Npolimorfismo.test;

import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.arthur.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate",20);
        Computador computador = new Computador("i7",30000);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(computador);
    }
}
