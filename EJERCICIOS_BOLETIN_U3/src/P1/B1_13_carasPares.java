package P1;

import java.util.Scanner;

public class B1_13_carasPares {

	public static void main(String[] args) {
		// ===============EJERCICIO 13==============================
		// Modifica el programa anterior para que no admita dados con un número de caras
		// impares
		// (¡no existen!). En el caso de meter un número impar de caras el programa
		// debería de
		// informarnos de que es erróneo y volver a preguntarnos por este dato.
		Scanner teclado = new Scanner(System.in);
		System.out.println("NUMERO DE DADOS: ");
		int dados = teclado.nextInt();
		System.out.print("INTRODUCE LAS CARAS DEL DADO PUENDEN SER 4 - 6 - 8 - 12 ---> ");
		int caras = teclado.nextInt();
		int contador = 0;
		while (caras % 2 != 0) {
			System.out.println("no existe dados con caras impares");
			System.out.print("INTRODUCE OTRA VEZ LA CARA: ---> ");
			caras = teclado.nextInt();
		}
		int total = 0;
		for (int i = 0; i < dados; i++) {
			contador++;
			int tirada = (int) (Math.random() * caras) + 1;
			System.out.println("DADO: " + contador + " --> " + tirada);
			total += tirada;
		}
		System.out.println("TOTAL --> " + total);
	}
}
