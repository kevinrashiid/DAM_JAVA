package instittulo;

public class ciclo {
	private modulo[] primero=new modulo[8];
	private modulo[] segundo=new modulo[8];
	private String nombreCiclo;
	private String grado;
	
	private int numModuloPrimero=0;
	private int numModuloSegundo=0;
	//CONSTRUCTOR
	public ciclo(String nombre,String grad,int año) {
		this.nombreCiclo=nombre;
		this.grado=grad;
	}
	//añadiendo modulos al ciclo segun su año
	public void anyadeModulo(modulo m) {
		if(m.getCurso()==1) {//si es de primero 
			primero[this.numModuloPrimero]=m;
			numModuloPrimero++;
		}else {
			segundo[this.numModuloSegundo]=m;
			numModuloSegundo++;
		}
	}
	
	public String getNombreCiclo() {
		return nombreCiclo;
	}
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}
}