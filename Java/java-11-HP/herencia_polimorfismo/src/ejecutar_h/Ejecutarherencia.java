package ejecutar_h;

import herencia.*;

public class Ejecutarherencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//estamos haciendo overloading con clases concretas 
		Padre p = new Padre(" Juan", "Pachuca");
		p.mostrarDatos();
		
		//pueden ser objetos independientes
		Hija h = new Hija("Dora ", "CDMX", 20);
		h.mostrarDatos();
		
		Hija h1 = new Hija("Diego ", "Tulancigo", 18);
		h1.mostrarDatos("Cruz");
		
		//clases con 
	}

}
