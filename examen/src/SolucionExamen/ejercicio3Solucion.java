package SolucionExamen;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3Solucion {

	public static void main(String[] args) {
		int vector[]= new int[10];
		System.out.println("Generando array: ");
		for(int i=0;i<10;i++) {
			vector[i]=(int)(Math.random()*50)+1;
		}
		//TODO quitamos las comillas
		String texto=Arrays.toString(vector);
		texto=texto.replace("[", "");//sin comillas
		texto=texto.replace("]", "");
		
		System.out.println(texto);
		
		Scanner teclado=new Scanner(System.in);
		
		//TODO mientras que sean fuera del rango (1-50)
		//sigue pidiendo
		int numero;
		do {
			System.out.println("introduce un numero entre el 1 y el 50: ");
			numero=teclado.nextInt();
		}while(numero<1||numero>50);
		
		//TODO recorre el array y cuentan los numeros mayores
		int contador=0;
		for(int elemento:vector) {
			if(elemento>numero) {
				contador++;
			}
		}
		System.out.println("En el array aparecen "+contador+" numeros mayores que el "+numero);
	}
}

