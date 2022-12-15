package principal;

import threads.*; //el paquete estan todas las clases al poner *

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 h1 = new Thread1();
		Thread2 h2 = new Thread2();
		h1.start();				//inicie o ejecute el hilo
		h2.start();
		try {					//maneja la excepcion 
			h1.join();
			h2.join();			//excepcion de interrupcion
		} catch (InterruptedException e) { //<--la captura dentro de este objeto
			
		}
		System.out.println("sean ejecutado los 2 thread ");
		
	}

}
