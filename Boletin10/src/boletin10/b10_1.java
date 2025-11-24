package boletin10;

public class b10_1 {

	public static void main(String[] args) {
		
		int numero1=5020;
		int numero2=5564;
		if(sumaDivisores(numero1, numero2)) {
			System.out.println("SON AMIGOS");
		}else {
			System.out.println("NO SON AMIGOS");
		}
		
	}
	
	//TODO Funcion que te devuelva la suma de los divisores de un numero
	public static boolean sumaDivisores(int numero1, int numero2) {
		int resultadoNumero1=0;
		int resultadoNumero2=0;
		boolean bandera=false;
		
		//VIENDO LOS DIVISORES HASTA EL 
		for(int i=1;i<numero1;i++) {
			if(numero1%i==0) {
				resultadoNumero1=resultadoNumero1+i;
			}
		}
		
		for(int x=1;x<numero2;x++) {
			if(numero2%x==0) {
				resultadoNumero2=resultadoNumero2+x;
			}
		}
		
		if(resultadoNumero1==numero2&&resultadoNumero2==numero1) {
			bandera=true;
		}else {
			bandera=false;
		}
		
		return bandera;
	}
}
