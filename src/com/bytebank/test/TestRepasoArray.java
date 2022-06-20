package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int numero = 40;
		// Wrapper
		// Integer numeroObjeto = new Integer(40); deprecado
		Integer numeroObjeto = Integer.valueOf(40);
		List lista = new ArrayList();
		// primitivo != object
		lista.add(numero);
		// Esto es lo que hace
		// lista.add(new Integer(40)); autoboxing
		lista.add(numeroObjeto);
		// unboxing
		// int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		// El valor maximo que soporta en bytes
		System.out.println(Integer.MAX_VALUE);
		// El valor minimo en bytes que soporta
		System.out.println(Integer.MIN_VALUE);
		// Tamaño en bits
		System.out.println(Integer.SIZE);
		// Tamaño en bytes
		System.out.println(Integer.BYTES);

	}

}
