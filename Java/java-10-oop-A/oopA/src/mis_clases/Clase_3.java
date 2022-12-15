package mis_clases;

public class Clase_3 {
	 int valor;
	 
	public Clase_3() { //clase que solicita parametro
		
	}
	
	public void setValor(int valor) { //al constructor le dor parametro o un valor al miembrode datos de la clase, para acceder arriba
		this.valor = valor;
	}
	//get es para saber que tiene, usa un return

	public int getValor() {
		return valor;
	}
	

	/*public static void main(String[] args) {
		Clase_3 obj3 = new Clase_3(23); //cuando creo el objeto el construcor de la clase solicita el parametro
		obj3.setValor(1489);
		
		System.out.println(obj3.valor);
	}*/

	
}
