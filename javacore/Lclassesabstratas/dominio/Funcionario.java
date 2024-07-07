package academy.arthur.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
}
