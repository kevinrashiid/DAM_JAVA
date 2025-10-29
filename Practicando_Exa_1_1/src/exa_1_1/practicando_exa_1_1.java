package exa_1_1;

import java.io.LineNumberReader;
import java.lang.reflect.Array;
import java.util.Arrays;
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
		//Escribir un programa que nos pida dos números por teclado y genere un número aleatorio
		//comprendido entre ambos. Por el momento no te preocupes de que el primer número
		//siempre debería de ser menor que el segundo, simplemente no los metas en un orden		
		//incorrecto
		/*
		Scanner teclado= new Scanner(System.in);
		System.out.println("primer numero ");
		int inicio=teclado.nextInt();
		System.out.println("segundo numero ");
		int fin=teclado.nextInt();
		int azar=(int)(Math.random()*(fin-inicio+1)+inicio);
		System.out.println(azar);
		*/
		
		//···········EJERCICIO 15···········
		//Modificar el programa del punto anterior para que si el primer número que metemos es
		//mayor que el segundo funcione correctamente. Es decir, si metemos en primer lugar el 50 y
		//en segundo el 10 nos debería de generar un número aleatorio entre el 10 y el 50 (y no entre el
		//50 y el 10 que no tiene mucha lógica…)
		/*
		Scanner teclado= new Scanner(System.in);
		System.out.println("primer numero ");
		int inicio=teclado.nextInt();
		System.out.println("segundo numero ");
		int fin=teclado.nextInt();
			if(inicio<fin) {
			int azar=(int)(Math.random()*(fin-inicio+1)+inicio);
			System.out.println(azar);
			}else {
				System.out.println("El primero siempre tiene que ser menor que el segundo");
			}
			*/
		//···········EJERCICIO 16···········
		//Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando una
		//lotería primitiva). Por el momento no te preocupes de que algunos números puedan salir
		//repetidos. Ya resolveremos eso más adelante.
		/*
		for(int i=0;i<6;i++) {
			int azar=(int)(Math.random()*(49-1+1)+1);
			System.out.println(azar);
		}
		*/
		//···········EJERCICIO 17···········
		//Escribir un programa que nos permita generar una quiniela. Para ello nos debe generar
		//quince números aleatorios entre el 1 y el 3. Recuerda que los resultados válidos son 1 X o 2,
		//así que si te sale un 3 lo que tienes que imprimir en pantalla es una X
		/*
		for(int i=0;i<15;i++) {
			int azar=(int)(Math.random()*(3-1+1)+1);
			if(azar==3) {
				System.out.println("x");
			}else {
				System.out.println(azar);
			}
		}
		*/
		//···········EJERCICIO 18···········
		//Escribe un programa que genere números aleatorios entre el 1 y el 1000 sin parar y que sólo
		//se detenga cuando salga el 666. Los números que ha tenido que generar tu programa hasta
		//aparecer el 666 son los que restan para el apocalipsis. Tu programa debería de indicarlo con
		//un mensaje tétrico (¡Faltan 236 días para que se acabe todo! por ejemplo)
		/*
		int azar=0;
		int contador=0;
		while(azar!=666) {
			azar=(int)(Math.random()*(1000-1+1)+1);
//			System.out.println(azar);
			contador++;
		}
		System.out.println("¡Faltan "+contador+" días para que se acabe todo!");
		*/
		
		//···········EJERCICIO 19···········
		//Escribir un programa que pida un número por teclado y nos muestre sus divisores
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("numero--> ");
		int numero=teclado.nextInt();
		for(int i=numero;i>0;i--) {
			if(numero%i==0) { //divisores
				System.out.println(i+" es divisor");
			}
		}
		*/
		
		
		//···········EJERCICIO 20···········
		//Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
		//muestre en pantalla ordenados de menor a mayor
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("primer numero--> ");
		int numero1=teclado.nextInt();
		System.out.println("segundo numero--> ");
		int numero2=teclado.nextInt();
		System.out.println("tercer numero--> ");
		int numero3=teclado.nextInt();

		//ordenador 3 numeros ascendente
		int max=Math.max(Math.max(numero1, numero2),numero3);
		int min=Math.min(Math.min(numero1, numero2),numero3);
		
		int medio=(numero1+numero2+numero3)-(max+min);
		System.out.println(min+"··"+medio+"··"+max);
		*/
		
		//···········EJERCICIO 21···········
		//Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no
		/* SIN ACABAR
		Scanner teclado=new Scanner(System.in);
		System.out.println("numero--> ");
		int numero=teclado.nextInt();
		boolean banderas=false;
		while(banderas==false) {
			if(numero%1==0 && numero%numero==0);
		}
		*/
		//···········EJERCICIO 22···········
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos
		//las muestre en pantalla ordenadas alfabeticamente en orden ascendente
		
		//···········EJERCICIO 23···········
		//Escribir un programa que te escriba todos los números primos que hay entre el 1 y el 100
		
		//···········EJERCICIO 24···········
		//Modifica el programa anterior para que sea el usuario quién introduzca dos números y se nos
		//muestre los primos que hay entre ambos
		
		//···········EJERCICIO 25···········
		//Escribir un programa que reciba por teclado un número y muestre sucesivamente el
		//resultado de ir dividiéndolo por dos sucesivamente hasta llegar a un número igual o menor a 1.
		//Caso de ser necesario los resultados se mostrarán con dos decimales. Un ejemplo de una
		//ejecución correcta después de introducir el número 34 sería esta:
		//Haz introducido el número 34
		//17
		//8.5
		//4.25
		//2.12
		//1.06
		//0.53
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce numero--> ");
		double numero=teclado.nextDouble();
		teclado.close();
		while(numero>1) {
			numero=numero/2.0; //reasignamos numero con el cociente de la division
			numero=Math.floor(numero*100)/100; //SALIDA CON DOS DECIMALES
			System.out.println(numero);
		}
		*/
		//TODO ------------------- BOLETIN 2------------------
		//···········EJERCICIO 1···········
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos
		//las muestre en pantalla ordenadas alfabeticamente en orden ascendente
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("primera letra");
		String letra0=teclado.nextLine();
		System.out.println("segunda letra");
		String letra1=teclado.nextLine();
		System.out.println("tercera letra");
		String letra2=teclado.nextLine();
		
		String[] arrayOrdenado=new String[3];
		arrayOrdenado[0]=letra0;
		arrayOrdenado[1]=letra1;
		arrayOrdenado[2]=letra2;
		System.out.println("--------------");
		Arrays.sort(arrayOrdenado); //ordenar ascendente
		for(String n:arrayOrdenado)
			System.out.println(n);
		*/
		/*
		//···········EJERCICIO 2···········
		//al anterior pero ordenando ahora en orden descendente
		Scanner teclado=new Scanner(System.in);
		String[] arrayOrdenado=new String[3];

		System.out.println("primera letra");
		String letra0=teclado.nextLine();
		System.out.println("segunda letra");
		String letra1=teclado.nextLine();
		System.out.println("tercera letra");
		String letra2=teclado.nextLine();
		
		
		arrayOrdenado[0]=letra0;
		arrayOrdenado[1]=letra1;
		arrayOrdenado[2]=letra2;
		System.out.println("--------------");
		Arrays.sort(arrayOrdenado); //ordenar array descendente
		
		for(int i=arrayOrdenado.length-1;i>=0;i--) { //recorrer array al reves
			System.out.println(arrayOrdenado[i]);
		}
		*/
		
		//···········EJERCICIO 3···········
		//Escribir un programa que pida un número por teclado al usuario que simule ser el
		//precio de un artículo y escriba el resultado de aplicarle el IVA del 21%. El resultado
		//debe de estar redondeado a dos decimales.
		/*
		Scanner tecladoScanner=new Scanner(System.in);
		System.out.println("numero para aplicarle 21%IVA");
		double numero=tecladoScanner.nextDouble();
		numero=(numero+(numero/100)*21);//TODO SUMANDO EL 21% de IVA
		numero=Math.floor(numero*100)/100;//con dos decimales
		System.out.println(numero);
		*/
		//···········EJERCICIO 4···········
		//Escribir un programa que nos pida por teclado dos calificaciones numéricas de un
		//alumno y nos muestre la media aritmética resultante redondeada sin decimales. Las
		//notas introducidas deben de estar entre 0 y 10 y admiten decimales. Caso de que una
		//entrada sea errónea debería de advertirnos de ello y no hacer el cálculo
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("primera nota");
		double nota1 = teclado.nextDouble();
		System.out.println("segunda nota");
		double nota2 = teclado.nextDouble();
		teclado.close();
		double media = 0;
		if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {

			media = (nota1 + nota2) / 2;
			//podemos tambien convertirlo para que quede mas claro 
			int mediaRedondeada=(int)Math.round(media);
			System.out.println("media de notas " + mediaRedondeada); //redondeado sin decimales
		} else {
			System.out.println("introduce bien las notas!!");
		}
		*/
		//···········EJERCICIO 5···········
		//Escribir un programa que nos pida las notas obtenidas en un trimestre y nos muestre
		//la media ponderada sabiendo que;
		//1. La primera nota corresponde al trabajo en clase y cuenta como un 5% del total
		//2. La segunda corresponde a los ejercicios prácticos: 15%
		//3. La tercera la nota del examen: 80%
		//El resultado debería de mostrarse de dos formas: redondeado con dos decimales
		//(nota real) y sin redpmdeada sin decimales (nota de boletín)
		
		//···········EJERCICIO 9···········
		//Escribir un programa que pida números entre el 1 y el 100 por teclado hasta que
		//escribamos la palabra FIN (con mayúsculas). Si el usuario introduce una entrada
		//inválida (números superiores a 100, otras cadenas de caracteres que no sean FIN, etc.)
		//no se tendrá en cuenta pero se mostrará un mensaje de error y el programa seguirá
		//su curso. Cuando terminamos (al introducir la palabra FIN, recuerda) mostraremos
		//por pantalla el numero de entradas válidas que hemos hecho (sin contar esta última
		//que sólo sirve para finalizar el programa)
		/*
		boolean salida=false;
		String texto="";
		String patron="[0-9]{1,3}";
		int numero=0;
		int valido=0;
		int i=0;
		int[] arrayValidos=new int[0];
		Scanner teclado=new Scanner(System.in);
		
		while(salida==false) {
			System.out.println("introduce un numeros entro 1 y 100--> ");
			texto=teclado.nextLine();
			if(texto.equals("FIN")) {
				salida=true;
			}
			if(texto.matches(patron)) {
				numero=Integer.parseInt(texto);
				if(numero>=1&&numero<=100) {
					arrayValidos=Arrays.copyOf(arrayValidos, arrayValidos.length+1);
					arrayValidos[i]=numero;
					i++;
					valido++;
				}else {
					System.out.println("no esta en el rango");
				}
			}else {
				System.out.println("es otra cosa");
			}
		}
		System.out.println("Haz introducido "+valido+" numeros validos");
		for(int n:arrayValidos) {
			System.out.println(n);
		}
		*/
		//···········EJERCICIO 10···········
		//Modificar el programa anterior para que nos muestre al final la media aritmética de
		//las entradas válidas
		/*
		boolean salida=false;
		String texto="";
		String patron="[0-9]{1,3}";
		int numero=0;
		int valido=0;
		int i=0;
		int[] arrayValidos=new int[0];
		Scanner teclado=new Scanner(System.in);
		
		while(salida==false) {
			System.out.println("introduce un numeros entro 1 y 100--> ");
			texto=teclado.nextLine();
			if(texto.equals("FIN")) {
				salida=true;
			}
			if(texto.matches(patron)) {
				numero=Integer.parseInt(texto);
				if(numero>=1&&numero<=100) {
					arrayValidos=Arrays.copyOf(arrayValidos, arrayValidos.length+1);
					arrayValidos[i]=numero;
					i++;
					valido++;
				}else {
					System.out.println("no esta en el rango");
				}
			}else {
				System.out.println("es otra cosa");
			}
		}
		System.out.println("Haz introducido "+valido+" numeros validos");
		for(int n:arrayValidos) {
			System.out.println(n);
		}
		//TODO SACANDO MEDIA DE UN ARRAY
		double media=0;
		for(int x=0;x<arrayValidos.length;x++) {
			media=media+arrayValidos[x];
		}
		media=media/arrayValidos.length;
		System.out.println("la media es "+media);*/
		//···········EJERCICIO 11···········
		//Modificar el programa anterior para que, además, nos diga al final cual han sido el
		//número mayor y el menor que has introducido
		/*
		boolean salida=false;
		String texto="";
		String patron="[0-9]{1,3}";
		int numero=0;
		int valido=0;
		int i=0;
		int[] arrayValidos=new int[0];
		Scanner teclado=new Scanner(System.in);
		
		while(salida==false) {
			System.out.println("introduce un numeros entro 1 y 100--> ");
			texto=teclado.nextLine();
			if(texto.equals("FIN")) {
				salida=true;
			}
			if(texto.matches(patron)) {
				numero=Integer.parseInt(texto);
				if(numero>=1&&numero<=100) {
					//TODO AUMENTANDO EL TAMAÑO DE UN ARRAY
					arrayValidos=Arrays.copyOf(arrayValidos, arrayValidos.length+1);
					arrayValidos[i]=numero;
					i++;
					valido++;
				}else {
					System.out.println("no esta en el rango");
				}
			}else {
				System.out.println("es otra cosa");
			}
		}
		System.out.println("Haz introducido "+valido+" numeros validos");
		for(int n:arrayValidos) {
			System.out.println(n);
		}
		//TODO SACANDO MEDIA DE UN ARRAY
		double media=0;
		for(int x=0;x<arrayValidos.length;x++) {
			media=media+arrayValidos[x];
		}
		media=media/arrayValidos.length;
		System.out.println("la media es "+media);
		//TODO SACANDO EL MAYOR DE UN ARRAY
		Arrays.sort(arrayValidos);
		System.out.println("el mayor es "+arrayValidos[arrayValidos.length-1]);
		*/
		//···········EJERCICIO 12···········
		//Realiza un juego en el que debes de acertar un número entre el 1 y el 50 que el
		//ordenador ha elegido de forma aleatoria. El programa te indicará si has acertado, si te
		//has pasado o si te has quedado corto. El programa finaliza cuando se acierta o cuando
		//se superan el número máximo de intentos establecidos en 5
		/*
		int intentos=5;
		boolean acertado=false;
		int azar=(int)(Math.random()*50)+1;
		int numeroInput=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println(azar);
		do {
			System.out.println("Adivina Adivina el numero entre el 1 y 50");
			numeroInput=teclado.nextInt();
			if(numeroInput>azar) {
				System.out.println("Te has pasado");
				intentos--;
			}else if(numeroInput<azar) {
				System.out.println("Te has quedado corto");
				intentos--;
			}
			if(numeroInput==azar) {
				System.out.println("Acertaste el numero es "+azar);
				//para que se cumplan las dos condiciones del while
				acertado=true;
				intentos=0;
				teclado.close();
			}
		}while(intentos>0|acertado==false);
		*/
		
		//···········EJERCICIO 13···········
		//Modifica el programa anterior para que el programa te de todos los intentos que
		//necesites pero que cuando aciertes te informe de cuantas veces has fallado antes de
		//lograrlo
		/*
		boolean acertado=false;
		int intentos=0;
		int azar=(int)(Math.random()*50)+1;
		int numeroInput=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println(azar);
		do {
			System.out.println("Adivina Adivina el numero entre el 1 y 50");
			numeroInput=teclado.nextInt();
			if(numeroInput>azar) {
				System.out.println("Te has pasado");
				intentos++;
			}else if(numeroInput<azar) {
				System.out.println("Te has quedado corto");
				intentos++;
			}
			if(numeroInput==azar) {
				System.out.println("Acertaste el numero es "+azar);
				System.out.println("Lo hiciste con "+intentos);
				//para que se cumplan las dos condiciones del while
				acertado=true;
				teclado.close();
			}
		}while(acertado==false);
		*/
		
		//···········EJERCICIO 14···········
		//Modifica el programa anterior para que al final del programa te pida si quieres volver
		//a jugar y en caso afirmativo comience una nueva partida
		/*
		boolean replay=false;
		int intentos=0;
		int azar=(int)(Math.random()*50)+1;
		int numeroInput=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println(azar);
		String volverJugar="";
		while(replay==false) {
			System.out.println("Adivina Adivina el numero entre el 1 y 50");
			numeroInput=teclado.nextInt();
			if(numeroInput>azar) {
				System.out.println("Te has pasado");
				intentos++;
			}else if(numeroInput<azar) {
				System.out.println("Te has quedado corto");
				intentos++;
			}
			if(numeroInput==azar) {
				System.out.println("Acertaste el numero es "+azar);
				System.out.println("Lo hiciste con "+intentos);
				System.out.println("······Quieres volver a jugar??········");
				teclado.nextLine();//limpiar buffer 
				volverJugar=teclado.nextLine();
				if(volverJugar.equals("si")) {//volver a jugar
					replay=false;
				}else if(volverJugar.equals("no")){
					System.out.println("gracias por jugar!!");
					replay=true;
					teclado.close();
				}
			}
		}
		*/
		//TODO ------------------- BOLETIN 3------------------
		//···················EJERCICIO 7···········
		//Escribir un programa que pida por teclado una cadena de texto y la escriba con el
		//alfabeto típico de los hackers sustituyendo las letras a por el número 4, las letras e por
		//el número 3, las letras i por el número 1 y las letras o por el número 0. Considera que
		//las vocales pueden estar escritas en mayúsculas o minúsculas, pero no hace falta que
		//tengas en cuenta que además podrían ir acentuadas
		
	}
}












