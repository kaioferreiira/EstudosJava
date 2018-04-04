package br.com.estudosjava.HackerrankExerciciosResolvidos;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int aliceResult = 0;
        int bobResult = 0;

        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceResult++;
            } else if (alice[i] < bob[i]) {
                bobResult++;
            }
        }

        sc.close();
        System.out.print(aliceResult + " " + bobResult);

    }
}
