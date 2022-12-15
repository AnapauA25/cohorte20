package polimorfismo;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas{
Scanner s = new Scanner(System.in);
protected double pValor;
protected double sValor;	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t \t \t Area de un triangulo ");
		System.out.print("Introduzca la base: ");
		pValor = s.nextDouble();
		System.out.print("Introduce la altura: ");
		sValor = s.nextDouble();
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = (pValor * sValor)/ 2;		//llama las variables de figuras geometricas
	}

	
	
}
