package practicandoEnCasa;

public class NumeroRepetidos {

	public static void main(String[] args) {

		int numero=885210003;
		String textoNumero=String.valueOf(numero);
		int[] posiciones=new int[9];
		int cifra=0;
		for(int i=0;i<textoNumero.length();i++ ) {
			cifra=Character.getNumericValue(textoNumero.charAt(i));
			posiciones[cifra]++;
			
		}
		System.out.println("tu numero tiene");
		for(int i=0;i<9;i++) {
			if(posiciones[i]==1) {
				System.out.println(posiciones[i]+" numero "+i);
			}
			else if(posiciones[i]>1) {
				System.out.println(posiciones[i]+" numeros "+i);
			}
		}
		
	}
}
