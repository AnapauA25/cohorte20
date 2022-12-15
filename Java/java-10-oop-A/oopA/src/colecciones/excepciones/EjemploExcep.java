package colecciones.excepciones;

public class EjemploExcep {

public static int dividir(int a, int b) {
	int r = 0;
	try {
		r = a/b;
		
	} catch (ArithmeticException e) {
		System.out.println("no se puede dividir entre 0 ");
	}
	
	return r;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dividir (4,0));
	}

}
