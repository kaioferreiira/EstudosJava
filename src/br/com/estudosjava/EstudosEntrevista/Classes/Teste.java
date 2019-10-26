package br.com.estudosjava.EstudosEntrevista.Classes;



abstract class AbstractTest {

    static int i;

    abstract Object test();

    AbstractTest() {
        System.out.println("A");
    }
}

class Test extends AbstractTest {

    Integer test() {
        return i;
    }

    public static void main(String[] args) {

        Test t = new Test();

        System.out.println(t.test());

    }
}