package boletin4;

import java.util.Scanner;

public class ejer_boletin4 {

	public static void main(String[] args) {
		// ================ejercicio 1=============================
		// Escribir un programa que pida un número por teclado y calcule su factorial.
		// Como
		// sabes, la factorial de un número se calcula multiplicando ese número por los
		// sucesivos factores que obtenemos restando uno hasta llegar a la unidad.
		// Por ejemplo, el factorial de 6 (que se representa así 6!) sería este:
		// 6! = 6*5*4*3*2*1 = 720
		/*Scanner teclado = new Scanner(System.in);
		System.out.println("introduce numero y te calculo sus factoriales -->");
		int numeroPedido = teclado.nextInt();
		int factorial = 1;
		for (int i = numeroPedido; i >= 1; i--) {// for que genere desde el numero que meto hasta el uno
			factorial = factorial * i; // multiplico por i que va cada vez que entre en el bucle sera un numero menor
		}
		System.out.println(factorial);
		*/

		
		
		// ================ejercicio 4=============================
		//Escribir un programa que nos diga si un número es capicúa.
		//UN NUMERO CAPICUA ES SI SE LEE IGUAL DEL DERECHO Y DEL REVES POR EJMPLO:
		//818 111 232
		//para resolver esto tenemos que convertir a String para darle la vuelta
		//luego de darle la vuelta lo volvemos a convertir a int 
		//y ese int lo comparamos con int que pasamos por teclado
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce numero y te dire si es CAPICUA");
		
		int numeroPedido=teclado.nextInt();
		
		String numeroTexto=String.valueOf(numeroPedido);//convertir de numero a texto
		String alReves ="";
		for(int i=numeroTexto.length()-1; i>=0; i--) {//recoremos la cadena al reves
			alReves = alReves + numeroTexto.charAt(i);//introducimos la cadena al reves en la variable
		}
		int numeroInt=Integer.parseInt(alReves);//convertir de texto a numero
		if(numeroInt==numeroPedido) { //COMPARACION DEL NUMERO PEDIDO Y EL NUMERO CONVERTIDO
			System.out.println("EL NUMERO " +numeroPedido+ " ES CAPICUA");
		}else {
			System.out.println("EL NUMERO NOOO " +numeroPedido+ " ES CAPICUA\"");
		}
		*/
		// ================ejercicio 14=============================
		//Escribe un programa que lea una hora por teclado en formato 24 horas (HH:MM). Tu
		//programa debería de decir si corresponde a la mañana (entre las 6 y las 11, ambas
		//inclusive), si es una hora de la tarde (entre las 12 y las 19, ambas inclusive), si es de la
		//noche (entre las 20 y las 23, ambas inclusive), si es de la madrugada (entre las 0 y las
		//5, ambas inclusive) o bien, si el formato no es correcto o no se corresponde con una
		//hora real (minutos de mas de 60, horas negativas o por encima de 23, etc.
		Scanner teclado = new Scanner(System.in);
		
	}
}





