package com.bytebank.test;

import java.util.Iterator;

import com.bytebank.modelo.*;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		//							[new |cc |null |null |null ]
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[1]=cc;
		System.out.println(cc);
		System.out.println(cuentas[1]);
		cuentas[0]=new CuentaCorriente(11, 99);
		//						casteo
		CuentaCorriente cuenta = (CuentaCorriente)cuentas[1];
		System.out.println(cuentas[0]);
		for(int i=0;i<cuentas.length;i++) {
			System.out.println(cuentas[i]);
		}
	}

}
