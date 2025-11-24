package boletin7;

public class b7_1_2 {

	public static void main(String[] args) {

		System.out.println(calculadora(2, 3, "d"));
	}

	public static int calculadora(int numero1, int numero2, String operacion) {
		int resultado = 0;
		operacion = operacion.toUpperCase();
		switch (operacion) {
		case "S":
			resultado = numero1 + numero2;
			break;
		case "R":
			resultado = numero1 - numero2;
			break;
		case "M":
			resultado = numero1 * numero2;
			break;
		case "D":
			resultado = numero1 / numero2;
			break;
		case "C":
			resultado = (int) Math.sqrt(numero1);
			break;
		case "A":
			resultado = (int) Math.pow(resultado, 2);
			break;
		case "Q":
			resultado=(int)Math.pow(numero1, 3);
			break;
		}

		return resultado;
	}
}
