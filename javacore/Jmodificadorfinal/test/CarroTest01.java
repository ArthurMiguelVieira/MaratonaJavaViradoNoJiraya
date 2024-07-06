package academy.arthur.maratonajava.javacore.Jmodificadorfinal.test;

import academy.arthur.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("BMW");
        carro.getCOMPRADOR().setNome("Willian");

        System.out.println(carro.getCOMPRADOR());
    }
}
