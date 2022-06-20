package com.bytebank.test;

import com.bytebank.modelo.*;


public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario julian = new Contador();
		julian.setSalario(2000);

		Gerente sofia = new Gerente();
		sofia.setSalario(10000);

		Contador nere = new Contador();
		nere.setSalario(5000);

		ControlBonificacion control = new ControlBonificacion();
		control.registrarSalario(julian);
		control.registrarSalario(sofia);
		control.registrarSalario(nere);

	}

}
