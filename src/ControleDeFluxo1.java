import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.transform.Source;

public class ControleDeFluxo1 {

    public static void main(String[] args) {

        int idade = 20;
        float salario = 900;

        if (idade > 18 && salario > 1000) {
            System.out.printf("Entrou");
        } else if (idade < 18 && salario < 1000) {
            System.out.println("Deu ruimmm ");
        } else {
            System.out.println("ueee");
        }

    }
}
