package boletin5;

public class boletin5_arrays {

	public static void main(String[] args) {
		
		// ================ejercicio 1=============================
		//Escribir un programa que genere seis números aleatorios entre 
		//el 1 y el 49 sin que
		//ninguno de ellos esté repetido (simulando una lotería primitiva)
		//6 numeros aleatorios entre 1 y 49
		int numero1=1;
		int numero2=49;

//		int contador=0;

		int[] numeros=new int[6];
		//creo que se tiene que hacer con un WHILE //CORREGIR ESTA MAL creo que es un for y dentro un while
		
		int aleatorio = (int) (Math.random() * (numero2 - numero1 + 1) + numero1);
			for (int i = 0; i < numeros.length; i++) {
			while (numeros[i] == aleatorio) {
				aleatorio = (int) (Math.random() * (numero2 - numero1 + 1) + numero1);
				numeros[i] = aleatorio;
			};
			System.out.println(numeros[i]);
		};
		
		
	}
}
