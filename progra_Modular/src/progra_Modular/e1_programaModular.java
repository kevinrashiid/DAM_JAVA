package progra_Modular;

public class e1_programaModular {

	public static void main(String[] args) {
		int[] numeros = { 7, 13, 56, 77, 2, 56, 84 };

		for (int n : numeros) {
			if (esPrimo(n) == true) {//si el numero es primo dependiendo de la funcion 
				System.out.println(n + " es primo");//entra aqui
			} else {
				System.out.println(n + " no es primo");
			}
		}
	}
	//UNA FUNCION TIENE UN UNICO PUNTO DE ENTRADA Y UN UNICO PUNTO DE SALIDA
	//ES DECIR DE SALIDA SOLO UN UNICO RETURN
	//TODO SI LA FUNCION TIENE UN VOID NO TIENE RETURN
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		int raiz = (int) Math.sqrt(numero) + 1;//para que era esto?
		if (numero % 2 != 0 || numero == 2) {
			//entra si i es menor que la raiz Y primo es siempre true 
			for (int i = 3; i < raiz && esPrimo == true; i += 2) {
				if (numero % 2 == 0) {
					esPrimo = false;
				}
			}
		} else {
			esPrimo = false;
		}
		return esPrimo;
	}
}
