package br.com.estudosjava.Java14.InstanceofPreview;

import br.com.estudosjava.Java14.Records.Person;

public class InstanceofPreview {

	public static void main(String[] args) {


		Person obj = new Person();
		obj.setName("kaio");

		if (obj instanceof Person) {
			Person jd = (Person) obj;
			System.out.println(jd.getName());
		}

		if (obj instanceof Person) {
			System.out.println(obj.getName());
		}


	}

}
