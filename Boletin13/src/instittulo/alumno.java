package instittulo;

public class alumno extends persona{
	int edad;
	String ciclo;
	String grupo;
	boolean mayorEdad;
	public alumno(String nom, String ape, String grupo, String depa) {
		super(nom, ape);
		this.grupo=grupo;
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

