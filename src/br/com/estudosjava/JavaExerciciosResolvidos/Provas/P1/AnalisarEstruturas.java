package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

public class AnalisarEstruturas {

    public static void main(String[] args) {

        int i;
        i = 2;
        if (i == 0) {
            System.out.println(" i é igual a zero");
        } else if (i == 1) {
            System.out.println(" i é igual a um");
        } else if (i == 2) {
            System.out.println(" i é igual a dois");
        }

         /*  COMPARE COM ESSA OUTRA ESTRUTURA */
        i = 2;

        switch (i){
            case 0:
                System.out.println(" i é igual a zero");
            case 1:
                System.out.println(" i é igual a um");
            case 2:
                System.out.println(" i é igual a dois");
        }
    }
}
