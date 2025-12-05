package P1;

public class B1_18_finMundo {

	public static void main(String[] args) {

		// ===============EJERCICIO 18==============================
		// Escribe un programa que genere números aleatorios entre el 1 y el 1000 sin
		// parar y que sólo
		// se detenga cuando salga el 666. Los números que ha tenido que generar tu
		// programa hasta
		// aparecer el 666 son los que restan para el apocalipsis. Tu programa debería
		// de indicarlo con
		// un mensaje tétrico (¡Faltan 236 días para que se acabe todo! por ejemplo)

		int inicio = 1;
		int fin = 1000;
		int infinito;// la creamos fuera para que se pueda utilizar fuera del bucle
		// un do while por que no sabemos cuando va salir el 666
		// un contador por que tenemos que contar cuantas veces entra al bucle
		// y ese numero sera el numero de dias que falta para el fin
		int contador = 0;

		do {
			infinito = (int) (Math.random() * (fin - inicio + 1) + inicio);// numero ramdons entre 1 y 1000
			System.out.println(infinito);
			contador++;
		} while (infinito != 666); // mientras que infinito sea diferente a 666 (true) vuelve al bucle
									// si es igual se para
		System.out.print("¡Faltan " + contador + " días para el APOCALIPSIS");

	}

}
