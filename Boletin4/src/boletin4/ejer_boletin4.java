package boletin4;

import java.util.Scanner;

public class ejer_boletin4 {
	public static void main(String[] args) {
		// ================ejercicio 1=============================
		// Escribir un programa que pida un número por teclado y calcule su factorial.
		// Como
		// sabes, la factorial de un número se calcula multiplicando ese número por los
		// sucesivos factores que obtenemos restando uno hasta llegar a la unidad.
		// Por ejemplo, el factorial de 6 (que se representa así 6!) sería este:
		// 6! = 6*5*4*3*2*1 = 720
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce numero y te calculo sus factoriales -->");
		int numeroPedido = teclado.nextInt();
		int factorial = 1;
		for (int i = numeroPedido; i >= 1; i--) {// for que genere desde el numero que meto hasta el uno
			factorial = factorial * i; // multiplico por i que va cada vez que entre en el bucle sera un numero menor
		}
		System.out.println(factorial);
		*/
		
		// ================ejercicio 2=============================
		//En matemáticas, la sucesión de Fibonacci se trata de una serie infinita de números
		//naturales. Los dos primeros son siempre el 0 y el 1. Los siguientes se obtienen
		//sumando los dos anteriores. El tercero sería 1 (la suma de 0 + 1), el cuarto sería 2 (la
		//suma de 1 + 1), el quinto 3 (la suma de 1 + 2) y así sucesivamente. La lista con los 10
		//primeros números sería esta: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34].
		//Queremos hacer un programa que reciba un número por teclado y nos calcule tantos
		//números de la sucesión de fibonacci como indique ese número. Por ejemplo, si
		//metemos un 8 la salida de tu programa debería de ser así:
		//0,1,1,2,3,5,8,13
		Scanner teclado =new Scanner(System.in);
		//System.out.println("introduce numero -->");
		//int numero =teclado.nextInt();
		
		int num0=0;
		int num1=1;
		for (int i=0 ; i<10 ; i++) { //imprimimos 10 numeros
			System.out.print(num0 + " "); 
			//sumamos los dos anteriores que se van actulizando 
			//por que a num0 se le va asignar el valor antiguo de num1 
			int nuevo=num1+num0; // SUMA DE DOS ANTERIORES
			num0=num1; //el num1 pasa a ser el num0
			num1=nuevo;//y el num1 se guarda el valor que dio de num1+num0
		}
		
		
		// ================ejercicio 5=============================
		//Escribir un programa que nos diga si un número es capicúa.
		//UN NUMERO CAPICUA ES SI SE LEE IGUAL DEL DERECHO Y DEL REVES POR EJMPLO:
		//818 111 232
		//para resolver esto tenemos que convertir a String para darle la vuelta
		//luego de darle la vuelta lo volvemos a convertir a int 
		//y ese int lo comparamos con int que pasamos por teclado
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("introduce numero y te dire si es CAPICUA --> ");
		int numeroPedido=teclado.nextInt();
		teclado.close();//cerramos el teclado
		
		String numeroTexto=String.valueOf(numeroPedido);//convertir de numero a texto
		String alReves ="";//cadena vacia para introducir el texto al reves
		
		//recoremos la cadena al reves -1 por que queremos la ultima posicion
		//y se para cuando sea menor que 0
		for(int i=numeroTexto.length()-1; i>=0; i--) {
			alReves = alReves + numeroTexto.charAt(i);//introducimos la cadena al reves en la variable
		}
		int numeroInt=Integer.parseInt(alReves);//convertir de texto a numero
		if(numeroInt==numeroPedido) { //COMPARACION DEL NUMERO PEDIDO Y EL NUMERO CONVERTIDO
			System.out.println("EL NUMERO " +numeroPedido+ " ES CAPICUA");
		}else {
			System.out.println("EL NUMERO NOOO " +numeroPedido+ " ES CAPICUA\"");
		}
		*/
	

		
		
		// ================ejercicio 14=============================
		//Escribe un programa que lea una hora por teclado en formato 24 horas (HH:MM). 
		//Tu programa debería de decir si corresponde a la mañana (entre las 6 y las 11, ambas
		//inclusive), si es una hora de la tarde (entre las 12 y las 19, ambas inclusive), si es de la
		//noche (entre las 20 y las 23, ambas inclusive), si es de la madrugada (entre las 0 y las
		//5, ambas inclusive) o bien, si el formato no es correcto o no se corresponde con una
		//hora real (minutos de mas de 60, horas negativas o por encima de 23, etc.
		
		//SOLUCION DEL PROFE --VALIDACION DE UNA CADENA 
		// QUE COSAS TENGO QUE VALIDAR
		//1.-Longitud==5
		//2.-Caracter de separacion ==':'
		//3.-horas entre 0>= <=23
		//4.- Minutos entre 0>= <=59
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.print("INTRODUCE HORA EN FORMATO MM:HH --> ");
		String hora= teclado.nextLine();
		teclado.close();
		boolean bandera=true; //bandera
		int hhEntero=0;
		int mmEntero=0;
		if(hora.length()==5 && hora.charAt(2)==':' && hhEntero>=0 && hhEntero<=23 && mmEntero>=0 && mmEntero<=59)	{	
				hhEntero=Integer.parseInt(hora.substring(0,2)); //CORTAMOS LAS HORAS Y LAS CONVERTIMOS A INT
				mmEntero=Integer.parseInt(hora.substring(3,5)); //CORTAMOS LOS MINUTOS Y LOS CONVERTIMOS A INT
				}else {
					bandera=false; //SI NO SE CUMPLE LO DEL IF BANDERA ES IGUAL A FALSE SALTA AL ELSE QUE ESTA DEBAJO
				}
		if(bandera=true) { 
			System.out.println("la hora " + hora+" esta en un formato correcto");
			if(hhEntero>=06 && hhEntero<=11)	{
				System.out.println("Las "+hora+" es por la mañana");
			}
			else if(hhEntero>=12 && hhEntero<=19) {
				System.out.println("Las "+hora+" es por la tarde");
			}
			else if(hhEntero>=20 && hhEntero<=23) {
				System.out.println("Las "+hora+" es por la noche");
			}
			else if(hhEntero>=00 && hhEntero<=05) {
				System.out.println("Las "+hora+" es de madrugada");
			}
		}else {
			System.out.println("la hora " + hora+" esta en un formato INCORRECTO");
		}
		*/
		
		
		///ESTO ES UNA ESTA BIEN HASTA QUE ENTRA EN EL IF QUE SE PUEDE UNIR TODO Y AHORRARTE VARIAS LINEAS DE CODIGO
		/*if(hora.length()==5)	{
			if(hora.charAt(2)==':') {
				String hh=hora.substring(0,2);//extraemos las horas
				String mm=hora.substring(3,5);//extraemos los minutos
				int hhEntero=Integer.parseInt(hh); //conversion se horas a enteros
				int mmEntero=Integer.parseInt(mm);//conversion se minutos a enteros
				
				//ESTO ES LO MISMO QUE LO DE ARRIBA COMENRADO
				hhEntero=Integer.parseInt(hora.substring(0,2)); //CORTAMOS LAS HORAS Y LAS CONVERTIMOS A INT
				int mmEntero=Integer.parseInt(hora.substring(3,5)); //CORTAMOS LOS MINUTOS Y LOS CONVERTIMOS A INT
				if(hhEntero>=0 && hhEntero<=23) {
					if(mmEntero>=0 && mmEntero<=59) {
						bandera=true;
					}
					else {
						bandera =false;
					}
				}else {
					bandera =false;
				}
			}
			
			else {
				bandera=false;
			}
		}
		else {
			bandera=false;
		}
		if(bandera=true) {
			System.out.println("la hora " + hora+" esta en un formato correcto");
			if(hhEntero>=06 && hhEntero<=11)	{
				System.out.println("Las "+hora+" es por la mañana");
			}
			else if(hhEntero>=12 && hhEntero<=19) {
				System.out.println("Las "+hora+" es por la tarde");
			}
			else if(hhEntero>=20 && hhEntero<=23) {
				System.out.println("Las "+hora+" es por la noche");
			}
			else if(hhEntero>=00 && hhEntero<=05) {
				System.out.println("Las "+hora+" es de madrugada");
			}		}else {
			System.out.println("la hora " + hora+" esta en un formato incorrecto");
		}
		*/

	
		//MI POSIBLE SOLUCION SIN ACABAR
		/*
		Scanner teclado = new Scanner(System.in);
		int horasConvertidas=0;
		String horas="";
		String tiempo="";
		do {
		System.out.println("INTRODUCE LA HORA");
		teclado.nextLine();
		horas=tiempo.substring(0,2);
		System.out.println(horas);
		horasConvertidas=Integer.parseInt(horas);
		}while(horasConvertidas>=00 && horasConvertidas<=23 ==false);
		
		if(horasConvertidas>=06 && horasConvertidas<=11)	{
			System.out.println("Las "+horas+" es por la mañana");
		}
		else if(horasConvertidas>=12 && horasConvertidas<=19) {
			System.out.println("Las "+tiempo+" es por la tarde");
		}
		else if(horasConvertidas>=20 && horasConvertidas<=23) {
			System.out.println("Las "+tiempo+" es por la noche");
		}
		else if(horasConvertidas>=00 && horasConvertidas<=05) {
			System.out.println("Las "+tiempo+" es de madrugada");
		}
		else if(horasConvertidas>24) {
			System.out.println("ERROR ESE NUMERO NO CORRESPONDE A LAS HORAS");
		}
		*/
//		for(int i=0;i<tiempo.length();i++) {
//		}
//		
	}
}





