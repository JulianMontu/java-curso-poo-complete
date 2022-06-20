package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestLambda {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(2, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(62, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(32, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		Comparator<Cuenta> compare = new OrdenarPorNumeroDeCuenta();// Implementacion de la interfaz

		// Lambda
		lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));
		System.out.println("despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		Comparator<Cuenta> compareNombreTitular = new ordenadorPorNombreTitular();// Implementacion de la interfaz
		lista.sort(compareNombreTitular);
		System.out.println("despues de ordenar por nombre titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// Forma Antigua
		Collections.sort(lista, (c1, c2) -> {
			return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
		});

		System.out.println("despues de ordenar usando la clase Collections");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		//lambda for each
		//												.Puedo seguir ejecutando metodos
		lista.forEach(cuenta -> System.out.println(cuenta));
		Collections.sort(lista);
		System.out.println("despues de ordenar Natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}

}
