package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.*;

public class TestOrdenarLista {
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
		// ordenar las cuentas
		// Comparetor=>Interfaz que va a usar
		// Cualquier clase hija de cuenta
		// comparetor<Cualquier cosa que extienda de cuenta>
		// lista.sort(c);
		Comparator<Cuenta> compare = new OrdenarPorNumeroDeCuenta();// Implementacion de la interfaz
		// lista.sort(compare);
		// Clase anonima
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
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
		Collections.sort(lista, new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {

				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}

		});

		System.out.println("despues de ordenar usando la clase Collections");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		Collections.sort(lista);
		System.out.println("despues de ordenar Natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

	}

}

class OrdenarPorNumeroDeCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// Forma wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
		// forma intermedia
		// return o1.getNumero() - o2.getNumero();
		// Forma basica
		/*
		 * if (o1.getNumero() == o2.getNumero()) { return 0; } else if (o1.getNumero() >
		 * o2.getNumero()) { return 1; } else { return -1; }
		 */

	}

}

class ordenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());

	}

}
