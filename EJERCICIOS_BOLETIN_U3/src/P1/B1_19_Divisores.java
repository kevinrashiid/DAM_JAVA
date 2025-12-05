package P1;

import java.util.Scanner;

public class B1_19_Divisores {

	public static void main(String[] args) {

		// ===============EJERCICIO 19==============================
		// Escribir un programa que pida un número por teclado y nos muestre sus
		// divisores
		Scanner teclado = new Scanner(System.in);
		System.out.println("DAME UN NUMERO Y TE DIRE SUS DIVISORES");
		int numero = teclado.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println("Los divisores de " + numero + " son: " + i);
			}
		}
	}
}
