package progra_Modular_KAPREKAR;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarMALO {

	public static void main(String[] args) {
		//funcion que valide el numero optimo para hacer kaprekar
		//funcion para hacer el orden de los ascendente 
		//funcion para hacer el orden de los descendente
		
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		
		System.out.println("NUMERO DE 4 CIFRAS CON AL MENOS UNA DIFERENTE A LAS DEMAS: ");
		// constante es un numero que nunca cambia
		final int kaprekar = 6174; // numero como constante kaprekar

		// comprobacion de numero entero
		int entrada = -1;// esto funciona como una bandera
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
			} else {
				int contador = 0;
				while (entrada != kaprekar) {

					contador++;
//					System.out.println("ahora si, empezamos...");

					// vector
					int vector[] = new int[4];
					for (int x = 0; x < 4; x++) {
						// para conseguir el numero y no su codigo exadecimal
						// aqui me coge el codigo ASCCI de un numero
						 vector[x]=numTXT.charAt(x)-48;
//						vector[x] = Character.getNumericValue(numTXT.charAt(x));
//						vector[x] = numTXT.charAt(x) - '0';// CON ESTO CONVERTIMOS A INT LO METEMOS AL VECTOR Y COGEMOS
						// EL NUMERO NO SU CODIGO ASCII
					}
					Arrays.sort(vector);// array de numeros STRING ordenado
					String ascendente = "";
					String descendente = "";
					for (int k = 0; k < 4; k++) {
						ascendente = ascendente + vector[k];// ORDENANDO DE FORMA ASCENDENTE
						descendente =vector[k]+ descendente;//
					}
//					System.out.println("ascendente " + ascendente);
//					System.out.println("descendente " + descendente);

					// RESTAMOS y convertimos a la vez
					entrada = Integer.parseInt(descendente) - Integer.parseInt(ascendente);

					// PARA QUE CUANDO EL RESULTADO DE 3 DIGITOS POR QUE AVECES EL RESULTADO DA 3
					// DIGITOS
					for (int p = numTXT.length(); p < 4; p++) {
						numTXT = "0" + numTXT;
					}

					// guardamos el numero numTXT
					numTXT = Integer.toString(entrada);

					System.out.println(descendente + " - " + ascendente + " = " + entrada);
				}
				System.out.println("Haz hecho " + contador + " iteraciones para tener kaprekar");
			}
		} // TODO AQUI ACABA EL ELSE*/

	}

}
