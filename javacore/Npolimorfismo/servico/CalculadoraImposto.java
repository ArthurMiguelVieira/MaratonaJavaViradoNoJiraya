package academy.arthur.maratonajava.javacore.Npolimorfismo.servico;

import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.arthur.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do produto: "+produto.getNome());
       double imposto = produto.calcularImposto();
        System.out.println("Imposto a ser pago: "+ imposto);
        if(produto instanceof Tomate){
            System.out.println(((Tomate) produto).getDataValidade());
        }

    }

}
