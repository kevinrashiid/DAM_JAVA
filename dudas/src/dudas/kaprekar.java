package dudas;

import java.util.Arrays;
import java.util.Scanner;

public class kaprekar {

	public static void main(String[] args) {

		// numero de 4 cifras y que no todos sean iguales
		/*
		 * Scanner teclado=new Scanner(System.in); System.out.println(); int
		 * numero4Digits=teclado.nextInt();
		 * 
		 * //int numero4Digits = 2325; String textoNum = String.valueOf(numero4Digits);
		 * //convertir de numero a texto char cifras[] = new char[textoNum.length()];
		 * //creacion de array con el tamaño de la variable for (int i = 0; i <
		 * textoNum.length(); i++) {//recoremos el texto y lo metemos en el array
		 * cifras[i] = textoNum.charAt(i); } Arrays.sort(cifras);//lo ordenamos String
		 * textoAscendente = "";//lo metemos en una variable de forma ascendente for
		 * (int x = 0; x < cifras.length; x++) { textoAscendente = textoAscendente +
		 * cifras[x]; } int numAscendete = Integer.parseInt(textoAscendente); //lo
		 * convertimos de STRING a INT System.out.println(numAscendete);
		 * 
		 * String textoDescendente = ""; //ordenar de forma descendente for (int y =
		 * cifras.length - 1; y >= 0; y--) { textoDescendente += cifras[y]; }
		 * 
		 * int numDescendete = Integer.parseInt(textoDescendente);
		 * System.out.println(numDescendete); int salida = 6174; boolean bandera =
		 * false; int operacion=0;
		 */
		
		
		// ······························EMPEZAR DE NUEVO·····························3
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		
		System.out.println("NUMERO DE 4 CIFRAS CON AL MENOS UNA DIFERENTE A LAS DEMAS: ");
		// constante es un numero que nunca cambia
		final int kaprekar = 6174; // numero como constante kaprekar
		boolean todoCorrecto=false;

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
