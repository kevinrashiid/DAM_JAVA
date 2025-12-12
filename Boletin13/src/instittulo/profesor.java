package instittulo;

public class profesor extends persona{
	private String grupo;
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
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
