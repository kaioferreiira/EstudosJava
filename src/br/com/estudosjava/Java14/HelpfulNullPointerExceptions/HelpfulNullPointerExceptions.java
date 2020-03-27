package br.com.estudosjava.Java14.HelpfulNullPointerExceptions;

import br.com.estudosjava.Java14.Records.Person;

public class HelpfulNullPointerExceptions {

	public static void main(String[] args) {

		try {

			//before Java 14
			/**
			 * Ao executar uma chamada em algo que  não existe, o stacktrace mostra somente a linha em que deu o erro.
			 * */
			Person obj = new Person();
			String bairro = obj.getEndereco().getBairro();


		}catch (Exception e){
			System.out.println("");
			e.printStackTrace();
			System.out.println("");
		}


	}

}
