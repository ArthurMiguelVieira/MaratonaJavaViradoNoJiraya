package academy.arthur.maratonajava.javacore.Npolimorfismo.test;

import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.arthur.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",10000);
        Tomate tomate = new Tomate("Tomate Siciliano",10);

        CalculadoraImposto.calcularImposto(computador);

        System.out.println("---------------------");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("---------------------");

        Televisao televisao = new Televisao("Samsung 50\" ",3000);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
