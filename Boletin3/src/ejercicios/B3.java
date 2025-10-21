package ejercicios;

import java.util.Scanner;


public class B3 {

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
		
		//================ejercicio 1=============================
		/*
		boolean salir=false;
		Scanner teclado = new Scanner(System.in);
		while(salir==false) {
			System.out.println("escribe tu contraseña");
			 String contra1=teclado.nextLine();
			 System.out.println("escribe tu contraseña");
			 String contra2=teclado.nextLine();
			 
			// SI DA 0 --> SON IGUALES
			// SI DA POSITIVO --> la primera es mayor alfabeticamente que la segunda
			//SI DA NEGATIVO --> LA PRIMERA es menor que la segunda
			 if(contra1.compareTo(contra2)==0) {
				 System.out.println("son iguales");
				 salir=true;
			 }
			 else {
				 System.out.println("Las contraseñas no coinciden");
			 }
		}
		*/
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
		
		//SOLUCION DEL PROFE PARA COGER SOLTURA CON LOS BUCLES
		Scanner teclado= new Scanner(System.in);
		
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
		for(int i=texto.length()-1; i>=0; i--) {// RECORRIENDO AL REVES
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
		
		// ================ejercicio 7=============================
		//Escribir un programa que pida por teclado una cadena de texto y la escriba con el
		//alfabeto típico de los hackers sustituyendo 
		//las letras a por el número 4, 
		//las letras e por el número 3, 
		//las letras i por el número 1
		//las letras o por el número 0. 
		//Considera que las vocales pueden estar escritas en mayúsculas o minúsculas, 
		//pero NO hace falta que tengas en cuenta que además podrían ir acentuadas
		// ================MI SOLUCION --> ESTA BIEN=============================
		/*Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE TEXTO Y TE LO PONDRE CON ALFABETO HACKER --> ");
		String texto = teclado.nextLine();
		teclado.close();
		// lo transformamos a minusculas para que sea mas facil la comparacion en el case del switch
		texto=texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			switch (texto.charAt(i)) {
			case 'a'://reemplazamos el contenido de la i por un 4 por que encontro que es la i en esa vuelta es (a) 
				texto = texto.replace(texto.charAt(i), '4'); 
				break;
			case 'e':// SI LA i ES e LA REEMPLAZA POR 3
				texto = texto.replace(texto.charAt(i), '3');
				break;
			case 'i':
				texto = texto.replace(texto.charAt(i), '1');
				break;
			case 'o':
				texto = texto.replace(texto.charAt(i), '0');
				break;
			}
		}
		System.out.println(texto);
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
		/*
		Scanner teclado = new Scanner(System.in);

		System.out.print("INTRODUCE LOS NUMEROS DE TU DNI --> ");
		String dni = teclado.nextLine();
		//[0-9]que los primeros 8 caracteres sean entre 0 y 9
		//{8}repeticiones numeros
		//[A-Z a-z] la letra que sea entre A y Z minusculas y mayusculas
		if (dni.length() == 9) {
			if (dni.matches("[0-9]{8}[A-Z a-z]") == true) {
				System.out.println("dni CORRECTO");
			}
		}else {
			System.out.println("algo en tu DNI falla");
		}
		*/
		
		// ================EJERCICIO 12=============================
		//Las matrículas españolas constan de un número de cuatro dígitos y tres letras
		//cualesquiera en mayúsculas a excepción de las vocales, la Ñ y la Q. Escribe un
		//programa que detecte si una matrícula introducida por teclado es válida o no
		//TENEMOS QUE DECIR SI TIENE VOCALES 
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE TU MATRICULA --> ");
		String matricula = teclado.nextLine();
		//&&[^AEIOUQ] ESTO ES PARA QUE LA MATRICULA NO PUEDA TENER VOCALES
		if(matricula.matches("[0-9]{4}\\s[A-Z a-z&&[^AEIOUQ]]{3}")) {// (\\s) ESPACIO EN BLANCO
			System.out.println("MATRICULA CORRECTA");
		}else{
			System.out.println("MATRICULA INCORRECTA");
		}
		*/
		
		// ================EJERCICIO 13=============================
		//Modifica el programa anterior contemplando que entre los números y las letras
		//podría haber un espacio en blanco (uno solo) o un guión. En ambos casos se
		//considerará también que la matrícula es válida (si cumple todo lo demás, claro)
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE TU MATRICULA --> ");
		String matricula = teclado.nextLine();
		// [-||\\s] QUE PUEDA SER EL QUINTO CARACTER GUION O ESPACIO
		if(matricula.matches("[0-9]{4}[-||\\s][A-Z a-z&&[^AEIOUQ]]{3}")) {
			System.out.println("MATRICULA CORRECTA");
		}else{
			System.out.println("MATRICULA INCORRECTA");
		}
		*/
		
		// ================EJERCICIO 14=============================
		//Modifica el programa que validaba si un NIF era correcto comprobando si la letra que
		//incorpora lo es. La forma de hacerlo es la siguiente --> leer boletin 3:
		//PREGUNTAR SOBRE LA TABLA DEL BOLETIN
		// A QUE SE REFIERE CON ESA TABLA
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("INTRODUCE LOS NUMEROS DE TU DNI --> ");
		String dni = teclado.nextLine();
		//[0-9]que los primeros 8 caracteres sean entre 0 y 9
		//{8}repeticiones numeros
		//[A-Z a-z] la letra que sea entre A y Z minusculas y mayusculas
		
		if (dni.length() == 9) {
			if (dni.matches("[0-9]{8}[A-Z a-z]") == true) {
				System.out.println("DNI CORRECTO");
			}
		}else {
			System.out.println("algo en tu DNI falla");
		}
		
		// ================EJERCICIO 15=============================
		//Escribe un programa que reciba por teclado una fecha en el formato DD/MM/YYYY. 
		//El programa debe de comprobar si la fecha es correcta teniendo en cuenta:
		//Qué el formato sea el correcto
		//Que la fecha sea totalmente válida
		
		//teniendo en cuenta incluso los años que son bisiestos 
		//(aquellos que son divisibles entre cuatro).
		
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE FECHA FORMATO DD/MM/YYYY --> ");
		String fecha = teclado.nextLine();
		boolean bandera=true; //BANDERA
		//patron "[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}"
		if(fecha.matches("[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}")){
			System.out.println("FECHA CORRECTA!!");
		}else {
			bandera=false; //BANDERA
			System.out.println("FECHA INCORRECTA");
		}
		// MI SOLUCION PARA LA HACER LA COMPROBACIONES SERIA CORTANDO EL STRING
		//PASARLO A INT Y COMPARAR CADA PARTE
		
		//==TODO== COMPROBACION DE AÑO BISIESTO
		int añoBisiesto=0;
		String año=fecha.substring(6,fecha.length());
		añoBisiesto=Integer.parseInt(año);
		
		if(añoBisiesto%4==0 && bandera==true) {
			System.out.println("Año bisiesto");
		}else {
			System.out.println("Año no bisiesto");
		}
		*/
				
	}
}





