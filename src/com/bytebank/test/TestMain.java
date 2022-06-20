package com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		int edad1=10;
		int edad2 = 20;
		int edad3=30;
		//Quiero agruparlas en una sola referencia
		//indices 	 0 1 2 3 4
		//			[0|0|0|0|0]
		int[] edades=new int[5];
		edades[0]=10;
		edades[1]=20;
		edades[2]=30;
		edades[3]=40;
		edades[4]=50;
		/*
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);
		System.out.println(edades[3]);
		System.out.println(edades[4]);
		*/
		
		int tamanoArray = edades.length;
		System.out.println("El tamaño de este array es de "+tamanoArray);
		for(int i=0;i<edades.length;i++) {
			System.out.println(edades[i]);
		}
	}

}
