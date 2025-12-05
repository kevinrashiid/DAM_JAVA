package P1;

import java.util.Scanner;


public class B1 {

	public static void main(String[] args) {

		//================ejercicio 1=============================
		//Escribir un programa donde se muestren los 10 primeros números enteros
		 /*int entero;
		 for (int i =0; i<10;i++) {
		 System.err.println(i);
		 }

		 */	
		
		//===============EJERCICIO 21==============================
		//Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no
		//numero primo es SOLo divisible entre 1 y el mismo numero y ningun otro
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt(); // leemos el número del usuario
		teclado.close();
		boolean esPrimo = true; // bandera que indica si el número es primo o no
		// Los números menores o iguales a 1 no son primos
		if (num <= 1) {
			esPrimo = false;
		} else {
			// Recorremos desde 2 hasta la raíz cuadrada del número
			// Si encontramos un divisor, ya no es primo
			for (int i = 2; i <= Math.sqrt(num) && esPrimo; i++) {
				if (num % i == 0) { // si el resto es 0, significa que es divisible
					esPrimo = false; // marcamos que no es primo
				}
			}
		}
		// Mostramos el resultado final
		if (esPrimo) {
			System.out.println(num + " es primo");
		} else {
			System.out.println(num + " no es primo");
		}
		
		
		
		//===============EJERCICIO 22==============================
		//Escribir un programa que genere un número primo aleatorio entre el 10.000.000 y el
		//50.000.000
		/*
		 boolean esPrimo; //variable como bandera
		int azar;
		//este algoritmo es el peor codigo que podemos hacer pero funciona
		do {
			azar =(int) (Math.random()*(400000000+1))+100000000; //generar numero aleatorio
			int raiz=(int)Math.sqrt(azar)+1; 
			esPrimo=true; // estamos dando vuelta 
			System.out.println("Probando el numero "+ azar+ "...");
		//empezamos por 3 por que por 0 no se puede dividir y por 1 tampoco
		//por que es primo y el 2 es el unico primo
			if (azar%2==0)
				esPrimo=false;//con esto me aseguro que el numero generado sea IMPAR
			//divisor<azar && esPrimo==true dos condiciones que se tienen que cumplir
			//con el += son saltamos los pares
			for(int divisor=3; divisor<raiz && esPrimo==true; divisor+=2) {
				if (azar%divisor==0) {
					esPrimo=false;	
				}
			}
		}while(esPrimo == false);
		System.out.println("El numero " + azar + " es primo" );
		*/
		
		//===============EJERCICIO 25==============================
		//Escribir un programa que reciba por teclado un número y muestre sucesivamente el
		//resultado de ir dividiéndolo por dos sucesivamente hasta llegar a un número igual o menor a
		//1. Caso de ser necesario los resultados se mostrarán con dos decimales. Un ejemplo de una
		//ejecución correcta después de introducir el número 34 ser´ía esta:
		//Haz introducido el número 34
		//17
		//8.5
		//4.25
		//2.12
		//1.06
		//0.53
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO Y LO DIVIDIRE ENTRE 2 HASTA QUE SEA MENOR QUE 1");
		System.out.print("INTRODUCE EL NUMERO--> ");
		double numero= teclado.nextInt();
		teclado.close();
		//EN ESTE BUCLE SE CUMPLE ESTO
		//si el numero dado es MAYOR que 1 SIGUE DENTRO
		//O si el resultado de la division entre 2 que se añade a numero
		//es menor que 1 sigue y lo imprime con dos decimales
		while(numero>1) {
			numero=numero/2;//divide el numero dado entre 2 y lo añade a numero
			numero=Math.floor(numero*100.0)/100.0; //PARA que tenga solo dos decimales y no los eleve
			System.out.println(numero);
		}
		*/
	}
}



