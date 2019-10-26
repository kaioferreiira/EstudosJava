package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

public class QuestaoGraoArroz {

    public static void main(String[] args) {
        int i;
        double total = 0, arroz = 1;

        for (i=1; i <= 64; i++) {
            total = total + (arroz * i);
        }
        System.out.println("Total de grão: " + total);
        System.out.println("Total de sacos de arroz:" + (total/500));
    }

}
