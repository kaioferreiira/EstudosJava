package br.com.estudosjava.javacore.Kenum.test;

import br.com.estudosjava.javacore.Kenum.classes.*;

public class RedacaoTeste {

    public static void main(String[] args) {

        Redacao redacao1 =  new Redacao();

        redacao1.setCompetencia1(Competencia1.UM);
        redacao1.setCompetencia2(Competencia2.UM);
        redacao1.setCompetencia3(Competencia3.UM);
        redacao1.setCompetencia4(Competencia4.UM);
        redacao1.setCompetencia5(Competencia5.UM);

        System.out.println(redacao1.getCompetencia1());
        System.out.println(redacao1.getCompetencia2());
        System.out.println(redacao1.getCompetencia3());
        System.out.println(redacao1.getCompetencia4());
        System.out.println(redacao1.getCompetencia5());

        String valor1 =  redacao1.getCompetencia1().getNota();
        String valor2 =  redacao1.getCompetencia2().getNota();
        String valor3 =  redacao1.getCompetencia3().getNota();
        String valor4 =  redacao1.getCompetencia4().getNota();
        String valor5 =  redacao1.getCompetencia5().getNota();

        int  v1 = Integer.parseInt(valor1);
        int  v2 = Integer.parseInt(valor2);
        int  v3  = Integer.parseInt(valor3) ;
        int  v4  = Integer.parseInt(valor4) ;
        int  v5  = Integer.parseInt(valor5) ;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);

        System.out.println(v1+v2+v3+v4+v5);

    }
}
