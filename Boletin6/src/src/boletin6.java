package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class boletin6 {

	public static void main(String[] args) {
		//^incio $fin 
		/*
		//TODO EXTRAER TEXTO DE CON EXPRESIONES REGULARES
				String mensaje="hola llamame a este numero 622307406";
				Pattern patron=Pattern.compile("[6-8][0-9]{8}");
				Matcher matcher=patron.matcher(mensaje);
				if(matcher.find()) {
				//String numero=matcher.group();
					System.out.println("telefono "+matcher.group());
				}
		*/
		// ================ejercicio 1====================================================
		//Validar un código postal de Madrid. Cinco números, los dos primeros siempre son el 28
		//Ejemplo: 28032
		/*
		String codigoPostal="28032";
		//codigo postales que solo empiezan por 28 con ^(28)
		// y para decir que solo entran 3 digitos mas podriamos poner el $ al final "^(28)[0-9]{3}$" 
		//marcando el final despues de los 3 digitos
		if(codigoPostal.matches("^(28)[0-9]{3}")) { //TODO CODIGO POSTAL
			System.out.println("codigo postal correcto");
		}else {
			System.out.println("codigo postal incorrecto");
		}
		*/
		// ================ejercicio 2====================================================
		//Validar un número de teléfono
		//Ejemplo: 91345566
		/*
		String numero="91345566";
		if(numero.matches("^(9)[0-9]{7}")) {//TODO NUMERO TELEFONO
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 3====================================================
		//Validar un número de teléfono móvil (debe de empezar por 6, 7 u 8)
		//Ejemplo: 655776655
		/*
		String movil="655776655";
		if(movil.matches("^(6|7|8)[0-9]{8}")) { //TODO NUMERO MOVIL
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 4====================================================
		//Validar un número de teléfono con prefijo internacional (empieza por el signo + seguido
		//de dos dígitos, luego un espacio y a continuación un número de teléfono.
		//Ejemplo +34 912233444
		/*
		String telefonoPrefijo="+34 912233444";
		// el \\s? es un espacio opcional lo puede tener o no gracias al ? si se lo quitamos es obligatorio
		// esto ^\\+34 significa que SI O SI empieza por esto caracteres
		// el $ significa que termina justo despues del los ultimos 8 numero
		if(telefonoPrefijo.matches("^\\+34\\s?[0-9]{9}$")) {//TODO telefono con prefijo
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 5====================================================
		//Validar dos palabras de cualquier tamaño separadas por un único espacio en blanco.
		//Las palabras no pueden contener números y deben de empezar ambas por una letra
		//mayúscula.
		//Ejemplo: Hola Mundo
		/*
		String texto="Hola Mundo";
		if(texto.matches("[A-Z][a-z]*\\s[A-Z][a-z]*")) { //TODO patron valido para un nombre
			System.out.println("correcto");
		}else{
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 6====================================================
		//Una clave con el siguiente formato XX00-xxX-00 donde las X deben de ser letras
		//mayúsculas, las x letras minúsculas y los 0 d´ígitos.
		//Ejemplo: AB12-xyZ-75
		/*
		String clave="AB12-xyZ-75";
		//TODO FORMATO PARA ESTA CLAVE EN ESPECIFICO
		if(clave.matches("[A-Z]{2}[0-9]{2}\\-[a-z]{2}[A-Z]\\-[0-9]{2}")) {
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 7====================================================
		//Validar una tarjeta de crédito: cuatro grupos de cuatro números cada uno separados por
		//un espacio. A continuación un espacio y la fecha de caducidad en formato MM/YY. El
		//mes tiene que ser válido (entre 01 y 12)
		//Ejemplo: 1234 5678 9012 3456 03/25
		/*
		String tarjeta="1234 5678 9012 3456 03/25"; 
		//TODO TARJETA DE CREDITO
		if(tarjeta.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s(0[1-9]|1[0-2])\\/[0-9]{2}")) {
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 8====================================================
		//Un IBAN bancario de España. Las dos letras iniciales siempre tienen que ser ES
		//Ejemplo: ES61 1234 3456 42 0456323532
		/*
		String cuentaBancaria="ES61 1234 3456 42 0456323532";
		//TODO cuenta bancaria
		if(cuentaBancaria.matches("^ES[0-9]{2}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{2}\\s[0-9]{10}")) {
			System.out.println("correcta");
		}else {
			System.out.println("incorrecta");
		}
		*/
		// ================ejercicio 9====================================================
		//Un número de 4 cifras mínimo y 8 cifras máximo
		//Ejemplo: 12345 
		/*
		String numero="1234567";
		if(numero.matches("[0-9]{4,8}")) {//TODO 4 mínimo y 8 máximo
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		// ================ejercicio 9====================================================
		//Una dirección IP pública de clase C. Cuatro bytes en formato decimal separados por un
		//punto. Los dos primeros tienen que ser siempre 192.168.
		//Ejemplo: 192.168.30.30
		/*
		String ip="192.168.30.30";
		//TODO SIN VALIDAR QUE PUEDE SER 255
		if(ip.matches("^192\\.168\\.[0-9]{1,3}\\.[0-9]{1,3}")) { //TODO PATRON IP 
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
		*/
		//TODO PARA VALIDAR QUE PUEDE SER HASTA 255
		//"192\\.168\\." +
		//"([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
		//"([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
		
	}
}












