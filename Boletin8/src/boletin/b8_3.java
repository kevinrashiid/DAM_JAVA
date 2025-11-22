package boletin;

public class b8_3 {

	public static void main(String[] args) {
		// EJERCICIO 3
		// Vamos a realizar un programa de cifrado que haga lo siguiente: mezcle los
		// caractéres
		// alternando entre las del principio y las del final del mensaje empezando
		// siempre por el final.
		// Por ejemplo, si nuestro mensaje secreto fuera el siguiente:
		// 12345
		// El mensaje cifrado sería así:
		// 51432
		// Un ejemplo con un mensaje de texto real:
		// Atacamos mañana
		// Se codificaría así:
		// aAntaañcaamm os
		int mensaje=2452;
		System.out.println(codificado(mensaje));
	}
	public static int codificado(int mensaje) {
		String numero = String.valueOf(mensaje);
		String cifrado = "";
		for (int i = numero.length()-1; i >= 0; i--) {// DE ATRAS A ADELANTE
			for (int x = 0; x < numero.length(); x++) {// RECORRIDO NORMAL
				cifrado =cifrado+ numero.charAt(i);
				cifrado= numero.charAt(x)+cifrado;
			}
		}
		int resultado = Integer.parseInt(cifrado);
		return resultado;
	}
}