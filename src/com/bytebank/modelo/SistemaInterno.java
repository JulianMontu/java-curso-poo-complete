package com.bytebank.modelo;
public class SistemaInterno {
	private String clave = "123";

	public boolean autentica(Autenticable gerente) {
		
		boolean puedeIniciarSesion=gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
					
		}else {
			System.out.println("Error en Login");
			return false;
		}
	}

}
