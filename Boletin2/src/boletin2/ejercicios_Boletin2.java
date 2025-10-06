package boletin2;

import java.util.Scanner;

public class ejercicios_Boletin2 {

	public static void main(String[] args) {
		
		//RECOMENDABLE HACER LOS PROGRAMAS DE POCO A POCO
		
		//================ejercicio 1 SIN ACABAR=============================
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos las
		//muestre en pantalla ordenadas alfabeticamente en orden ascendente
		/*Scanner teclado= new Scanner(System.in);
		
		System.out.println("Primera palabra --->");
		String letra1=teclado.nextLine();
		
		System.out.println("Segunda palabra --->");
		String letra2=teclado.nextLine();
		
		System.out.println("Tercera palabra --->");
		String letra3=teclado.nextLine();
		
		//String primera=letra1.compareTo(letra2);
		String primera="";
		String segunda="";
		String tercera="";
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
		}*/
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
			/* REVISAR Y CORREGIR
			String condicion="";
			String si="si";
			String no="no";
			
			if (acertado == true) {
				System.out.println("quieres volver a jugar?? Si o No");
				condicion=teclado.next();
				if (condicion.equalsIgnoreCase(si)) {
					replay = false;
				} else {
					replay = true;
				}
			}*/
			
		}while(acertado==false && replay==false);
		
		
		
		
		
		
		
		
		
		
		
	}	
}























