package progra_Modular_KAPREKAR;

import java.util.Scanner;

public class kaprekarModular {

	public static void main(String[] args) {
		// funcion que valide el numero optimo para hacer kaprekar
		// funcion para hacer el orden de los ascendente
		// funcion para hacer el orden de los descendente
		Scanner teclado = new Scanner(System.in);
		String numTXT = "";
		final int kaprekar = 6174; // numero como constante kaprekar
		int entrada = teclado.nextInt();
		teclado.close();
		int contador = 0;
		while (entrada != kaprekar) {
			contador++;
			int numAscendente = kaprekarAscendeten(entrada);
			int numDescendente = kaprekarDescendente(entrada);
			entrada = numDescendente - numAscendente;
			for (int x = 0; x < 4; x++) {
				numTXT = "0" + numTXT;
			}
		}
		System.out.println();
	}

	// funcion que valide el numero optimo para hacer kaprekar
	public static int validoParaKaprekar(int numero) {
		boolean todoBien = false;
		Scanner teclado = new Scanner(System.in);
		String numTXT = "";
		final int kaprekar = 6174; // numero como constante kaprekar
		int entrada = teclado.nextInt();
		try {
			entrada = teclado.nextInt();// comprobando que es un numero entero
		} catch (Exception e) {
			System.out.println("Eso no es un numero entero ");// si da error esto
		} finally {
			teclado.close();
		}
		if (entrada != -1) {
			System.out.println("NUMERO ENTERO, EMPEZAMOS...! ");
		}

		String numTXT = Integer.toString(entrada);
		// comprobaciones de 4 cifras
		if (numTXT.length() != 4) {
			System.out.println("ERROR TU NUMERO NO TIENE MAS DE 4 CIFRAS ");
		} else {// TODO ESTO VA DENTRO DEL ELSE
			System.out.println("Seguimos haciendo comprobaciones... ");
			boolean bandera = false;// esta es la parte mas complicada
			for (int i = 0; i < numTXT.length(); i++) {
				if (numTXT.charAt(i) != numTXT.charAt(0)) {
					bandera = true;// cuando salgo de aqui es que hay alguno diferente
				}
			}
			if (bandera == false) {
				System.out.println("Todos los digitos son iguales");
			} else {
				System.out.println("Comprobaciones terminadas...");
			}

			// comprobacion de que no sea el numero KAPREKAR 6174
			if (entrada == kaprekar) {
				System.out.println("tu numero es ya la constante kaprekar");
			}
		}

	}

	// funcion para hacer el orden de los ascendente
	public static int kaprekarAscendeten(int n) {

	}

	// funcion para hacer el orden de los descendente
	public static int kaprekarDescendente(int n) {

	}

}
