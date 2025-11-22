package boletin;

import java.util.Scanner;

public class b8_1 {

	public static void main(String[] args) {

		// Una matriz transpuesta es aquella en la que se intercambian filas por
		// columnas. A
		// continuación tienes dos ejemplos de una matriz y su transpuesta:
		//
		// Realiza un programa que dada una matriz almacenada en un array te calcule su
		// transpuesta
		// y la almacene en otro diferente. Tu programa debería, ademas, dibujar en
		// consola las
		// matrices de la siguiente forma:
		// | 1 2 |
		// | 3 4 |
		// | 1 3 |
		// | 2 4 |
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insertar filas: ");
		int filas = teclado.nextInt();
		System.out.println("Insertar columnas: ");
		int columnas = teclado.nextInt();
		int[][] mapa = new int[filas][columnas];
		int[][] mapa2 = new int[columnas][filas];

		int total = (int) (Math.random() * 9) + 1;
		int contador = 0;

		//PRIMERA MATRIZ
		for (int i = 0; i < filas; i++) {
			System.out.print("|");
			for (int x = 0; x < columnas; x++) {
//						mapa[i][x]=contador++;
				int v = azarNumero(columnas, filas);
				mapa[i][x] = v;
				System.out.print(" " + mapa[i][x] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println(); //ESPACIO ENTRE MATRICES
		
		//MATRIZ TRANSPUESTA
		for (int c = 0; c < columnas; c++) {
			System.out.print("|");

			for (int f = 0; f < filas; f++) {
				int v = azarNumero(columnas, filas);
				mapa2[c][f] = mapa[f][c];
				System.out.print(" " + mapa2[c][f] + " ");
			}
			System.out.print("|");

			System.out.println();
		}
	}

	// TODO FUNCION QUE GENERA NUMEROS ALETORIOS TANTAS VECES COMO CELDAS TENGA EL
	// MAPA
	public static int azarNumero(int columnas, int filas) {
		int maxCeldas = columnas * filas;
		int total = 0;
		for (int i = 0; i < maxCeldas; i++) {
			total = (int) (Math.random() * 9) + 1;
		}
		return total;
	}
}
