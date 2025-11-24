package boletin10;

public class b10_4 {

	public static void main(String[] args) {
		// 4. Un número defectivo o número deficiente es un número n para el que la suma
		// de sus
		// divisores es menor que 2n (o, si te resulta mas cómodo, para el que la suma
		// de sus divisores
		// propios es menor que n). Por ejemplo, los divisores propios de 8 son 1, 2 y
		// 4, y su suma es
		// menor que 8, por lo que 8 es deficiente.
		// Los primeros números deficientes son 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14,
		// 15, 16, 17, 19, 21,
		// 22, 23, 25, 26, 27, 29, 31, 32 , 33, 34, 35, 37, 38, 39, 41, 43, 44, 45, 46,
		// 47, 49 y 50
		// Escribe una función que reciba dos números y nos muestre por consola todos
		// los números
		// abundantes que hay entre ellos, ambos incluidos
		int numero1=5;
		int numero2=10;
		numeroDefectivo(numero1, numero2);
	}
	public static void numeroDefectivo(int menor, int mayor) {
		int deficiencia = 0;
		for (int i = menor; i <= mayor; i++) {
			int suma = 0; // TODO ERROR ESTO LO TENIA FUERA DE LOS DOS FOR
			for (int k = 1; k < i; k++) {// TODO AQUI TENIA K<MAYOR
				if (i % k == 0) {
					suma = suma + k;
				}
			}
			if (suma < i) {
				deficiencia = i-suma;
				System.out.println(i + " es abundante (con deficiencia de " + deficiencia + ")");
			}
		}
	}
}
