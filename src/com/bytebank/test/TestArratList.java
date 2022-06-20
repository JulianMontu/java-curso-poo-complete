package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArratList {
	public static void main(String[] args) {
		//<> Forzando  a que acepte solo un tipo de objeto
		//Obligatorio el tipo de dato  = no es obligatorio
		List <Cuenta> list = new ArrayList<>();
		//List<Cuenta> list = new LinkedList<>();
		//referencia  objeto -> Heap
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 43);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		list.add(cc);
		list.add(cc2);
		Cuenta obtenerCuenta = list.get(0);
		System.out.println(obtenerCuenta);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Por cada cuenta en lista
		for (Cuenta cuenta:list) {
			System.out.println(cuenta);
		}
		boolean contiene = list.contains(cc3);
		//comparacion por referencia
		if(contiene) {
			System.out.println("Si es igual con equals");
		}
		
		/*Comparacion por valores 
		if(cc.esIgual(cc3)) {
			System.out.println("Si son iguales");
		}*/
	}

}
