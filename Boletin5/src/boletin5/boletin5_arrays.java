package boletin5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class boletin5_arrays {

	public static void main(String[] args) {

		// ================ejercicio 1=============================
		// Escribir un programa que genere seis números aleatorios entre
		// el 1 y el 49 sin que
		// ninguno de ellos esté repetido (simulando una lotería primitiva)
		// 6 numeros aleatorios entre 1 y 49
		// para el numero aleatorio
		/*
		int numero1 = 1;
		int numero2 = 49;

		int[] loteria = new int[6];
		int aleatorio = 0;
		// boolean banderas
		boolean repetido = false;
		for (int i = 0; i < loteria.length; i++) {
			do {
				aleatorio = (int) (Math.random() * (numero2 - numero1 + 1) + numero1);
				repetido=false;
				// Comprobar si el número ya existe en las posiciones anteriores
				for (int x = 0; x < i; x++) {
					if(loteria[x]==aleatorio) {
						repetido=true;
					}
				}
			} while (repetido==true);// repetir mientras el número ya exista
			loteria[i]=aleatorio;
			System.out.println(loteria[i]);
		}
		*/
		
		// ================ejercicio 2=============================
		//Hacer un programa en que nos permita calcular todos los divisores comunes a dos
		//números 
		//CREO QUE ESTO SE TIENE QUE HACER CON VECTORES
		
	
		// ================ejercicio 3====================================================
		//Escribir un programa que cuenta las palabras que tiene una frase introducida
		//previamente por teclado. Las palabras pueden estar separadas por más de un espacio
		//pero siempre debe de haber al menos uno. No tenemos en cuenta los signos de
		//puntuación como separadores.
		// SIN ACABAR
		Scanner teclado=new Scanner(System.in);
		System.out.println("FRASE --> ");
		String frase=teclado.nextLine(); //para pedir la frase
		String[] palabras=new String[10]; //para añadir las palabras y contarlas
		teclado.close();
		char espacio=' ';
		String c="";
		String entera="";
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)!=espacio) {
				c=String.valueOf(frase.charAt(i));
				palabras[i]=c.charAt(i)+entera;
			}
		}
		System.out.println(entera);
//		System.out.println(Arrays.toString(palabras));
		
		
		
		
		
		
		
		// ================ejercicio 4====================================================
		//Escribir un programa que nos pida una cadena por teclado y luego cuente cuantas
		//palabras hay en ella con cuatro o más vocales diferentes. Por ejemplo, si introducimos
		//la frase “Crisis constitucional por culpa del murcielago guineoecuatorial” Nos debería
		//de decir que 3. Tendrías que tener en cuenta que las vocales pueden ir en mayúsculas
		//o no y son la misma letra. Presupón que ninguna vocal va acentuada de ninguna
		//forma
		
		
		// ================ejercicio 5====================================================
		//Escribe un programa que genere 100 números aleatorios comprendidos entre el 1 y
		//50 (ambos inclusive) y, posteriormente, obtenga el mayor, el menor y el que mas veces
		//se repite (y nos diga cuantas veces lo hace).
		/*
		int inicio=1;
		int fin=50;
		int[] numeros=new int[100]; //array de 50 numeros
		int max=0;
		int menor=0;
		for (int i = 0; i <=99; i++) { //para repetir 50 veces
			int aleatorio = (int) (Math.random() * (fin - inicio + 1) + inicio); // 50 numeros random entre 1 y 50
			max=aleatorio;
			menor=aleatorio;
			numeros[i]=aleatorio; //lo añadimos
			System.out.println(numeros[i]);
			for(int x=0;x<numeros.length;x++) { //comprobar cual es mayor dentro del array
				if(numeros[x]>max) {
					max=numeros[x];
				}
				if(numeros[x]<menor) { 
					menor=numeros[x];
				}
			}
		}
		System.out.println("el mayor es "+max);
		System.out.println("el menor es "+menor);
		*/
		// ================ejercicio 6====================================================
		//Escribe un programa que nos permita contar el número de veces que se repite cada
		//cifra en un número. Por ejemplo, el número 885210003 tiene tres 0, un 1, un 2, un 5 y
		//dos 8.
		

	}
}
