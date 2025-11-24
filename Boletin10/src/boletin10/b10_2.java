package boletin10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class b10_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		boolean bandera = false;
		do {
			try {
				System.out.print("TU NUMERO ES PERFECTO?: ");
				int numero = teclado.nextInt();
				if (numeroPerfecto(numero) && numero > 0 && bandera == false) {
					System.out.println("Tu numero es perfecto");
					bandera = true;
				} else {
					System.out.println("Tu numero no es perfecto");
					bandera = true;
				}
				
			}catch (InputMismatchException e) {
				System.out.println("NO PUEDE SER UNA LETRA");
			}
			catch (Exception e) {
				System.out.println("TIENE QUE SER UN NUMERO POSITIVO");
			}
		}while (bandera == false);
		teclado.close();


	}

	public static boolean numeroPerfecto(int numero) {
		boolean bandera = false;
		int resultado = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0 && i != numero) {
				resultado = resultado + i;
			}
			if (resultado == numero) {
				bandera = true;
			} else {
				bandera = false;
			}
		}
		return bandera;
	}
}
