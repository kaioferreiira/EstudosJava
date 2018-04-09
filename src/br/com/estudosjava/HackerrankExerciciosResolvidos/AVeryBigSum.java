package br.com.estudosjava.HackerrankExerciciosResolvidos;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        long  [] arr1 =  new long[5];
        long result = 0;

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextLong();
        }

        for (int i = 0; i < arr1.length; i++){
            result +=  arr1[i];
        }

        System.out.println(result);


    }






}
