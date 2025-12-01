
package pokemon;

public class Pokemon {
	
	private String nombre;
	private int codigo;
	private String[] tipo;
	private String evolucion;
	private int pv;
	
	//constructor de un tipo
	public Pokemon(String name,int code,String type,String evo) {
		this.nombre=name;
		this.codigo=code;
		this.tipo[0]=type;//metiendo en array de string
		this.evolucion=evo;
		this.pv=(int)(Math.random()*51)+50;
	}
	//constructor de dos tipos
	public Pokemon(String name,int code,String type,String type2,String evo) {
		this.nombre=name;
		this.codigo=code;
		this.tipo[0]=type;
		this.tipo[1]=type2;
		this.evolucion=evo;
		this.pv=(int)(Math.random()*51)+50;//asignando puntos al azar
	}
	public void infoPokemon() {
		System.out.println(this.codigo+" - "+this.nombre);
		if(this.tipo[1]==null) {
			System.out.println("Tipo: "+ this.tipo[0]);
		}else {
			System.out.println("Tipo: "+ this.tipo[0]+", "+this.tipo[1]);
		}
		System.out.println("PV: "+this.pv);
	}
}