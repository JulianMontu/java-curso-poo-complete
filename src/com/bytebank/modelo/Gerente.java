package com.bytebank.modelo;
public class Gerente extends Funcionario implements Autenticable {


	

	// Sobre escritura del metodo
	public double getBonificacion() {
		System.out.println("Ejecutando dessde gerente");
		return super.getSalario() + (this.getSalario() * 0.05);
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
