package br.com.estudosjava.javacore.Npolimorfimo.classes.Test;

import br.com.estudosjava.javacore.Npolimorfimo.classes.classes.Gerente;
import br.com.estudosjava.javacore.Npolimorfimo.classes.classes.RelatorioPagamento;
import br.com.estudosjava.javacore.Npolimorfimo.classes.classes.Vendedor;

public class PolimorfismoTest {

    public static void main(String[] args) {
        Gerente g =  new Gerente("Kaio Ferreira", 6000, 2000);
        Vendedor v = new Vendedor("Lucas Tião",  1000, 30000);

        RelatorioPagamento relatorio = new RelatorioPagamento();

        relatorio.relatorioPagamentoGerente(g);

        System.out.println("---------------------------");

        relatorio.relatorioPagamentoVendendor(v);


    }
}
