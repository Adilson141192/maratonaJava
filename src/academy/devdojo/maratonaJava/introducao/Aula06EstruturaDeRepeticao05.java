package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >=1000
        double valorTotal = 30000.0;
        for (double parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
