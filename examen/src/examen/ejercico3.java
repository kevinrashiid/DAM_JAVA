package examen;

import java.util.Scanner;

public class ejercico3 {

	public static void main(String[] args) {
		int inicio =1;
		int fin=50;
		int[] numerosAletorios=new int[10];
		System.out.print("generando array: ");
		for(int i=0;i< numerosAletorios.length;i++) {
			int aletorio=(int)(Math.random()*(fin-inicio+1)+inicio);
			numerosAletorios[i]=aletorio;
			System.out.print(numerosAletorios[i]+",");
		}
		System.out.println();
		Scanner teclado=new Scanner(System.in);
		System.out.print("introduce un numero entre el 1 y el 50: ");
		int numeroInput=teclado.nextInt();
		int contador=0;
		boolean bandera=false;
		do {
			if(numeroInput>1&&numeroInput<50) {
				bandera=true;
			}else {
				System.out.println("tiene que ser entre 1 y 50 ");
				numeroInput=teclado.nextInt();
				bandera=false;
			}
		}while(bandera==false);
		if (bandera == true) {
			for (int x = 0; x < numerosAletorios.length; x++) {
				if (numerosAletorios[x] > numeroInput) {
					contador++;
				}
			}
			System.out.println("En el array aparecen " + contador + " numeros mayores que el " + numeroInput);
		}
		
		
		
		
	}
}
