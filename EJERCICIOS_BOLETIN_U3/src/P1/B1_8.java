package P1;

import java.util.Scanner;

public class B1_8 {

	public static void main(String[] args) {
		// ===============EJERCICIO 8=============================
		// Escribir un programa que reciba por teclado el importe de una cantidad a
		// pagar en euros
		// (puede tener decimales) y el número de meses que contamos para pagarla (tiene
		// que ser un
		// número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No
		// aplicamos
		// intereses de ningún tipo y redondeamos a dos decimales

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in); // tengo que crear un scanner por
//		cada entrada por teclado que hago
		System.out.print("INTRODUCE EL TOTAL A PAGAR: ");
		double total = teclado.nextDouble();
		System.out.print("CUANTOS MESES TIENES PARAR PAGARLO: ");
		int mes = teclado2.nextInt();
		double mensualidad = total / mes;
		System.out.println("tienes que pagar " + mensualidad + "€");

	}
}
