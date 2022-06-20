package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistma= new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin1=new Administrador();
		sistma.autentica(gerente1);
		sistma.autentica(admin1);
		
	}

}
