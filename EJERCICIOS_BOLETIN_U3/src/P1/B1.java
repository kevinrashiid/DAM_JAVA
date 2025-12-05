package P1;

import java.util.Scanner;


public class B1 {

	public static void main(String[] args) {

		//================ejercicio 1=============================
		//Escribir un programa donde se muestren los 10 primeros números enteros
		 /*int entero;
		 for (int i =0; i<10;i++) {
		 System.err.println(i);
		 }

		 */	

		//===============EJERCICIO 18==============================
		//Escribe un programa que genere números aleatorios entre el 1 y el 1000 sin parar y que sólo
		//se detenga cuando salga el 666. Los números que ha tenido que generar tu programa hasta
		//aparecer el 666 son los que restan para el apocalipsis. Tu programa debería de indicarlo con
		//un mensaje tétrico (¡Faltan 236 días para que se acabe todo! por ejemplo)
	
		/*int inicio=1;
		int fin=1000;
		int infinito;//la creamos fuera para que se pueda utilizar fuera del bucle
		//un do while por que no sabemos cuando va salir el 666
		//un contador por que tenemos que contar cuantas veces entra al bucle 
		//y ese numero sera el numero de dias que falta para el fin
		int contador=0;
						
		do {
			infinito=(int)(Math.random()*(fin-inicio+1)+inicio);//numero ramdons entre 1 y 1000
			System.out.println(infinito );
			contador++;
		}while(infinito!=666); // mientras que infinito sea diferente a 666 (true) vuelve al bucle
								//si es igual se para
		System.out.print("¡Faltan " +contador+ " días para el APOCALIPSIS");
		
		
		*/
		//===============EJERCICIO 19==============================
		//Escribir un programa que pida un número por teclado y nos muestre sus divisores
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("DAME UN NUMERO Y TE DIRE SUS DIVISORES");
		int numero=teclado.nextInt();
		
		for (int i = 1 ; i<=numero ; i++) {
			if(numero%i==0) {
				System.out.println("Los divisores de "+numero+" son: "+i);
			}
		}
		*/
		
		
		//===============EJERCICIO 20==============================
		//Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
		//muestre en pantalla ordenados de menor a mayor
		//EXPLICACION DEL CODIGO
		//PEDIMOS NUMEROS HASTA LA LINEA 458
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("NUMERO 1--> ");
		int num1=teclado.nextInt();
		
		System.out.println("NUMERO 2--> ");
		int num2=teclado.nextInt();
		
		System.out.println("NUMERO 3--> ");
		int num3=teclado.nextInt();
		
		//COMPARAMOS PARA SABER CUAL ES MAXIMO DE LOS 3 NUMEROS PEDIDOS Y LO ALMACENAMOS EN MAX
		//COMPAREMOS num1 Y num2 EL QUE SEA MAYOR SE VUELVE A COMPARAR CON NUM3
		int max=Math.max(Math.max(num1, num2),num3);
		//AQUI LO MISMO QUE ANTES PERO CON EL MINIMO
		int min=Math.min(Math.min(num1, num2), num3);
		//CON EL ANTERIOR CODIGO TENEMOS EL MAYOR Y EL MENOR PERO CON LA SIGUIENTE LINEA SACAMOS
		//EL DEL MEDIO
		//SUMAMOS LOS NUMEROS PEDIDOS, SUMAMOS EL MAXIMO Y EL MINIMO Y LOS RESTAMOS CON LA SUMA DE LOS
		//NUMEROS, EL RESULTADO ES EL NUMERO QUE QUEDA QUE ES EL DEL MEDIO POR QUE LE HEMOS RESTADO EL 
		//MAXIMO Y EL MINIMO
		int medio=(num1+num2+num3)-(max+min);
		//EJEMPLO: NUM1-->2 NUM2-->3 NUM3-->4 LOS SUMAMOS = 9 LES RESTAMOS EL MAXIMO Y EL MINIMO 
		//=(2+3+4) - (2+4)=3 EL DEL MEDIO
		System.out.println("EL MAYOR ---> "+max);
		System.out.println("EL DEL MEDIO ---> "+medio);
		System.out.println("EL MINIMO ---> "+min);
		*/
		
		//===============EJERCICIO 21==============================
		//Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no
		//numero primo es SOLo divisible entre 1 y el mismo numero y ningun otro
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt(); // leemos el número del usuario
		teclado.close();
		boolean esPrimo = true; // bandera que indica si el número es primo o no
		// Los números menores o iguales a 1 no son primos
		if (num <= 1) {
			esPrimo = false;
		} else {
			// Recorremos desde 2 hasta la raíz cuadrada del número
			// Si encontramos un divisor, ya no es primo
			for (int i = 2; i <= Math.sqrt(num) && esPrimo; i++) {
				if (num % i == 0) { // si el resto es 0, significa que es divisible
					esPrimo = false; // marcamos que no es primo
				}
			}
		}
		// Mostramos el resultado final
		if (esPrimo) {
			System.out.println(num + " es primo");
		} else {
			System.out.println(num + " no es primo");
		}
		
		
		
		//===============EJERCICIO 22==============================
		//Escribir un programa que genere un número primo aleatorio entre el 10.000.000 y el
		//50.000.000
		/*
		 boolean esPrimo; //variable como bandera
		int azar;
		//este algoritmo es el peor codigo que podemos hacer pero funciona
		do {
			azar =(int) (Math.random()*(400000000+1))+100000000; //generar numero aleatorio
			int raiz=(int)Math.sqrt(azar)+1; 
			esPrimo=true; // estamos dando vuelta 
			System.out.println("Probando el numero "+ azar+ "...");
		//empezamos por 3 por que por 0 no se puede dividir y por 1 tampoco
		//por que es primo y el 2 es el unico primo
			if (azar%2==0)
				esPrimo=false;//con esto me aseguro que el numero generado sea IMPAR
			//divisor<azar && esPrimo==true dos condiciones que se tienen que cumplir
			//con el += son saltamos los pares
			for(int divisor=3; divisor<raiz && esPrimo==true; divisor+=2) {
				if (azar%divisor==0) {
					esPrimo=false;	
				}
			}
		}while(esPrimo == false);
		System.out.println("El numero " + azar + " es primo" );
		*/
		
		//===============EJERCICIO 25==============================
		//Escribir un programa que reciba por teclado un número y muestre sucesivamente el
		//resultado de ir dividiéndolo por dos sucesivamente hasta llegar a un número igual o menor a
		//1. Caso de ser necesario los resultados se mostrarán con dos decimales. Un ejemplo de una
		//ejecución correcta después de introducir el número 34 ser´ía esta:
		//Haz introducido el número 34
		//17
		//8.5
		//4.25
		//2.12
		//1.06
		//0.53
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO Y LO DIVIDIRE ENTRE 2 HASTA QUE SEA MENOR QUE 1");
		System.out.print("INTRODUCE EL NUMERO--> ");
		double numero= teclado.nextInt();
		teclado.close();
		//EN ESTE BUCLE SE CUMPLE ESTO
		//si el numero dado es MAYOR que 1 SIGUE DENTRO
		//O si el resultado de la division entre 2 que se añade a numero
		//es menor que 1 sigue y lo imprime con dos decimales
		while(numero>1) {
			numero=numero/2;//divide el numero dado entre 2 y lo añade a numero
			numero=Math.floor(numero*100.0)/100.0; //PARA que tenga solo dos decimales y no los eleve
			System.out.println(numero);
		}
		*/
	}
}



