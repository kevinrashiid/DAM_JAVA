package instittulo;


public class grupo {
	
	private String nombre;
	private ciclo ciclo;
	private int curso;
	private int numAlumnos;
	private int alumnosMatriculados=0;
	private profesor tutor=null;
	private alumno[] listaAlumnos;
	public grupo(String nombre,ciclo ciclo,int curso,int numAlumnos) {
		this.nombre=nombre;
		this.ciclo=ciclo;
		this.curso=curso;
		this.numAlumnos=numAlumnos;
		this.listaAlumnos=new alumno[numAlumnos];//lista para ir añadiendo alumnos	
	}
	
	//AÑADIENDO UN PROFESOR AL GRUPO
	public void addProfesor(profesor tutor) {
		this.tutor=tutor;
		tutor.setTutoria(this); //this referencia al objeto que aparece
				
	}
	
	//AÑADIENDO UN ALUMNO AL GRUPO
	public void addAlumno(alumno alumno) {
		if(this.numAlumnos==this.alumnosMatriculados) {
			System.out.println("GRUPO COMPLETO. YA HAY "+this.alumnosMatriculados);
		}else {
			this.listaAlumnos[this.alumnosMatriculados]=alumno;
			this.alumnosMatriculados++;
		}
	}
	public void verGrupo() {
		System.out.println("NOMBRE DEL GRUPO: "+this.nombre);
		System.out.println("Ciclo "+this.ciclo.getNombreCiclo()+"- Curso "+this.curso);//consiguiendo el nombre del ciclo
		System.out.println("Total Alumnos "+this.numAlumnos);
		System.out.println("Alumnos matriculados:"  +this.alumnosMatriculados);
		if(this.tutor!=null) {
			System.out.println("Tutor: "+ this.tutor.getNombre());
		}else {
			System.out.println("No tiene tutor asignado");
		}
		System.out.println("\nListado de alumnos del grupo: ");
		for(int i=0;i<this.alumnosMatriculados;i++) {
			System.out.println("- "+this.listaAlumnos[i].nombre);
		}
		System.out.println("\nListado de modulos del grupo");
		modulo[] modulos=this.ciclo.verModulo(this.curso);
		int posicion=0;
		modulo m=modulos[posicion];
		
		while(m!=null) {
			System.out.println("- "+m.getNombre());
			posicion++;
			m=modulos[posicion];
		}
	}
	

}




