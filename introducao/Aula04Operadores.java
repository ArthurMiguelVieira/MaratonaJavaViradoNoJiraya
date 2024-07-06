package academy.arthur.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Aritméticos
        //  +
        //  -
        //  /
        // *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double)numero02;
        System.out.println("Valor: "+resultado);

        //Relacionais
        // %
        int resto = 21 % 2;
        System.out.println(resto);
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte : " + isDezMaiorQueVinte);

        //Lógicos
        // &&   (AND)
        // ||   (OR)
        // ! (NOT)
        int idade =21;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30  && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30  && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+ isPlaystationCincoCompravel);

        //Atribuição
        // = += -= *= /= %=

        double bonus = 1;
//        bonus = bonus + 1000;
//        bonus += 1000;
//        bonus++;
//        bonus--;
//        ++bonus;
//        --bonus;
        System.out.println(++bonus);
        System.out.println(bonus);

    }
}
