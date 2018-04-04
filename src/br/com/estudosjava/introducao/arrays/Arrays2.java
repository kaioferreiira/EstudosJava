package br.com.estudosjava.introducao.arrays;

public class Arrays2 {

    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        // char impresso  ' '
        //boolean falso
        //reference null

        byte[] arrayByte = new byte[1];
        short[] arrayShort = new short[1];
        int[] arrayInt = new int[2];
        long[] arrayLong= new long[1];
        float[] arrayFloat = new float[1];
        double[] arrayDouble= new double[1];
        char[] arrayChar= new char[1];
        boolean[] arrayBoolean= new boolean[1];
        String[] arrayString= new String[1];



//        System.out.println(arrayByte[0]);
//        System.out.println(arrayShort[0]);
//        System.out.println(arrayInt[0]);
//        System.out.println(arrayLong[0]);
//        System.out.println(arrayFloat[0]);
//        System.out.println(arrayDouble[0]);
//        System.out.println(arrayChar[0]);
//        System.out.println(arrayBoolean[0]);
//        System.out.println(arrayString[0]);

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        for (int i =0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }


//        int [] idades =  new int[3];
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);
//        System.out.println(idades[0]);
//
//        for (int i=0; i <= idades.length; i++){
//            System.out.println(idades[i]);
//        }
//
//        String[] nomes = new String[3];
//
////        nomes[0] = "kaio";
////        nomes[1] = "lucas";
////        nomes[2] = "nico";
//
//        for(int i = 0; i < nomes.length; i++){
//            System.out.println("nome: " + nomes[i]);
//        }


    }
}
