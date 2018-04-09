package br.com.estudosjava.HackerrankExerciciosResolvidos;

import java.util.Scanner;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        staircase(n);
    }
}
