package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import java.util.*;

public class Colecciones {
	public static void main(String[]args) {
		//Las colecciones nos sirven para almacenar un conjunto 
		//de objetos 
		//La diferencia de las colecciones y los objetos 
		//es que las coleeciones son dinamicas, pueden cambiar
		//el numero de objetos agregados
		
		//Orden de velocidad 
		//1.HashSet
		//2.LinkedHashSet
		//3.TreeSet

		
	//coleccion de tipo set
		//Set tiene 3 implementaciones 
		//no puede contener elementos repetidos
		//los elementos no mantiene un orden 
		
		//Hashset
		//Los elementos no mantiene un orden 
		//Es la implementacion mas rápida 
		
		/*Set <String> frutas = new HashSet<String>(); 
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		//foreach, puede recorrer una coleccion y en cada 
		//recorrido recupera el valor y lo podemos almacenar 
		//en una variable 
		//sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		/*
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		//TreeSet
		//Esta implementacion ordena los elementos en funcion de sus valores
		//es la implementacion mas lenta 
		
		/*Set <String> frutas = new TreeSet<String>(); 
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		//LinkedHashSet
		//ordena los elementos en orden de insercion 
		//es mas costoso que HashSet 
		/*Set <String> frutas = new LinkedHashSet<String>(); 
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		//List 
		//se permiten elementos duplicados
		//acceder a elementos
		
		//ArrayList
		
		List <String>pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");
		pokemones.add("Eeve");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		 
		//add si agregamos un indice y un elemento, posiciona 
		//el elemento en el indice y realiza un desplazamiento
		//es decir no borra el elemento en la posicion si no que lo desplaza
		
		pokemones.add(2, "Pikachu"); //puedo insertarlo en el codigo, diciendole la posicion primero
		//lo que ara es mover los elementos y insertarse en la posicion
		
		//remove remueve el elemento de la posicion especifica 
		
		pokemones.remove(5);
		
		//set remplaza el elemento en la posicion especificada 
		pokemones.set(0, "Flareon");
		
		for(String pokemon : pokemones) {
		System.out.println(pokemon);
		}
		System.out.println("************");
		System.out.println(pokemones.get(4));
		
		//indexOf, nos va a devolver la posicion del elemento 
		//y si el elemento no se encuentra nos devuelve -1
		//lastIndexOf nos devuelve el ultimo elemento
		
		//System.out.println(pokemones.indexOf("Togepi")); si no esta el elemento devuelve -1
		
		System.out.println(pokemones.indexOf("Togepi"));
		System.out.println("************");
		
		//LinkedList 
		//Es una lista doblemente enlazada 
		//Es ams rapido para insertar y remover elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		
		//Map
		//Asocia claves a valores.
		//No puede contener claves duplicadas 
		//Solo puede tener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Carlos");
		//usuarios.put(2,"Raul"); HashMap no acepta claves duplicadas 
		usuarios.put(2,"Pedro");
		usuarios.put(3, "Ro");
		
		System.out.println(usuarios.get(2)); //devuelve el valor asociado
		
		//keySet
		//Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		//values 
		//nos permite recuperar el valor directamente 		
		System.out.println(usuarios.values());
		
		//TreeMap
		Map<Integer,String> tamales = new TreeMap <Integer,String>();
		tamales.put(5, "Mole Rojo");
		tamales.put(9, "Mole Verde");
		tamales.put(160, "Gansito");
		tamales.put(1, "Cochinita");
		
		System.out.println("******************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());

		System.out.println(tamales);
		tamales.entrySet().forEach(elemento ->{ //funcion lambda
		 //System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
		System.out.println(elemento.getKey());
		System.out.println(elemento.getValue());
		});
	
		//LinkedHashMap
		
		Map<Integer, String> carros = new LinkedHashMap<Integer,String>();
		//guarda los elementos segun el orden en el que se inserten 
		carros.put(1,"Volvo");
		carros.put(567,"Pointer");
		carros.put(8,"Mustang");
		
		System.out.println("*************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());

	}
}
