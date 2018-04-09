package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

public class PrincipalAPrincipalB {

    public static void main(String[] args) {
        int cont;
        cont = 12;
        do {
            cont++;
            System.out.println(cont);
        } while (cont <= 11);

        System.out.println(cont);

        while (cont <= 11) {
            cont++;
            System.out.println(cont);
        }
        System.out.println(cont);

    }
}
