package Bucle;

import java.util.Scanner;

public class Bucle_Switch {

	public static void main(String[] args) {
		//utilizamos switch en casos por ejemplos de menu
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un numero del 2 al 4");
		int numero =teclado.nextInt();
		//vamos a evaluar el contenido de la variable
		//en funcion de eso el bucle switch hace una cosa u otra
		
		switch(numero) {
		case 2: //si el numero es 2 ejecuta esto
			System.out.println("es un patito");
			break;//salida
		case 3://si el numero es 3 ejecuta esto
			System.out.println("Es una serpiente");
			break;//salida
		case 4,6://si el numero es 4 ejecuta esto
			System.out.println("Es una silla");
		case 7:
		case 8://esto es lo mismo que el anterior case
			System.out.println("hola hola");
			break;//salida
			default://esto es como el else //NO ES OBLIGATORIO
				System.out.println("no se que es es numere");
		}
		//cuando tenemos menos de 3 opciones utizamos if
		//si son mas de 3 opciones lo mejor es utilizar switch
		//LOS CASE son siempre como un = no se puede case < 3
		
		
		
		///////////////////////CASO PRACTICO/////////////////////////
		///Scanner teclado=new Scanner(System.in);
		System.out.println("Vamos a jugar pulsa una tecla ---> P-S-c-x-X");
		String opcion =teclado.nextLine();
		
		switch(opcion) {
		case "P": 
			System.out.println("Jugar");
			break;
		case "S":
			System.out.println("pausa");
			break;
		case "c":
			System.out.println("change");
		break;
		case "x":
		case "X":
			System.out.println("saltar");
			break;
			default:
				System.out.println("tecla no VALIDA");
		}
	}
}







