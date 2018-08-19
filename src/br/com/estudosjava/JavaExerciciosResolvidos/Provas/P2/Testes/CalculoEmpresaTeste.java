package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Testes;

import br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes.CalculoEmpresa;

public class CalculoEmpresaTeste {

    public static void main(String[] args) {


        CalculoEmpresa c1 =  new CalculoEmpresa();
        c1.salario = 1000;
        c1.nome = "kai";
        System.out.println(c1.salario);
        System.out.println(c1.imposto);
        System.out.println(c1.nome);
        System.out.println(c1.calculaImposto(c1.salario));

        CalculoEmpresa c2 =  new CalculoEmpresa();
        c1.salario = 850;
        c1.nome = "bbb";
        System.out.println(c1.salario);
        System.out.println(c1.imposto);
        System.out.println(c1.nome);
        System.out.println(c1.calculaImposto(c1.salario));


        CalculoEmpresa c3 =  new CalculoEmpresa();
        c1.salario = 10000;
        c1.nome = "ccc";
        System.out.println(c1.salario);
        System.out.println(c1.imposto);
        System.out.println(c1.nome);
        System.out.println(c1.calculaImposto(c1.salario));



    }

}
