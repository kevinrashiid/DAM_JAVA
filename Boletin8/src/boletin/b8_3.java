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
		
		String texto="123456";
		int i=0;
		int j=texto.length()-1;
		String txtCifrado="";
		//RECORRIENDO CON UN WHILE
		while(i<j){
			txtCifrado=txtCifrado +texto.charAt(j);
			txtCifrado=txtCifrado+texto.charAt(i);
			i++;//APUNTADORES AL INDICE 0
			j--;//APUNTADOR AL ULTIMO INDICE
		}
		//si es impar el del medio te lo deja en el medio
		if(texto.length()%2!=0) {
			txtCifrado=txtCifrado+texto.charAt(texto.length()/2);
		}
		System.out.println(txtCifrado);
		
	}


}