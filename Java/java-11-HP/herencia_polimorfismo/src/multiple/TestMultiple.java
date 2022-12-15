package multiple;

public class TestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma suma = new Suma(5, 5); //clase concreta
		System.out.println("La suma es: "+ suma.sumar());//clase concreta
		
		//metodo abstracto mandamos llamar a la clase hijo 
		OperacionesAritmeticas oa = new Suma(10, 5);
		
		System.out.println("Objeto oa "+ oa.sumar());
		//metodo abstracto mensajes,  se puede llamar porque es parte de  la clase suma  
		Operaciones o = new Suma(3,2); //es necesario poner esto aunque no necesitemos sumar pero si para mostrar el mensaje
		suma.mensajes();
		o.mensajes();
		
		//---
		Resta resta = new Resta(23, 14);
		OperacionesAritmeticas oar = new Resta (23,14);
		Operaciones or = new Resta (23, 14);
		
		resta.mensajes();
		System.out.println("La resta es "+ resta.restar());
		System.out.println(oar.restar());
		or.mensajes();
		
		
		
	}

}
