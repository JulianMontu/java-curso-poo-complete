package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestReferencias {
	public static void main(String[] args) {
		//Elemento mas generico puede ser adapatado
		// al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Julian");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Sofia");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
	}

}
