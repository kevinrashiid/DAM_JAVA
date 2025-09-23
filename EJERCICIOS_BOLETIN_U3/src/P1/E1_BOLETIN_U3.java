package P1;

import java.util.Scanner;

public class E1_BOLETIN_U3 {

	public static void main(String[] args) {

		// /*===============ejercicio 1==================================*/
		/*
		 * 1.-Escribir un programa donde se muestren los 10 primeros números enteros
		 */
		// int entero;
		// for (int i =0; i<10;i++) {
		// System.err.println(i);
		// }

		// /*===============EJERCICIO 2==============================*/
		// /*2.- Escribir un programa donde se muestren los 50 primeros números pares*/
		// //SOLUCION 1:
		// int par;
		// for (int i=0;i<50;i+=2) {
		// System.out.println(i);
		// }
		// SOLUCION 2: es mucho mejor la primera ya que aqui depende si pones el syso
		// debajo del contador
		// //salen los impares
		// int par2;
		// for(int i=0;i<50;i++) {
		// if(i%2==0) {
		// System.out.println(i);
		// i++;
		// }

		// /*===============EJERCICIO 3==============================*/
		/*
		 * Escribir un programa donde se muestren los 5 primeros números múltiplos de
		 * uno dado por el usuario (se introducirá por teclado)
		 */
		// ESTA ES MI SOLUCION PERO LO ENTENDI MAL
		// Scanner multiplo= new Scanner(System.in);
		// int num;
		// for(int i=0; i<5; i++) {
		// System.out.println("TE DIRE SI ES MULTIPLO DE UNO: ");
		// num = multiplo.nextInt();
		// if (num%1==0) {
		// System.out.println(num + " Es multiplo de UNO");
		// }
		// else {
		// System.out.println(num + " No es multiplo de UNO");
		// }
		// multiplo.close();
		// }
		// /*SOLUCION*/
		// Scanner multiplo = new Scanner(System.in);
		// int numero;
		// System.out.println("Introduce un numero ");
		// numero = multiplo.nextInt();
		// for (int i =1;i<5;i++) {
		// System.out.println(numero * i);
		// }

		// /*===============EJERCICIO 4==============================*/
		/*
		 * Escribir un programa donde se muestren todos los números divisibles por 7
		 * menores a 10000
		 */
		// for (int i=0; i < 1000; i++) {
		// if(i%7==0) {
		// System.out.println(i);
		// }
		// }
		// SOLUCION 2:
		/* podriamos multiplicar por 7 ya que sabemos que es multiplo */
		// //INCLUSO ESTE ES EL MAS OPTIMO
		// for (int i=1; i < 10000; i++) {
		// System.out.println(7*i);
		// }

		// /*===============EJERCICIO 5==============================*/
		/*
		 * Escribir un programa que pida por teclado un número al usuario y diga si es
		 * par o impar
		 */
		// Scanner parImpar = new Scanner(System.in);
		// System.out.print("Pasa un numero y te dire es PAR O IMPAR: ");
		// int num;
		// num = parImpar.nextInt();
		// if (num%2==0) {
		// System.out.println("Tu numero " + num + " es par"); //PREGUNTA??? en este
		// print en ves de meter la variable num meti el objeto parImpar por que da ese
		// error
		// }
		// else {
		// System.out.println("No es par :(");
		// }

		
		
		// /*===============EJERCICIO 6==============================*/
		/*
		 * Escribir un programa que pida por teclado un número al usuario y diga si es
		 * divisible por 3 o no.
		 */
		// Scanner teclado = new Scanner(System.in);
		// System.out.print("TU NUMERO ES DIVISIBLE POR 3?: ");
		// int num = teclado.nextInt();
		// if (num%3==0) {
		// System.out.print("Tu numero es divisible por 3");
		// }
		// else {
		// System.out.println("tu numero no es divisible de 3");
		// }

		
		
		// /*===============EJERCICIO 7==============================*/
		/*
		 * Escribir un programa que pida un número por teclado al usuario que simule ser
		 * el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%
		 */
		// Scanner teclado = new Scanner(System.in);
		// System.out.println("CALCULO EL 21% DE UN PRECIO");
		// double articulo = teclado.nextInt();
		// double iva;
		// iva = articulo*0.21 ;
		// articulo=articulo - iva;
		// System.out.println(articulo);

		
		
		// /*===============EJERCICIO 8==============================*/
		// Escribir un programa que reciba por teclado el importe de una cantidad a
		// pagar en euros
		// (puede tener decimales) y el número de meses que contamos para pagarla (tiene
		// que ser un
		// número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No
		// aplicamos
		// intereses de ningún tipo y redondeamos a dos decimales
		// Scanner teclado = new Scanner(System.in);
		// Scanner teclado2 = new Scanner(System.in); // tengo que crear un scanner por
		// cada entrada por teclado que hago
		// System.out.print("INTRODUCE EL TOTAL A PAGAR: ");
		// double total = teclado.nextDouble();
		// System.out.print("CUANTOS MESES TIENES PARAR PAGARLO: ");
		// int mes = teclado2.nextInt();
		// double mensualidad = total / mes;
		// System.out.println("tienes que pagar " + mensualidad + "€");

		
		
		/// *===============FUNCION RANDOM==============================*/
		// funcion que genera numero RANDOM
		// Math.random(); devuelve un numero entre 0 y 0,999... ES DECIR DOUBLE
		// System.out.println(Math.random());
		// double azar = Math.random();
		// System.out.println(azar); // sale entre 0 y 0,999...
		// azar = azar *6;
		// System.out.println(azar); //sale entre 0 y 6.99999
		// azar =(int)azar; //CAST//convertimos el numero double de math.random a entero
		// System.out.println(azar); // numero entero entre 1 y 6

		// /*PEDIR EXPLICACION DEL 6 Y 1*/
		// int dado = (int)(Math.random()*6)+1;
		// System.out.println(dado);

		// GENERAR UN NUMERO ALEATORIO ENTRE 5 15
		// int inicio =5;
		// int fin =15;
		//
		// int dado = (int)(Math.random()*(fin-inicio+1))+inicio;

		// int inicio =10;
		// int fin =20;
		// //quiero generar 100 numero entre 2 y 4
		// for(int i=0;1<100;i++) {
		// int dado = (int)(Math.random()*(fin-inicio+1))+inicio; //ver explicacion de
		// esta linea
		// System.out.println(dado);
		// }

		// System.out.println(dado);esto da error por que la variable se creo dentro del
		// bloque for
		// y solo se puede utilizar dentro de ese bloque
		// System.out.println(); con esto pasaria lo mismo

		/// *===============EJERCICIO 9==============================*/
		/*
		 * Escribir un programa que genere un número aleatorio entre el 0 y el 50 y lo
		 * muestre
		 */
		// int inicio = 0;
		// int fin = 50;
		// int aleatorio=(int)(Math.random()*(fin-inicio+1))+inicio;
		// System.out.println(aleatorio);
		// //FORMULA PARA GENERAR UN NUMERO ENTRE UN INICIO Y UN FIN
		// //(int)(Math.random()*(fin-inicio+1))+inicio;
		//

		// *===============EJERCICIO 10==============================*/
		/*
		 * Escribir un programa que genere dos números aleatorios simultáneamente entre
		 * el 1 y el 6 (simulando una tirada de dos dados
		 */
//		int inicio = 1;
//		int fin = 6;
//		int azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
//		int azar2 = (int) (Math.random() * (fin - inicio + 1) + inicio);
//		System.out.println("Primer numero es: " + azar);
//		System.out.println("Segundo numero es: " + azar2);

		
		
		// *===============EJERCICIO 11==============================*/
		// Modificar el programa anterior para que tu programa tire dos dados de forma
		// continuada
		// hasta que el número que salga en ambos sea el mismo. En ese momento debería
		// de parar la
		// ejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a
		// ese resultado
//		int inicio = 1;
//		int fin = 6;
//		
//		int contador=0;
//		
//		int azar=1;
//		int azar2=0;
//		
//		while (azar!=azar2) {	
//			azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
//			azar2 = (int) (Math.random() * (fin - inicio + 1) + inicio);
//			System.out.println("DADO 1 --> : " + azar);
//			System.out.println("DADO 2 --> : " + azar2);
//			System.out.println("  ");//SEPARACION PARA QUE SE VEA MAS CLARO 
//			contador++;
//		}
//		System.out.println("Ha entrado al bucle " + contador + " veces");
//		
		
		// *===============EJERCICIO 12==============================*/
		//Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
		//pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
		//8, 12, etc.) A continuación debería de hacer la tirada y mostrarla
		//ESTA ERA MI SOLUCION PERO NO ES MUY enrevesado
		
		/*
		Scanner teclado =new Scanner(System.in);
		System.out.println("CUANTOS DADOS VAS A TIRAR?:  ");
		int numDados = teclado.nextInt();
		System.out.println("Cuantas caras tienen tus dados");
		int numCarasFin = teclado.nextInt();
		int inicio= 1;//inicio 1 por que siempre el menor numero de un dado va ser 1
		
		
		if (numDados==1) {
			System.out.println("VAS A UTILIZAR " + numDados + " DADO CON " + numCarasFin + " CARAS");
			int tirada= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
			System.out.println("DADO UNO --> " + tirada);
		}
		else if (numDados==2) {
			System.out.println("VAS A UTILIZAR " + numDados + " DADOS CON " + numCarasFin + " CARAS");
			int tirada1= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
			int tirada2= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
		
			System.out.println("DADO UNO, SALIO --> " + tirada1);
			System.out.println("DADO DOS, SALIO --> " + tirada2);
			System.out.println("=====================");
			System.out.println("TOTAL: "+ (tirada1+tirada2));// entre () por que se tiene que hacer la suma no es una concatenacion
															
		}
		else if (numDados==3) {
			System.out.println("VAS A UTILIZAR " + numDados + " DADOS CON " + numCarasFin + " CARAS");
			int tirada3= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
			int tirada4= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
			int tirada5= (int)(Math.random()*(numCarasFin-inicio+1)+inicio)*numDados;
		
			System.out.println("DADO UNO, SALIO --> " + tirada3);
			System.out.println("DADO DOS, SALIO --> " + tirada4);
			System.out.println("DADO TRES, SALIO --> " + tirada5);
			System.out.println("=====================");
			System.out.println("TOTAL: "+ (tirada3+tirada4+tirada5));// entre () por que se tiene que hacer la suma no es una concatenacion
															
		}
		teclado.close();
		*/
	}
}






