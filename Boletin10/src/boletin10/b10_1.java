package boletin10;

public class b10_1 {

	public static void main(String[] args) {
		// 1.-
		// Se denominan números amigos a dos números naturales diferentes relacionados
		// de tal
		// manera que la suma de los divisores propios de cada uno es igual al otro
		// número.
		// Un divisor propio de un número es un factor positivo de ese número que no sea
		// el propio
		// número. Por ejemplo, los divisores propios de 6 son 1, 2 y 3, pero no 6.
		// El par más pequeño de números amigos es (220, 284), y son amigos porque los
		// divisores
		// propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, de los cuales la
		// suma es 284; y los
		// divisores propios de 284 son 1, 2, 4, 71 y 142, de los cuales la suma es 220
		// Los primeros diez pares de números amigos son: (220, 284), (1184, 1210),
		// (2620, 2924),
		// (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416),
		// (63020,
		// 76084) y (66928, 66992)
		// Escribe una función que reciba dos números y devuelva un valor booleano que
		// nos diga si
		// son amgos o no
		int numero1 = 5020;
		int numero2 = 5564;
		if (sumaDivisores(numero1, numero2)) {
			System.out.println("SON AMIGOS");
		} else {
			System.out.println("NO SON AMIGOS");
		}

	}

	// TODO Funcion que te devuelva la suma de los divisores de un numero
	public static boolean sumaDivisores(int numero1, int numero2) {
		int resultadoNumero1 = 0;
		int resultadoNumero2 = 0;
		boolean bandera = false;
		// VIENDO LOS DIVISORES HASTA EL
		for (int i = 1; i < numero1; i++) {
			if (numero1 % i == 0) {
				resultadoNumero1 = resultadoNumero1 + i;
			}
		}
		for (int x = 1; x < numero2; x++) {
			if (numero2 % x == 0) {
				resultadoNumero2 = resultadoNumero2 + x;
			}
		}
		if (resultadoNumero1 == numero2 && resultadoNumero2 == numero1) {
			bandera = true;
		} else {
			bandera = false;
		}
		return bandera;
	}
}
