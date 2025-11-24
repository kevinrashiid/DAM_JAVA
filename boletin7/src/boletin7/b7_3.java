package boletin7;

public class b7_3 {

	public static void main(String[] args) {
		meses(4);
	}

	public static void meses(int numeroMes) {
		String mes = "";
		switch (numeroMes) {
		case 1:
			System.out.println("enero");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		}
	}
}
