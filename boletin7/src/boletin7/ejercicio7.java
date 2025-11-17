package boletin7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// 7. Pide al usuario un número y crea un array de enteros de tantas posiciones
		// como indique
		// ese número. Rellénalo con números aleatorios entre el 10 y el 1000 y
		// finalmente
		// pregunta al usuario por la posición de la que quiere recuperar el valor. El
		// programa
		// mostrará el número de la posición indicada si esta existe y un error si
		// tratamos de
		// recuperar una posición que no existe (menor a 0 o mayor a la longitud del
		// array

		Scanner teclado = new Scanner(System.in);
		System.out.println("Tamaño del array -->");
		try {// CAPTURAMOS UN NUMERO PARA QUE SOLO META NUMEROS ENTEROS
			int tamaño = teclado.nextInt();
			int[] entero = new int[tamaño];
			for (int i = 0; i < tamaño; i++) {
				int aletorio = (int) (Math.random() * (1000 - 100) + 100);
				entero[i] = aletorio;
			}
			for (int i = 0; i < tamaño; i++) {
				System.out.print(entero[i] + " - ");
			}

			System.out.print("\nQUE POSICION QUIERES CONSULTAR: ");
			int posicion = teclado.nextInt()-1;
			if (posicion > 0 && posicion <= tamaño) {
				System.out.println("En la posicion " + posicion + " esta el numero " + entero[posicion]);
			} else {
				System.out.println("Esa posicion no existe");
			}
		} catch (Exception e) {
			System.out.println("ERROR LO QUE HAS INTRODUCIDO NO ES UN ENTERO");
		} finally {
			teclado.close();
		}

	}
}
