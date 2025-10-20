package expreciones_regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expreciones_regulares {

	public static void main(String[] args) {
		/* === EXPRESIONES REGULARES === */
		//System.out.println("hola mundo\nkevin"); //salto de linea \n
		//si yo quiero poner una (\) barra pongo dos ya que si pongo una me pide una letra reservada
		//		System.out.println("esto es una \\ barra"); 
		// \d --> 
		// \\d{9} --> 8 digitos seguidos 
		// [0-9]{9} --> 8 digitos y que se repita 8 veces
		// [6-8][0-9] {8} --> 
		// EL PATRON Y EL MATCHER VAN DE LA MANO
		
		/*
		Pattern patron=Pattern.compile("[6-8][0-9]{8}");
		//Pattern patron = Pattern.compile("\\d{9}");
		
		
		Matcher coincidencia =patron.matcher("655334455"); //9 digitos
		//el numero cuadra con el patron?
		if(coincidencia.find()==true) { // 
			System.out.println("Es un numero de telefonos valido");
		}else {
			System.out.println("no es un numero de telefono valido");
		}
		*/
		// METODO MAS FACIL
		String telefono ="6655445566";
		//si este patron coincide con el numero del telefono
		//[6-8] el primer digito tiene que ser 6-7-8 por que los numeros empiezan por 6,7 o 8
		//[0-9] numeros del 0-9
		//{8} 
		if(telefono.matches("[6-8][0-9]{8}")==true) {
			System.out.println("telefono valido");
		}else {
			System.out.println("telefono NO valido");
		}
		//[A-Z a-z Ññ] {3}
		//PATRON DNI [0-9]{8}[A-Z]
		//PATRON MATRICULA [0-9]{4}\\s[A-Z a-z&&[^AEIOUQ]]{3}
		//.find() //mira si encuentra el patron
		//.matches() //tiene que coincidir EXACTAMENTE
	}
}