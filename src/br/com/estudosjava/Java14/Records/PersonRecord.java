package br.com.estudosjava.Java14.Records;

import java.io.Serializable;

public record PersonRecord(String name, Integer age) implements Serializable {
}
