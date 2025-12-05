package P1;

import java.util.Scanner;

public class B1_12 {

	public static void main(String[] args) {

		// ===============EJERCICIO 12==============================
		// Escribir un programa que sirva como asistente para un juego de rol. Tu
		// programa debería de
		// pedir por teclado el número de dados que se van a tirar y el número de caras
		// de estos (4, 6,
		// 8, 12, etc.) A continuación debería de hacer la tirada y mostrarla
		// ESTA ERA MI SOLUCION PERO NO ES MUY enrevesado
		Scanner teclado = new Scanner(System.in);
		System.out.println("NUMERO DE DADOS: ");
		int dados = teclado.nextInt();
		System.out.println("CARAS DEL DADO PUENDEN SER 4 - 6 - 8 - 12: ");
		int caras = teclado.nextInt();
		int contador = 0;
		for (int i = 0; i < dados; i++) { // ver la explicacion de este for
			contador++;
			int tirada = (int) (Math.random() * (caras) + 1);
			System.out.println("Dado: " + contador + " --> " + tirada);
		}
		teclado.close();

	}

}
