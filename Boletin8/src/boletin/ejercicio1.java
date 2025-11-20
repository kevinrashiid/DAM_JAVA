package boletin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ejercicio1 {

	public static void main(String[] args) {
		//Una matriz transpuesta es aquella en la que se intercambian filas por columnas. A
		//continuación tienes dos ejemplos de una matriz y su transpuesta:
		//		
		//Realiza un programa que dada una matriz almacenada en un array te calcule su transpuesta
		//y la almacene en otro diferente. Tu programa debería, ademas, dibujar en consola las
		//matrices de la siguiente forma:
		//| 1 2 |
		//| 3 4 |
		//| 1 3 |
		//| 2 4 |
		
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insertar filas: ");
		int filas=teclado.nextInt();
		System.out.println("Insertar columnas: ");
		int columnas=teclado.nextInt();
		int[][] mapa=new int[filas][columnas];
		int[][] mapa2=new int[columnas][filas];
		
		
		int total=(int)(Math.random()*9)+1;

		int contador=0;
		
		for(int i=0;i<filas;i++) {
			for(int x=0;x<columnas;x++){
//				mapa[i][x]=contador++;
				int v=azarNumero(columnas, filas);
				mapa[i][x]=v;
				System.out.print(mapa[i][x]+" ");
			}
			System.out.println();
		}
		
System.out.println();
		for(int c=0;c<columnas;c++) {
			for(int f=0;f<filas;f++) {
				int v=azarNumero(columnas, filas);
				mapa2[c][f]=mapa[f][c];
				System.out.print(mapa2[c][f]+" ");
			}
			System.out.println();
		}
	}
	//TODO FUNCION QUE GENERA NUMEROS ALETORIOS TANTAS VECES COMO CELDAS TENGA EL MAPA
	public static int azarNumero(int columnas, int filas) {
		int maxCeldas=columnas*filas;
		int total=0;
		for(int i=0;i<maxCeldas;i++) {
			total=(int)(Math.random()*9)+1;			
		}
		return total;
	}*/
		
//		Scanner teclado=new Scanner(System.in);
//		System.out.println("INTRODUCE CONTASEÑA\n Deber tener entre 8 y 20 caraceteres"
//				+ "\n Al menos una mayuscula y una minuscula"
//				+ "\n Al menus un numero"
//				+ "\n Debe tener un simbolo de los siguientes  _, -, !, ?, *");
//		String contraseña=teclado.nextLine();
		String contraseña="ssddaA2wdds";
		boolean aceptada=true;
		
//		do {	
		if(entre8y20caracteres(contraseña)) {
			aceptada=true;
		}else {
			System.out.println("Tu contraseña no tiene tiene entre 8 y 20 caracteres");
			aceptada=false;
		}
		if(validarMayusMinus(contraseña)) {
			aceptada=true;
		}else {
			System.out.println("Tu contraseña tiene que tener al menos una mayuscula y una minuscula");
			aceptada=false;
		}
		if(alMenosUnNumero(contraseña)) {
			aceptada=true;
		}else {
			System.out.println("tu contraseña no tiene ningun numero");
			aceptada=false;
		}
		if(aceptada==false) {
			System.out.println("Tu contraseña debe cumplir todos los requisitos");
		}
		
//		}while(aceptada==false);
		
	}
	
	public static boolean entre8y20caracteres(String contraseña) {
		return  (contraseña.matches(".{8,20}"));
	}
	public static boolean validarMayusMinus(String p) {
		Pattern minusculas=Pattern.compile("[a-zñ]");
		Matcher tieneMinusculas=minusculas.matcher(p);
		return(tieneMinusculas.find());
	}
	//este es ta mal
	public static boolean alMenosUnNumero(String contraseña) {
		boolean p=contraseña.matches("[0-9]+");
		return p;
	}
//	public static boolean compruebaLongitud(String contraseña) {
//		Pattern simbolos=Pattern.compile("[a-zñ]");
//		
//		
//	}
}








