package br.com.estudosjava.introducao.controlefluxo;

public class ControleDeFluxo5 {

    public static void main(String[] args) {
        // dado um valor de um carro descubrar em quantas vezes
        // ele pode ser parcelado, porem as parcelas não podem ser menores que 1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + "valor da parcela: " + valorParcela);
            }else{
                break;
            }
            System.out.println("Deu certo ");



        }
    }
}
