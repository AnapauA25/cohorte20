package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		//System.out.println("Escribe un dato ");
//		//String dato = scanner.nextLine();
//		//System.out.println("El dato es " + dato);
//		
//		//int valor =6;
//		//int valor1 = 5;
//		
//		
//		System.out.println("Escribe un digito");
//		int valor = scanner.nextInt();
//		System.out.println("Escribe otro digito");
//		int valor1 = scanner.nextInt();
//		
//		
//		int suma = valor + valor1;
//		int resta = valor - valor1;
//		int mult = valor * valor1;
//		float div = valor / valor1;
//		int resi = valor % valor1;
//		
//		//if (div >0) {
//			//System.out.println("El resultado de la division es menor a 0");
//		//}else {
//		//	System.out.println("Resultado de la division "+ div);
//		//}
//		
//		System.out.println("Resultado de la suma "+ (valor + valor1));
//		System.out.println("Resultado de la resta "+ resta);
//		System.out.println("Resultado de la multiplicacion "+ mult);
//		if (div >0) {
//		System.out.println("El resultado de la division es menor a 0");
//		}else {
//		System.out.println("Resultado de la division "+ div);
//		}
//		if(resi==0) {
//		System.out.println("El residuo es par ");
//		}else{
//		System.out.print("El residuo es impar");
//		}

//		var a = 5;
//		var b = 8;
//		boolean comparar = a<b;
//		boolean logica = true;
//		if(comparar && logica) {
//			System.out.println("verdadero");
//		}
//		
//		//System.out.print("compara: " + comparar);
//		var c = 3;
//		var d = 5;
//		boolean comparaL = a>=b;
//		boolean logicaL = true;
//		if(comparaL || logicaL) {
//			System.out.println(" verdadero");
//			System.out.println("comparar "+comparar);
//		}else {
//			System.out.println(comparar);
//			System.out.println(logica);
//		}
//		
//		var e = 3;
//		var f = 5;
//		boolean comp = a>=b;
//		boolean logi = true;
//		if(comp || !(logi)) {
//			System.out.println(" verdadero");
//			System.out.println("comparar "+comparar);
//		}else {
//			System.out.println(comparar);
//			System.out.println(logica);
//		}
//		
//		int numero =1;
//		String msj = " ";
//		switch(numero) {
//			case 1:
//				System.out.println("uno");
//				break;
//			case 2:
//				System.out.println("dos");
//				break;
//			case 3:
//				System.out.println("tres");
//				break;
//				default:
//					break;
//			}
		
		Scanner scanner = new Scanner(System.in);
		int i =0;
		do {
		System.out.println("Escribe un numero 1.suma 2.Resta 3.Multiplicacion 4.Division 5.residuo");
        int numero = scanner.nextInt();
		
		
		System.out.println("Escribe un digito");
		int valor = scanner.nextInt();
		System.out.println("Escribe otro digito");
		int valor1 = scanner.nextInt();
		switch(numero) {
			case 1:
				int suma = valor + valor1;
				System.out.println("Resultado de la suma "+ (valor + valor1));
				
				break;
			case 2:
				int resta = valor - valor1;
				System.out.println("Resultado de la resta "+ resta);

				break;
			case 3:
				int mult = valor * valor1;
				System.out.println("Resultado de la multiplicacion "+ mult);
				break;
			case 4:
				int div = valor / valor1;
				if (div >0) {
				System.out.println("El resultado de la division es menor a 0");
				}else {
					System.out.println("Resultado de la division "+ div);
					}
				break;
			case 5:
				int resi = valor % valor1;
				if(resi==0) {
					System.out.println("El residuo es par ");
					}else{
					System.out.print("El residuo es impar");
					}					
				break;
			case 7:
					System.out.println("Esa no es una opcion");
					break;
					default:
					break;
		}
		}while(i !=6);
		
//		int i =0;
//		do {
//			System.out.println("loop do while");
//			System.out.println(i);
//			i++;
//		}while(i<=9);
		
		}
		 
  }


