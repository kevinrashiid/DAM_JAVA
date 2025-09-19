package p1;

public class divisibleDe3 {

	public static void main(String[] args) {
		/*queremos mostrar en pantalla todos 
		 * los numeros divisibles por 3 entre el 1 y 100*/
		for (int i = 0; i < 101 ; i++) {
			if (i % 3 == 0) { // el % mira el resto
				System.out.println(i);
			}
		}
		
		/*SOLUCION DEL PROFE*/
		/*el i+=3 es la forma abreviada de i = i+3
		 * en cada interacion del bucle for le sumamos 3 como nosotros sabemos que 
		 * los divisibles de 3 iran de 3 en 3*/
		for (int i = 0; i < 101 ; i+=3) {
				System.out.println(i);
			}
		
		
		
		}
	}






