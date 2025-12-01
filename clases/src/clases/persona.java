package clases;

//POO(PROGRAMACION ORIENTADA A OBJETOS)
public class persona {//LAS CLASE VAN EN OTRO FICHERO
	//CARACTERISTICAS DEL OBJETO
	//el private evita que el dado se manipula directamente
	//datos que no se pueden manipular fuera de esta clase
	//solo se pueden manipular dentro de esta clase
	private String nombre; //atributos
	private String apellido;
	private int edad=0;
	private static int numPersonas=0; //comun a todas los objetos
	
	//difencia entre constructor y clase

	//getters muestra 
	//setters modifica
	public int getnumPersonas() {
		return numPersonas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getNumPersonas() {
		return numPersonas;
	}

	public static void setNumPersonas(int numPersonas) {
		persona.numPersonas = numPersonas;
	}

	//funciones/metodos
	//constructor
	public persona(String nom, String ape) {
		this.nombre=nom;
		this.apellido=ape;
		numPersonas++;
	}
	//misma clase diferente atributos
	public persona(String nom, String ape, int ed) {
		this.nombre=nom;
		this.apellido=ape;
		this.edad=ed;
		numPersonas++;
	}
	
	//funcion que incrementa la edad de una caracteristica
	public void incrementarEdad() {
		//this.
		this.edad++;//LITERALMENTE ES ESTO--> esta edad suma 1
	}
	
	// funcion que muestra apellido y nombre
	public void mostrar() {
		System.out.println(this.apellido+","+this.nombre+" "+this.edad);
	}
}
