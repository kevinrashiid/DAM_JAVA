package dudas;

import java.util.Arrays;

public class kaprekar {

	public static void main(String[] args) {

		int numero4Digits = 2325;
		String textoNum = String.valueOf(numero4Digits);
		char cifras[] = new char[textoNum.length()];
		for (int i = 0; i < textoNum.length(); i++) {
			cifras[i] = textoNum.charAt(i);
		}
		Arrays.sort(cifras);
		String textoAscendente = "";
		for (int x = 0; x < cifras.length; x++) {
			textoAscendente = textoAscendente + cifras[x];
		}
		int numAscendete = Integer.parseInt(textoAscendente);
		System.out.println(numAscendete);

		String textoDescendente = "";
		for (int y = cifras.length - 1; y >= 0; y--) {
			textoDescendente += cifras[y];
		}
		int numDescendete = Integer.parseInt(textoDescendente);
		System.out.println(numDescendete);
		int salida = 6174;
		boolean bandera = false;
		int operacion=0;
		do {
			
			
		} while (bandera==false);

//		for(int i=0;i<numero4Digits.length();i++) {
//			arrayNumeros[i]=numero4Digits;
////			System.out.println(arrayNumeros[i]);
//			if(i>=i+1) {
//				arrayNumeros[i]=arrayNumeros[i];
//			}else {
//				arrayNumeros[i+1]=arrayNumeros[i];
//			}
//		}

	}
}
