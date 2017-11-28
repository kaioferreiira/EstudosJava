package br.com.estudosjava.javacore.Dsobrecargametodos.teste;

import br.com.estudosjava.javacore.Dsobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Kaio ferreira");
        funcionario.inicializa("Mikey Moyse", "999.999.999-99", 3500.50 , "88.888.777");

        funcionario.imprime();
    }
}
