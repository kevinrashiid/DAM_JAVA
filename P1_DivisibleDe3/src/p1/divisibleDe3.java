package p1;

public class divisibleDe3 {

	public static void main(String[] args) {
		/*queremos mostrar en pantalla todos 
		 * los numeros divisibles por 3 entre el 1 y 100*/
		for (int i = 0; i < 101 ; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}		
