package com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		System.out.println("Antes del metodo" + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" Cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		char letra = nombre.charAt(3);
		int indice = nombre.indexOf("e");
		System.out.println("Nuevo nombre " + nombre);
		System.out.println("Caracter encontrado " + letra);
		System.out.println("Indice letra encontrado " + indice);
	}

	public static void printLine(String valor) {
		System.out.println(valor);
	}

	// String nombre2= new String("Alura");

}
