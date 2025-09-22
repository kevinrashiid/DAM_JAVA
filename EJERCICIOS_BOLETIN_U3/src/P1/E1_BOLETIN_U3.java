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



		//		/*===============EJERCICIO 4==============================*/
		/*Escribir un programa donde se muestren todos los números divisibles por 7 menores a	
		 * 10000*/
		//		for (int i=0; i < 1000; i++) {
		//			if(i%7==0) {
		//				System.out.println(i);
		//			}
		//		}



		//		/*===============EJERCICIO 5==============================*/
		/*Escribir un programa que pida por teclado un número al usuario y diga si es par o impar*/
		//		Scanner parImpar = new Scanner(System.in);
		//		System.out.print("Pasa un numero y te dire es PAR O IMPAR: ");
		//		int num;
		//		num = parImpar.nextInt();
		//		if (num%2==0) { 
		//			System.out.println("Tu numero " + num + " es par"); //PREGUNTA??? en este print en ves de meter la variable num meti el objeto parImpar por que da ese error
		//		}
		//		else {
		//			System.out.println("No es par :(");
		//		}



		//		/*===============EJERCICIO 6==============================*/
		/*Escribir un programa que pida por teclado un número al usuario y diga si es divisible por 3 o no.*/
		//		Scanner teclado = new Scanner(System.in);
		//		System.out.print("TU NUMERO ES DIVISIBLE POR 3?: ");
		//		int num = teclado.nextInt();
		//		if (num%3==0) {
		//			System.out.print("Tu numero es divisible por 3");
		//		}
		//		else {
		//			System.out.println("tu numero no es divisible de 3");
		//		}



		//		/*===============EJERCICIO 7==============================*/
		/*Escribir un programa que pida un número por teclado al usuario que simule ser el precio de
		 * un artículo y escriba el resultado de aplicarle el IVA del 21%*/



	}
}











