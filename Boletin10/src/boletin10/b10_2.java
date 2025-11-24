package boletin10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class b10_2 {

	public static void main(String[] args) {

		//2. Un número perfecto o numero es un número entero positivo que es igual a la suma de sus
		//divisores propios positivos excluyéndose a sí mismo. Dicho de otra forma, un número
		//perfecto es aquel que es amigo de sí mismo.
		//Así, 6 es un número perfecto porque sus divisores propios positivos son 1, 2 y 3; y 6 = 1 + 2 +
		//3. Un divisor propio positivo de un número es un factor positivo de ese número que no sea el
		//propio número. Por ejemplo, los divisores propios de 6 son 1, 2 y 3, pero no 6. Los siguientes
		//números perfectos son 28, 496 y 8128.
		//Escribe una función que reciba un número y nos devuelva un valor booleano diciendo si es
		//perfecto o no. El número debe de recogerse por teclado y si no es un entero positivo se
		//debería de informar al usuario y pedir otro hasta que sea correcto. Usa excepciones para ello
		Scanner teclado = new Scanner(System.in);
		boolean bandera = false;
		//CORREGIR ESTE BUCLE NO SALE  DE EL SI LE METES UNA SALIDA
		int numero=0;
		do {
			try {
				System.out.print("···¿TU NUMERO ES PERFECTO?··· ");
				numero = teclado.nextInt();
				if (  numero > 0&& numeroPerfecto(numero)) {
					System.out.println("Tu numero es perfecto");
					bandera = true;
				} else {
					System.out.println("Tu numero no es perfecto");
					bandera = true;
				}
				//captura exactamente la excepcion de meter letra en vez de numero
			}catch (InputMismatchException e) {
				System.out.println("NO PUEDE SER UNA LETRA");
				bandera=false;
				teclado.nextLine();//LIMPIAR EL BUFFER
			}
			catch (Exception e) {
				System.out.println("TIENE QUE SER UN NUMERO POSITIVO");
				bandera=false;
			}
		}while (numeroPerfecto(numero)==false);
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
