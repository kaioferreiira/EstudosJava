package br.com.estudosjava.AceleraDevDBServer;

public class Saque {

    public int notasDeCem;
    public int notasDeCinquenta;
    public int notasDeVinte;
    public int notasDeDez;

    public Saque(Cliente cliente) {
        int valor = cliente.getValorASacar();
        while (valor > 0) {
            if(valor >= 100) {
                notasDeCem = valor / 100;
                valor = valor % 100;
            }
            if(valor >= 50) {
                notasDeCinquenta = valor / 50;
                valor = valor % 50;
            }
            if(valor >= 20) {
                notasDeVinte = valor / 20;
                valor = valor % 20;
            }
            if(valor >= 10) {
                notasDeDez = valor / 10;
                valor = valor % 10;
            }
            if(valor < 10) {
                throw new RuntimeException("Este caixa nao possui notas menores do que dez reais.");
            }

        }

    }

    @Override
    public String toString() {
        return "Saque{" +
                "notasDeCem=" + notasDeCem +
                ", notasDeCinquenta=" + notasDeCinquenta +
                ", notasDeVinte=" + notasDeVinte +
                ", notasDeDez=" + notasDeDez +
                '}';
    }
}
