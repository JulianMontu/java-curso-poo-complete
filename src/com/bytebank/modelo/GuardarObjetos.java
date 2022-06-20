package com.bytebank.modelo;

public class GuardarObjetos {
	Object[] referencia = new Object[10];
	int indice=0;
	public void guardar(Object ref) {
		referencia[indice]=ref;
		indice++;
	}
	public Object obtener(int indice) {
		return referencia[indice];
	}

}
