package academy.arthur.maratonajava.javacore.Bintroducaometodos.test;

import academy.arthur.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(18);
        funcionario.setSalario (new float[] {1300,1233,1450});

        funcionario.imprimir();
        funcionario.imprimirMediaSalario();

        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario()[0]);

    }

}
