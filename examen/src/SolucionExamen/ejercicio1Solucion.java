package SolucionExamen;

public class ejercicio1Solucion {
	public static void main(String[] args) {
		
		for (int k = 0; k < 4; k++) {
			for (int j = 0; j < 5; j++) {
				String segmento = "";
				for (int i = 0; i < 5; i++) {
					// lo convertimos automaticamente
					segmento = segmento + (int) (Math.random() * 10); // entre el 0 y el 9
				}
				System.out.print(segmento);
				//QUITANDO LA COMILLA DEL FINAL
				if (j != 4) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
