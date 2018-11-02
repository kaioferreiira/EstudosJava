package br.com.estudosjava.javacore.OException.error.teste;

public class ErrorTest {

    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError() {
        stackOverflowError();
    }
}
