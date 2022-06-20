package com.bytebank.modelo;

public class GuardaCuentas {
	//Crear un objeto para guardar cuentas
	//permitirnos agregar cuentas con un metodo
	//GuardaCuentas.adiciona(cuenta)
	//obtener,remover
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;
	
	//					[ | | | |]	
	public void guardar(Cuenta cc) {
		cuenta[indice]=cc;
		indice++;
	}
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
	

}
