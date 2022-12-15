package polimorfismo;

import java.util.Scanner;

public abstract class FigurasGeometricas {
	//protected double pValor;
	//protected double sValor;
	protected double resultado;
	//Scanner s;
	
	public abstract void pedirDatos(); 
	
	/*{
		s = new Scanner (System.in);
		System.out.print("Introduszca el primer valor: ");
		pValor = s.nextDouble();
		System.out.print("Introduszca el segundo valor: ");
		sValor = s.nextDouble();
		}*/
		
		//metodo abstracto
	public abstract void area();
		
	//salida
	public void visualizar() {
		System.out.println("El resultado del area es: "+ resultado);
	}
}
