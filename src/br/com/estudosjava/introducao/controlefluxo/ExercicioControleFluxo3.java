package br.com.estudosjava.introducao.controlefluxo;

public class ExercicioControleFluxo3 {

    public static void main(String[] args) {


        int numero = 100;

        for (int i = 0; i<= numero; i++){
            if(i % 2 == 0){
                System.out.println("par " + i);
            }else{
                System.out.println("Impar " + i);
            }
        }
    }
}
