package academy.arthur.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Arthur";
        String address = "São Paulo";
        double salary = 1.412;
        String date = "27/06/2024";
        String report = "Eu "+name+", morando no endereço "+address+" confirmo que recebi o salário de "+salary+", na data "+date;
        System.out.println(report);
    }
}
