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
		/*
		//==================SIN ACABAR=======================
		Scanner teclado= new Scanner(System.in);
		
		String espacio=" ";
		System.out.print("texto--> ");
		
		String texto=teclado.nextLine();
		
		int contador=0;
		
		for(int i=0; i<texto.length(); i++) {
				texto=texto.replace(" ", "");
				if(espacio.equals(texto.charAt(i))) {
					contador=contador+1;
				}
		}
		*/
		//SOLUCION DEL PROFE PARA COGER SOLTURA CON LOS BUCLES
		/*Scanner teclado= new Scanner(System.in);
		
		System.out.print("texto--> ");
		
		String texto=teclado.nextLine();
		
		int contador=0;
		String sinEspacios="";

		for(int i=0; i<texto.length(); i++) {
			if(texto.charAt(i) != ' ') {//caracteres con comillas simples ''
				sinEspacios = sinEspacios + texto.charAt(i);
			}else {//cuando i sea igual a un espacio sumara +1 al contador
				contador++; 
			}
		}
		System.out.println("CADENA SIN ESPACIOS ---> "+sinEspacios);
		System.out.println("ESPACIOS ELIMINADOS --> "+contador);
		*/
		
		// ================ejercicio 5=============================
		//Escribir un programa que pida por teclado una cadena de texto y la imprima escrita al
		//reves (es decir, si el usuario escribe Hola Mundo el programa debería de escribir
		//odnuM aloH)
		/*Scanner teclado =new Scanner(System.in);
		
		String alReves="";
		
		System.out.println("INTRODUCE TEXTO Y TE LO PONGO AL REVES --> ");

		String texto= teclado.nextLine();
		
		//recoriendo el texto al reves //el i-- es para ir restando ya que vamos al reves
		for(int i=texto.length()-1; i>=0; i--) {
			alReves = alReves + texto.charAt(i);
		}
		System.out.println("CADENA AL REVES -->"+alReves);
		*/
		
		
		// ================ejercicio 6=============================
		//Escribir un programa que pida por teclado una cadena de texto y la separe en dos
		//distintas. En la primera de ellas estarían las letras que ocupan una posición par y en la
		//segunda las que ocupan una posición impar. Por ejemplo, si el usuario escribe Hola
		//Mundo la primera cadena sería Hl ud y la segunda oaMno
		/*Scanner teclado =new Scanner(System.in);
		System.out.print("INTRODUCE TEXTO--> ");
		String texto= teclado.nextLine();
		String pares="";
		String impares="";
		for(int i=0; i<texto.length(); i++) {
			if(i%2==0) {//la i es par??
				pares = pares + texto.charAt(i); //si es par la añadimos a pares
			}else {//si no es par SI O SI es impar
				impares = impares + texto.charAt(i); //pues lo añadimos a impares
			}
		}
		System.out.println(pares);
		System.out.println(impares);
		*/
		
		// ================ejercicio 8=============================
		//		Escribir un programa que reciba una cadena de texto por teclado y la muestre sin
		//		vocales. Por ejemplo, si recibe la cadena “Hola Mundo” debería de devolver “Hl Mnd”.
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE TEXTO--> ");
		String texto = teclado.nextLine();
		String sinVocales = "";
		String minusculas = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = minusculas.charAt(i);
			switch (c) {
			case 'a', 'e', 'i', 'o', 'u': //si es VOCAL no lo añade
				break;
			default://el default es como un else
				//si es todo lo demas (consonantes) lo añade 
				sinVocales = sinVocales + texto.charAt(i);
			}
		}
		System.out.println(sinVocales);
		*/
		// ================ejercicio 9=============================
		//Escribir un programa que nos pida elegir entre cuatro destinos turísticos (Francia,
		//Italia, Chile o Japón) y dependiendo de nuestra respuesta nos diga cual es la capital de
		//nuestro destino (París, Roma, Santiago de Chile o Tokio)
		/*Scanner teclado = new Scanner(System.in);
		String paisElegido= teclado.nextLine();
		
		switch (paisElegido) {
		case "Francia":
			System.out.println("La capital de "+paisElegido+"es Francia");
			break;
			
		case "Italia":
			System.out.println("La capital de "+paisElegido+"es Roma");
			break;
			
		case "Santiago de chile":
			System.out.println("La capital de "+paisElegido+"es Chile");
			break;	
		case "Tokio":
			System.out.println("La capital de "+paisElegido+"es Japon");
			break;
			default:
			System.out.println("error");
		
		}
		*/

		
		
		
		
		// ================ejercicio 10=============================
		//Escribe un programa que valide si un NIF español introducido por teclado es correcto.
		//La longitud exacta de la cadena ha de ser de 9 caractéres. Los ocho primeros han de
		//ser números comprendidos entre el 0 y el 9 y el último una letra que puede estar
		//escrita en mayúsculas o minúsculas
		//ESTE EJERCICIO SE RESOLVERA CUANDO SEPAMOS CAPTURAR EXPECIONES
		/*Scanner teclado = new Scanner(System.in);

		System.out.print("INTRODUCE LOS NUMEROS DE TU DNI --> ");
		int dniNumeros = teclado.nextInt();
		
		System.out.println("INTRODUCE LA LETRA DE TU DNI");
		String dniLetra = teclado.nextLine();
		
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		//for (int i = 0; i < abecedario.length(); i++) {
			if (dniNumeros <= 99999999 && abecedario.indexOf(dniLetra) != -1) {
				System.out.println("ERES ESPAÑOL! DNI CON 9 CARACTERES");
			} else {
				System.out.println("NO ERES ESPAÑOL! ");
			}
			*/
			
		/*Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE tu DNI --> ");
		String dni = teclado.nextLine();
		//System.out.println(dni.substring(0,8));
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < dni.length(); i++) {
			if (dni.length() == 9) {
				System.out.println("BIEN SON 9 CARACTERES");
			} else {
				System.out.println("TIENEN QUE SER 9 CARACTERES EXACTOS");
			}
			if(dni.length()-1<=99999999 &&   ) {
			}
		}
		//int numerosDni=numerosDni + dni.substring(0,9);
		//int numerosDni=(int)(numerosDni + dni.substring(0,9));
		 */
		
		//ELIMINAR ESPACIOS DE AL PRINCIPIO Y LOS DEL FINAL
		String dni=" 23245235B ";
		dni=dni.trim();
		System.out.println(dni);
	}
}




