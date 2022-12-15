package herencia;

public class Padre {
	protected String nombre;
	protected String domicilio;
	
	public Padre(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public void mostrarDatos() {	//metodo para mostrar datos
		System.out.println("Elnombre es: "+ nombre + "el domicilio es: "+ domicilio);
	}

}
