package boletin;
import java.util.Scanner;
public class b8_7 {
	public static void main(String[] args) {
		// EJERCICIO CON FORMATO DE EXAMEN
		// Un número es Armstrong cuando la suma de cada uno de los números que lo
		// componen
		// elevado al número de dígitos de dicho número de dicho número da como
		// resultado el propio
		// número.
		// Realiza un programa que, dado un número introducido por teclado, averigüe si
		// es un número
		// Armstrong o Narcisista.
		// Ejemplo de un número de 3 dígitos: 153 ya que 13+53+33 = 1+125+27 = 153.
		// Todos los números de una cifra son narcisistas. De tres cifras tienes, además
		// del anterior, el
		// 370, el 371 y el 407 y de mas de tres cifras puedes probar con el 1634. No
		// existen números
		// narcisistas de dos cifras.
		// Ejemplo de funcionamiento:
		// Introduce un número: 371
		// El número 371 es narcisista
		// No hace falta comprobaciones acerca de la entrada que siempre será un número
		// entero
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero:  ");
		String numeroTexto = teclado.nextLine();
		teclado.close();
		int suma = 0;
		for (int i = 0; i < numeroTexto.length(); i++) {
//			String c =String.valueOf(numeroTexto.charAt(i));
//			int n=numeroTexto.charAt(i);
			int cifra = Character.getNumericValue(numeroTexto.charAt(i));// CONVER
			suma = suma + (int) Math.pow(cifra, numeroTexto.length());
		}
		//CONVIRTIENDO Y COMPARANDO A LA VEZ
		if (suma == Integer.parseInt(numeroTexto)) {
			System.out.println(numeroTexto + " Es narcicista");
		} else {
			System.out.println(numeroTexto + " No es narcicista");
		}

		// MI SOLUCION
//		Scanner teclado = new Scanner(System.in);
//		System.out.print("TU NUMERO ES NARCISISTA O ARMSTRONG? ");
//		int numero = teclado.nextInt();
//		if (numero >= 100) {
//			if (armstrong(numero) == true) {
//				System.out.println("El numero es armstrong");
//			} else {
//				System.out.println("El numero es narcista");
//			}
//		} else {
//			System.out.println("Tu numero tiene que ser mayor igual a 100");
//		}
	}
	// MI FUNCION
//	public static boolean armstrong(int numero) {
//		boolean esArmstrong = false;
//		String numeroTexto = String.valueOf(numero);
//
//		// RECORREMOS EL NUMERO Y LO GUARDAMOS EN UN ARRAY
//		String[] arrayNumerosString = new String[numeroTexto.length()];
//		for (int i = 0; i < numeroTexto.length(); i++) {
//			String c = String.valueOf(numeroTexto.charAt(i));
//			arrayNumerosString[i] = c;
//		}
//		// CONVIRTIENDO UN ARRAY DE STRING A UN ARRAY DE INT
//		double[] arrayNumerosInt = new double[arrayNumerosString.length];
//		for (int i = 0; i < arrayNumerosString.length; i++) {
//			arrayNumerosInt[i] = Integer.parseInt(arrayNumerosString[i]);
//		}
//		// SUMANDO LOS RESULTADOS DE LOS EXPONENTES
//		double sumaResultado = 0;
//		for (int i = 0; i < arrayNumerosInt.length; i++) {
//			// Math.pow elevando los numeros del array a un exponente
//			// ponemos el cast de (int) por que Math.pow devuelve un double
//			sumaResultado = sumaResultado + (int) Math.pow(arrayNumerosInt[i], numeroTexto.length());
//		}
//		// comparando con el numero pasado
//		if (sumaResultado == numero) {
//			esArmstrong = true;
//		} else {
//			esArmstrong = false;
//		}
//		return esArmstrong;
//	}
}
