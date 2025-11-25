package practicandoExamenPrimerTri;

import java.util.Scanner;

public class exa_2_combioMonedas {

	public static void main(String[] args) {
		
		//TODO ME QUEDA HACER EL BUCLE
		
		Scanner teclado=new Scanner(System.in);
		int[] arrayEnteros=new int[10];
		
		System.out.println("INTRODUCE UN NUMERO");
		int numero=teclado.nextInt();
		
//		int azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
		int mayores=0;

		for(int i=0;i<arrayEnteros.length;i++) {
			int aletorio=(int)(Math.random()*(50-1+1)+1);
			arrayEnteros[i]=aletorio;
			if(arrayEnteros[i]>numero) {
				mayores++;
			}
		}
		for(int i:arrayEnteros) {
			System.out.println(i);
		}
		System.out.println("En el array aparecen "+mayores+" numeros mayores que el "+numero);
	}
}

//for(int i:arrayEnteros) {
//	System.out.println(i);
//}