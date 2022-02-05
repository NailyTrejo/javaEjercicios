
package Metodos;

public class Metodos {
	
	//Metodo es una funcion 
	
	//atributos de la clase 
	int a, b;
	
	//Metodo void (vacio)
		public void sumar() {
			int resultado = a + b;
			System.out.println("el resultado de sumar " + a + " más " + b +" es " + resultado);
		}
		
		//metodo con retorno de valores 
		public int sumaConRetorno() {
			//int resultado = a + b;
			//return resultado;
			return a + b;
		}
		
		//argumentos 
		//suma(argumentos)
		
		public double multiplicarConArgumentos(int arg1, double arg2) {
			int c = arg1;
			double d = arg2;
			return c * d ;
		}
		
		//metodo estatico 
		//estatico, void (no regresa datos), usa argumentos y puede funcionar sin hacer uso de un objeto
		public static void imprimirNombre(String nombre) {
			System.out.println("Mi nombre es: " + nombre);
		}
		
			
}