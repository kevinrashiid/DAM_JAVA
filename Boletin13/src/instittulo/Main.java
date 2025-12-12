package instittulo;

public class Main {

	public static void main(String[] args) {
		profesor joseMaria=new profesor("Jose Maria", "Moralez", "Informatica");
		profesor fernando=new profesor("Fernando", "Vazques", "Informatica");

		alumno andrea=new alumno("Andrea", "Andrea", 18);
		alumno mario=new alumno("Mario", "Carcalete", 19);

		modulo java=new modulo("Programacion", 2025, 320, false);
		modulo python=new modulo("Programacion python", 2025, 320, true);
	}
}



