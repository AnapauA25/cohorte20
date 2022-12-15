package colecciones.excepciones.operacion;

public class Division {
 private int numerador;
 private int denominador;
public Division(int numerador, int denominador)throws OpExcepcion {
	if(denominador ==0) {
		throw new OpExcepcion("El denominador es 0");
	}
	
	this.numerador = numerador;
	this.denominador = denominador;
	
}
 
 public void visualizarD() {
	 System.out.println("Resultado de la division " + (this.numerador/this.denominador));
 }
}
