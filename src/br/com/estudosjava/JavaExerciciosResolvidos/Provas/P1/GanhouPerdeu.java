package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

public class GanhouPerdeu {

    public static void main(String[] args) {
        int soma;
        soma = 7;
        if (soma < 7) {
            System.out.print("ganhou");
        }else{
            System.out.print("perdeu");
        }System.out.println(" o bonus");
        soma = 21;
        if (soma != 20){
            System.out.print("ganhou");
        }else{
            System.out.print("perdeu");
        }System.out.println(" o bonus");
    }
}