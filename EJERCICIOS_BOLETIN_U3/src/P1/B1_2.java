package P1;

public class B1_2 {

	public static void main(String[] args) {

		// ===============EJERCICIO 2==============================
		// Escribir un programa donde se muestren los 50 primeros números pares
		// SOLUCION 1:
		int par;

		for (int i = 0; i < 50; i += 2) {
			System.out.println(i);
		}
//				 SOLUCION 2: es mucho mejor la primera ya que aqui depende si pones el syso
//				 debajo del contador
//				 salen los impares
		int par2;
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
		}
	}
}
