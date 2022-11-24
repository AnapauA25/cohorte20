package clases;

public class Animal {

	private String raza;
	private String nombre;
	private int edad;
	
public Animal() {	
		
	}

	public Animal(String nombre){
	super();
	this.nombre = nombre;
	}


	public void setEdad(int edad) {
	this.edad = edad;
	}

	public String getNombre() {
	return nombre;
	}

	public int getEdad() {
	return edad;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
