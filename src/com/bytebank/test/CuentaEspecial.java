package com.bytebank.test;

import com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta{
	public void deposita(double valor) {
		super.saldo = 0.0;
	}

}
