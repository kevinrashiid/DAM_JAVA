package practicandoUltimoExamen;

public class practicandoUltimoExamen {

	public static void main(String[] args) {

//		Scanner teclado = new Scanner(System.in);
//		System.out.print("Numero: ");
//		int pin = teclado.nextInt();
		int pin=6214;
		if (pin < 0 || pin > 9999) {
			System.out.println("TIENE QUE SER UN NUMERO DE 4 CIFRAS");
		} else {
			String[] codigo = cifraPin(pin);
			for (String linea : codigo) {
				System.out.println(linea);
			}
			System.out.println(descifrarNumero2(codigo));
		}
	}

	public static String[] cifraPin(int pin) {
		String[] codigo = new String[4];
		String txtPin = Integer.toString(pin);
		if (txtPin.length() != 4) {
			for (int i = txtPin.length(); i < 4; i++) {
				txtPin = "0" + txtPin;
			}
		}
		for (int i = 0; i < txtPin.length(); i++) {
			int cifra = (int) txtPin.charAt(i) - 48;
			codigo[i]=cifraNumero(cifra);
		}
		return codigo;
	}

	public static String cifraNumero(int numero) {
		String linea = "";
		// si el numero es 0
		if (numero == 0) {
			numero = 10;
		}
		for (int i = 0; i < 10; i++) {
			if (i == numero - 1) {
				linea  +=  "0";
			} else {
				linea += "X";
			}
		}
		return linea;

	}
	public static String cifraNumero2(int num) {
		String linea="";
		for(int i=0;i<num;i++) {
			linea+="0";
		}
		for(int i=0;i<10-num;i++) {
			linea="X"+linea;
		}
		return linea;
	}
	
	
	public static int descifrarNumero(String[] codigo) {
		int numero=0;
		for(String elemento:codigo) {
			if(elemento.equalsIgnoreCase("0")) {
				numero++;
			}
		}
		return numero;
	}
	public static int descifrarNumero2(String[] codigo) {
		int posicion=0;
		for(int i=0;i<codigo.length;i++) {
			if(codigo[i]=="0") {
				posicion+=i;
			}
		}
		return posicion;
	}
	
	
	
}
