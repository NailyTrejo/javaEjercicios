package clases;
import java.util.Scanner;

public class DeletreaNombre {

/*Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

Ejemplo: "Juan"
"J"
"u"
"a"
"n"
	Como pista pueden investigar cómo se usan los siguientes métodos de String:
		length() devuelve la logitud de la una cadena, Retorna la cantidad de caracteres almacenados en el String.
		charAt(i) argumentos de tipo int, especifica el valor que comienza en 0,Retorna un caracter del String, llega al método la posición del caracter a extraer.
*/
	public static void main(String[]args) {
		
		System.out.println("Ingresa tu nombre");
		Scanner sc = new Scanner (System.in);
		String nombre= sc.nextLine();
		
		for(int i=0; i<nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		
	}
}