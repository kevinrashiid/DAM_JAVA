
package holaMundo;


public class HolaMundo {
	
	public static void main(String[] args) {
		
		
		/*=========ENTEROS=========*/		
		System.out.print("Hola Mundo " );
		System.err.println("Hola Mundo"); 
		/*Un mensaje pero en rojo pero que salga 
		al principio, antes que el primer syso*/
		
		int edad = 20; /*creamos la variable con 20*/
		edad = 30; /* cambiamos la valor de "edad" a 30 */
		System.out.println(edad); // saldra 30
		
		edad = edad + 1;
		System.out.println(edad);
		
		edad = 56;
		int precio = 0;
		int curso =1;
		int edadSegunda =57;
		edad = 51;
		curso =1+1;
		edadSegunda = edad + 2;
		curso  = curso +3; // esto es lo mismo que lo de abajo
		curso += 3; 
		
		/*=========DECIMALES=========*/
		double precioDouble = 4.3; //FORMATO PREFERIDO DE JAVA
		//float iva = 12.5; //formato preferido de java es el double por eso da error
		float iva2 = (float)12.5; //aqui ya no da error por que hemos puesto un cast
								  // un cast fuerza a ser ese tipo de dato
		
		/*=========DECIMALES=========*/ 
		System.out.println(5.0/2);  /*si hay algun numero decimal 
									la operacion te sale con decimales*/
		System.out.println(5%2);
		
		/*=========OPERADORES=========*/ 
		
		/* podriamos utilizar todos estos +=
		-=
		*=
		/=
		%= 
		*/
		
		int x =5;
		int y =3;
		// estos dos son los mismos
		x ++; // x vale 6
		x = x +1;
		
		// estos dos son los mismos
		y --; //y vale 2
		y = y-1;
		/*=========CASOS SUPUESTOS=========*/
		//Estos dos sacan dos casos diferentes pero x se incrementa siempre
		//segun es el orden de que se ejecuta primero
		//preguntar a GPT por que?
		System.out.println(x++);
		System.out.println(++x);

		/*=========String/Cadenas de texto=========*/ 
		String texto ="Hola mundo";
		String text = "5"; // No es numero es un caracter
		System.out.println(texto);
		texto ="hola" + "adios"; //concatenar texto
		//NO se pueden MODIFICAR las cadenas de texto se tiene que crear una nueva cadena de texto

		/*=========BOLEANOS=========*/ 
		boolean acertado = true;
		boolean negativo = false;
		
		
		
		/*=========SENTENCIAS DE CONTROL=========*/
		/*en estas pocas lineas imprime la dos print*/
		int nino =18;
		if (nino >= 18)
			System.out.println("Eres mayor de edad");
			System.out.println("ya puedes votar");
		
		/*en cambio aqui no como no cumple el primero que le pertenece al if no se cumple 
		 * y no se impreme*/
		int nina =15;
		if (nina >= 18)
				System.out.println("Eres mayor de edad");
				System.out.println("ya puedes votar");	
		
		/*esto es un bloque que de codigo dentro del IF*/		
		int nAna =15;
		if (nAna >= 18) {
					System.out.println("Eres mayor de edad");
					System.out.println("ya puedes votar");		
		}
		
		/*=========DE COMPARACION=========*/
		/*
		< MENOR QUE 
		> MAYOR QUE 
		<= MENOR O IGUAL QUE
		>= MAYOE O IGUAL QUE
		== SI ES IGUAL
		!= SI ES DISTINTO O IGUAL
		*/
		
		int nono = 18;
		if (nono != 18) {
			System.out.println("tu edad no es 18");
		}
		else {
			System.out.println("Tienes 18 años");
		}
		System.out.println("Fin del programa");
		
/*===========================================*/

		
		/*  
		si es menor de 18 
		si tiene 18 
		o 
		si tiene mas de 18
	
		
		int edad2 = 18;
		if (edad2 < 18) {
			System.out.println("Tienes menos de 18 años");
		}
		else if (edad2==18) { /*AÑADIMOS un else if 
			System.out.println("Tienes EXACTAMENTE 18");
		}
		else {
			System.out.println("Tienes mas de 18 años");
		}
		System.out.println("fin del programa de EDAD2");
		*/
		
		
	
		/* DECIR A QUE CLASE ECONOMICA PERTENECES
		sueldo=5000
		dependiendo del sueldo
		2500 clase media 
		10.000 clase alta
		1000 clase baja
		*/
		/*int sueldo = 5000  ;
		if (sueldo < 1000) {
			System.out.println("TIENES UN SUELDO BAJO, NO PAGAS IMPUESTOS");
		}
		else if(sueldo >= 1000 && sueldo < 10000) {
			System.out.println("Clase media PAGAS 10%");
		}
		else if(sueldo >= 10000 ) {
			System.out.println("Clase alta PAGAS 50%");
		}
		else {
			System.out.println("NO TIENES SUELDO!!!");
		}*/
		
		
		/*
		 IGUAL QUE EL ANTERIOR PERO HECHO POR EL PROFE
		double sueldo = 700;
		if (sueldo < 1000) { 
			System.out.println("Tu sueldo es menor a 1000");
		}
		else if (sueldo < 10000){
			System.out.println("tu sueldo es mayor a 1000 pero menor que 10000");
		}
		else {
			System.out.println("tu sueldo es mayor a 10000");
		}
		*/
		
		/*CALCULAR EL SUELDO NETO SEGUN LO QUE COBRES
		double sueldo = 30000;
		double neto = 0;
		if (sueldo < 1000) { 
			System.out.println("Tu sueldo es menor a 1000 - no pagas IMPUESTOS");
		}
		else if (sueldo < 10000){
			//neto = sueldo * 0.9;
			neto = sueldo - (sueldo *10/100); //el profe lo soluciono asi
			System.out.println("Cobras " + sueldo + " tu sueldo es mayor a 1000 pero menor que 10000 PAGAS UN 10% SERIA: " + neto);
		}
		else {
			//neto = sueldo/2; //yo lo hice asi
			neto = sueldo - (sueldo *50/100); //linea del profe
			System.out.println("tu sueldo es mayor a 10000 PAGAS 50% tu sueldo seria; " + neto);
		}
		*/
		//TIPO DE DATO CHAR
		char letra ='X'; //comillas simples -- solo podemos meter UNA LETRA
		String otraLetra = "X"; //comillas dobles -- podemos poner varias letras
		
		//blucle que saca del 0 al 9
		/*for (int i=0; i<10; i++)
			System.out.println(i); 

		for (int i=0; i<10; i++) {
			System.out.println(i);
			//System.out.println("i");  i i i i i i i i i i i
		}
		*/
		
		
	}
}
