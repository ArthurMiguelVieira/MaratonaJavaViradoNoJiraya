package academy.arthur.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salario;

    public void imprimir(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("salário 1: "+salario[0]+" salário 2: "+salario[1]+" salário 3: "+salario[2]);
    }

    public void imprimirMediaSalario(){
        System.out.println(((salario[0]+salario[1]+salario[2])/3));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(float[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float[] getSalario() {
        return salario;
    }
}
