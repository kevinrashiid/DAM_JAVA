package examen;

public class ejercicio1 {

	public static void main(String[] args) {
		int inicio=10000;
		int fin=99999;
		int aletorio=0;
		String guardarCodigo="";
		System.out.println("Generando claves en el formato solicitado: ");
		for(int i=0;i<5;i++) {
			aletorio=(int)(Math.random()*(fin-inicio+1)+inicio);
			guardarCodigo=String.valueOf(aletorio+"-");
//			guardarCodigo=guardarCodigo.substring(0,guardarCodigo.length());
//			System.out.print(guardarCodigo);
			System.out.println();
			for(int x=0;x<5;x++) {
				System.out.print(guardarCodigo);
			}
		}

	
		
		
		
		
	}
}




