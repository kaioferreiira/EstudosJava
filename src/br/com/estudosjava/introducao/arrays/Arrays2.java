package br.com.estudosjava.introducao.arrays;

public class Arrays2 {

    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        // char impresso  ' '
        //boolean falso
        //reference null

        String[] nomes = new String[3];
        nomes[0] = "kaio";
        nomes[1] = "kaio";
        nomes[2] = "kaio";
        for(int i = 0; i < nomes.length; i++){
            System.out.println("nome: " + nomes[i]);
        }

    }
}
