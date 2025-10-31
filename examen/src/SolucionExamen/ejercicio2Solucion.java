package SolucionExamen;

import java.util.Scanner;

public class ejercicio2Solucion {

	public static void main(String[] args) {
		final double cambioPeso=27.93;//para que sean constantes
		final double cambioRupia=102.82;
		final double cambioFranco=0.93;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad: ");
		String entrada=teclado.nextLine();
		teclado.close();
		
		//TODO separamos el texto en la moneda y el numero que es texto
		char moneda=entrada.charAt(entrada.length()-1);
		double cantidad=Double.parseDouble(entrada.substring(0,entrada.length()-1));
		
		switch(moneda) {
		case'P':
			double cambio=(double)Math.round((cantidad/cambioPeso)*10000)/10000;//redondeo
			System.out.println(cantidad+" pesos Cubanos equivale a "+cambio+" euros");
			break;
		case 'R':
			
			break;
		case 'F':
			
			break;
		case 'E':
			
			break;
			
		}
	}
}



