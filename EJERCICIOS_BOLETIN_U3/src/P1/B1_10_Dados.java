package P1;

public class B1_10_Dados {

	public static void main(String[] args) {

		// ===============EJERCICIO 10=============================
		// Escribir un programa que genere dos números aleatorios simultáneamente entre
		// el 1 y el 6 (simulando una tirada de dos dados
		int inicio = 1;
		int fin = 6;
		int azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
		int azar2 = (int) (Math.random() * (fin - inicio + 1) + inicio);
		System.out.println("Primer numero es: " + azar);
		System.out.println("Segundo numero es: " + azar2);

	}

}
