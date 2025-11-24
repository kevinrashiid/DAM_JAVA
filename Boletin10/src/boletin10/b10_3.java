package boletin10;

public class b10_3 {

	public static void main(String[] args) {
		// 3.
		// Un número abundante o número excesivo es un número para el cual la suma de
		// sus divisores
		// propios es mayor que el propio número. El entero 12 es el primer número
		// abundante. Sus
		// divisores propios son 1, 2, 3, 4 y 6 para un total de 16. La cantidad en que
		// la suma excede al
		// número es la abundancia. El número 12 tiene una abundancia de 4, por ejemplo.
		// Los primeros 28 números abundantes son: 12, 18, 20, 24, 30, 36, 40, 42, 48,
		// 54, 56, 60, 66,
		// 70, 72, 78, 80, 84, 88, 90, 96, 100, 102, 104, 108 , 112, 114 y 120
		// Escribe una función que reciba dos números y nos muestre por consola todos
		// los números
		// excesivos que hay entre ellos, ambos incluidos

		int menor = 10;
		int mayor = 20;
		numeroAbuntante(menor, mayor);
	}

	// TODO en vez de void puse int
	public static void numeroAbuntante(int menor, int mayor) {
		int abundancia = 0;
		for (int i = menor; i <= mayor; i++) {
			int suma = 0; // TODO ERROR ESTO LO TENIA FUERA DE LOS DOS FOR
			for (int k = 1; k < i; k++) {// TODO AQUI TENIA K<MAYOR
				if (i % k == 0) {
					suma = suma + k;
				}
			}
			if (suma > i) {
				abundancia = suma - i;
				System.out.println(i + " es abundante (con abundancia de " + abundancia + ")");
			}
		}
	}
}
