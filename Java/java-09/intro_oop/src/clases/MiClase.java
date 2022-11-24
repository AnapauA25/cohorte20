package clases;

public class MiClase {
		 int atributo1;				//este
		 private String atributo2;
		
		public MiClase(){ //tipo de metodo constructor
			
		}

		public MiClase(int atributo1, String atributo2) {
			super();
			this.atributo1 = atributo1;	//este
			this.atributo2 = atributo2;
		}

		public void metodo(){ //tipo de metodo void
			MiClase obj = new MiClase();//necesito tener un objeto para tener acceso a los miembros de la clase
			int n= obj.atributo1 = 23;
			String s = obj.atributo2 = "Hola";
			System.out.println(n);
			System.out.println(s);
			
			System.out.println(atributo1);
			System.out.println(atributo2);
		}
		
		public double metodo1() { //tipo de metodo primitivo
			double a = 0.0;
			return a;
		}
		
		
}


