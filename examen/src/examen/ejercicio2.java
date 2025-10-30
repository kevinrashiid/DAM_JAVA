package examen;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		//EJERCICO 2
		double cubanos=27.93;
		double rupias=102.81;
		double francosSuizos=0.93;
		double cantidadEuros=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad: ");
		cantidadEuros=teclado.nextInt();
		
		double cambioCubanos=cantidadEuros*27.93;
		double cambioRupias=cantidadEuros*102.81;
		double cambioFrancosSuizos=cantidadEuros*0.93;
		System.out.println(cantidadEuros+"euros equivalen a "+cambioCubanos*cantidadEuros+cantidadEuros*rupias+" rupias o "+cantidadEuros*francosSuizos+"francosSuizos");
		
//		String cantidadTexto=String.valueOf(cantidadEuros);
//		char moneda;
//		for(int i=0;i<cantidadEuros.length();i++) {
//			moneda=cantidadEuros.charAt(i);
//		}
		
		
	}
}




