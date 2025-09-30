package boletin2;

import java.util.Scanner;

public class ejercicios_Boletin2 {

	public static void main(String[] args) {
		//================ejercicio 1=============================
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos las
		//muestre en pantalla ordenadas alfabeticamente en orden ascendente
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Primera palabra --->");
		String letra1=teclado.nextLine();
		
		System.out.println("Segunda palabra --->");
		String letra2=teclado.nextLine();
		
		System.out.println("Tercera palabra --->");
		String letra3=teclado.nextLine();
		
//		String primera=letra1.compareTo(letra2);
		
		if (letra1.compareTo(letra2)==0) {
			System.out.println("son iguales");
		}else if(letra1.compareTo(letra2)>0)
			System.out.println(letra1+"va detras de"+letra2);
		else if(letra2.compareTo(letra3)>0) {
			System.out.println(letra2 +" va detras de "+ letra3);
		}
		else
			System.out.println("error");
	
		
		
		
		
		
		
		
	}
}
















