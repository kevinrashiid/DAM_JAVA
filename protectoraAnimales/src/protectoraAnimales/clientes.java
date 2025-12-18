package protectoraAnimales;

import java.util.Arrays;

public class clientes {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	private animales[] animalesAdoptados=new animales[1];
	
	//CONSTRUCTOR CLIENTES
	public clientes(String nombre,String apellido,int edad,int telefono) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.telefono=telefono;
	}
	
	//FUNCION QUE ADOPTE UN ANIMAL
	public animales[] adoptarAnimal(animales animal, animales[] adoptados) {
		adoptados=animalesAdoptados;
		for(int i=0;i<adoptados.length;i++) {
			adoptados=Arrays.copyOf(adoptados, adoptados.length+1);
			if(adoptados[i]==null) {
				adoptados[i]=animal;
			}
		}
		return adoptados;
	}
	
	//FUNCION QUE MUESTRE LOS ANIMALES ADOPTADOS
	public void animalesAdoptados(animales[] adoptados) {
		adoptados=animalesAdoptados;
		for(int i=0;i<adoptados.length;i++) {
			System.out.println(adoptados[i]);
		}
	}
}
