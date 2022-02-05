package clases;

public class ContadorDe3en3 {
 public static void main(String[]args) {
	 /*Crea una clase llamada contador
		Escribe un ciclo que haga que un contador 
		vaya de 15 a 90, contando de 3 en 3.*/
	 
	 for(int i=15; i <= 90; i++) {
			if(i % 3 == 0) { //solo se muestra cuando el valor de i sea numero par
				System.out.println("Contador = " + i); 
			}
 }
}
}
