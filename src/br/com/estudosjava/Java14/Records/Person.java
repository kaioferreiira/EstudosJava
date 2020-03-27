package br.com.estudosjava.Java14.Records;

import java.util.Objects;

import br.com.estudosjava.javacore.Hheranca.classes.Endereco;


//classe padrão java ansient
public class Person {

	private String name;
	private Integer idade;

	private Endereco endereco;


	public Person() {
	}

	public Person(String name, Integer idade, Endereco endereco) {
		this.name = name;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) &&
				Objects.equals(idade, person.idade) &&
				Objects.equals(endereco, person.endereco);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, idade, endereco);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", idade=" + idade +
				", endereco=" + endereco +
				'}';
	}
}
