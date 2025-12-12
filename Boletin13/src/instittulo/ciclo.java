package instittulo;

public class ciclo {
	private modulo[] primero=new modulo[8];
	private modulo[] segundo=new modulo[8];
	private String nombreCiclo;
	private String grado;
	

	//CONSTRUCTOR
	public ciclo(String nombre,String grado,int año) {
		this.nombreCiclo=nombre;
		this.grado=grado;
	}
	public void anyadeModulo(modulo m) {
		
		
	}
	
	public String getNombreCiclo() {
		return nombreCiclo;
	}
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}
	
	
}