package academy.arthur.maratonajava.javacore.Hherenca.test;

import academy.arthur.maratonajava.javacore.Hherenca.dominio.Funcionario;

public class HerancaTest02 {
    //01- primeiro carrega os blocos de inicializacao da classe pai e depois da classe filho
    //02- segue a ordem normal de inicializacao comecando pela classe pai e continuando na classe filho
    //bloco de inicializacao,construtor,
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
