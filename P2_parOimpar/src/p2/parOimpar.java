package p2;

import java.util.Scanner;

public class parOimpar {

	public static void main(String[] args) {
		
//		/*pasar por teclado y que indique si es par o impar*/
//		Scanner numero = new Scanner (System.in);
//		System.out.println("Dime un numero y te dire si es par o impar: ");
//		
//		int numTeclado = numero.nextInt();
//		if (numTeclado % 2 == 0) { // EL % MIRA EL RESTO
//			System.out.println("EL NUMERO " + numTeclado + " ES PAR");
//		}
//		else {
//			System.out.println(numTeclado + " ES IMPAR");
//		}
//		numero.close();
//		
		
		//PEDIR DOS NUMERO POR SEPARADO CUAL ES DE LOS DOS ES MAYOR
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Escribe dos numero y te dire cual es mayor");
		System.out.println("Escribe el primer numero: ");
		int  num1 = numero1.nextInt();
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Escribe el segundo numero");
		int num2 = numero2.nextInt();
		
		
//		System.out.println("tu primer numero es " + num1);
//		System.out.println("tu primer numero es " + num2);

		
	}
}

//PEDIR DOS NUMERO POR SEPARADO CUAL ES DE LOS DOS ES MAYOR




