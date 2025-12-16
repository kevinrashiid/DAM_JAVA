package instittulo;

public class alumno extends persona{
	private int edad;
	String ciclo;
	String grupo;
	private boolean mayorEdad;
	public alumno(String nom, String ape,int edad) {
		super(nom, ape);
//		this.grupo=grupo;
		this.edad=edad;
		if(edad>=18) {//MARCANDO SI ES MAYOR DE EDAD
			this.mayorEdad=true;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public boolean isMayorEdad() {
		return mayorEdad;
	}
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	
	
}

