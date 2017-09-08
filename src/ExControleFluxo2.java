public class ExControleFluxo2 {
    public static void main(String[] args) {

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("É domingo, não é dia util. ");
                break;
            case 2:
                System.out.println("É Segunda, dia util. ");
                break;
            case 3:
                System.out.println("É terça, dia util. ");
                break;
            case 4:
                System.out.println("É quarta, dia util. ");
                break;
            case 5:
                System.out.println("É quinta, dia util. ");
                break;
            case 6:
                System.out.println("É sexta dia util. ");
                break;
            case 7:
                System.out.println("É sabado, não é dia util. ");
                break;
            default:
                System.out.println("Valor passado é inválido! ");

        }

        switch (dia) {
            case 1:
            case 7:
                System.out.println("É domingo, não é dia util. ");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É Segunda, dia util. ");
                break;
            default:
                System.out.println("Valor passado é inválido! ");

        }
    }
}
