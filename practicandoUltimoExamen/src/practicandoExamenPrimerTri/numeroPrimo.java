package practicandoExamenPrimerTri;

public class numeroPrimo {

	public static void main(String[] args) {
		int numero=23;
		if(esPrimo(numero)) {
			System.out.println("es Primo");
		}else {
			System.out.println("no es primo");
		}
	}
	public static boolean esPrimo(int numero) {
	    boolean esPrimo = true;
	    if (numero <= 1) {
	        esPrimo = false;
	    } else if (numero == 2) {
	        esPrimo = true;
	    } else if (numero % 2 == 0) {
	        esPrimo = false;
	    } else {
	        for (int i = 3; i <= Math.sqrt(numero) && esPrimo; i += 2) {
	            if (numero % i == 0) {
	                esPrimo = false;
	            }
	        }
	    }
	    return esPrimo;
	}
}
