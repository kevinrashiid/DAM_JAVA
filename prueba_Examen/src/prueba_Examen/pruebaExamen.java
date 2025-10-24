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
		boolean fraseTerminada = false;
		String fraseAhorcado="";
		/*
		//me faltaba esto
//		do {
		for (int i = 0; i < frase.length(); i++) {
//			if(frase.charAt(i) == espacio.charAt(0)) { //lo que hice yo
//				System.out.print(' ');
//			}
			if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i)==' ') {
				fraseAhorcado=fraseAhorcado+frase.charAt(i);
			} else {
				fraseAhorcado=fraseAhorcado+'*';
			}
		}
		System.out.println("Resultado " +fraseAhorcado);

//			contador++; //para contar los intentos
//		} while (bandera == false);
		*/
		//EJERCICIO 2
		String fraseNueva="";
		int contadorLetra=0;
		while (fraseTerminada == false) {
			int contadorAsteriscos=0;
			System.out.print("INTRODUCE LETRA--> ");
			letra=teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i)==' ') {
					fraseNueva=fraseNueva+frase.charAt(i);
				} else {
					fraseNueva=fraseNueva+frase.charAt(i);
				}
				if(fraseAhorcado.charAt(i)=='*') {
					contadorAsteriscos++;
				}
			}
			
			System.out.println("Resultado " +fraseAhorcado);
			System.out.println("La letra "+letra+" aparece en "+contadorLetra+" ocasiones");
				if(contadorAsteriscos==0) {
					fraseTerminada=true;
					System.err.println("Has necesitado "+contador+" intentos");
				}
				contador++; //para contar los intentos
		};
		
		
	}
}


//   || frase.charAt(i)==espacio.charAt(0)

