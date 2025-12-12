package instittulo;

public class ciclo {
	String nombreCiclo;
	int año;
	String tutor;
	int numAlumnos;
	String[] alumnosMatriculados;

	//CONSTRUCTOR
	public ciclo(String nombre,int año,String tutor,int numeroAlumnos) {
		this.nombreCiclo=nombre;
		this.año=año;
		this.tutor=tutor;
		this.numAlumnos=numeroAlumnos;
	}
	public String getNombreCiclo() {
		return nombreCiclo;
	}
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public String[] getAlumnosMatriculados() {
		return alumnosMatriculados;
	}
	public void setAlumnosMatriculados(String[] alumnosMatriculados) {
		this.alumnosMatriculados = alumnosMatriculados;
	}
	
	
}