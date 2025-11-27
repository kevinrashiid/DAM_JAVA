package examen2;

public class E3 {

	public static void main(String[] args) {
		int inicio=8;
		int fin=23;
		int contador=0;
		System.out.println("Números capicúas entre "+inicio+" y "+fin+":");
		for(int i=inicio;i<fin;i++) {
			String numeroTexto=String.valueOf(i);
			if(i==esCapicua(numeroTexto)) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Hay un total de "+contador+" números capicúas");
	}
	public static int esCapicua(String texto) {
		String palabraInvertida = "";
		for(int i=texto.length()-1; i>=0; i--) {
			palabraInvertida = palabraInvertida + texto.charAt(i);//introducimos la cadena al reves en la variable
		}
		int numeroInt=Integer.parseInt(palabraInvertida);//convertir de texto a numero
 
		return numeroInt;
	}
}
