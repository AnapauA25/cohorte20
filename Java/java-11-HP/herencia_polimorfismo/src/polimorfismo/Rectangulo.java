package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
Scanner s = new Scanner (System.in);
private double base;
private double altura;

	@Override
	public void pedirDatos() {
		
		System.out.println("\t Area de un rectangulo ");
		System.out.println("Introduce la base: ");
		base = s.nextDouble();
		System.out.println("Introduce la altura: ");
		altura= s.nextDouble();	
	}

	@Override
	public void area() {
		resultado = base * altura ;
		
	}

}
