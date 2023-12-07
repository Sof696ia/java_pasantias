package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre ="paracetamol";
		productoA.descripcion = "para la fiebre";
		productoA.precio = 20.5;
		productoA.stockActual = 5;
		
		productoB.nombre ="finalin";
		productoB.descripcion = "dolor de cabeza";
		productoB.precio = 11.5;
		productoB.stockActual = 50;
		
		productoC.nombre ="bactrin";
		productoC.descripcion = "infeccion";
		productoC.precio = 10.8;
		productoC.stockActual = 30;
		
		System.out.println("----------producto A -----------");
		System.out.println(
				"nombre: "+productoA.nombre+"\n"+
			    "descripcion: "+productoA.descripcion+"\n"+
			    "precio: "+productoA.precio+"\n"+
			    "stock Actual: "+productoA.stockActual
				);
		System.out.println("----------producto B -----------");
		System.out.println(
				"nombre: "+productoB.nombre+"\n"+
			    "descripcion: "+productoB.descripcion+"\n"+
			    "precio: "+productoB.precio+"\n"+
			    "stock Actual: "+productoB.stockActual
				);
		System.out.println("----------producto C -----------");
		System.out.println(
				"nombre: "+productoC.nombre+"\n"+
			    "descripcion: "+productoC.descripcion+"\n"+
			    "precio: "+productoC.precio+"\n"+
			    "stock Actual: "+productoC.stockActual
				);
		
		
		
	}

}
