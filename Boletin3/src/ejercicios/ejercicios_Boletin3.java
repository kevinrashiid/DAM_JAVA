package ejercicios;

import java.util.Scanner;

public class ejercicios_Boletin3 {

	public static void main(String[] args) {
		//================ejercicio 1=============================
		//Escribir un programa que pida una contraseña por teclado (dos veces) y si no coinciden
		//nos lo vuelva a pedir hasta que lo hagan
		/*Scanner teclado= new Scanner(System.in);
		System.out.println("INTRODUCE CONTRASEÑA");
		String primeraContra=teclado.nextLine();
		System.out.println("VUELVE A INTRODUCIRLA");
		String segundaContra=teclado.nextLine();
		
		if(primeraContra.equalsIgnoreCase(segundaContra)) {
			System.out.println("coinciden");
		}else {
			System.out.println("NO coinciden");
		}
		*/
		
		//================ejercicio 1=============================
		//Escribir un programa que pida una contraseña por teclado (dos veces) y si no
		//coinciden nos lo vuelva a pedir hasta que lo hagan
		
		/*
		String contra1="";
		String contra2="";		
		do {
		Scanner teclado = new Scanner(System.in);
		System.out.println("LAS CONTRASEÑAS SON IGUALES???");
		
		System.out.print("INTRODUCE PRIMERA CONTRASEÑA ---> ");
		contra1=teclado.nextLine();
		
		System.out.print("SEGUNDA CONTRASEÑA ---> ");
		contra2=teclado.nextLine();
		
		if(contra1.equalsIgnoreCase(contra2)){
			System.out.println("---> CONTRASEÑAS IGUALES <---");
		}
		else {
			System.out.println("!!!!CONTRASEÑAS DIFERENTES!!!!");
		}
		
		}while(!contra1.equalsIgnoreCase(contra2));*/
		//! <--- ESTE SIGNO REVIERTE EL TRUE O FALSE
		//----EXPLICACION----
		/*
		 * Empezamos comparando dos texto  HASTA QUE SEAN IGUALES es decir
		 * un bucle while por que no sabemos cuando seran iguales, y para 
		 * mejorarlo hacemos un do while ya que tenemos primero pedidos las
		 * contrar y luego las comparamos la parte clave de este ejercicio
		 * para que salga es la condicion while(!contra1.equalsIgnoreCase(contra2))
		 * ! este signo revierte el resultado, comparamos contra1 y contra2 
		 * si son iguales sale TRUE pero como tiene --> ! saldra FALSE
		 * lo que quiere decir es que -->
		 * mientras sean DIFERENTES se vuelva a ejecutar*/
		
		
		
		//================ejercicio 2=============================
		//Modifica el programa anterior para que cuando coincidan ambas contraseñas nos
		//informe del número de intentos inválido
		/*String contra1="";
		String contra2="";
		int contador=0;
		do {
		Scanner teclado = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("LAS CONTRASEÑAS SON IGUALES???");
		
		System.out.print("INTRODUCE PRIMERA CONTRASEÑA ---> ");
		contra1=teclado.nextLine();
		
		System.out.print("SEGUNDA CONTRASEÑA ---> ");
		contra2=teclado.nextLine();
		
		if(contra1.equalsIgnoreCase(contra2)){
			System.out.println("---> CONTRASEÑAS IGUALES <---");
		}
		else {
			System.out.println("!!!!CONTRASEÑAS DIFERENTES!!!!");
		}
		contador++;
		}while(!contra1.equalsIgnoreCase(contra2));
		System.out.println("NUMERO DE INTENTOS INVALIDOS --> "+ contador);*/
		//----EXPLICACION----
		/*
		 * Es el mismo ejercicio solo que hemos añadido el contador dentro del
		 * bucle para saber cuantas veces paso por el contador*/

		
		
		//================ejercicio 3=============================
		//Escribir un programa que nos pida nuestro nombre y apellidos (dos peticiones
		//diferentes hechas en ese orden) y nos lo escriba formateado de la siguiente forma:
		//Morales Vázquez, José María
		
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("DIME TU NOMBRE --> ");
		String nombre=teclado.nextLine();
		System.out.println("DIME TU APELLIDO --> ");
		String apellido=teclado.nextLine();
		System.out.println(apellido+","+nombre);
		//NO SE SI REFIERE A ESTO
		*/
		
		
		
		//================ejercicio 4=============================
		//Escribir un programa que pida por teclado una cadena de texto y la escriba en sin
		//espacios en blanco (si los hubiera). Además, nos debe de decir el número de espacios
		//que ha encontrado y suprimido.
		Scanner teclado= new Scanner(System.in);
		String espacio=" ";
		System.out.print("texto--> ");
		String texto=teclado.nextLine();
		int contador=0;
		
		for(int i=0;i<texto.length();i++) {
				texto=texto.replace(" ", "");
				if(texto.charAt(i)==espacio) {
					contador++;
				}
		}
		System.out.println(contador);
		System.out.println(texto);
		
						
				//================ejercicio 4=============================
				//Escribir un programa que pida por teclado una cadena de texto y la escriba en sin
				//espacios en blanco (si los hubiera). Además, nos debe de decir el número de espacios
				//que ha encontrado y suprimido
				Scanner teclado= new Scanner(System.in);
				System.out.println("INTRODUCE TEXTO CON ESPACIOS");
				String textoConEspacio=teclado.nextLine();
				int contador=0;
				String espacio=" ";
				textoConEspacio=textoConEspacio.replace(" " , "");
				System.out.println(textoConEspacio);
				//falta contar CUANTOS ESPACIO ELIMINO
		
		
		
		
	}
}















