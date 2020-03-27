package br.com.estudosjava.Java14.Records;

public class MainTest {

	public static void main(String[] args) {


		var kaio = new PersonRecord("kaio", 26);
		var lucas = new PersonRecord("lucas", 46);

		System.out.println(kaio.name());
		System.out.println(kaio.age());

		System.out.println(lucas.name());
		System.out.println(lucas.age());

		System.out.println(kaio.equals(lucas));






	}

}
