package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tipos primitivos: byte, short, int, long
		//byte numeroB = 127;
		System.out.println("Tamanno de un byte" + Byte.SIZE);
		System.out.println("Tamanno maximo" + Byte.MAX_VALUE);
		System.out.println("valor minimo" + Byte.MIN_VALUE);
	
		System.out.println("------------------------------");
		
		//int entero = 5;
		System.out.println("Tamanno de un entero" + Integer.BYTES);
		System.out.println("tamanno " + Integer.SIZE);
		System.out.println("valor max" + Integer.MAX_VALUE);
		System.out.println("valor minimo" + Integer.MIN_VALUE);
		
		System.out.println("------------------------------");
		
		System.out.println("Tamanno de un short" + Short.BYTES);
		System.out.println("Tamanno" + Short.SIZE);
		System.out.println("valor maximo" + Short.MAX_VALUE);
		System.out.println("valor minimo " + Short.MIN_VALUE);
		
		System.out.println("------------------------------");
		
		System.out.println("Tamanno de un long" + Long.BYTES);
		System.out.println("tamanno " + Long.SIZE);
		System.out.println("valor max" + Long.MAX_VALUE);
		System.out.println("valor minimo" + Long.MIN_VALUE);
		
		
		var num = 12;
		System.out.println("la variable num es: " + num);
		
		var sistemNum = 0b101;
		var sistemNumm = 0x1A;
		var sistemNu = 0111;
		System.out.println(" binario: " + sistemNum);
		System.out.println(" HEXADECIMAL: " + sistemNumm);
		System.out.println(" octal: " + sistemNu);
		
		//PRIMITIVOS float Y double
System.out.println("------------------------------");
		
		System.out.println("Tamanno de un float " + Float.BYTES);
		System.out.println("tamanno " + Float.SIZE);
		System.out.println("valor max " + Float.MAX_VALUE);
		System.out.println("valor minimo " + Float.MIN_VALUE);
		float comaF = 100.50F;
		//tambien var comaF = 100.50;
		System.out.println("flotante: " +comaF);
		
		System.out.println("------------------------------");
		System.out.println("Tamanno de un Double " + Double.BYTES);
		System.out.println("tamanno " +Double.SIZE);
		System.out.println("valor maximo " + Double.MAX_VALUE);
		System.out.println("valor minimo " + Double.MIN_VALUE);
		double comaD= 356.78D;
		//tambien var comaD = 356.78D;
		System.out.println("Double: " + comaD);
		
		//Boolean 
		boolean estado = true; //false
		System.out.println("-->" + estado);
		System.out.println("--->" + Boolean.FALSE);
		System.out.println("-----> "+ Boolean.TRUE);
		
		if(estado) {
			System.out.println("Soy verdadero");
		}
		
		var edad = 19;
		Boolean adulto = edad > 17;
		//System.out.println("---> si edad es mayor o igual a 10 "+ adulto);
		
		if(edad>= 18) {
			System.out.println("Eres adulto de" + edad);
		}else {
			System.out.println("eres menor de " + edad);
		}
		
		char caracter = 'a';
		char caracterr = "halo".charAt(0);
		System.out.println("Imprimo: " + caracter);
		System.out.println("Imprimo: " + caracterr);
		
	}
 
}
