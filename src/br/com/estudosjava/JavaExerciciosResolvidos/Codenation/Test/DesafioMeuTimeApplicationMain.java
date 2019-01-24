package br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Classes.DesafioMeuTimeApplication;

public class DesafioMeuTimeApplicationMain {


    public static void main(String[] args) {

        System.out.println(" ---------------------");
        LocalDate data1 =  LocalDate.of(2018,02,14);
        LocalDate data2 =  LocalDate.of(2016,01,12);

        DesafioMeuTimeApplication desafioMeuTimeApplication = new DesafioMeuTimeApplication();

        desafioMeuTimeApplication.incluirTime(3L, "cruzeiro", data1, "azul", "branco");
        desafioMeuTimeApplication .incluirTime(2L, "vasco", data1, "azul", "branco");
        desafioMeuTimeApplication .incluirTime(1L, "flamengo", data1, "azul", "branco");

        desafioMeuTimeApplication.imprimeTimes();
        System.out.println(" ---------------------");

        System.out.println(" ---------------------");
        BigDecimal salario = new BigDecimal(2000.22);

        desafioMeuTimeApplication.incluirJogador(1l,1l, "kaio", data1, Integer.parseInt("10"), salario);
        desafioMeuTimeApplication.incluirJogador(2l,2l, "lucas", data1, Integer.parseInt("450"),salario);
        desafioMeuTimeApplication.incluirJogador(3l,2l, "marcos", data2, Integer.parseInt("33"),salario);

        desafioMeuTimeApplication.imprimeJogadores();
        System.out.println(" ----------------------------------");
        System.out.println(" ------- Define capitão ----------");

        desafioMeuTimeApplication.definirCapitao(1l);
        desafioMeuTimeApplication.definirCapitao(2l);
        desafioMeuTimeApplication.definirCapitao(3l);

        desafioMeuTimeApplication.imprimeCapitaoTime();


        System.out.println(" ----------------------------------");
        System.out.println(" ------- Busca capitão ------------");
        System.out.println(desafioMeuTimeApplication.buscarCapitaoDoTime(1l));


        System.out.println(" ----------------------------------");
        System.out.println(" ------- Busca nome jogador ------------");
        System.out.println(desafioMeuTimeApplication.buscarNomeJogador (1l));

        System.out.println(" ----------------------------------");
        System.out.println(" ------- Busca nome Time ------------");
        System.out.println(desafioMeuTimeApplication.buscarNomeTime(1l));

        System.out.println(" --------------------------------------------");
        System.out.println(" ------- Busca Jogadores do Time ------------");
        List<Long> listJogadores =  desafioMeuTimeApplication.buscarJogadoresDoTime(2l);
        for(Long j: listJogadores){
            System.out.println("id jogador:  " + j);
        }

        System.out.println(" --------------------------------------------");
        System.out.println(" ------- Busca Melhor jogador do time------------");
        Long melhorJogador =  desafioMeuTimeApplication.buscarMelhorJogadorDoTime(2l);
        System.out.println("Melhor jogado: " + melhorJogador);


        System.out.println(" --------------------------------------------");
        System.out.println(" ------- Busca Jogador mais velho------------");

        Long jogadorMaisVelho = desafioMeuTimeApplication.buscarJogadorMaisVelho(2l);
        System.out.println("Jogador mais velho: " + jogadorMaisVelho);


    }
}
