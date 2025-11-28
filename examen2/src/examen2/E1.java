package examen2;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		boolean bandera = false;
		do {
			try {
				System.out.print("Cuantos dados vas tirar? ");
				int tiradas = teclado.nextInt();
				System.out.println("Haz tirado " + tiradas + " dados y ha salido lo siguiente");
				int contador1 = 0;
				int contador6 = 0;
				int sumaTotal = 0;
				int media = 0;
				for (int i = 0; i < tiradas; i++) {
					int dado = (int) (Math.random() * 6) + 1;
					sumaTotal = sumaTotal + dado;
					System.out.print(dado);
					if(i!=tiradas-1) {
						System.out.print(", ");
					}else {
						System.out.println("");
					}
					if (dado == 1) {
						contador1++;
					}
					if (dado == 6) {
						contador6++;
					}
				}
				media = 3*tiradas;
				int mitad=(tiradas*6)/2;
				if(contador1>0) {
					System.out.println("En " + contador1 + " dados ha salido un 1");
				}
				if(contador6>0) {
					System.out.println("En " + contador6 + " dados ha salido un 6");					
				}
				System.out.println("La suma de todos los dados da " + sumaTotal);
				if(sumaTotal<(tiradas*6)) {
					System.out.println("Tu tirada esta por debajo de la media "+mitad);
				}
				if(sumaTotal>(tiradas*6)) {
					System.out.println("Tu tirada esta por encima de la media "+mitad);
				}
				if(sumaTotal==(tiradas*6)) {
					System.out.println("Tu tirada es exactamente de la media "+mitad);
				}
				bandera = true;
				teclado.close();
			} catch (Exception e) {
				teclado.nextLine();

				System.out.println("No es una opcion valida");
			}
		} while (bandera == false);

	}
}
