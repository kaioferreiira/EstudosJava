package br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Classes.GerenciadorDeTimes;

public class DesafioMeuTimeApplicationMain {


    public static void main(String[] args) {


        GerenciadorDeTimes gerenciador = new GerenciadorDeTimes();

        gerenciador.incluirTime(3L, "cruzeiro", LocalDate.of(2019, Month.FEBRUARY,1), "azul", "branco");
        gerenciador .incluirTime(2L, "vasco", LocalDate.of(2019, Month.FEBRUARY,2), "azul", "branco");
        gerenciador .incluirTime(1L, "flamengo", LocalDate.of(2019, Month.FEBRUARY,3), "azul", "branco");

        gerenciador.incluirJogador(1l,1l, "kaio", LocalDate.of(2019, Month.FEBRUARY,1), Integer.parseInt("10"),
                new BigDecimal(1234));
        gerenciador.incluirJogador(2l,2l, "lucas", LocalDate.of(2020, Month.FEBRUARY,1), Integer.parseInt("450"),
                new BigDecimal(5678));
        gerenciador.incluirJogador(3l,4l, "marcos", LocalDate.of(2021, Month.FEBRUARY,1), Integer.parseInt("33"),
                new BigDecimal(7252));


















//
//        System.out.println(" ---------------------");
//        LocalDate data1 =  LocalDate.of(2018,02,14);
//        LocalDate data2 =  LocalDate.of(2016,01,12);
//
//        DesafioMeuTimeApplication desafioMeuTimeApplication = new DesafioMeuTimeApplication();
//
//        desafioMeuTimeApplication.incluirTime(3L, "cruzeiro", data1, "azul", "branco");
//        desafioMeuTimeApplication .incluirTime(2L, "vasco", data1, "azul", "branco");
//        desafioMeuTimeApplication .incluirTime(1L, "flamengo", data1, "azul", "branco");
//
//        desafioMeuTimeApplication.imprimeTimes();
//        System.out.println(" ---------------------");
//
//        System.out.println(" ---------------------");
//        BigDecimal salario = new BigDecimal(2000.22);
//
//        desafioMeuTimeApplication.incluirJogador(1l,1l, "kaio", data1, Integer.parseInt("10"), salario);
//        desafioMeuTimeApplication.incluirJogador(2l,2l, "lucas", data1, Integer.parseInt("450"),salario);
//        desafioMeuTimeApplication.incluirJogador(3l,2l, "marcos", data2, Integer.parseInt("33"),salario);
//
//        desafioMeuTimeApplication.imprimeJogadores();
//        System.out.println(" ----------------------------------");
//        System.out.println(" ------- Define capitão ----------");
//
//        desafioMeuTimeApplication.definirCapitao(1l);
//        desafioMeuTimeApplication.definirCapitao(2l);
//        desafioMeuTimeApplication.definirCapitao(3l);
//
//        desafioMeuTimeApplication.imprimeCapitaoTime();
//
//
//        System.out.println(" ----------------------------------");
//        System.out.println(" ------- Busca capitão ------------");
//        System.out.println(desafioMeuTimeApplication.buscarCapitaoDoTime(1l));
//
//
//        System.out.println(" ----------------------------------");
//        System.out.println(" ------- Busca nome jogador ------------");
//        System.out.println(desafioMeuTimeApplication.buscarNomeJogador (1l));
//
//        System.out.println(" ----------------------------------");
//        System.out.println(" ------- Busca nome Time ------------");
//        System.out.println(desafioMeuTimeApplication.buscarNomeTime(1l));
//
//        System.out.println(" --------------------------------------------");
//        System.out.println(" ------- Busca Jogadores do Time ------------");
//        List<Long> listJogadores =  desafioMeuTimeApplication.buscarJogadoresDoTime(2l);
//        for(Long j: listJogadores){
//            System.out.println("id jogador:  " + j);
//        }
//
//        System.out.println(" --------------------------------------------");
//        System.out.println(" ------- Busca Melhor jogador do time------------");
//        Long melhorJogador =  desafioMeuTimeApplication.buscarMelhorJogadorDoTime(2l);
//        System.out.println("Melhor jogado: " + melhorJogador);
//
//
//        System.out.println(" --------------------------------------------");
//        System.out.println(" ------- Busca Jogador mais velho------------");
//
//        Long jogadorMaisVelho = desafioMeuTimeApplication.buscarJogadorMaisVelho(2l);
//        System.out.println("Jogador mais velho: " + jogadorMaisVelho);


    }
}
