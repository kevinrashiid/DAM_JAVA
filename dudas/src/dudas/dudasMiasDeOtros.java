package dudas;

public class dudasMiasDeOtros {

	public static void main(String[] args) {
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
		}
	}

