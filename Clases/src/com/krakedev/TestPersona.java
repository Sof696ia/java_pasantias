package com.krakedev;
/* comentarios 
 * varios 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona(); //1 y 2  declaro e instacio
		
		System.out.println("nombre "+p.nombre);  //3 accedo a los atributos
		System.out.println("edad "+p.edad);
		System.out.println("altura "+p.altura);
		
		p.nombre="Mario";  // 4 modifico los atributos 
		p.edad = 20;
		p.altura = 1.5;
		
		System.out.println("nombre "+p.nombre);  //3 accedo a los atributos
		System.out.println("edad "+p.edad);
		System.out.println("altura "+p.altura);
		
		System.out.println("----------------- ");
		
		Auto auto1= new Auto();
		
		System.out.println("marca: "+auto1.marca);
		System.out.println("anio: "+auto1.anio);
		System.out.println("precio: "+ auto1.precio);
		
		Auto auto2= new Auto();
		
		System.out.println("marca: "+auto2.marca);
		System.out.println("anio: "+auto2.anio);
		System.out.println("precio: "+ auto2.precio);

	}

}
