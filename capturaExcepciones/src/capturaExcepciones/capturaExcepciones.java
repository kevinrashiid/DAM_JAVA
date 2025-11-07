package capturaExcepciones;

import java.util.Scanner;

public class capturaExcepciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double importe = 0;
		int personas = 0;
		// los bloques try y catch van siempre de la malo
		try {
			System.out.println("Cuanto ha costado la cena?: ");
			importe = teclado.nextDouble();
			teclado.nextLine();// para limpiar el buffer del teclado
			System.out.println("cuantos habeis cenado?: ");
			personas = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		finally {
			System.out.println("Se ejecuta siempre. Haya o no excepcion");
		}
		
		teclado.close();
		if (importe != 0 || personas != 0) {
			double porPersona = importe / personas;
			System.out.printf("Tocais a %.2f € por persona", porPersona);
		} else {
			System.out.println("Ni el importe ni los comensales pueden ser 0");
		}
		
	}
}