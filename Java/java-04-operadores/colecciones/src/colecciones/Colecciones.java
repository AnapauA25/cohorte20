package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		//List -Arraylist
		//valores de un mismo  tipo
		
		System.out.println("---ArrayList----");
		
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("CDMX");
		miArray.add("GDL");
		miArray.add("MTY");
		miArray.add(1, "Manzanillo");
		
		String valorQuitado = miArray.remove(0);
		//boolean valorQuitado = miArray.remove("CDMX");
		
		System.out.println(miArray);
		System.out.println(valorQuitado);
		System.out.println(miArray.get(0));
		System.out.println(miArray.size());
		
		imprimir(miArray);
		
		System.out.println("---HashSet----");
		//es la mas rapida de todas
		//no permiten elementos duplicados 
		//no guarda los elementos en "orden"
		//no maneja indice
		Set<String> miSet = new HashSet<String>();
		
		miSet.add("Panchito");
		miSet.add("Paco");
		miSet.add("Juan");
		miSet.add("Juan");
		miSet.add("Martin");
		
		System.out.println(miSet);
		imprimir(miSet);
		
		//nos busca si existe lo que hay dentro del set es muy sensible.
		System.out.println(miSet.contains("Martin"));
		
		miSet.remove("Martin");
		imprimir(miSet);
		
		System.out.println("---HashMap----");
		//pares de valores (llave-valor)
		Map<String, Integer> miMap =new HashMap<String, Integer>();
		miMap.put("Valor 1", 56); //se reemplaza el valor
		miMap.put("Valor 2", 5);
		miMap.put("Valor 1", 6); //es reemplazado por este valor
		miMap.put("Valor 3", 61);
		
		System.out.println(miMap);
		//para obtener un valor en especifico
		System.out.println(miMap.get("Valor 2"));
		System.out.println(miMap.keySet());
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}

		//no lo podemos utilizar imprimir(miMap);
	}
//no tiene que ver colecciones recorre e imprime
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}

}
