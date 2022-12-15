package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parametrizamos el array  y nuevo objeto permite elementos dubplicados
		ArrayList<String> list = new ArrayList<String>();
		  
	    //creamos el objeto   
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(null);
  //.add= un elemento
        System.out.println("ArrayList: " + list);
        //System.out.println("ArrayList: " + list.get(0)); //MUESTRA EL 1ER ELEMENTOS
        //System.out.println("ArrayList: " + list.get(2)); //MUESTRA EL 3ER ELEMENTO
  
       //el hashm utiliza 2 elementos clave(wrapper), valor  realizamos nuevo objeto
       //utiliza mas memoria, no permite elementos duplicado en caso de claves wrappers
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();
  
       
        hm.put(null, "A ");
        hm.put(2, null);
        hm.put(null, null);
        hm.put(4, "D");
  
        
        //System.out.print("HashMap: " + hm.get(1)); //muestra por el indice de sus claves
        System.out.print("HashMap: " + hm);
        //System.out.println("HashMap: "+ hm.get(3));
	}

}
