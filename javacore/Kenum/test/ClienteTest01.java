package academy.arthur.maratonajava.javacore.Kenum.test;


import academy.arthur.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.arthur.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.arthur.maratonajava.javacore.Kenum.dominio.TipoCliente;

import java.util.Scanner;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
