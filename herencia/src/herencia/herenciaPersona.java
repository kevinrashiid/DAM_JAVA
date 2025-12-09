package herencia;

public class herenciaPersona {
	protected String nombre; // atributos
	protected String apellido;

//	abstract void funcionObligatorio(int x); //funcion clase abstracta
	
	public herenciaPersona(String nom, String ape) {
		this.nombre=nom;
		this.apellido=ape;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//NOMBRE COMPLETO
	public String getNombreCompleto() { 
		return this.nombre+" "+this.apellido;
	}
	
}
class Profesor extends herenciaPersona {//extends la clase profesor hereda de herenciaPersona
	public Profesor(String nom, String ape) {
		super(nom, ape);//con super llamamos a cosas del padre
	}
	//NOMBRE COMPLETO PERSONALIZADO
	public String getNombreCompleto() { 
		return "Sr/Sra "+this.nombre+" "+this.apellido;
	}
	
	public String reutilizarCodigo() {
		return "Señor Don" +super.getNombreCompleto();//reutilizando la funcion
	}
	
}

class Alumno extends herenciaPersona {
	private int edad;//atributo que solo tendra el alumno
	public Alumno(String nom, String ape,int edad) {
		super(nom, ape);//con super llamamos a los atributos del constructor
		this.edad=edad;
	}
}