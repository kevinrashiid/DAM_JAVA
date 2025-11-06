package dudas;

import java.util.Scanner;

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
		/*
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
			*/
		
			//
			
			/*EJERCICIO ENUNCIADO LO SUBIRA*/
			Scanner teclado =new Scanner(System.in);
			System.out.print("Introduce numero de dados ");
			int numDados=teclado.nextInt();
			int azar=0;
			int[] tiradas=new int[numDados];
			boolean bandera=false;
			int contador=0;
			//tamaño 7 por que el dado tiene 6 caras pero se empiza a contar desde el 0 
			//la posicion 0 no lo utilizaremos pero por que la tirada de un dado sera del 1 al 6
			int[] frecuencia=new int[7];
			do {
				contador++;
				for (int i = 0; i < numDados; i++) {
					azar = (int) (Math.random() * 6) + 1;
					tiradas[i] = azar;
					frecuencia[azar]++;//incrementando la posicion del array
					//el propio dado es el indice
					if (i == numDados - 1) {
						System.out.println(azar);
					} else {
						System.out.print(azar + " - ");
					}
				}
				bandera = true;
				for (int j = 1; j < numDados; j++) {
					if (tiradas[0] != tiradas[j]) {
						bandera = false;
					}
				}
			} while (bandera == false);
			System.out.println("haz necesitado " + contador + " para que todos sean iguales");
			for(int k=1;k<=6;k++) {
				System.out.printf("El numero %d ha salido el %.2f %% de las veces\n"
						,k,(double)(100*frecuencia[k])/(numDados*contador));
			}
		}
	}

















