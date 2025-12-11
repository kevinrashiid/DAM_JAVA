package instittulo;

public class modulo {
	String nombre;
	int año;
	int horasLectivasSemana;
	boolean optativo;
	public modulo(String nom,int año,int horas,boolean opta) {
		this.nombre=nom;
		this.año=año;
		this.horasLectivasSemana=horas;
		this.optativo=opta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getHorasLectivasSemana() {
		return horasLectivasSemana;
	}
	public void setHorasLectivasSemana(int horasLectivasSemana) {
		this.horasLectivasSemana = horasLectivasSemana;
	}
	public boolean isOptativo() {
		return optativo;
	}
	public void setOptativo(boolean optativo) {
		this.optativo = optativo;
	}
}
