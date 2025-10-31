package SolucionExamen;
public class ejercicio4Solucion {

	public static void main(String[] args) {
		String texto1="Examen 1T01";
		String texto2="Octubre-2025";
		
		//cortando texto
		int posicion=texto1.indexOf(" ");
		String uno=texto1.substring(posicion+1);
		String tres=texto1.substring(0,posicion);
		
		//cortando texto
		posicion=texto2.indexOf("-");
		String dos=texto2.substring(posicion+1);
		String cuatro=texto2.substring(0,posicion);
		
		//sumando las longitud cadena
		int longitud=texto1.length()+texto2.length();
		
		String resultado=uno+"-"+dos+" "+tres+" "+cuatro+"("+longitud+")";
		System.out.println("Resultado: "+resultado);
	}
}



