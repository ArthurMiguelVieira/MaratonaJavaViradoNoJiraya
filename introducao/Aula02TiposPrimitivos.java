package academy.arthur.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int: números inteiros
        int age = 10;
        System.out.println("Idade: " + age);

        // double: números de ponto flutuante com dupla precisão
        double pi = 3.14159;
        System.out.println("Valor de pi: " + pi);

        // float: números de ponto flutuante com precisão simples
        float height = 1.80f;
        System.out.println("Altura: " + height + " metros");

        // char: caracteres únicos
        char word = 'A';
        System.out.println("Letra: " + word);

        // byte: números inteiros pequenos
        byte temperature = -10;
        System.out.println("Temperatura: " + temperature + "°C");

        // short: números inteiros
        short year = 2024;
        System.out.println("Ano: " + year);

        // long: números inteiros longos
        long distance = 100000L;
        System.out.println("Distância: " + distance + " metros");

        // boolean: valores booleanos (true ou false)
        boolean isJavaFun = true;
        System.out.println("Java é divertido: " + isJavaFun);
    }
}
