package app;

import modelos.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1=new Persona("pepe","jbs",0);
		System.out.println(p1.mostrarEdad());
		
		Persona p2=new Persona("pepe","jbs",17);
		System.out.println(p2.mostrarEdad());
		
		Persona p3=new Persona("pepe","jbs",18);
		System.out.println(p3.mostrarEdad());
		
		Persona p4=new Persona("pepe","jbs",65);
		System.out.println(p4.mostrarEdad());
		
		Persona p5=new Persona("pepe","jbs",66);
		System.out.println(p5.mostrarEdad());
		
		
		Persona p6=new Persona("pepe","jbs",130);
		System.out.println(p6.mostrarEdad());
		
		
		Persona p7=new Persona("pepe","jbs",131);
		System.out.println(p7.getEdad());
		
		
		
		

	}

}
