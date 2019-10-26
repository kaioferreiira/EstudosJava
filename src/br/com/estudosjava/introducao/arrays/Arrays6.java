package br.com.estudosjava.introducao.arrays;

public class Arrays6 {

    public static void main(String[] args) {


        int[][] dias = new int[12][30];


        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
/*

        //
        int [][] dias;
        dias = new int [][] {{0,0},{1,2,3},{0,0,0,0}};

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }



       for (int[] arr : dias) {
            for(int num:  arr){
                System.out.print(num);
            }
            System.out.println(" ");
        }
*/
    }
}
