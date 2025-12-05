package P1;

import java.util.Scanner;

public class B1_15 {

	public static void main(String[] args) {

		//===============EJERCICIO 15==============================
		//Modificar el programa del punto anterior para que si el primer número que metemos es
		//mayor que el segundo funcione correctamente. Es decir, si metemos en primer lugar el 50 y
		//en segundo el 10 nos debería de generar un número aleatorio entre el 10 y el 50 (y no entre el
		//50 y el 10 que no tiene mucha lógica…)
		Scanner entrada=new Scanner(System.in);
		System.out.print("Primer numero --> ");
		int numero1=entrada.nextInt();
		System.out.print("Segundo numero --> ");
		int numero2=entrada.nextInt();
		while (numero1<numero2) {
			System.err.print("EL PRIMER NUMERO ES MENOR, VUELVE A INTRODUCIRLO -->");
			numero1=entrada.nextInt();
		}
		//siempre el mas grande - el mas pequeño +1 y le sumas el mas pequeño
		int aleatorio=(int)(Math.random()*(numero2-numero1+1)+numero1); //generacion de un numero entre dos numeros 
		System.out.println("EL NUMERO ALETARIO ENTRE " + numero1 + " y " + numero2 + " ES "+ aleatorio);
	}
}
