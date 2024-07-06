package academy.arthur.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxaSalario ;
        if (salarioAnual <= 34712){
            taxaSalario = 9.70;
        }else if(salarioAnual <= 68507){
            taxaSalario = 37.35;
        }else{
            taxaSalario = 49.50;
        }
        double resultado = (salarioAnual*taxaSalario)/100;
        System.out.println(taxaSalario);
        System.out.println(resultado);
    }
}
