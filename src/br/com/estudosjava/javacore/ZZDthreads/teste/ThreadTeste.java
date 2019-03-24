package br.com.estudosjava.javacore.ZZDthreads.teste;

//TIPOS THREADS
//DAEMON E USER
class ThreadExemplo extends  Thread{
    private char c;

    public  ThreadExemplo (char c){
        this.c = c;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <1000 ; i++){
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}


//Padrão de projeto, implementar a interface Runnable
class ThreadTesteRunnable implements Runnable{

    private char c;

    public  ThreadTesteRunnable (char c){
        this.c = c;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <1000 ; i++){
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }

}

public class ThreadTeste {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

//        ThreadExemplo t1 =  new ThreadExemplo('A');
//        ThreadExemplo t2 =  new ThreadExemplo('b');
//        ThreadExemplo t3 =  new ThreadExemplo('c');
//        ThreadExemplo t4 =  new ThreadExemplo('d');
//        ThreadExemplo t5 =  new ThreadExemplo('e');

        Thread t1 = new Thread(new ThreadTesteRunnable('a'));
        Thread t2 = new Thread(new ThreadTesteRunnable('b'));
        Thread t3 = new Thread(new ThreadTesteRunnable('c'));
        Thread t4 = new Thread(new ThreadTesteRunnable('d'));
        Thread t5 = new Thread(new ThreadTesteRunnable('e'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
