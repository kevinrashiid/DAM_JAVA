package boletin7;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		//BOLETIN 5 EJERCICICIO 4
		//Escribir un programa que nos pida una cadena por teclado y luego cuente cuantas
		//palabras hay en ella con cuatro o más vocales diferentes. Por ejemplo, si introducimos
		//la frase “Crisis constitucional por culpa del murcielago guineoecuatorial” Nos debería de
		//decir que 3. Tendrías que tener en cuenta que las vocales pueden ir en mayúsculas o no
		//y son la misma letra. Presupón que ninguna vocal va acentuada de ninguna forma.
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String entrada=teclado.nextLine();
		teclado.close();
		String[] palabras=entrada.split(" ");//te separa las palabras y te las agrega en el array
		int contador=0;
		for(String x:palabras) {
//			System.out.println(x);
			if(tieneMasCuatrooMasVocales(x)) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" palabras con 4 o mas vocales");
	}
	public static boolean tieneMasCuatrooMasVocales(String p) {
		int contarVocales=0;
		boolean tieneCuatroVocales=false;
		String[] letras= {"a","e","i","o","u"};
		for(String letra:letras) {
			contarVocales+=buscaLetra(p, letra);
		}
		
		if(contarVocales>=4) {
			tieneCuatroVocales=true;
		}
		return tieneCuatroVocales;
	}
	
	public static int buscaLetra(String p,String l) {
	int hayLetra=1;
	if(p.indexOf(l)==-1) {//busca una subcadena dentro de una cadena
		hayLetra=0;
	}
	return hayLetra;

	}
	
	
	
}
