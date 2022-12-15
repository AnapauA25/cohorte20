package herencia;
//No es protected ya no hereda si no a la clase la heredan no comparte los atributos con el padre

public class Hija extends Padre {
	
	
	private int edad;
	//private String apellido; No es necesario ponerlo porque pasa directo con el parametro 
																//atributos heredados
	public Hija(String nombre, String domicilio, int edad) { //metodo constructor, aqui hay sobrecarga
		super(nombre, domicilio);
		this.edad = edad;
	}
	
	public void mostrarDatos() {	//metodo para mostrar datos
		System.out.println("El nombre es: "+ nombre + "el domicilio es: "+ domicilio + " Edad: " + edad);
	}
	//aqui esta el parametro
	public void mostrarDatos(String apellido) { 	//aunque se llaman igual los metodos tiene un atributo (overloading)
		//this.apellido = apellido;
		
		System.out.println("El nombre y apellido es: "+ nombre +" "+ apellido + "el domicilio es: "+ domicilio + " Edad: " + edad);
	}
}
