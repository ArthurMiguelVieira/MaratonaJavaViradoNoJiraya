package academy.arthur.maratonajava.javacore.Hherenca.test;

import academy.arthur.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.arthur.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.arthur.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprimir();
        System.out.println("------------");
        pessoa.imprimir();
        funcionario.relatorioPagamento();
    }
}
