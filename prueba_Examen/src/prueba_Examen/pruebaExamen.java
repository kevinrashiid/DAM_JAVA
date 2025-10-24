package prueba_Examen;

import java.util.Scanner;

public class pruebaExamen {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("INTRODUCE LA FRASE PARA ADIVINARLA--> ");
		String frase=teclado.nextLine();
		
		System.out.print("INTRODUCE LETRA--> ");
		String letra=teclado.nextLine();
		String espacio=" ";
		int contador = 0;
		boolean bandera = false;
		do {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra.charAt(0)) {
					System.out.println(letra.charAt(0));
				}else if(frase.charAt(i)==espacio.charAt(0)) {
						System.out.println(" ");
				}else {
					System.out.println("*");
				}
				System.out.println("INTRODUCE OTRA LETRA--> ");
				letra = teclado.nextLine();
			}
			contador++; //para contar los intentos
		} while (bandera == false);
	}
}

//|| frase.charAt(i)==espacio.charAt(0)

