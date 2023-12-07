package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.anio = 2022;
		auto1.marca = "mazda";
		auto1.precio = 20.000000;
		
		auto2.anio = 2023;
		auto2.marca = "audi";
		auto2.precio = 20.000000;
		
		System.out.println("auto 1");
		System.out.println("marca: "+auto1.marca);
		System.out.println("anio: "+auto1.anio);
		System.out.println("precio: "+ auto1.precio);
		
		
		
		System.out.println("___________________________");
		System.out.println("auto 2");
		System.out.println("marca: "+auto2.marca);
		System.out.println("anio: "+auto2.anio);
		System.out.println("precio: "+ auto2.precio);

	}

}
