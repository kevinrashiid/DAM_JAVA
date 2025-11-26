package practicandoExamenPrimerTri;

public class AjedrezAletorio {
	public static void main(String[] args) {
		int lado = 8;
		String[][] tablero = new String[lado][lado];
		System.out.println("  TABLERO DE AJEDREZ");
		int numeroTorres = 2;
		int numeroCaballo=2;
		int numeroReyna=1;
		colorarGuion(tablero, lado);
		colorarTorre(tablero, numeroTorres, lado);
		colocarCaballo(tablero, numeroTorres, lado);
		colocarReyna(tablero, numeroReyna, lado);
		mostrarTablero(tablero, lado);
		
	}

	// TODO FUNCION PARA MOSTRAR EL TABLERO
	// CORRGIR
	public static void colorarGuion(String[][] tablero, int lado) {
		for (int e = 0; e < lado; e++) {// fila
			for (int r = 0; r < lado; r++) {// columna
				tablero[e][r] = " - ";
			}
		}
	}

	public static void mostrarTablero(String[][] tablero, int lado) {
		for (int e = 0; e < lado; e++) {// fila
			for (int r = 0; r < lado; r++) {// columna
				System.out.print(tablero[e][r]);
			}
			System.out.println();
		}
	}

	// TODO FUNCION PARA COLOCAR TORRES
	public static void colorarTorre(String[][] tablero, int numtorres, int lado) {
		String torres = " T ";
		int contadorTorres = 0;
		while (contadorTorres != numtorres) {
			int columna = (int) (Math.random() * lado);// columna aletorio
			int fila = (int) (Math.random() * lado);// fila aletoria
			if (tablero[fila][columna].equals(" - ")) { // SI HAY UN 0 PONE LA MINA
				tablero[fila][columna] = torres;// MINA ES 1
				contadorTorres++;
			}
		}
	}
	
	public static void colocarCaballo(String[][] tablero, int numCaballo, int lado) {
		String caballo = " C ";
		int contadorCaballo = 0;
		while (contadorCaballo != numCaballo) {
			int columna = (int) (Math.random() * lado);// columna aletorio
			int fila = (int) (Math.random() * lado);// fila aletoria
			if (tablero[fila][columna].equals(" - ")) { // SI HAY UN 0 PONE LA MINA
				tablero[fila][columna] = caballo;// MINA ES 1
				contadorCaballo++;
			}
		}
	}
	public static void colocarReyna(String[][] tablero, int numReyna, int lado) {
		String reyna = " R ";
		int contadorReyna = 0;
		while (contadorReyna != numReyna) {
			int columna = (int) (Math.random() * lado);// columna aletorio
			int fila = (int) (Math.random() * lado);// fila aletoria
			if (tablero[fila][columna].equals(" - ")) { // SI HAY UN 0 PONE LA MINA
				tablero[fila][columna] = reyna;// MINA ES 1
				contadorReyna++;
			}
		}
	}

}
