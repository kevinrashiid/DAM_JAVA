package arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		/*
		//RECORRIENDO UN ARRAY
		double[] notas= {7.3,8.5,9,10,3,3,4};//7 posiciones
		for(int posiciones=0;posiciones<notas.length;posiciones++) {
			System.out.println(notas[posiciones]);
		}
		System.out.println("··········································");
		//sumando dos puntos extras a cada alumno
		for(int posiciones=0;posiciones<notas.length;posiciones++) {
			//notas[posiciones]=notas[posiciones]+2;
			notas[posiciones]+=2; //esto y lo de arriba es igual
			System.out.println(notas[posiciones]);
		}
		*/
		
		//DATOS
		String[] profes= {"natalia","victor","Eduardo"};
		String[] profesNuevos;
		double[] numerosDecimales={7,8,53.2,3.333,432.2};	
		profesNuevos=profes; //asignando al segundo array los valores del nuevo array
		/*
		for(int i=0;i<profesNuevos.length;i++) {
			System.out.println(profesNuevos[i]);//profesNuevos y profes tienen el mismo contenido
		}
		*/
		profesNuevos[2]="yago";//sustituyendo eduardo
		//si se recorre sale lo mismo por que son dos variables apuntado a la misma celda dde memoria
		for(int i=0;i<profesNuevos.length;i++) { 
			System.out.println(profesNuevos[i]);
		}
		for(int i=0;i<profes.length;i++) {
			System.out.println(profes[i]);
		}
		//TODO ··· HACIENDO COPIAS  
		//hacemos una copia TOTAL de profes
		String[] copiaProfes=Arrays.copyOf(profes,profes.length); 
		//quita eduardo por que quitas una celda
		String[] copiaProfesMenos1=Arrays.copyOf(profes,profes.length-1);
		//hacemos una copia pero con dos espacios vacios nuevos
		String[] copiaProfesMas2=Arrays.copyOf(profes,profes.length+2); 

		//RECORRIENDO UN ARRAY
		for(int i=0;i<profes.length;i++) { 
			System.out.println(i+" - "+profes[i]); //para mostrar las posiciones
		}
		//TODO ··· RECORRIENDO UN ARRAY CUANDO SOLO ME INTERESA EL CONTENIDO Y NO LAS POSICIONES
		for(String nombre:profes) {
			System.out.println(nombre);
		
		}
		
		
		
		if(profes.equals(copiaProfesMas2)) {//comparacion de arrays
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		
		Arrays.sort(profes);//ordena alfabeticamente
		Arrays.sort(numerosDecimales);//tambien vale si son numeros
		
		//EL SIGUIENTE METODO FUNCIONA SOLO SI EL ARRAY ESTA ORDENADO ASCENDENTEMENTE --> SORT()
		//SIRVE PARA BUSCAR EL DATO ESTA EN EL ARRAY
		
		if(Arrays.binarySearch(profes, "victor")<0) {//si es menor que 0 no lo encuentra
			System.out.println("no esta en el array");
		}else {
			System.out.println("esta en el array");
		}
		//con esto estamos haciendo si 
		int posicion =Arrays.binarySearch(profes, "victor"); //si encuentra lo encuentra devuelve su posiciones
		//si no lo encuentra devuelve un numero negativo
		if(posicion >=0) {
			profes[posicion]="geraldo";
		}else {
			System.out.println("no esta ");
		}
		
		
		int diasDelMes[]= new int[12];//12 espacios
		Arrays.fill(diasDelMes,30);//rellena todas sus posiciones con la segunda posicion -->30
		for(int mes:diasDelMes) {
			System.out.print(mes +"  ");
		}
		
		//toString 
		String texto= Arrays.toString(diasDelMes);//para convertir un array a texto
		texto=texto.replace("[", "");
		texto=texto.replace("]", "");
		System.out.println(texto);
		/*
		//EJERCICIO 4 EXAMEN
		String texto1="examen 1T01";
		String texto2="Octubre-2025";
		
		//.split se aplica a una cadena de texto
		//separa cada elemento por un espacio y los mete en una posicion del array
		String[] elementos1=texto1.split(" ");
		for(String elemento:elementos1) {
			System.out.println(elemento);
		}
		String[] elementos2=texto2.split(" ");
		for(String elemento:elementos2) {
			System.out.println(elemento);
		}
		
		//esto da error
		String resultado=elementos1[1]+"-"+elementos2[1]+" "+elementos1[0]+" "+elementos2[0];
//		resultado=resultado+elementos1[0]+" "+elementos1[0]+" "+elementos2[0];
		System.out.println(resultado);
		*/
		
		//es como el anterior pero como con expresiones regulares 
		String texto3="en un lugar     de la mancha        de cuyo nombre no quiero";
		String[]palabras=texto3.split("[ ]+");
		String fraseCorrecta="";
		for(String c:palabras) {
			fraseCorrecta=fraseCorrecta+c+" "; //formando la palabra solo por UN espacio
		}
		//quitar espacios de adelante y atras con .trim()
		fraseCorrecta=fraseCorrecta.trim();
		System.out.println(fraseCorrecta);
		
		//················SALIDAS POR PANTALLA···························33
		System.out.println("Esto va en una linea\nY esto en la de abajo");
		String nombre ="jose maria";
		String apellido="morales vazques";
		int edad=27;
		double salario=1345.678;
		
		//#######codigos de control#################
		//LA LETRA ES EL TIPO DE VARIABLE
		//.printf
		//%s = string
		//%d = decimal
		//%f = numeros con decimales
		//.2 para REDONDEAR A DOS DECIMALES SI ELLA SALE SON DOS DECIMALES
		System.out.printf("tu nombre es %s apellido %s ,"
				+ " tienes %d y cobras %.2f euros",nombre,apellido,edad,salario);
		
		//PROGRAMA DE CONTABILIDAD
		int n1 =345;
		int n2=1245;
		int n3=2;
		int n4=32;
		
		//el 5 para que ordene en columnas y las unidades con las unidades etc es decir alinear a la derecha
		//el 5 es el numero que 
		System.out.printf("Ingresos:\n%5d€\n%5d€\n%5d€\n%5d€\n", n1, n2, n3, n4);
		// para que alinee a la izquierda
		System.out.printf("Ingresos:\n%-5d€\n%-5d€\n%-5d€\n%-5d€\n", n1, n2, n3, n4);
		// para que RELLENAR a la izquierda 0
		System.out.printf("Ingresos:\n%05d€\n%05d€\n%05d€\n%05d€\n", n1, n2, n3, n4);

		double d1 = 345.12;
		double d2 = -1245.1;
		double d3 = 2.9;
		double d4 = 32.3456;
		// para alinear en base a la coma
		//el signo - tambien cuenta por eso es %9 si no el d2 se descuadra
		System.out.printf("Ingresos:\n%9.3f€ \n%9.3f€ \n%9.3f€ \n%9.3f€ \n", d1, d2, d3, d4);
		
		//si el numero es positivo te lo pone si es negativo te pone - (tambien cuanta como caracter)
		System.out.printf("Ingresos:\n%+9.3f€ \n%+9.3f€ \n%+9.3f€ \n%+9.3f€ \n", d1, d2, d3, d4);
		//si queremos hacer que los negativos salgan entre parentesis
		System.out.printf("Ingresos:\n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n", d1, d2, d3, d4);
		
		//para que salga la salida de color rojo 
		System.err.printf("Ingresos:\n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n", d1, d2, d3, d4);
		
		//EJERCICIO QUE TE PIDA POR TECLADO LAS CIFRAS Y LOS DECIMALES Y QUE IMPIRMA SEGUN
		//LO QUE LE HAS PASADO
		Scanner teclado=new Scanner(System.in);
		System.out.println("cuantas cifras totales quieres que tenga? ");
		String cifras=teclado.nextLine();
		System.out.println("cuantas cifras decimales quieres que tenga? ");
		String decimales=teclado.nextLine();
		
		double c1=233.3;
		double e=2.71828;
		
		//introducimos el formato en una variable
		String formato="%"+cifras+"."+decimales+"f";
		System.out.println(formato);
		formato=formato+"\n"+formato;//para ir saltar de linea

		System.out.printf(formato,c1,e);
		
		//con esto nos podemos ahorrar un varible pero no lo guardamos en una variable
		//System.out.printf("%"+cifras+"."+decimales+"f",c1,e);
	}
}

