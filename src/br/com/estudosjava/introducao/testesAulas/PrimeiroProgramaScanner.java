package br.com.estudosjava.introducao.testesAulas;

import java.util.Scanner;

public class PrimeiroProgramaScanner {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;
        float altura;
        int nascimento;

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Qual a sua altura: ");
        altura = teclado.nextFloat();

        System.out.println("Qual ano voce nasceu: ");
        nascimento = teclado.nextInt();

        //imprimindo com o Printf
        System.out.printf("Meu nome é %s, minha altura é  %.2f e eu nasci em %d . ", nome, altura, nascimento);
        System.out.print("\n");

        //imprimindo com o Println
        System.out.println("Meu nome é " + nome + " minha altura é " + altura + " e eu nasci em " + nascimento + "!");
    }
}
