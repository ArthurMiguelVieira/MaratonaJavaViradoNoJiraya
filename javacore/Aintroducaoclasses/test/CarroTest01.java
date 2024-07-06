package academy.arthur.maratonajava.javacore.Aintroducaoclasses.test;

import academy.arthur.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Gol";
        carro.modelo = "Gol G1";
        carro.ano = 1980;

        Carro carro2 = new Carro();
        carro2.nome = "Marea";
        carro2.modelo = "Turbo";
        carro2.ano = 1998;

        carro = carro2;

        System.out.println("Nome: "+ carro.nome+" modelo: "+carro.modelo+" ano: "+carro.ano);
        System.out.println("Nome: "+ carro2.nome+" modelo: "+carro2.modelo+" ano: "+carro2.ano);


    }
}
