package dudas;

import java.util.Arrays;

public class dudasMiasDeOtros {

	public static void main(String[] args) {
		/*
		String texto="programando en java";
		String textoPares="";
		for(int i=0;i<texto.length();i++) {//recoremos la cadena
			if(i%2==0) { //solo seleccionamos las letras que esten en las posiciones PARES
				textoPares=textoPares + texto.charAt(i);//accedemos a la letra y la añadimos a textoPares
			}
		}
		System.out.print(textoPares);
		
		String textoPares2="";
		for(int i=0;i<texto.length();i+=2) {//recoremos la cadena // Y NOS SALTAMOS LOS IMPARES
				textoPares=textoPares2 + texto.charAt(i);//accedemos a la letra y la añadimos a textoPares
			}
		*/
		
			// ordenar un array
			int[] numeros = { 14, 145, 5, 23, 37, 1, 456, 44 };
			Arrays.sort(numeros);//
			//imprimir sin importar el indice es decir solo nos importa el contenido
			//no nos importa la posicion de la (i)
			//for (int n : numeros) {
			//System.out.println(n);
			//}
			//for(int i=0;i<numeros.length;i++) { 
			int[] nuevoArray=new int[numeros.length]; //creando un nuevo array con el tamaño del antiguo
			int j=0;
			for(int i=numeros.length-1;i>=0;i--) {//decremento i
				//recorriendo un array de forma inversa
				nuevoArray[j]=numeros[i];
				j++;//incremento j
			}
			//imprimimos el nuevo array
			for(int n:nuevoArray) {
				System.out.println(n);
			}
			
			
		}
	}

