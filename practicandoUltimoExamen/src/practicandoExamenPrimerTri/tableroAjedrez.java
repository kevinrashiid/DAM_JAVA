package practicandoExamenPrimerTri;

public class tableroAjedrez {

	public static void main(String[] args) {
		for (int x = 0; x <4; x++) {
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("|X|");
				}
			}
			System.out.println();
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					System.out.print("|X|");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	// |X|
}
