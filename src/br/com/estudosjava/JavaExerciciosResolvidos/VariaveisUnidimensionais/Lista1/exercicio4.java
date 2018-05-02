package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisUnidimensionais.Lista1;

public class exercicio4 {

    public static void main(String[] args) {


        float[] v1 = new float[10];

        v1[0] = 5.2f;
        v1[1] = 6.3f;
        v1[2] = 7.6f;
        v1[3] = 8.5f;
        v1[4] = 2.f;

        int nulos = 0;
        for(int i =0; i<v1.length ; i++){
            if (v1[i] == 0) {
                nulos++;
            }
        }

        System.out.println(nulos);

    }
}
