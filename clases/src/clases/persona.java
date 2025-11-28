package clases;

//POO(PROGRAMACION ORIENTADA A OBJETOS)
public class persona {//LAS CLASE VAN EN OTRO FICHERO
	//CARACTERISTICAS DEL OBJETO
	//el private evita que el dado se manipula directamente
	private String nombre;
	private String apellido;
	private int edad;
	
	//constructor
	public persona(String nom, String ape, int ed) {
		this.nombre=nom;
		this.apellido=ape;
		this.edad=ed;
	}
	//funcion que incrementa la edad de una caracteristica
	public void incrementarEdad() {
		//this.
		this.edad++;//LITERALMENTE ES ESTO--> esta edad suma 1
	}
	
	// funcion que muestra apellido y nombre
	public void mostrar() {
		System.out.println(this.apellido+","+this.nombre);
	}
	
}
