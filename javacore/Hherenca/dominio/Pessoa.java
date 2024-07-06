package academy.arthur.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco estatico de pessoa");
    }

    {
        System.out.println("Dentro do bloco inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getCep());
        System.out.println(endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
