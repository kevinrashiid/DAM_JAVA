package boletin2;

import java.util.Scanner;

public class ejercicios_Boletin2 {

	public static void main(String[] args) {
		
		//RECOMENDABLE HACER LOS PROGRAMAS DE POCO A POCO
		
		//================ejercicio 1 SIN ACABAR=============================
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos las
		//muestre en pantalla ordenadas alfabeticamente en orden ascendente
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Primera palabra --->");
		String letra1=teclado.nextLine();
		
		System.out.println("Segunda palabra --->");
		String letra2=teclado.nextLine();
		
		System.out.println("Tercera palabra --->");
		String letra3=teclado.nextLine();
		
		if(letra1.compareTo(letra2)==0) {
			System.out.println(letra1 +" son iguales "+ letra2);
		}else if(letra1.compareTo(letra2)==1){
			System.out.println(letra1 +" "+ letra2);
		}
		
//		String primera=letra1.compareTo(letra2);
	
		
		
		
		//================ejercicio 9=============================
		//Escribir un programa que pida números entre el 1 y el 100 por teclado hasta que
		//escribamos la palabra FIN (con mayúsculas). Si el usuario introduce una entrada
		//inválida (números superiores a 100, otras cadenas de caracteres que no sean FIN, etc.)
		//no se tendrá en cuenta pero se mostrará un mensaje de error y el programa seguirá
		//su curso. Cuando terminamos (al introducir la palabra FIN, recuerda) mostraremos
		/*
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		int contador = 0;
		do {
			System.out.println("INTRODUCE UN NUMERO ENTRE EL 0 Y EL 100 o FIN: ");
			entrada = teclado.nextLine();// recogemos por teclado y lo guardamos en entrada
			entrada = entrada.toLowerCase(); // para que cambie a minusculas por is meten mayusculas
			if (!entrada.equals("fin")) {
				int numero = Integer.parseInt(entrada);// convierto entrada en numero
				if (numero >= 1 && numero <= 100) { // si entre 1 y 100
					contador++; //para contar cuantos numeros entre 1 y 100 estamos metiendo
				}
			}
		} while (!entrada.equals("fin")); // si entrada es distinto a sigue en el bucle
		System.out.println("Has metido "+contador+" numeros entre 1 y el 100");
		*/
		//================ejercicio 12=============================
		//Realiza un juego en el que debes de acertar un número entre el 1 y el 50 que el
		//ordenador ha elegido de forma aleatoria. El programa te dejará tantos intentos como
		//necesites y te indicará si has acertado, si te has pasado o si te has quedado corto. El
		//programa finaliza cuando se acierta o cuando se superan el número máximo de intentos
		//establecidos en 5
		//GENERAR NUMERO ALETORIO entre 1 y 50
		/*int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		
		//System.out.println(azar); comentamos esto para que no nos el numero
		for(int intentos=1;intentos<6 && acertado==false;intentos++) {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
		}
		//si acabamos con los aciertos sale del bucle y entra aqui 
		if(acertado==false) {
			System.out.println("LO SIENTO HAS TERMINADO CON LOS INTENTOS EL NUMERO ERA "+azar);
		}
		*/
		//================ejercicio 13=============================
		//Modifica el programa anterior para que el programa te de todos los intentos que
		//necesites pero que cuando aciertes te informe de cuantas veces has fallado antes de
		//lograrlo
		//LO HACEMOS CON UN DO WHILE POR QUE AL MENOS TIENE QUE PREGUNTAR UNA VEZ
		/*int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		int intentos=1;
		//System.out.println(azar); comentamos esto para que no nos el numero
		do {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			intentos++;//contador
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
		}while(acertado==false);
		*/
		//esta linea EN AHORA EN EL 13 no tiene sentido por que ya no va salir hasta que se acierte
		//if(acertado==false) {
		//System.out.println("LO SIENTO HAS TERMINADO CON LOS INTENTOS EL NUMERO ERA "+azar);
		//}
		
	/*	int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		boolean acertado= false;
		for(int intentos=1; acertado==false;intentos++) { //esto seria para el profe un FOR de forma elegante
		System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
		int eleccion=teclado.nextInt();
		intentos++;//contador
		if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
			System.out.println("ACERTASTE!!");
			acertado=true;//
		}else if(eleccion> azar) {
			System.out.println("uhhh te  has pasado");
		}else {
			System.out.println("casi, te has quedado corto");
		}
		}
		*/
		
		/*
		int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		boolean replay=false;
		int intentos=1;
		System.out.println(azar); //comentamos esto para que no nos el numero
		do {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			intentos++;//contador
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
			*/
		//================ejercicio 16=============================
		//Escribe un programa que pida por teclado el radio de una circunferencia, admitiendo
		//valores con decimales y calcule la longitud y el área de la circunferencia (redondeando
		//a cinco decimales). Si no las recuerdas, las fórmulas son las siguientes:
		//area = 3.14159 * radio2
		//longitud = 2 * 3.14159 * radio
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un radio de tu circunferencia-->");
		double radio= teclado.nextDouble();
		double area= 2*3.14159*radio;
		double longitud= 3.14159* radio * radio;
		System.out.println("Longitud del cirulo --> ");
		System.out.println("Area del circulo --> ");
		
		//PARA CONSEGUIR CINCO CIFRAS DECIMALES
		//1.- multiplicamos por 1 seguido de cinco ceros
		longitud=longitud*100000;
		area=area*100000;
		*/
		//2.-Convertimos a entero
		
	}	
}























