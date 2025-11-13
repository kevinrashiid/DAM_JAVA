package progra_Modular_KAPREKAR;

import java.util.Scanner;

public class kaprekarModular {

	public static void main(String[] args) {
		//funcion que valide el numero optimo para hacer kaprekar
		//funcion para hacer el orden de los ascendente 
		//funcion para hacer el orden de los descendente
		Scanner teclado=new Scanner(System.in);
		String numTXT="";
		final int kaprekar = 6174; // numero como constante kaprekar
		int entrada=teclado.nextInt();
		teclado.close();
		int contador=0;
		while (entrada != kaprekar) {
			contador++;
			int numAscendente=kaprekarAscendeten(entrada);
			int numDescendente=kaprekarDescendente(entrada);
			entrada=numDescendente-numAscendente;
			for (int x = 0; x < 4; x++) {
				numTXT="0"+numTXT;
			}
		}
		System.out.println();
		
		
	}
	
	//funcion que valide el numero optimo para hacer kaprekar
	public static int validoParaKaprekar(int numero) {
		boolean todoBien=false;
		
		
		
	}
	
	//funcion para hacer el orden de los ascendente 
	public static int kaprekarAscendeten(int n) {
		
	}
	
	//funcion para hacer el orden de los descendente
	public static int kaprekarDescendente(int n){
		
	}
	
}
