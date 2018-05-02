package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisUnidimensionais.Lista1;

public class exercicio7 {
    public static void main(String[] args) {


        int n = 5;

        float[] v1 = new float[n];
        float[] v2 = new float[n];
        float[] v3 = new float[n];
;
        v1[0] = 5.2f;
        v1[1] = 6.3f;
        v1[2] = 7.6f;
        v1[3] = 8.5f;
        v1[4] = 2.f;

        v2[0] = 5.2f;
        v2[1] = 6.3f;
        v2[2] = 7.6f;
        v2[3] = 8.5f;
        v2[4] = 2.f;


        for (int i = 0; i < v3.length; i++) {
            v3[i] =  v1[i] + v2 [i];
        }

        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
        }
    }
}
