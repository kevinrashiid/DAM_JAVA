package prueba_Examen;

import java.util.Scanner;

public class pruebaExamen {

	public static void main(String[] args) {
		/*
		Scanner teclado = new Scanner(System.in);

		System.out.print("INTRODUCE LA FRASE PARA ADIVINARLA--> ");
		String frase = teclado.nextLine();

		System.out.print("INTRODUCE LETRA--> ");
		String letra = teclado.nextLine();
		boolean sonIguales = false;
		String fraseGuardada = "";
		char asterisco = '*';
		int contador=0; //CUIDADO
		*/
		//############# EJERCICIO 1####################
//		for (int i = 0; i < frase.length(); i++) {
//			if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i) == ' ') {
//				fraseGuardada = fraseGuardada + frase.charAt(i);
//			} else {
//				fraseGuardada = fraseGuardada + asterisco;
//			}
//		}
//		System.out.print("resultado--> "+fraseGuardada);
		
		//############# EJERCICIO 2####################
		/*while (sonIguales == false){//mientras que sean diferentes sigue dentro
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i) == ' ') {
					fraseGuardada = fraseGuardada + frase.charAt(i);
				} else {
					fraseGuardada = fraseGuardada + asterisco;
				}
				System.out.println("resultado--> "+fraseGuardada);
				
				if(fraseGuardada.equals(frase)) {
					sonIguales=true; //bandera
				}else {
					System.out.print("INTRODUCE LETRA--> ");
					letra = teclado.nextLine();
				}
			}
			contador++;
		} 
		System.out.println("La Frase es: " +fraseGuardada);
		System.out.println("intentos--> "+contador);*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		System.out.print("Letra a mantener: ");
		String letra = teclado.nextLine();
		// recorremos la frase introducida y construimos una nueva donde
		String fraseAhorcado = "";
		
		/*for (int i = 0; i < frase.length(); i++)
			// si el caracter coincide con espacio o con la letra a mantener lo conservamos
			if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i) == ' ')
				fraseAhorcado += frase.charAt(i);
			else
				// si no, ponemos un asterisco
				fraseAhorcado += '*';
		System.out.println("Resultado: " + fraseAhorcado);
		
		// Hasta aquí la primera parte del ejercicio
		
		 */
		int contadorIntentos = 0;
		boolean fraseCompleta = false;
		// la condición de salida es que la frase esté completa.
		// Lo haremos comparando la frase construida con la frase original y ver si son
		// iguales
		// también podríamos contar los asteriscos y ver si son igual a cero
		while (fraseCompleta == false) {
			int contadorLetra = 0;
			String fraseTemporal = "";
			System.out.print("Introduce una letra: ");
			letra = teclado.nextLine();
			// por cada letra introducida contamos un intento
			contadorIntentos++;
			// y volvemos a recorrer la frase original y construimos una nueva
			for (int i = 0; i < frase.length(); i++)
				// si el caracter coincide con el de la frase original lo pasamos a la frase
				// nueva
				if (frase.charAt(i) == letra.charAt(0)) {
					fraseTemporal += letra.charAt(0);
					// e incrementamos el contador de veces que aparece la letra
					contadorLetra++;
				} else
					// si no coincide, metemos el caracter de la frase a medio terminar
					fraseTemporal += fraseAhorcado.charAt(i);
			System.out.println("La letra " + letra + " aparece en " + contadorLetra + " ocasiones");
			System.out.println("Resultado: " + fraseTemporal);
			// la nueva frase que hemos construido este turno será la de partida en la
			// siguiente iteracción
			fraseAhorcado = fraseTemporal;
			// si ambas frases coinciden, hemos terminado
			if (fraseAhorcado.equals(frase))
				fraseCompleta = true;
		}
		teclado.close();
		System.out.println("Haz ganado. Has necesitado " + contadorIntentos + " intentos para completar la frase");
	}
}