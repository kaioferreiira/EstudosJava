package br.com.estudosjava.introducao.arrays;

public class Arrays6 {

    public static void main(String[] args) {

        //Formar de inicializar um array
        int[] arrayInt = {1, 2, 3, 4};
        int[] arrayInt2 = new int[4];
        int[] arrayInt3 = new int[]{1, 2, 3, 4};


        //int[][] dias = new int[3][];
        //dias[0] = new int[2];
        //dias[1] = new int[]{1, 2, 3};
        //dias[2] = new int[4];


        int [][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for (int[] arr : dias) {
            for(int num:  arr){
                System.out.print(num);
            }
            System.out.println(" ");
        }

    }
}
