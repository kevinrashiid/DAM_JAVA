package p4;

import java.util.Scanner;

public class ComparacionWhilfor {

	public static void main(String[] args) {
		/*	for (int i=0; i<5; i++)	{

		}
//		*/
		//		int i =0;
		//		while (i<5) {
		//			System.out.println(i);
		//			i++;
		//		}
		//	}
		//	
		
		/*============EJERCICIO=================*/
		//que no muestre los numeros que metemos por teclado hasta
		//cuando el usuario meta el numero 0, salimos del bucle
		
		
			/*YO HICE ESTO*/
//		Scanner numero1 = new Scanner(System.in);
//		int ent = numero1.nextInt();
//		while(ent != 0) {
//			System.out.println("Tu numero es: " + ent);
//		}
		
		/*SOLUCION DEL PROFE*/
//		Scanner numero1 = new Scanner(System.in);
//		int tecla =9;
//		while (tecla != 0) { 
//			System.out.println("Escribe un entero 0 para salir: ");
//			tecla  = numero1.nextInt(); // CAMBIAMOS EL VALOR DE LA VARIABLE HASTA ESCRIBAMOS 0
//		}
//		System.out.println("Bucle termiando haz puesto " + tecla);
//		
		
		
		/*ASI SE PODRIA HACER CON EL DO WHILE*/
//		Scanner numero2 = new Scanner(System.in);
//		int tecla2 =9;
//		do { 
//			System.out.println("Escribe un entero 0 para salir: ");
//			tecla2  = numero2.nextInt(); // CAMBIAMOS EL VALOR DE LA VARIABLE HASTA ESCRIBAMOS 0
//		}while (tecla2 != 0); //SOLO en do while el ; (punto y coma) de esta linea es OBLIGATORIO
//		System.out.println("Bucle termiando haz puesto " + tecla2);
//		
		
		/*======= ESTO NUNCA SE DEBE DE HACER ESTE CODIGO ES MUY TIPICO DE DE CHATGPT===================*/
		Scanner numero1 = new Scanner(System.in);
		int tecla =9;
		while (true) { 
			System.out.println("Escribe un entero 0 para salir: ");
			tecla  = numero1.nextInt(); // CAMBIAMOS EL VALOR DE LA VARIABLE HASTA ESCRIBAMOS 0
			System.out.println(tecla);
			if (tecla ==0)
				break;
		}
		System.out.println("Bucle termiando haz puesto " + tecla);
		
		
		//LA CONDICION DEL WHILE TIENE QUE DAR TRUE PARA QUE SE REPITA
		//REPITE LO QUE TIENE EN SU BLOQUE HASTA QUE SE CUMPLE SU CONDICION
		
		
		//break funciona rompiendo el bucle en el que esta 
		
	}
}





