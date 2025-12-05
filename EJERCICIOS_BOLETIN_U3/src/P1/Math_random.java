package P1;

public class Math_random {

	public static void main(String[] args) {

		// ===============FUNCION RANDOM==========================
		// funcion que genera numero RANDOM
		// Math.random(); devuelve un numero entre 0 y 0,999... ES DECIR DOUBLE
		System.out.println(Math.random());
		double azar = Math.random();
		System.out.println(azar); // sale entre 0 y 0,999...
		azar = azar * 6;
		System.out.println(azar); // sale entre 0 y 6.99999
		azar = (int) azar; // CAST//convertimos el numero double de math.random a entero
		System.out.println(azar); // numero entero entre 1 y 6

		// PEDIR EXPLICACION DEL 6 Y 1
		int dado = (int) (Math.random() * 6) + 1;
		System.out.println(dado);

		// GENERAR UN NUMERO ALEATORIO ENTRE 5 15
		int inicio = 5;
		int fin = 15;

		int dado1 = (int) (Math.random() * (fin - inicio + 1)) + inicio;

		int inicio2 = 10;
		int fin1 = 20;
		// quiero generar 100 numero entre 2 y 4
		for (int i = 0; 1 < 100; i++) {
			// ver explicacion de esta linea
			int dado2 = (int) (Math.random() * (fin1 - inicio2 + 1)) + inicio2;
			System.out.println(dado2);
		}

		// System.out.println(dado);esto da error por que la variable se creo dentro del
		// bloque for
		// y solo se puede utilizar dentro de ese bloque
		// System.out.println(); con esto pasaria lo mismo

	}

}
