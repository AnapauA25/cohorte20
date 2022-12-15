package multiple;

public class Resta implements OperacionesAritmeticas, Operaciones {
	private double pValor;
	private double sValor;
	
	
	
public Resta(double pValor, double sValor) {
		this.pValor = pValor;
		this.sValor = sValor;
	}
	public double sumar() {
		return 0;
	}
	public double restar() {
		return pValor - sValor;
	}
	public void mensajes() {
		System.out.println("Hola soy la resta "+ pValor + sValor);
	}
}
