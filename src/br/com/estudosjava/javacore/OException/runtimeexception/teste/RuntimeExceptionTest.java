package br.com.estudosjava.javacore.OException.runtimeexception.teste;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

        //exeplo runtimeexception
        int a = 10 /0;
        System.out.println(a);

        //exemplo nullpointer
        Object obj = null;
        System.out.println(obj.toString());
    }
}
