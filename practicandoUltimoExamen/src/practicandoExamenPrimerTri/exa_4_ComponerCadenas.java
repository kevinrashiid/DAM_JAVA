package practicandoExamenPrimerTri;

public class exa_4_ComponerCadenas {

	public static void main(String[] args) {
		
		String texto1="Examen 1T01";
		String texto2="Octubre-2025";
		
//		Resultado: 1T01-2025 Examen Octubre (23)
		
		String tema=texto1.substring(7,texto1.length());
		String exa=texto1.substring(0,6);
		String año=texto2.substring(8,texto2.length());
		String mes=texto2.substring(0,7);
		
		String frase=tema+"-"+año+" "+exa+" "+mes;
		String longitud=""+frase.length();
		System.out.println(frase+" ("+longitud+")");
	}
}
