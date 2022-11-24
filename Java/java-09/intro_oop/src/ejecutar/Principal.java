package ejecutar;

import clases.Animal;
import clases.MiClase;


public class Principal {

	public static void main(String[] ana) {
		// TODO Auto-generated method stub
		MiClase mc = new MiClase(14689,"como estas");
		
		mc.metodo();
		
		Animal miAnimal = new Animal("gato");
		System.out.println("nombre: " + miAnimal.getNombre());
		miAnimal.setEdad(4);
		System.out.println("edad: "+ miAnimal.getEdad()); 
		
		Animal otroAnimal = new Animal ("conejo");
		otroAnimal.setNombre("chanita");
		otroAnimal.setEdad(1);
		
		System.out.println("El nuevo animal es: " + otroAnimal.getNombre());
		System.out.println("su edad es: " +otroAnimal.getEdad());
		
	}

}
