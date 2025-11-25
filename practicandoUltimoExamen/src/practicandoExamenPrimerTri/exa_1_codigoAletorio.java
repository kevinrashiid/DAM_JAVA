package practicandoExamenPrimerTri;

public class exa_1_codigoAletorio {

	public static void main(String[] args) {
		String codigo = "";
		System.out.println("Generando claves en el formato solicitado:");
		for (int c = 0; c < 4; c++) {
			for (int x = 0; x < 5; x++) {
				for (int i = 0; i < 5; i++) {
					int numero = (int) (Math.random() * 9);
					codigo = String.valueOf(numero);
					System.out.print(codigo);
				}
				if(x!=4) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
