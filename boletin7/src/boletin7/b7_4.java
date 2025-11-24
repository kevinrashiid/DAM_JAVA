package boletin7;

public class b7_4 {

	public static void main(String[] args) {
		
		nota(9);
	
	}
	public static void nota(int numero) {
		switch (numero) {
		case 1,2:
			System.out.println("MUY DEFICIENTE");
			break;
		case 3,4:
			System.out.println("INSUFISIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7,8:
			System.out.println("NOTABLE");
			break;
		case 9,10:
			System.out.println("SOBRESALIENTE");
			break;

		default:
			break;
		}
		
	}
}
