package instittulo;

public class grupo {
	
	private String nombre;
	private ciclo ciclo;
	private int curso;
	private int numAlumnos;
	private alumno[] listaAlumnos;
	public grupo(String nombre,ciclo ciclo,int curso,int numAlumnos) {
		this.nombre=nombre;
		this.ciclo=ciclo;
		this.curso=curso;
		this.numAlumnos=numAlumnos;
		this.listaAlumnos=new alumno[numAlumnos];//lista para ir añadiendo alumnos	
	}
	
	//AÑADIENDO UN PROFESOR AL GRUPO
	public void addProfesor(profesor p) {
		
	}
	//AÑADIENDO UN ALUMNOS AL GRUPO
	public void addAlumno(alumno a) {
		
	}
}