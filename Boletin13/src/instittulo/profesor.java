package instittulo;

public class profesor extends persona{
	String grupo;
	String departamento;

	public profesor(String nom, String ape, String grupo, String depa) {
		super(nom, ape);
		this.grupo=grupo;
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
