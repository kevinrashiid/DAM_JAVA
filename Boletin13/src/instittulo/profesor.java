package instittulo;

public class profesor extends persona{
	private String grupo;
	private grupo tutoria=null;
	private String departamento=null;//poniendo como null para comparar mas rapidos
	public profesor(String nom, String ape, String depa) {
		super(nom, ape);
		if(!depa.equalsIgnoreCase("Informatica")&&
				!depa.equalsIgnoreCase("Ingles")&&
				!depa.equalsIgnoreCase("Empresa")) {
			System.out.println("ERROR: Departamento");
		}else {
			this.departamento=depa.toUpperCase();
		}
		//this.grupo=grupo;
		
	}
	public void setTutoria(grupo grupo) {
		this.tutoria=grupo;
	}
	
	//get consiguiendo el apellido nombre
	public String getNombre() {
		return this.apellido+", "+this.nombre;
	}
	
}
