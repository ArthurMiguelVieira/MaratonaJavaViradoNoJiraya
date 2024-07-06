package academy.arthur.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    static{
        System.out.println("Dentro do bloco estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(salario);
    }

    public  void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+ this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
