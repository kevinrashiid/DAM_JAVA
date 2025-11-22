package boletin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b8_2 {

	public static void main(String[] args) {

		// EJERCICIO 2
//		Scanner teclado=new Scanner(System.in);
//		System.out.println("INTRODUCE CONTASEÑA\n Deber tener entre 8 y 20 caraceteres"
//				+ "\n Al menos una mayuscula y una minuscula"
//				+ "\n Al menus un numero"
//				+ "\n Debe tener un simbolo de los siguientes  _, -, !, ?, *");
//		String contraseña=teclado.nextLine();

		String contraseña = "ssddaA2wdds";
		boolean aceptada = true;

//		do {	
		if (entre8y20caracteres(contraseña)) {
			aceptada = true;
		} else {
			System.out.println("Tu contraseña no tiene tiene entre 8 y 20 caracteres");
			aceptada = false;
		}
		if (validarMayusMinus(contraseña)) {
			aceptada = true;
		} else {
			System.out.println("Tu contraseña tiene que tener al menos una mayuscula y una minuscula");
			aceptada = false;
		}
		if (alMenosUnNumero(contraseña)) {
			aceptada = true;
		} else {
			System.out.println("tu contraseña no tiene ningun numero");
			aceptada = false;
		}
		if (aceptada == false) {
			System.out.println("Tu contraseña debe cumplir todos los requisitos");
		}

//		}while(aceptada==false);

	}

	public static boolean entre8y20caracteres(String contraseña) {
		Pattern rango = Pattern.compile(".{8,20}");
		Matcher entre8y20 = rango.matcher(contraseña);
		return (entre8y20.find());
	}

	public static boolean validarMayusMinus(String p) {
		Pattern minusculas = Pattern.compile("[a-zñ]");
		Matcher tieneMinusculas = minusculas.matcher(p);
		return (tieneMinusculas.find());
	}

	// este es ta mal
	public static boolean alMenosUnNumero(String p) {
		Pattern numero=Pattern.compile("[0-9]+");
		Matcher tieneUnNumero=numero.matcher(p);
		return(tieneUnNumero.find());
	}
}
