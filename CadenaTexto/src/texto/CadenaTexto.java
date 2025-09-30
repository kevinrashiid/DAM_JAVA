package texto;

public class CadenaTexto {

	public static void main(String[] args) {
		//dos formas de crear un String
		//las dos son iguales pero en realidad por detras estamos haciendo la otra
		String texto1="hola mundo";
		String texto2=new String("Hola mundo cruel");
		
		//con el = modificamos el texto1 y reasignamos
		texto1= texto1 + " cruel";
		System.out.println(texto1);
		
		texto1 =texto1.concat(" Bienvenidos al goya");// es lo mimo que esto texto1= texto1 + " cruel";
		
		//por ejemplo aqui no modificamos solo mostramos por pantalla
		texto1.concat(" Bienvenidos al goya");
		System.out.println(texto1);
		
		//esto es lo mismo
		System.out.println(texto1 + " Bienvenido al goya");
		System.out.println(texto1.concat(" Bienvenidos al goya"));
		
		int precio=55;
		System.out.println("El precio es de "+precio+" euros");//el + como sabe que no puede sumar el texto lo une o concatena
		
		System.out.println(texto2.length());//devuelve longitud de una cadena
		System.out.println(texto2.charAt(3));//devuelve el caracter num 3 se empieza a contar desde 0
		
		//recoremos una cadena 
		for(int i=0;i<texto2.length();i++) {//.length para saber la longitud de texto
			System.out.println(texto2.charAt(i));//devolviendo i que a recorido la cadena de texto
		}
		
		System.out.println(texto2.toLowerCase());//devuelve la cadena de texto en minusculas
		System.out.println(texto2.toUpperCase());//devuelve la cadena de texto en mayusculas
		
		String nombre1="Rodriguez";
		String nombre2="RODRIGUEZ";
		if(nombre1.equals(nombre2)) {//compara si es igual o no
			System.out.println("Son Iguales");
		}else
			System.out.println("No son iguales");
		
		 
		//comparacion sin importar mayusculas
		if(nombre1.equalsIgnoreCase(nombre2)) {//compara si es igual o no //pero le da igual las mayus o minusculas
			System.out.println("Son Iguales");
		}else
			System.out.println("No son iguales");
		
		
		//para organizar alfabeticamente
		if (nombre1.compareTo(nombre2)==0) {//compareTo devuelve un  0 cuando las dos cadenas son iguales 
			System.out.println("Son iguales");
		}//si duvuelve un numero mayor que 0 quiere decir que la primera cadena es mayor que la segunda
		else if(nombre1.compareTo(nombre2)>0) 
			System.out.println(nombre1 + " va detras de "+ nombre2);
		else
			System.out.println(nombre1 +" va delante de " +nombre2);
		
		
		
		//SACANDO trozos de cadenas
		//empezando a contar desde 0
		System.out.println(nombre1.substring(3));//devolveria desde la R hasta el final
		System.out.println(nombre1.substring(3,7));//el 3 esta incluido pero el segundo no
		
		//CADENA VACIA Y CADENA NULA
		String cadenaVacia=""; //esta inicializada pero esta vacia
		
		//ESTOS DOS CASOS SI SE UTILIZAN DARA ERROR 
		String cadenaNula;  //
		String cadenaNula2= null; 
		
		if (cadenaVacia.isEmpty()) {//comprobar si la cadena esta vacia TRUE o FALSE
			System.out.println("LA CADENA ESTA VACIA");
		}
		
		
		//COMPARAR SI LA CADENA ESTA VACIA
		if (cadenaVacia.isEmpty()) {//comprobar si la cadena esta vacia TRUE o FALSE
			System.out.println("LA CADENA ESTA VACIA");
		}
		if (cadenaVacia.equals("")) {//comprobar si la cadena esta vacia TRUE o FALSE
			System.out.println("LA CADENA ESTA VACIA");
		}
		if (cadenaVacia.compareTo("")==0) {//comprobar si la cadena esta vacia TRUE o FALSE
			System.out.println("LA CADENA ESTA VACIA");
		}
		
		String texto="Hola Mundo soy java";
		//la cadena dada tiene que coincidir exactamente
		System.out.println(texto.indexOf("m"));//devuelve el numero del caracter cuando encuentre la primera (m)
		System.out.println(texto.indexOf("A")); //si no lo encuentra devuelve -1
		//indexOf funciona tambien con cadenas por ejemplo
		System.out.println(texto.indexOf("soy"));//devuelve la cadena de la primera palabra s
		System.out.println(texto.indexOf("soY")); //aqui devolveria -1
		
		System.out.println(texto.replace(" ", "/"));//todos los espacios en blanco los sustituye por un /
		//como vemos no modifica el texto solo se modifica si se VUELVE ASIGNAR
		System.out.println(texto);
		
		//como aqui, que se a modificado la variable
		texto = texto.replace(" ", "=");
		System.out.println(texto);

	}
}















