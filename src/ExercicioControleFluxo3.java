public class ExercicioControleFluxo3 {

    public static void main(String[] args) {
        //imprimir os pares  ate 100.000

        int numero = 100000;

        for (int i = 0; i<= numero; i++){
            if(i % 2 == 0){
                System.out.println("par" + i);
            }
        }
    }
}
