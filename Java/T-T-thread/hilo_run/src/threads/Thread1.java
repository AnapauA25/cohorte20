package threads;


public class Thread1 extends Thread{
	
	public void run() {				//itera de 1 a 100 para ver como funciona el hilo
		for (int i=0; i <100; i ++) {
			System.out.print(" 1 ");
		}
	}
}
