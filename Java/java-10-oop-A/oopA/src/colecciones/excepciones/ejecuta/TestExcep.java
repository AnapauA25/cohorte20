package colecciones.excepciones.ejecuta;

import colecciones.excepciones.operacion.Division;
import colecciones.excepciones.operacion.OpExcepcion;

public class TestExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//meter catch
		try {
			Division d = new Division(4, 4);
			d.visualizarD();
		} catch (OpExcepcion e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("continua...");
	}

}
