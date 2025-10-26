package exa_1_1;

import java.util.Scanner;

public class practicando_exa_1_1 {

	public static void main(String[] args) {
		
		//···········BOLETIN 1·············
		//···········EJERCICIO 1···········
		//Escribir un programa donde se muestren los 
		//0 primeros números enteros
		/*for(int i=0;i<10;i++)	{
			System.err.print(i+" ");
		}
		
		*/
		//Escribir un programa donde se muestren los 50 primeros números pares
		//···········EJERCICIO 2···········
		//·······SOLUCION A···········

		/*
		for(int i=0;i<50;i++)	{
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
		*/
		//·······SOLUCION B +EFICIENTE···········
		//SI QUEREMOS LOS IMPARES SOLO PONEMOS INICIALIZAMOS LA I A --> 1
		/*
		for(int i=0;i<50;i+=2) { //SUMADOS DOS PARA IMPRIMIR SOLO LOS PARES
			System.out.println(i+" ");
		}
		*/
		
		//···········EJERCICIO 3···········
		//Escribir un programa donde se muestren los 5 primeros 
		//números múltiplos de uno dado por
		//el usuario (se introducirá por teclado)
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce numero");
		int numero=teclado.nextInt();
		for(int i=1;i<5;i++) {//los 5 primeros 
			System.out.println(numero*i); //múltiplos de uno dado
		}
		*/
		//···········EJERCICIO 4···········
		//Escribir un programa donde se muestren todos 
		//los números divisibles por 7 menores a
		//10000
		//·······SOLUCION A···········
		/*for(int i=0;i<1000;i++) {
			if(i%7==0) { //divisibles por 7
				System.out.println(i);
			}
		}*/
		//·······SOLUCION B --> +EFICIENTE···········
		/*
		for(int i=0;i<1000;i+=7) {
				System.out.println(i);
		}
		*/
		//···········EJERCICIO 5···········
		//Escribir un programa que pida por teclado un número 
		//al usuario y diga si es par o impar
		/*Scanner teclado=new Scanner(System.in);
		System.out.println("TU NUMERO ES PAR O IMPAR --> ");
		int numero=teclado.nextInt();
		if(numero%2==0) {
			System.out.println("tu numero es par");
		}else {
			System.out.println("es impar");
		}*/
		//···········EJERCICIO 6···········
		//Escribir un programa que pida por teclado un número al usuario y diga si es divisible por 3 o
		//no.
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("numero divisible por 3--> ");
		int numero=teclado.nextInt();
		if(numero%3==0) {
			System.out.println(numero+" es divisible entre 3");
		}
		else {
			System.out.println("no es divisible entre 3");
		}
		*/
		//···········EJERCICIO 7···········
		//Escribir un programa que pida un número por teclado al usuario que simule ser el precio de
		//un artículo y escriba el resultado de aplicarle el IVA del 21%
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("precio producto --> ");
		double precio=teclado.nextDouble();
		double conIva=precio+precio*0.21;
		System.out.println(conIva);
		*/
		//···········EJERCICIO 8···········
		//Escribir un programa que reciba por teclado el importe de una cantidad a pagar en euros
		//(puede tener decimales) y el número de meses que contamos para pagarla (tiene que ser un
		//número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No aplicamos
		//intereses de ningún tipo y redondeamos a dos decimales
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("cantidad a pagar");
		double euros=teclado.nextDouble();
		System.out.println("numero de meses que tenemos?? ->");
		int meses=teclado.nextInt();
		
		double cuotaMes=euros/meses;
//		cuotaMes=Math.floor(cuotaMes*100.0)/100.0; // para eliminar dos decimales
		cuotaMes=Math.round(cuotaMes*100.0)/100.0; // REDONDEA A DOS DECIMALES
		System.out.println("tu cuota de mes --> "+cuotaMes);
		*/
		
		//···········EJERCICIO 9···········
		//Escribir un programa que genere un número aleatorio entre el 0 y el 50 y lo muestre
//		int aletorio=(int)(Math.random()*51);//aletorio entre 50 y 0
		//numero entre 0 y 50 si el fin no es 0 es mejor utilizar este
		/*
		int aletorio=(int)(Math.random()*(50-0+1)+0);
		System.out.println(aletorio);
		*/
		//···········EJERCICIO 10···········
		//Escribir un programa que genere dos números aleatorios simultáneamente entre el 1 y el 6
		//(simulando una tirada de dos dados)
		//tambien podriamos poner dos aletorio
		/*
		for(int i=0;i<2;i++) {
			int aletorio=(int)(Math.random()*(6-1+1)+1);
			System.out.println(aletorio);
		}
		*/
		//···········EJERCICIO 11···········
		//Modificar el programa anterior para que tu programa tire dos dados de forma continuada
		//hasta que el número que salga en ambos sea el mismo. En ese momento debería de parar la
		//ejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a ese resultado
		/*
		int dado1=0;
		int dado2=0;
		int contador=0;
		do {
		dado1=(int)(Math.random()*(6-1+1)+1);
		dado2=(int)(Math.random()*(6-1+1)+1);
		System.out.println("dado1 --> "+dado1+" "+"dado2-> "+dado2);
		contador++;
		}while(dado1!=dado2);//van a salir hasta que sean iguales
		System.out.println("se tiraron los dados "+contador+" veces");
		*/
		
		//···········EJERCICIO 12···········
		//Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
		//pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
		//8, 12, etc.) A continuación debería de hacer la tirada y mostrarla.
		//EXPRECIONES REGULARES
		/*
		Scanner teclado =new Scanner(System.in);
		System.out.println("CUANTOS DADOS? ");
		int dados=teclado.nextInt();
		
		System.out.println("CUANTAS CARAS TENDRA EL DADO ");
		int carasDados=teclado.nextInt();
		int inicio=1; //el inicio siempre va ser 1 
		int fin=carasDados; //pero el numero maximo del dado sera la cara dada
		teclado.close();
		for(int i=0;i<dados;i++) {
			// Genera un número aleatorio entre 1 y el número de caras del dado (simula una tirada)
			int tirada=(int)(Math.random()*(fin-inicio+1)+inicio);
			System.out.println("Dado "+(i+1)+": "+tirada);
		}
		*/
		
		
		//···········EJERCICIO 13···········
		//Modifica el programa anterior para que no admita dados con un número de caras impares
		//(¡no existen!). En el caso de meter un número impar de caras el programa debería de
		//informarnos de que es erróneo y volver a preguntarnos por este dato.
		/*
		Scanner teclado =new Scanner(System.in);
		System.out.println("CUANTOS DADOS? ");
		int dados=teclado.nextInt();
		
		System.out.println("CUANTAS CARAS TENDRA EL DADO ");
		int carasDados=teclado.nextInt();
		int inicio=1; //el inicio siempre va ser 1 
		int fin=carasDados; //pero el numero maximo del dado sera la cara dada
		teclado.close();
		//tiene que ser PAR y mayor o igual que 4 por que 4 caras tiene que tener minimo un dado
		if (carasDados % 2 == 0 && carasDados>=4) { 
			for (int i = 0; i < dados; i++) {
				// Genera un número aleatorio entre 1 y el número de caras del dado (simula una
				// tirada)
				int tirada = (int) (Math.random() * (fin - inicio + 1) + inicio);
				System.out.println("Dado " + (i + 1) + ": " + tirada);
			}
		}else {
			System.out.println("EL NUMERO DE CARAS TIENE QUE SER PAR!");
		}
		*/
		
		//···········EJERCICIO 14···········

	}
}


