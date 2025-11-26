package practicandoExamenPrimerTri;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabrasPatronArray {

	public static void main(String[] args) {
		//añadiendo solo las palabras que cumple el patron
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce texto: ");
		String texto = teclado.nextLine();
		Pattern patron = Pattern.compile("[a-zA-Z.]+");
		Matcher matcher = patron.matcher(texto);
		
		int contador = 0;// contador de palabras
		while (matcher.find()) {
			contador++;
		}
		String[] palabras = new String[contador];
		matcher.reset(); 
		int i = 0;
		while (matcher.find()) {
			palabras[i]=matcher.group();
			i++;
		}
		for(int v=0;v<palabras.length;v++) {
			System.out.println(v+1+".-"+palabras[v]);
		}
	}
}

