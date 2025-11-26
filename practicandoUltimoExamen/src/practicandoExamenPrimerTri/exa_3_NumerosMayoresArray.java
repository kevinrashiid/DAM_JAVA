package practicandoExamenPrimerTri;

import java.util.Scanner;

public class exa_3_NumerosMayoresArray {

	public static void main(String[] args) {
		
		//TODO ME QUEDA HACER EL BUCLE
		boolean bandera=false;
		int numero=0;	
		do {
		try {
			Scanner teclado=new Scanner(System.in);
			int[] arrayEnteros=new int[10];
			//
			boolean aceptado=false;
			while(aceptado==false) {
				System.out.println("INTRODUCE UN NUMERO ENTRE 1 Y 50");
				numero=teclado.nextInt();
				if(numero>=1&&numero<=50) {
					aceptado=true;
				}else {
					System.err.println("tiene que estar en el rango");
				}
			}
//			int azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
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
			bandera=true;
			
		} catch (Exception e) {
			System.out.println("NO ADMITIDO");
		}
		}while(bandera==false);
		
	}
}

//for(int i:arrayEnteros) {
//	System.out.println(i);
//}