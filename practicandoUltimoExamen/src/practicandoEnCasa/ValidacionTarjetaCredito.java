package practicandoEnCasa;

public class ValidacionTarjetaCredito {

	public static void main(String[] args) {
		
		//(0[1-9]|1[0-2]) //representa los meses
		// --> \\/ para escapar el signo
		String tarjeta="1234 5446 5859 3980 03/25";
		String formato="[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s(0[1-9]|1[0-2])\\/[0-9]{2}";
		if(tarjeta.matches(formato)) {
			System.out.println("tarjeta aceptada");
		}
		
	}
}
