package examen2;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// nombre y apellido
		String[] clientes = { "Diego Norrea", "Inés Perado", "Demetrio Imedio", "Roberto Rija", "Rubén Tosidad",
				"Armando Adistancia", "German Tequilla" };
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos premios vas a repartir? ");
		int numPremios = teclado.nextInt();
//		System.out.println(clientes.length);
		if (numPremios > clientes.length) {
			System.out.println("Solo tienes 7 clientes tienes. Les puedes dar un premio a cada uno");
			int sobrantes = numPremios - 7;
			System.out.println("Te sobran " + sobrantes + " premios sin repetir !Guardalos para el siguiente sorteo¡");
		} else if (numPremios == clientes.length) {
			System.out.println("Tienes 7 clientes. Les puedes dar un premio a cada uno");
		} else if (numPremios < clientes.length) {
			System.out.println("Los/as afortunados/as son:");
			for (int i = 0; i < numPremios; i++) {
				int azar = (int) (Math.random() * 7);
				int ultimoAzar=azar;
				String premiado = clientes[azar];
				String[] separados=premiado.split(" ");//separando por espacios y metiendo en un array 
				String ApellidoNombre=separados[1]+", "+separados[0];
				do {
					azar = (int) (Math.random() * 7);
				}while(azar==ultimoAzar);
				System.out.println(ApellidoNombre);
			}
		}
	}

}
