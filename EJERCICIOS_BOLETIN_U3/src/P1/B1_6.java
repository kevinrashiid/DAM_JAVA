package P1;

import java.util.Scanner;

public class B1_6 {

	public static void main(String[] args) {
		// ===============EJERCICIO 6==============================
		// Escribir un programa que pida por teclado un número al usuario y diga si es
		// divisible por 3 o no.

		Scanner teclado = new Scanner(System.in);
		System.out.print("TU NUMERO ES DIVISIBLE POR 3?: ");
		int num = teclado.nextInt();
		if (num % 3 == 0) {
			System.out.print("Tu numero es divisible por 3");
		} else {
			System.out.println("tu numero no es divisible de 3");
		}

	}

}
