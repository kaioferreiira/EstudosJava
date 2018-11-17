package br.com.estudosjava.javacore.wio.test;

import java.io.File;
import java.util.Base64;

public class FIleDiretorioTest {

    public static void main(String[] args) {

//        File file = new File("images-cheques");
//        boolean mkdir = file.mkdir();
//        System.out.println("Diretorio de cheques criado!  " + mkdir);

//        File arquivo = new File("/home/kaio/Área de Trabalho/Estudos/EstudosJava/images-cheques/arquivo.txt");
//        try {
//            boolean newFile =  arquivo.createNewFile();
//            System.out.println("Arquivo criado " + newFile );
//            arquivo.delete();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("Arquivos de imagens cheques : ");
        buscarAquivos();

        byte[] encodedBytesImageChequeFront = Base64.getEncoder().encode(("/home/kaio/Área de "
                + "Trabalho/Estudos/EstudosJava/images"
                + "-cheques/136110120180000645700010273365F.TIF").getBytes());
        System.out.println("Result imagem converter encodedBytes " + new String(encodedBytesImageChequeFront));

//        set.add(NegocioUtil.buildMap("img_cheque",Base64.encodeBase64String(FileUtil.getBytes( new FileInputStream(origem)))));



    }

    public static void buscarAquivos(){
        File file = new File("/home/kaio/Área de Trabalho/Estudos/EstudosJava/images-cheques");
        String [] list = file.list();
        for (String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
