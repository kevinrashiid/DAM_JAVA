package P1;

import java.util.Scanner;

public class E1_BOLETIN_U3 {

	public static void main(String[] args) {
		//		/*===============ejercicio 1==================================*/

		/*1.-Escribir un programa donde se muestren 
		 *los 10 primeros números enteros*/
		//		int entero;
		//		for (int i =0; i<10;i++) {
		//			System.err.println(i);
		//		}
		//		
		//		/*===============EJERCICIO 2==============================*/
		//		/*2.- Escribir un programa donde se muestren los 50 primeros números pares*/
		//		//SOLUCION 1:
		//		int par;
		//		for (int i=0;i<50;i+=2) {
		//			System.out.println(i);
		//		}
		//SOLUCION 2: es mucho mejor la primera ya que aqui depende si pones el syso debajo del contador
		//		//salen los impares
		//		int par2;
		//		for(int i=0;i<50;i++) {
		//			if(i%2==0) {
		//				System.out.println(i);
		//				i++;
		//			}
		//		/*===============EJERCICIO 3==============================*/
		
		
		/*Escribir un programa donde se muestren los 5 primeros números múltiplos de uno dado por
		el usuario (se introducirá por teclado)*/
		//ESTA ES MI SOLUCION PERO LO ENTENDI MAL
//		Scanner multiplo= new Scanner(System.in);
//		int num;
//		for(int i=0; i<5; i++) {
//			System.out.println("TE DIRE SI ES MULTIPLO DE UNO: ");
//			num = multiplo.nextInt();
//			if (num%1==0) {
//				System.out.println(num + " Es multiplo de UNO");
//			}
//			else {
//				System.out.println(num + " No es multiplo de UNO");
//			}
//			multiplo.close();
//		}
//		/*SOLUCION*/
//		Scanner multiplo = new Scanner(System.in);
//		int numero;
//		System.out.println("Introduce un numero ");
//		numero = multiplo.nextInt();
//		for (int i =1;i<5;i++) {
//			System.out.println(numero * i);
//		}
		
		
	}
}






