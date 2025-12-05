package P1;

public class B1_16_PrimitivaRepetidos {

	public static void main(String[] args) {

		//===============EJERCICIO 16==============================
		//Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando una
		//lotería primitiva). Por el momento no te preocupes de que algunos números puedan salir
		//repetidos. Ya resolveremos eso más adelante.
		int inicio = 1;
		int fin=49;
		int contador=1;
		for(int i=0;i<6;i++) {
			int aleatorio=(int)(Math.random()*(fin-inicio+1)+inicio);
			System.out.println("El numero--> "+contador+ " es "+aleatorio);
			contador++;
		}
			
		
	}
}
