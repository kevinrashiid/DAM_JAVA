package boletin7;

import java.util.Arrays;

public class b7_5 {
	public static void main(String[] args) {
		// 5. Pide al usuario un número y crea un array de enteros de tantas posiciones
		// como indique ese número. Rellenalo con números aleatorios entre el 10 y el
		// 1000 y
		// finalmente
		// muestra cual es el máximo, cual el mínimo y la media aritmética con dos
		// decimales.
		int numero = 20;
		int[] enteros = new int[numero];

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.random() * (1000 - 10)) + 10;
			System.out.println(enteros[i]);
		}
		
		System.out.println("El mayor es " + mayor(enteros));
		System.out.println("El menor es " + menor(enteros));
		System.out.printf("La media es %.2f", media(enteros));
		// PRINTF SOLO CON DOS DECIMALES
	}
	//TODO FUNCION SACA EL MAYOR DE UN ARRAY
	public static int mayor(int[] enteros) {
		int numeroMayor = 0;
		Arrays.sort(enteros);
		numeroMayor = enteros[enteros.length - 1];
		return numeroMayor;
	}
	//TODO FUNCION QUE SACA EL MENOR DE UN ARRAY
	public static int menor(int[] enteros) {
		int numeroMenor = 0;
		Arrays.sort(enteros);
		numeroMenor = enteros[0];
		return numeroMenor;
	}
	//TODO FUNCION SACA LA MEDIA DE UN ARRAY
	public static double media(int[] enteros) {
		double media = 0;
		for (int x = 0; x < enteros.length; x++) {
			media = media + enteros[x];
		}
		media = media / enteros.length;
		return media;
	}
}
