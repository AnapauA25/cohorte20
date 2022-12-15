package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas{
Scanner s= new Scanner(System.in);
private double lado;
	
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t \t \t Area de un Cuadrado ");
		System.out.print("Introduce un lado: ");
		lado = s.nextDouble();
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = lado * lado;
	}
	
}
