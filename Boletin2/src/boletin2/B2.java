package boletin2;

import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
		
		//RECOMENDABLE HACER LOS PROGRAMAS DE POCO A POCO
		
		//================ejercicio 1 SIN ACABAR=============================
		//Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos las
		//muestre en pantalla ordenadas alfabeticamente en orden ascendente
		/*Scanner teclado= new Scanner(System.in);
		
		System.out.println("Primera palabra --->");
		String letra1=teclado.nextLine();
		
		System.out.println("Segunda palabra --->");
		String letra2=teclado.nextLine();
		
		System.out.println("Tercera palabra --->");
		String letra3=teclado.nextLine();
		
		if(letra1.compareTo(letra2)==0) {
			System.out.println(letra1 +" son iguales "+ letra2);
		}else if(letra1.compareTo(letra2)==1){
			System.out.println(letra1 +" "+ letra2);
		}
		
//		String primera=letra1.compareTo(letra2);
	*/
		//================ejercicio 8=============================
		//Escribe un programa que pida un número por teclado y escriba todos sus divisores
		//separados por comas (y evitando poner una coma al final). Por ejemplo, si el número
		//introducido es el 14 tu programa debería de mostrar lo siguiente:
		//Divisores del número 14: 1, 2, 7, 14
		//================SIN ACABAR CREO QUE ESTA MAL=============================
		//da un error
		Scanner teclado = new Scanner(System.in);
		System.out.println("INTRODUCE UN NUMERO Y TE DIRE TODOS SUS DIVISORES");
		int numero = teclado.nextInt();
		teclado.close();
		String numeroMostrado = "";
		for (int i = 1; i<=numero; i++) {//RECOREMOS HASTA QUE i SEA MAYOR AL NUMERO DADO
			if (numero % i == 0) { //SI EL NUMERO DADO SE DIVIDE ENTRE i Y DA 0...
				numeroMostrado = numeroMostrado+i + ", "; //GUARDAMOS i Y LA SEPARACION EN ESTE CASO LA COMA
			}
		}
		//CORTAMOS EL ESPACIO Y LA COMA AÑADIDOS--> (", ")
		//MOSTRAMOS DESDE LA POSICION 0 HASTA LA ULTIMA -2
		numeroMostrado=numeroMostrado.substring(0,numeroMostrado.length()-2);
		System.out.println("DIVISORES DE "+numero+" SON: "+numeroMostrado);


		
		
		
		//================ejercicio 9=============================
		//Escribir un programa que pida números entre el 1 y el 100 por teclado hasta que
		//escribamos la palabra FIN (con mayúsculas). Si el usuario introduce una entrada
		//inválida (números superiores a 100, otras cadenas de caracteres que no sean FIN, etc.)
		//no se tendrá en cuenta pero se mostrará un mensaje de error y el programa seguirá
		//su curso. Cuando terminamos (al introducir la palabra FIN, recuerda) mostraremos
		/*
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		int contador = 0;
		do {
			System.out.println("INTRODUCE UN NUMERO ENTRE EL 0 Y EL 100 o FIN: ");
			entrada = teclado.nextLine();// recogemos por teclado y lo guardamos en entrada
			entrada = entrada.toLowerCase(); // para que cambie a minusculas por is meten mayusculas
			if (!entrada.equals("fin")) {
				int numero = Integer.parseInt(entrada);// convierto entrada en numero
				if (numero >= 1 && numero <= 100) { // si entre 1 y 100
					contador++; //para contar cuantos numeros entre 1 y 100 estamos metiendo
				}
			}
		} while (!entrada.equals("fin")); // si entrada es distinto a sigue en el bucle
		System.out.println("Has metido "+contador+" numeros entre 1 y el 100");
		*/
		//================ejercicio 12=============================
		//Realiza un juego en el que debes de acertar un número entre el 1 y el 50 que el
		//ordenador ha elegido de forma aleatoria. El programa te dejará tantos intentos como
		//necesites y te indicará si has acertado, si te has pasado o si te has quedado corto. El
		//programa finaliza cuando se acierta o cuando se superan el número máximo de intentos
		//establecidos en 5
		//GENERAR NUMERO ALETORIO entre 1 y 50
		/*int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		
		//System.out.println(azar); comentamos esto para que no nos el numero
		for(int intentos=1;intentos<6 && acertado==false;intentos++) {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
		}
		//si acabamos con los aciertos sale del bucle y entra aqui 
		if(acertado==false) {
			System.out.println("LO SIENTO HAS TERMINADO CON LOS INTENTOS EL NUMERO ERA "+azar);
		}
		*/
		//================ejercicio 13=============================
		//Modifica el programa anterior para que el programa te de todos los intentos que
		//necesites pero que cuando aciertes te informe de cuantas veces has fallado antes de
		//lograrlo
		//LO HACEMOS CON UN DO WHILE POR QUE AL MENOS TIENE QUE PREGUNTAR UNA VEZ
		/*int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		int intentos=1;
		//System.out.println(azar); comentamos esto para que no nos el numero
		do {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			intentos++;//contador
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
		}while(acertado==false);
		*/
		//esta linea EN AHORA EN EL 13 no tiene sentido por que ya no va salir hasta que se acierte
		//if(acertado==false) {
		//System.out.println("LO SIENTO HAS TERMINADO CON LOS INTENTOS EL NUMERO ERA "+azar);
		//}
		
	/*	int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		boolean acertado= false;
		for(int intentos=1; acertado==false;intentos++) { //esto seria para el profe un FOR de forma elegante
		System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
		int eleccion=teclado.nextInt();
		intentos++;//contador
		if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
			System.out.println("ACERTASTE!!");
			acertado=true;//
		}else if(eleccion> azar) {
			System.out.println("uhhh te  has pasado");
		}else {
			System.out.println("casi, te has quedado corto");
		}
		}
		*/
		
		/*
		int azar=(int)(Math.random()*50)+1;
		Scanner teclado=new Scanner(System.in);
		
		boolean acertado= false;
		boolean replay=false;
		int intentos=1;
		System.out.println(azar); //comentamos esto para que no nos el numero
		do {//5 numeros de intentos //y si acertamos acertado se pone true y sale del bucle
			System.out.print("Intento numero "+ intentos +"¿En que numero estoy pensando?");
			int eleccion=teclado.nextInt();
			intentos++;//contador
			if(eleccion==azar) { //si la eleccion es igual al numero generado BINGO!!
				System.out.println("ACERTASTE!!");
				acertado=true;//
			}else if(eleccion> azar) {
				System.out.println("uhhh te  has pasado");
			}else {
				System.out.println("casi, te has quedado corto");
			}
			*/
		//================ejercicio 16=============================
		//Escribe un programa que pida por teclado el radio de una circunferencia, admitiendo
		//valores con decimales y calcule la longitud y el área de la circunferencia (redondeando
		//a cinco decimales). Si no las recuerdas, las fórmulas son las siguientes:
		//area = 3.14159 * radio2
		//longitud = 2 * 3.14159 * radio
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un radio de tu circunferencia-->");
		double radio= teclado.nextDouble();
		double area= 2*3.14159*radio;
		double longitud= 3.14159* radio * radio;
		System.out.println("Longitud del cirulo --> ");
		System.out.println("Area del circulo --> ");
		
		//PARA CONSEGUIR CINCO CIFRAS DECIMALES
		//1.- multiplicamos por 1 seguido de cinco ceros
		longitud=longitud*100000;
		area=area*100000;
		*/
		//2.-Convertimos a entero
		
		
		//================ejercicio 17=============================
		//Escribir un programa que reciba por teclado una temperatura en cualquiera de las
		//tres unidades básicas (Celcius, Farenheit o Kelvin) y la devuelva en las otras dos.
		//Tu programa reconocerá la unidad que has usado al introducir la entrada por teclado
		//porque irá acompañado de una letra que lo indique. Por ejemplo, 12C, 280.57K o
		//98.6F
		//Se admitirán decimales en la entrada, (como se ve en los ejemplos anteriores) y se
		//devolverá el resultado con dos decimales
		//Las formulas de conversión entre unidades son las siguientes:
		//Para convertir de ºC a ºF use la fórmula: ºF = ºC x 1.8 + 32. !!
		//Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.   
		//Para convertir de ºK a ºC use la fórmula: ºC = ºK – 273.15 
		//Para convertir de ºC a ºK use la fórmula: ºK = ºC + 273.15.  !!
		//Para convertir de ºF a ºK use la fórmula: ºK = 5/9 (ºF – 32) + 273.15.
		//Para convertir de ºK a ºF use la fórmula: ºF = 1.8(ºK – 273.15) + 32
		//================ SIN ACABAR =============================
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("INTRODUCE UNA TEMPERATURA ");
		String temperatura =teclado.nextLine();		
		teclado.close();
		double numero=Double.parseDouble(temperatura.substring(0,temperatura.length()-1)); //cojemos la parte del numero
		char unidad =temperatura.charAt(temperatura.length()-1);//cojemos la unidad
		
		System.out.println(numero+ " - " +unidad);
		double calculo=0;
		switch(unidad) {
		case 'C','c':
			calculo=(numero*1.8)+32;
			System.out.println(temperatura +" equivale a "+calculo+"F");
			calculo=numero+273.15;
			System.out.println(temperatura +" equivale a "+calculo+"K");
			break;
		case 'F':
			break;
		case 'K':
			
			break;
			default: 
				System.out.println("Launidad no esta reconocida");
			
		}
		*/
		
		
		
	}	
}























