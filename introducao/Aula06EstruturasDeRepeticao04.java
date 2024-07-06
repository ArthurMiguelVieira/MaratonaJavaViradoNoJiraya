package academy.arthur.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;

        for(int i =1;i<valorCarro;i++){
            double valorParcela = valorCarro/i;
            if(valorParcela >= 1000){
                System.out.println("Valor da parcela "+i+": "+valorParcela);
            }else{
                break;
            }

        }
    }
}
