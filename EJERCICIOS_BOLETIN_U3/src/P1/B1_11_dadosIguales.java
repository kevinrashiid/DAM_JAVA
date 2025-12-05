package P1;

public class B1_11_dadosIguales {

	public static void main(String[] args) {

//		SOLUCION PROFE
		int azar = 1;
		int azar2 = 0;
		int contador = 0;
		do {
			azar = (int) (Math.random() * ((6)) + 1);
			azar2 = (int) (Math.random() * ((6)) + 1);
			System.out.println("DADO 1 --> : " + azar);
			System.out.println("DADO 2 --> : " + azar2);
			System.out.println("  ");// SEPARACION PARA QUE SE VEA MAS CLARO
			contador++;
		} while (azar != azar2);
		System.out.print("He tenido que tirar los dados  " + contador);
		if (contador == 1) {
			System.out.print(" vez");
		} else
			System.out.print(" veces");
	}
}
