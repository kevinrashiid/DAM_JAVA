package P1;

import java.util.Scanner;


public class E1_BOLETIN_U3 {

	public static void main(String[] args) {

		//================ejercicio 1=============================
		//Escribir un programa donde se muestren los 10 primeros números enteros
		 /*int entero;
		 for (int i =0; i<10;i++) {
		 System.err.println(i);
		 }

		 */

		//===============EJERCICIO 2==============================
		// Escribir un programa donde se muestren los 50 primeros números pares
		//SOLUCION 1:
		/*int par;

		 for (int i=0;i<50;i+=2) {
		 System.out.println(i);
		 }
		 SOLUCION 2: es mucho mejor la primera ya que aqui depende si pones el syso
		 debajo del contador
		 salen los impares
		 int par2;
		 for(int i=0;i<50;i++) {
		 if(i%2==0) {
		 System.out.println(i);
		 i++;
		 }
		 */
		
		

		//===============EJERCICIO 3==============================
		 //Escribir un programa donde se muestren los 5 primeros números múltiplos de
		 //uno dado por el usuario (se introducirá por teclado)
		 //ESTA ES MI SOLUCION PERO LO ENTENDI MAL
		 /*Scanner multiplo= new Scanner(System.in);
		 int num;
		 for(int i=0; i<5; i++) {
		 System.out.println("TE DIRE SI ES MULTIPLO DE UNO: ");
		 num = multiplo.nextInt();
		 if (num%1==0) {
		 System.out.println(num + " Es multiplo de UNO");
		 }
		 else {
		 System.out.println(num + " No es multiplo de UNO");
		 }
		 multiplo.close();
		 }
			//SOLUCION
		 Scanner multiplo = new Scanner(System.in);
		 int numero;
		 System.out.println("Introduce un numero ");
		 numero = multiplo.nextInt();
		 for (int i =1;i<5;i++) {
		 System.out.println(numero * i);
		 }
		 */

		
		
		
		//===============EJERCICIO 4==============================
		//Escribir un programa donde se muestren todos los números divisibles por 7
		//menores a 10000
		 /*for (int i=0; i < 1000; i++) {
		 if(i%7==0) {
		 System.out.println(i);
		 }
		 }
		// SOLUCION 2:
		// podriamos multiplicar por 7 ya que sabemos que es multiplo 
		 //INCLUSO ESTE ES EL MAS OPTIMO
		 for (int i=1; i < 10000; i++) {
		 System.out.println(7*i);
		 }
		 */

		
		
		//===============EJERCICIO 5==============================
		 //Escribir un programa que pida por teclado un número al usuario y diga si es
		 //par o impar
		/*
		 Scanner parImpar = new Scanner(System.in);
		 System.out.print("Pasa un numero y te dire es PAR O IMPAR: ");
		 int num;
		 num = parImpar.nextInt();
		 if (num%2==0) {
		 System.out.println("Tu numero " + num + " es par"); //PREGUNTA??? en este
		 print en ves de meter la variable num meti el objeto parImpar por que da ese
		 error
		 }
		 else {
		 System.out.println("No es par :(");
		 }
		 */

		
		
		//===============EJERCICIO 6==============================
		//Escribir un programa que pida por teclado un número al usuario y diga si es
		//divisible por 3 o no.
		 /*
		 Scanner teclado = new Scanner(System.in);
		 System.out.print("TU NUMERO ES DIVISIBLE POR 3?: ");
		 int num = teclado.nextInt();
		 if (num%3==0) {
		 System.out.print("Tu numero es divisible por 3");
		 }
		 else {
		 System.out.println("tu numero no es divisible de 3");
		 }
		 */
		
		
	
		//===============EJERCICIO 7==============================
		//Escribir un programa que pida un número por teclado al usuario que simule ser
		//el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%
		 /*
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("CALCULO EL 21% DE UN PRECIO");
		 double articulo = teclado.nextInt();
		 double iva;
		 iva = articulo*0.21 ;
		 articulo=articulo - iva;
		 System.out.println(articulo);
		 */

		
		
		//===============EJERCICIO 8=============================
		//Escribir un programa que reciba por teclado el importe de una cantidad a
	    //pagar en euros
	    //(puede tener decimales) y el número de meses que contamos para pagarla (tiene
		//que ser un
		//número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No
		//aplicamos
		//intereses de ningún tipo y redondeamos a dos decimales
		/*
		 Scanner teclado = new Scanner(System.in);
		 Scanner teclado2 = new Scanner(System.in); // tengo que crear un scanner por
		 cada entrada por teclado que hago
		 System.out.print("INTRODUCE EL TOTAL A PAGAR: ");
		 double total = teclado.nextDouble();
		 System.out.print("CUANTOS MESES TIENES PARAR PAGARLO: ");
		 int mes = teclado2.nextInt();
		 double mensualidad = total / mes;
		 System.out.println("tienes que pagar " + mensualidad + "€");
		 */

		
		
		 //===============FUNCION RANDOM==========================
		 //funcion que genera numero RANDOM
		 //Math.random(); devuelve un numero entre 0 y 0,999... ES DECIR DOUBLE
		/*System.out.println(Math.random());
		 double azar = Math.random();
		 System.out.println(azar); // sale entre 0 y 0,999...
		 azar = azar *6;
		 System.out.println(azar); //sale entre 0 y 6.99999
		 azar =(int)azar; //CAST//convertimos el numero double de math.random a entero
		 System.out.println(azar); // numero entero entre 1 y 6

		// PEDIR EXPLICACION DEL 6 Y 1
		 int dado = (int)(Math.random()*6)+1;
		 System.out.println(dado);

		// GENERAR UN NUMERO ALEATORIO ENTRE 5 15
		 int inicio =5;
		 int fin =15;
		
		 int dado = (int)(Math.random()*(fin-inicio+1))+inicio;

		 int inicio =10;
		 int fin =20;
		 //quiero generar 100 numero entre 2 y 4
		 for(int i=0;1<100;i++) {
		 //ver explicacion de  esta linea
		 int dado = (int)(Math.random()*(fin-inicio+1))+inicio; 
		 System.out.println(dado);
		 }

		// System.out.println(dado);esto da error por que la variable se creo dentro del
		// bloque for
		// y solo se puede utilizar dentro de ese bloque
		// System.out.println(); con esto pasaria lo mismo
		*/

		
		
		 //===============EJERCICIO 9=============================
		 //Escribir un programa que genere un número aleatorio entre el 0 y el 50 y lo muestre
		 /*
		 int inicio = 0;
		  
		 int fin = 50;
		 int aleatorio=(int)(Math.random()*(fin-inicio+1))+inicio;
		 System.out.println(aleatorio);
		
		 //FORMULA PARA GENERAR UN NUMERO ENTRE UN INICIO Y UN FIN
		 //(int)(Math.random()*(fin-inicio+1))+inicio;
		  */
		
		
		
		//===============EJERCICIO 10=============================
		//Escribir un programa que genere dos números aleatorios simultáneamente entre
		//el 1 y el 6 (simulando una tirada de dos dados
		 /*
				int inicio = 1;
				int fin = 6;
				int azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
				int azar2 = (int) (Math.random() * (fin - inicio + 1) + inicio);
				System.out.println("Primer numero es: " + azar);
				System.out.println("Segundo numero es: " + azar2);
		 */

		
		
		//===============EJERCICIO 11===========================
		 //Modificar el programa anterior para que tu programa tire dos dados de forma
		 //continuada
		 //hasta que el número que salga en ambos sea el mismo. En ese momento debería
		 //de parar la
		 //ejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a
		 //ese resultado
				/*
				 int inicio = 1;
				int fin = 6;
				int contador=0;
				int azar=1;//
				int azar2=0;//

				while (azar!=azar2) {	//un while por que no se cuantos veces tengo que tirar los dados hasta que salgan iguales
					azar = (int) (Math.random() * (fin - inicio + 1) + inicio);
					azar2 = (int) (Math.random() * (fin - inicio + 1) + inicio);
					System.out.println("DADO 1 --> : " + azar);
					System.out.println("DADO 2 --> : " + azar2);
					System.out.println("  ");//SEPARACION PARA QUE SE VEA MAS CLARO 
					contador++;
				}
				System.out.println("Haz hecho " + contador + " tiradas");

		SOLUCION PROFE

		int azar=1;
		int azar2=0;
		int contador=0;
		do {
			azar = (int) (Math.random() * ((6)) + 1);
			azar2 = ( int) (Math.random() * ((6)) + 1);
			System.out.println("DADO 1 --> : " + azar);
			System.out.println("DADO 2 --> : " + azar2);
			System.out.println("  ");//SEPARACION PARA QUE SE VEA MAS CLARO 
			contador++;
		}while(azar!=azar2);
		System.out.print("He tenido que tirar los dados  "+ contador);
		if (contador==1) {
			System.out.print(" vez");
		}else
			System.out.print(" veces");
		 */
		
		
		
		//===============EJERCICIO 12==============================
		//Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
		//pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
		//8, 12, etc.) A continuación debería de hacer la tirada y mostrarla
		//ESTA ERA MI SOLUCION PERO NO ES MUY enrevesado
		
		/*
		Scanner teclado =new Scanner(System.in);
		System.out.println("NUMERO DE DADOS: ");
		int dados = teclado.nextInt();
		System.out.println("CARAS DEL DADO PUENDEN SER 4 - 6 - 8 - 12: ");
		int caras=teclado.nextInt();
		int contador=0;
		for(int i=0;i<dados; i++) { //ver la explicacion de este for
			contador++;
			int tirada=(int)(Math.random()*(caras)+1);
			System.out.println("Dado: "+contador+ " --> " +tirada);
		}
		teclado.close();
		 */

		
		
		//===============EJERCICIO 13==============================
		//Modifica el programa anterior para que no admita dados con un número de caras impares
		//(¡no existen!). En el caso de meter un número impar de caras el programa debería de
		//informarnos de que es erróneo y volver a preguntarnos por este dato.
		/*
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("NUMERO DE DADOS: ");
		int dados = teclado.nextInt();

		System.out.print("INTRODUCE LAS CARAS DEL DADO PUENDEN SER 4 - 6 - 8 - 12 ---> ");
		int caras=teclado.nextInt();
		
		int contador =0;

		while(caras%2!=0)	{
			System.out.println("no existe dados con caras impares");
			System.out.print("INTRODUCE OTRA VEZ LA CARA: ---> ");
			caras=teclado.nextInt();
		}
		int total=0;
		for(int i=0;i<dados; i++) {
			contador++;
			int tirada=(int)(Math.random()*caras)+1;
			System.out.println("DADO: " + contador +" --> " + tirada);
			total +=tirada;
		}
		System.out.println("TOTAL --> "+ total);
		*/
	

		
		//===============EJERCICIO 14==============================
		//Escribir un programa que nos pida dos números por teclado y genere un número aleatorio
		//comprendido entre ambos. Por el momento no te preocupes de que el primer número
		//siempre debería de ser menor que el segundo, simplemente no los metas en un orden
		//incorrecto.
		
		/*Scanner entrada=new Scanner(System.in);
		System.out.print("Primer numero --> ");
		int numero1=entrada.nextInt();
		System.out.print("Segundo numero --> ");
		int numero2=entrada.nextInt();
		//siempre el mas grande - el mas pequeño +1 y le sumas el mas pequeño
		int aleatorio=(int)(Math.random()*(numero2-numero1+1)+numero1); //generacion de un numero entre dos numeros 
		System.out.println("EL NUMERO ALETARIO ENTRE" + numero1 + " y " + numero2 + " ES "+ aleatorio);
		*/

		//===============EJERCICIO 15==============================
		//Modificar el programa del punto anterior para que si el primer número que metemos es
		//mayor que el segundo funcione correctamente. Es decir, si metemos en primer lugar el 50 y
		//en segundo el 10 nos debería de generar un número aleatorio entre el 10 y el 50 (y no entre el
		//50 y el 10 que no tiene mucha lógica…)
		
		/*Scanner entrada=new Scanner(System.in);
		System.out.print("Primer numero --> ");
		int numero1=entrada.nextInt();
		System.out.print("Segundo numero --> ");
		int numero2=entrada.nextInt();
		
		while (numero1<numero2) {
			System.err.print("EL PRIMER NUMERO ES MENOR, VUELVE A INTRODUCIRLO -->");
			numero1=entrada.nextInt();
		}
		
		//siempre el mas grande - el mas pequeño +1 y le sumas el mas pequeño
		int aleatorio=(int)(Math.random()*(numero2-numero1+1)+numero1); //generacion de un numero entre dos numeros 
		System.out.println("EL NUMERO ALETARIO ENTRE " + numero1 + " y " + numero2 + " ES "+ aleatorio);
		*/
		//PREGUNTAR AL PROFE SI ESTA BIEN
		
		//===============EJERCICIO 16==============================
		//Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando una
		//lotería primitiva). Por el momento no te preocupes de que algunos números puedan salir
		//repetidos. Ya resolveremos eso más adelante.
		/*
		int inicio = 1;
		int fin=49;
		int contador=1;
		for(int i=0;i<6;i++) {
			int aleatorio=(int)(Math.random()*(fin-inicio+1)+inicio);
			System.out.println("El numero--> "+contador+ " es "+aleatorio);
			contador++;
		}
		*/
		
		
		//===============EJERCICIO 17==============================
		//Escribir un programa que nos permita generar una quiniela. Para ello nos debe generar
		//quince números aleatorios entre el 1 y el 3. Recuerda que los resultados válidos son 1 X o 2,
		//así que si te sale un 3 lo que tienes que imprimir en pantalla es una X
		
		/*
		int inicio=1;
		int fin=3;
		int quinceNum;
		for(int i=0;i<15;i++) { //generamos 15 numeros
			quinceNum=(int)(Math.random()*(fin-inicio+1)+inicio); //que sean entre 1 y 3
			if(quinceNum==3) { //esos 15 numeros alguno es 3 que saque 3
				System.out.println("X");
			}
			else if(quinceNum!=3) { //si es diferente a 3 que saque los que puede que son 1 o 2
				System.out.println(quinceNum);
			}
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
		Scanner teclado=new Scanner(System.in);
		System.out.println("TU NUMERO ES PRIMO?? --> ");
		int numPrimo=teclado.nextInt();
	}
}





















