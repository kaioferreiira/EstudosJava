package br.com.estudosjava.introducao.testesAulas;

import java.util.Scanner;

public class OlaMundo {

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
            System.out.printf("O seu nome é %s, a sua altura é  %.2f e o seu nascimento foi em %d . ", nome, altura, nascimento);
            System.out.print("\n");

            //imprimindo com o Println
            System.out.println("O seu nome é " + nome + " a sua altura é " + altura + " e o seu nascimento foi em " + nascimento + "!");
        }
    }

