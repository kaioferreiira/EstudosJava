package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisUnidimensionais.Lista1;

public class exercicio5 {

    public static void main(String[] args) {

        float[] v1 = new float[5];
        float[] v2 = new float[5];

        v1[0] = 5.2f;
        v1[1] = 6.3f;
        v1[2] = 7.6f;
        v1[3] = 8.5f;
        v1[4] = 2.f;


        for (int i = 0; i < v1.length ; i++){
            v2[i] = v1[i];
        }


        for (int i = 0; i < v2.length ; i++){
            System.out.println(v2[i]);
        }

    }
}
