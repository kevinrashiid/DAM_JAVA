package practicandoEnCasa;

public class numeroArmstrong {

	public static void main(String[] args) {
		
		int numero=153;
		String cifra="";
		String textoNumero=String.valueOf(numero);
		int suma=0;
		for(int i=0;i<textoNumero.length();i++) {
			cifra=""+textoNumero.charAt(i);
			int cifraNumero=Integer.parseInt(cifra);
			suma=suma+(int)Math.pow(cifraNumero, textoNumero.length());
		}
		System.out.println(suma);
		if(suma==numero) {
			System.out.println("tu numero es Armstrong");
		}else {
			System.out.println("Tu numero es narcicista");
		}
	}
}
