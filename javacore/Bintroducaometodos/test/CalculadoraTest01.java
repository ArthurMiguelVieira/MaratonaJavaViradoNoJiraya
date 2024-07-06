package academy.arthur.maratonajava.javacore.Bintroducaometodos.test;

import academy.arthur.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizar Calculadora");
    }
}
