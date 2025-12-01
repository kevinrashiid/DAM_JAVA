package clases;

public class QueSonLasClases {

	public static void main(String[] args) {
		//Creando un objeto
		//TIPO DE DATO      //CONSTRUCTOR CREANDO OBJETO
		persona chica=new persona("Lucia","Sanz",24);
		chica.incrementarEdad();
		chica.mostrar();//utilizando una funciona de la clase persona
		
		//destruyendo a un objeto
		//chica=null;
		persona chico=new persona("Lucia","Sanz");
		System.out.println(chico.getnumPersonas());
		System.out.println(chica.getnumPersonas());
	}
}
