package br.com.estudosjava.introducao.controlefluxo;

public class ControleFluxo6 {

    public static void main(String[] args) {

        // dado um valor de um carro descubrar em quantas vezes
        // ele pode ser parcelado, porem as parcelas não podem ser menores que 1000

        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela <= 1000) {
                continue;
            }

            System.out.println("Parcela " + parcela + "valor da parcela: " + valorParcela);
        }

    }
}
