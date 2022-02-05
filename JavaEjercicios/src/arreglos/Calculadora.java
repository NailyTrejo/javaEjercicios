package arreglos;
import java.util.Scanner;

public class Calculadora {
	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	   */
	public static void main(String[]args) {
		
		System.out.println("Introduce el primer numero");
		Scanner sc = new Scanner(System.in);
		int numero1 =sc.nextInt();
		
		System.out.println("Introduce el segundo numero");

		int numero2 =sc.nextInt();
		
		System.out.print(" Elige un numero 1 es para suma, 2 es para resta, 3 es para division y 4 para multiplicación: ");
		
		int op =sc.nextInt();
		
		int resultado = 0;
		
		switch(op) {
		  case 1: //Suma
			  resultado = numero1 + numero2;
			  System.out.println("El resultado de la suma es de:" + resultado);
			  break;
		  case 2: //Resta
			  resultado = numero1 - numero2;
			  System.out.println("El resultado de la resta es de:" + resultado);
			  break;
		  case 3: //division 
			  resultado = numero1 / numero2;
			  System.out.println("El resultado de la division es de:" + resultado);
			  break;
		  case 4 : //multiplicación 
			  resultado = numero1 * numero2;
			  System.out.println("El resultado de la multiplicación es de:" + resultado);
			  break;
			default:
				System.out.println("Elige una operación");			
		}
	}

}