package operadores;

import java.util.Scanner;

public class Ciclos {

	void saludo() {
		System.out.println("Hola a las funciones en Java ");
	}
	
//METODOS	
	int operacion () {
		int f = (int) Math.pow(3, 2); //casteo porque pow es float y lo devuelve entero
		
		return f;
	}
	static double noperacion () {
		double h = Math.pow(13,9);
		return h;
	}
	
	float nuevo() {
		return 0;
	}
	
	String caracteres () {   //return de tipo referenciado
		String nombre= " ";
		return nombre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ciclos objC;
		objC = new Ciclos();
		objC.saludo();
		System.out.println("uso de exponentes pow " + objC.operacion());
		objC.operacion();
		System.out.println("Pow de tipo double: " + noperacion());
//		Scanner scanner = new Scanner (System.in);
//		System.out.println("BUCLES: Escribe el numero que quieres multiplicar: ");
//		int tablaW = scanner.nextInt();
//		for (int i=0; i <= 10; i++) {
//			System.out.println(tabla + " * " + i + "= " + (tabla*i));
//		}
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Escribe el numero que quieres multiplicar: ");
		int tablaW = scanner.nextInt();
		int j = 1;
		//int tablaW = 3;
		while (j < 10 ) {
		System.out.println(tablaW + " * " + j + "= " + (tablaW*j));
		j++;
	}
	}
}
