package exa_1_1;

import java.util.Scanner;

public class practicando_exa_1_1 {

	public static void main(String[] args) {
		
		//···········BOLETIN 1·············
		//···········EJERCICIO 1···········
		//Escribir un programa donde se muestren los 
		//0 primeros números enteros
		/*for(int i=0;i<10;i++)	{
			System.err.print(i+" ");
		}
		
		*/
		//Escribir un programa donde se muestren los 50 primeros números pares
		//···········EJERCICIO 2···········
		//·······SOLUCION A···········

		/*
		for(int i=0;i<50;i++)	{
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
		*/
		//·······SOLUCION B +EFICIENTE···········
		//SI QUEREMOS LOS IMPARES SOLO PONEMOS INICIALIZAMOS LA I A --> 1
		/*
		for(int i=0;i<50;i+=2) { //SUMADOS DOS PARA IMPRIMIR SOLO LOS PARES
			System.out.println(i+" ");
		}
		*/
		
		//···········EJERCICIO 3···········
		//Escribir un programa donde se muestren los 5 primeros 
		//números múltiplos de uno dado por
		//el usuario (se introducirá por teclado)
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce numero");
		int numero=teclado.nextInt();
		for(int i=1;i<5;i++) {//los 5 primeros 
			System.out.println(numero*i); //múltiplos de uno dado
		}
		*/
		//···········EJERCICIO 4···········
		//Escribir un programa donde se muestren todos 
		//los números divisibles por 7 menores a
		//10000
		//·······SOLUCION A···········
		/*for(int i=0;i<1000;i++) {
			if(i%7==0) { //divisibles por 7
				System.out.println(i);
			}
		}*/
		//·······SOLUCION B --> +EFICIENTE···········
		/*
		for(int i=0;i<1000;i+=7) {
				System.out.println(i);
		}
		*/
		//···········EJERCICIO 5···········
		//Escribir un programa que pida por teclado un número 
		//al usuario y diga si es par o impar
		/*Scanner teclado=new Scanner(System.in);
		System.out.println("TU NUMERO ES PAR O IMPAR --> ");
		int numero=teclado.nextInt();
		if(numero%2==0) {
			System.out.println("tu numero es par");
		}else {
			System.out.println("es impar");
		}*/
		
	}
}


