package clases;
import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int numero1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce tu nombre ");
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("Tu nombre es:" + nombre + ". Tu numero es:"+ numero1);
		
		/*
		 * System.out.println("Introduce otro número"); int numero2 = sc.nextInt();
		 * 
		 * System.out.println("Numero 1: " +numero1 + "Numero 2:" +numero2);
		 */
		//cerrar scanner pero solo se usa cuando ya no se va a volver a usar 
				//sc.close();
				
	}
}
