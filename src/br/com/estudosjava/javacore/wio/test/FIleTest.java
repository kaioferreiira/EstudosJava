package br.com.estudosjava.javacore.wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FIleTest {

    public static void main(String[] args) {

        File file = new File("arquivo.txt");
        File file2 = new File("/home/kaio/Área de Trabalho/Estudos/EstudosJava/src/br/com/estudosjava/javacore/wio/136110120180000645700010273365F.TIF");

        System.out.println(file.canRead());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isHidden());
        System.out.println( new Date(file2.lastModified()));

        try {
            boolean newFIle =  file.createNewFile();
            System.out.println(newFIle);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
