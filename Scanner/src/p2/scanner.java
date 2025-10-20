package p2;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		/*LEER POR TECLADO*/
		//Scanner teclado; ESTO ES LO MISMO QUE ESTO int edad;
		//varible objeto del tipo Scanner
		// estamos creando un objeto utilizando un constructor
		//Scanner teclado; //varible que contendra lo que le pasemos por teclado
		Scanner teclado = new Scanner(System.in); /*System.in para poder leer por teclado y
		 									y que se guarde en la variable teclado*/
		System.out.println("Escribe tu nombre: ");
	
		String nombre = teclado.nextLine(); //metodo --> nombre del objeto + funcion
		/*nextLine coje todo lo que escribo por teclado hasta que pulso ENTER y 
		 * lo guarda en la variable*/
									
		System.out.println("Tu nombre es: " + nombre);
		
		/*cuando utilizamos Scanner tenemos que cerrarlo*/
		teclado.close();//es para liberar el espacio de memoria donde esta teclado
		
		int numero;
		numero =teclado.nextInt(); //igual que nextLine pero con numeros
		System.out.println(numero);
		
	}
}





