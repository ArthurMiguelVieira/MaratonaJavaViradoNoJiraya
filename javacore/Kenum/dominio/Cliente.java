package academy.arthur.maratonajava.javacore.Kenum.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipocliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipocliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipocliente = tipocliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipocliente=" + tipocliente +
                ", tipoclienteInt=" + tipocliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
