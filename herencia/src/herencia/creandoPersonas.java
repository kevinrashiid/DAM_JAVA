package herencia;

public class creandoPersonas {

	public static void main(String[] args) {
		Profesor profesor1=new Profesor("Kevin", "Villarroel");
		System.out.println(profesor1.getNombre());
		
		Alumno alumno1=new Alumno("Martin", "Ruso",19);
		System.out.println(profesor1.getNombre());
		
		//UTILIZANDO FUNCIONES DE CADA CLASE
		//FUNCION DE LA CLASE ALUMNO MUESTR SOLO NOMBRE COMPLETO
		System.out.println(alumno1.getNombreCompleto());
		//FUNCION DE LA CLASE PROFESOR PERSONALIZADO MUESTR SOLO NOMBRE COMPLETO
		System.out.println(profesor1.getNombreCompleto());
	}

}
