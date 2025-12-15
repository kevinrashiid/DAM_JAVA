package instittulo;

public class modulo {
	private String nombre;
	private int año;
	private int horasLectivasSemana;
	private boolean optativo;
	//CONSTRUCTOR CREAR OBJETO Y VUELVE
	public modulo(String nom,int año,int horas,boolean opta) {
		this.nombre=nom;
		this.año=año;
		this.horasLectivasSemana=horas;
		this.optativo=opta;
	}
	//CONSIGUIENDO EL AÑO DEL MODULO/ASIGNATURA
	public int getCurso() {
		return this.año;
	}
	public String getNombre() {
		return this.nombre;
	}
}
