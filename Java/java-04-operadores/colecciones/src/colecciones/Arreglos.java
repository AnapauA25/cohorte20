package colecciones;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//arrays - arreglos -matrices
		//solo permiten un tipo de dato
		
		String [] miArreglo = new String[5];
		
		miArreglo[0]= "Ana";
		miArreglo[1]= "Paula";
		miArreglo[2]= "Mexico";
		miArreglo[3]= "Iztapalapa";
		miArreglo[4]= "Generation";
		
		System.out.println(miArreglo[0]);
		//ciclo for para recorrerlo
		for(int i=0; i< miArreglo.length; i++ ){
			System.out.println(miArreglo[i]);
		}
		System.out.println("---------------------------");
		//for each recorre cada elemento del arreglo escribe como for normal la diferencia es lo que esta dentro de los arreglos
		for(String nombre : miArreglo) {
			System.out.println("ForEach " + nombre);
		}
		System.out.println("---------------------------");
		//Arrays metodos para los arreglos
		System.out.println(Arrays.toString(miArreglo));
		
		System.out.println("---------------------------");
		//Tipos de valores
		int numeros []= new int[5];
		
		numeros[0]=3;
		numeros[1]=-55;
		numeros[2]=(int) 3.45; //casteo cambiar a otro tipo de valor
		numeros[3]=Integer.parseInt("2"); //parseo cambiar la clase del valor
		
		for(int numero : numeros) {
			System.out.println("Valores del arreglo numeros "+ numero);
		} 
		
		//Arreglos de objetos
		//creando nuestros propios objetos
		Persona persona1 = new Persona("Lugo", 24);
		Persona persona2 = new Persona("Paty", 53);
		
		//
		Persona [] arrPersonas = new Persona[3];
		
		arrPersonas[0]= persona1;
		arrPersonas[1]=persona2;
		arrPersonas[2]= new Persona("Luis", 18);
		
		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre);
		System.out.println(arrPersonas[2].nombre);
		
		for(Persona persona : arrPersonas) {
			System.out.println("Nombre: "+ persona.nombre + "edad" + persona.edad);
		}
		
		//arreglos literales
		//tienen que ser el mismo de dato
		String [] arrString = {"Manzana", "Pera", "12", "Hola"};
		System.out.println(Arrays.toString(arrString));	
	}
}
