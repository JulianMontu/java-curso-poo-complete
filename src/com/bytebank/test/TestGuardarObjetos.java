package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.GuardarObjetos;

public class TestGuardarObjetos {
	public static void main(String[] args) {
		GuardarObjetos objetos = new GuardarObjetos();
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Julian");
		objetos.guardar(cliente1);
		System.out.println(objetos.obtener(0));
	}

}
