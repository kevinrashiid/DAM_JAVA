package boletin;

public class b8_6 {

	public static void main(String[] args) {
//		EJERCICIO CON FORMATO DE EXAMEN
//		Realiza un programa que lea una frase y nos diga si es un palíndromo o no. Un palíndromo es
//		una palabra o frase que se lee igual hacia adelante que hacia atrás sin tener en cuenta los
//		espacios en blanco ni que los caracteres tengan tilde o estén en mayúsculas.
//		Ejemplos de palíndromos:
//		La ruta nos aporto otro paso natural
//		Atale demoníaco Cain o me delata
//		Para facilitar la codificación se deberán introducir las frases sin tildes, pero si hay que tener
//		en cuenta las mayúsculas y los espacios. Tampoco tendrán signos de puntuación
//		Ejemplo de funcionamiento:
//		Introduce un texto: Dabale arroz a la zorra el abad
//		El texto introducido es un palíndromo
//		No hace falta comprobaciones sobre la entrada (que siempre será una cadena de texto, pero
//		si que es preciso vigilar que a veces puede que haya mas de un espacio entre las palabras o
//		incluso al principio y al final de la frase
		String texto = "La ruta nos aporto otro paso natural";
		texto = texto.trim();// ELIMINA LOS ESPACIO DEL PRINCIPIO Y DEL FINAL
		texto = texto.toLowerCase();
		if (texto.indexOf(" ") == -1) {// SI NO ENCUENTRA ESPACIO ES PALABRA
			if (texto.equalsIgnoreCase(palabraPalindromo(texto))) {
				System.out.println("La palabra es palindromo");
			} else {
				System.out.println("La palabra NO es palindromo");
			}
		} else {// SI ENCUENTRA ESPACIOS ES FRASE
			if (texto.equalsIgnoreCase(frasePalimdromo(texto))) {
				System.out.println("La frase es palindromo");
			} else {
				System.out.println("La frase NO es palindromo");
			}
		}
		System.out.println(frasePalimdromo(texto));

	}
	// TODO almacenar los indices de espacios en un array
//	int[] espacios = new int[texto.length()];
//	for (int i = 0; i < texto.length(); i++) {
//		String c = String.valueOf(texto.charAt(i));
//		if (texto.charAt(i) == ' ') {
//			espacios[i] = i;
//		}
//	}

	// TODO funcion que reinvierte la PALABRA dada
	public static String palabraPalindromo(String texto) {
		texto.toLowerCase();
		String palabraInvertida = "";
		// si no encuentra un espacio es decir ES UNA PALABRA HACE ESTO
		for (int i = texto.length() - 1; i >= 0; i--) {
			String c = String.valueOf(texto.charAt(i));
			palabraInvertida = palabraInvertida + c;
		}
		return palabraInvertida;
	}

	// TODO funcion que reinvierte la FRASE dada
	public static String frasePalimdromo(String texto) {
		String fraseInvertida = "";
		texto = texto.toLowerCase();

		// reinvirtiendo la frase Y quital espacios
		for (int i = texto.length() - 1; i >= 0; i--) {
			String c = String.valueOf(texto.charAt(i));
			fraseInvertida = fraseInvertida + c;
		}
		fraseInvertida = fraseInvertida.replace(" ", "");

		// asignando los espacios del texto original al invertido
		String fraseInvertidaConEspacio = "";
		int indiceInvertida = 0;
		for (int q = 0; q < texto.length(); q++) {
			if (texto.charAt(q) == ' ') {
				fraseInvertidaConEspacio += " ";
			} else {
				fraseInvertidaConEspacio += fraseInvertida.charAt(indiceInvertida);
				indiceInvertida++;
			}
		}
		return fraseInvertidaConEspacio;
	}
}
