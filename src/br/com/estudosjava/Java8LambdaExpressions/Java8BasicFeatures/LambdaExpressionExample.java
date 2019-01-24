package br.com.estudosjava.Java8LambdaExpressions.Java8BasicFeatures;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        int largura = 10;
        int altura = 15;

        //sem lambda
        Drawable semLambda =  new Drawable() {
            @Override
            public void sorteio() {
                System.out.println("Largura: " +  largura);
            }

        };
        semLambda.sorteio();

        //com lambda
        Drawable comLambda =  () -> {
            System.out.println("Altura: " + altura + 10);
        };


        comLambda.sorteio();







    }
}
