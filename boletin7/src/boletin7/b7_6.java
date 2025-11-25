package boletin7;

import java.util.Arrays;

public class b7_6 {

	public static void main(String[] args) {

		// 6. Modifica el ejercicio anterior para que, nos muestre en que posición del
		// array se encuentran el máximo y el mínimo.
		//Si están repetidos y aparecen en mas de una
		// posición debería de indicarlas todas
		int numero = 20;
		int[] enteros = new int[numero];

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.random() * (1000 - 10)) + 10;
		}
		Arrays.sort(enteros);
		for(int i:enteros) {
			System.out.println(i);
		}
		int numeroMayor = 0;
		int numeroMenor = 0;
		double media = 0;
		System.out.println("El mayor es " + mayor(enteros));
		System.out.println("La posicion del mayor "+posicionMayor(enteros));
		System.out.println("El menor es " + menor(enteros));
		System.out.println("EL posicion del menor es "+ posicionMenor(enteros));
		System.out.printf("La media es %.2f", media(enteros));
		// PRINTF SOLO CON DOS DECIMALES
	}
					/*~~~~FUNCIONES~~~~~*/
	//TODO FUNCION SACA EL MAYOR DE UN ARRAY
		public static int mayor(int[] enteros) {
			int numeroMayor = 0;
			numeroMayor = enteros[enteros.length - 1];
			return numeroMayor;
		}
		//TODO FUNCION QUE SACA EL MENOR DE UN ARRAY
		public static int menor(int[] enteros) {
			int numeroMenor = 0;
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
		public static int posicionMayor(int[] enteros) {
			int posicion=0;
			for(int x = 0; x < enteros.length; x++) {
				if(mayor(enteros)==enteros[x]) {
					posicion=x+1;
				}
			}			
			return posicion;
		}
		public static int posicionMenor(int[] enteros) {
			int posicion=0;
			for(int x = 0; x < enteros.length; x++) {
				if(menor(enteros)==enteros[x]) {
					posicion=x+1;
				}
			}			
			return posicion;
		}
}
