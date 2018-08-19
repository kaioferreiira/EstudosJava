package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Testes;

import br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes.VendaDeCarros;

public class VendaDeCarrosTeste {
    public static void main(String[] args) {

        VendaDeCarros carro1 = new VendaDeCarros();
        VendaDeCarros carro2 = new VendaDeCarros();
        VendaDeCarros carro3 = new VendaDeCarros();

        double totalCarro = 0;
        double totalCarro2 = 0;
        double totalCarro3 = 0;
        double totalClientes = 0;

        totalCarro = carro1.porta + carro1.vidro + carro1.lanterna;
        carro1.placa = "dsada";
        carro1.nome = "kaio";
        totalCarro = carro1.porta + carro1.farol;
        totalCarro = carro1.porta + carro1.farol;

        totalClientes = carro1.somaVenda(totalCarro,totalCarro2,totalCarro3);

        double desconto = carro1.descontoClinte(totalClientes);

        System.out.println(desconto);
        System.out.println(carro1.placa);
        System.out.println(carro1.nome);
    }
}
