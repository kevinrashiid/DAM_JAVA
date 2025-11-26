package practicandoExamenPrimerTri;

import java.util.Scanner;

public class exa_2_CambioMonedas {

	public static void main(String[] args) {
		// Hay que poern final para que fuera constante
				final double cambioPeso= 27.93;
				final double cambioRupia = 102.81;
				final double cambioFranco = 0.93;
				
				Scanner teclado = new Scanner(System.in);
				System.out.println("Introducr la cantidad: ");
				String entrada = teclado.nextLine();
				teclado.close();
				
				char moneda = entrada.charAt(entrada.length()-1);//cogiendo el ultimo caracter
				double cantidad = Double.parseDouble(entrada.substring(0,entrada.length()-1));
				
				switch (moneda) {
				case 'E' , 'e':
					
					break;
				case 'P' , 'p'://Multiplica por 10000 para "mover" 4 decimales a la izquierda.
					double cambio = (double) Math.round(cantidad/cambioPeso)*10000/10000;
					System.out.println(cantidad + " pesos cubanos equivalen a " + cambio + " euros");
					break;
				case 'R' , 'r':
					cambio = (double) Math.round(cantidad/cambioPeso)*10000/10000;
					cambio = cantidad/cambioRupia;
				System.out.println(cantidad + " pesos cubanos equivalen a " + cambio + " euros");
					break;
				case 'F' , 'f':
					cambio = (double) Math.round(cantidad/cambioPeso)*10000/10000;
					cambio = cantidad/cambioFranco;
				System.out.println(cantidad + " pesos cubanos equivalen a " + cambio + " euros");;
					break;
				default:
					System.out.println("La moneda introducida no está reconocida, escribe E, P, R, F.");
				
			}
		
		
	}
}
