package instittulo;

abstract class persona {
	//TODO ESTA CLASE ES ABSTRACTA 
	//POR QUE VA HEREDAR EL NOMBRE Y APELLIDO
	//TODO protected se heredan y los private NO
	protected String nombre;
	protected String apellido;
	
	//CONSTRUCTOR
	public persona(String nom,String ape) {
		this.nombre=nom;
		this.apellido=ape;
	}
}
