package clase_2;

import mis_clases.Clase_3;

public class TestMain {
	public static void main(String[] args) {
		Clase_3 nc3 = new Clase_3();
		nc3.setValor(0);
		//Clase_Padre cp = new Clase_Padre();
		Clase_2 c2 = new Clase_2(23,"a","b");
		c2.visualizar();
		c2.vizualizar2();
		
	}
}
