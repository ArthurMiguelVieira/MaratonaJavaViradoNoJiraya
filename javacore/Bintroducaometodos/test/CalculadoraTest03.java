package academy.arthur.maratonajava.javacore.Bintroducaometodos.test;

import academy.arthur.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividiDoisNumeros(10,0);

        System.out.println(resultado);
        System.out.println(calculadora.dividiDoisNumeros(100,25));

        calculadora.imprimeDivisaoDoisNumeros(10,0);
    }
}
