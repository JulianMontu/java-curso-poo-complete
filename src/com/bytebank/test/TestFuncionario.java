package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario julian = new Contador();
		julian.setDocumento("Diego");
		julian.setDocumento("45613");
		julian.setSalario(2000);
		julian.setTipo(0);
		System.out.println(julian.getSalario());
		System.out.println(julian.getBonificacion());
	}

}
