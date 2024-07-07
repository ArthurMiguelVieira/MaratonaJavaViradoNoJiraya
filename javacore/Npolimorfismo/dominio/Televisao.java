package academy.arthur.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.30;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do "+this.nome+" valor base: "+this.valor);
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
