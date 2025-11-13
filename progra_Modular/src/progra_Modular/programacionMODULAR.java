package progra_Modular;

public class programacionMODULAR {

	public static void main(String[] args) {
		
		muestraNumero(5);//utilizando funcion
		//SALIDA --> 5
		int n=6;
		muestraNumero(n);//pasandole un variable
		//SALIDA --> 6
		
		//le pasamos el numero de caracteres y el caracter Q
		//resultado de funcion guardandolo en una variable
		String texto=creaLinea(4, 'Q'); 
		System.out.println(texto); //SALIDA -> QQQQ
		
		
		
		
	}
	
	
	//void significa vacio //que no devuelve nada
	//si devuelve un string cambios el void por el String
	//la variable numero solo existe dentro de la funcion
	//void es como el tipo de dato que va devolver
	public static void muestraNumero(int numero) { //funcion de ejemplo para ver como funcionan las funcioones
		System.out.println(numero);
	}
	
	
	//FUNCION QUE RECIBA UN CARACTER Y UN NUMERO
	//cuando queremos devolver algo ponemos un return
	//funcion que recibe dos variables de tipos distintos
	public static String creaLinea(int veces, char caracter) { 
		String cadena="";
		for(int i=0;i<veces;i++) {
			cadena=cadena+caracter;
		}
		return cadena; //para que devuelva el string
	}
	
	
	
	
}


