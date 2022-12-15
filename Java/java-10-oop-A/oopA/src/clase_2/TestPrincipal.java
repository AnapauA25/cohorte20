package clase_2;

public class TestPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase_Padre cp = new Clase_Padre(14689, "Hola");
		
		cp.visualizar();
		Clase_2 c2 = new Clase_2(2357, "ADIOS", "clase 2");
		c2.visualizar();
		c2.vizualizar2();
	}

}
