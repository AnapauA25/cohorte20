package clase_2;

public class Clase_2 extends Clase_Padre{
	
	private String dato1; //pertenece aqui
public Clase_2(int valor0, String dato0, String dato1) { //pertenece a clase padre
		super(valor0, dato0);
		// TODO Auto-generated constructor stub
		this.dato1 = dato1;
	}

void vizualizar2() {
	System.out.println(dato1);
}
}
