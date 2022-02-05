package arreglos;

public class Arreglos {
	//solo un tipo de dato
		//especificar el tamaño o la cantidad de elementos que va a contener 
		
		
		public static void main(String[]args) {
			//1 manera 	
			int numeros[]; //creamos la variable
			numeros = new int[4]; //creando el arreglo 
			
			//2 manera 
			String[]nombres = new String[4]; //basado en 0. [0, 1, 2, 3]
			
			//3 manera
			//array literal 
			String []nombreFrutas = new String[]{"Manzana", "Platano", "Uva", "Pera"};
			
			numeros[0] = 10; //insertar dato dentro del arreglo
			numeros[1] = 8;
			numeros[2] = 100;
			numeros[3] = 200;
			//numeros[4] = 200;
			
			nombres[0] = "Juan";
			nombres[1] = "Pedro";
			nombres[2] = "Antonio";
			nombres[3] = "Felipe";


			
			//impresion de uno en uno
			System.out.println(numeros[0]);
			System.out.println(numeros[1]);
			System.out.println(numeros);
			/*System.out.println(numeros); guarda el arreglo en la memoria hit y no se puede imprimir todo el arreglo*/
			
			//imprimir todo el arreglo
			for(int i=0; i < numeros.length; i++) { //en arrays, length es una propiedad
				System.out.println("Elemento de numeros: " + numeros[i]); // adquiere la posicion de cada elemento del array [0],[1],[2],[3]
				System.out.println("Elemento de numeros: " + nombres[i]);
				System.out.println("Elemento de frutas: " + nombreFrutas[i]);
				System.out.println("-----------------------------------");
			}
			}
}
