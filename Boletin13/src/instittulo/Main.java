package instittulo;

public class Main {

	public static void main(String[] args) {
		profesor joseMaria=new profesor("Jose Maria", "Moralez", "Informatica");
		profesor fernando=new profesor("Fernando", "Vazques", "Informatica");

		alumno andrea=new alumno("Andrea", "Andrea", 18);
		alumno mario=new alumno("Mario", "Carcalete", 19);
		
		modulo java=new modulo("Programacion Java", 2025, 320, false);
		modulo python=new modulo("Programacion Python", 2025, 320, true);
		
		ciclo dam=new ciclo("DAM", "SUPERIOR", 2000);
		
		//añadiendo modulos al ciclo
		dam.anyadeModulo(python);
		dam.anyadeModulo(java);
		
		grupo dam1=new grupo("DAM1",dam,1,4); //creando un grupo 
		
		dam1.addProfesor(joseMaria); //AÑADIENDO TUTOR
		
		//TODO SI LLENAMOS EL GRUPO
		//NOS SALTA UN AVISO
		dam1.addAlumno(andrea);
		dam1.addAlumno(mario);

		dam1.verGrupo();
		
	}
}