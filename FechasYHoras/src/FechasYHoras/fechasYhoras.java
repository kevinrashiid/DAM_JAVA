package FechasYHoras;

import java.time.LocalDate;
import java.time.LocalTime;

public class fechasYhoras {

	public static void main(String[] args) {
		//fecha actual
		//formato Ingles
		LocalDate hoy=LocalDate.now();
		System.out.println(hoy);
		//hora actual
		// hora minuto segundos y billonecimas de segundos
		//10:33:41.081085294
		LocalTime hora=LocalTime.now();
		System.out.println(hora);
		
		
		
		
	}
}
