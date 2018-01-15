package br.com.estudosjava.javacore.Lclassesabstratas.test;

import br.com.estudosjava.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.estudosjava.javacore.Lclassesabstratas.classes.Gerente;
import br.com.estudosjava.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {
        Gerente g = new Gerente("Lucas", " 222111-5", 2000);
        Vendedor v = new Vendedor("Thiago", " 333111-5", 2000);

        g.calculaSalario();
        v.calculaSalario();

        System.out.println(g);
        g.imprime();

        System.out.println(v);
    }
}
