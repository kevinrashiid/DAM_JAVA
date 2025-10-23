package arrays2;

import java.util.Arrays;

public class arrays2 {

	public static void main(String[] args) {
		/*
		//RECORRIENDO UN ARRAY
		double[] notas= {7.3,8.5,9,10,3,3,4};//7 posiciones
		for(int posiciones=0;posiciones<notas.length;posiciones++) {
			System.out.println(notas[posiciones]);
		}
		System.out.println("··········································");
		//sumando dos puntos extras a cada alumno
		for(int posiciones=0;posiciones<notas.length;posiciones++) {
			//notas[posiciones]=notas[posiciones]+2;
			notas[posiciones]+=2; //esto y lo de arriba es igual
			System.out.println(notas[posiciones]);
		}
		*/
		
		//DATOS
		String[] profes= {"natalia","victor","Eduardo"};
		String[] profesNuevos;
		double[] numerosDecimales={7,8,53.2,3.333,432.2};	
		profesNuevos=profes; //asignando al segundo array los valores del nuevo array
		/*
		for(int i=0;i<profesNuevos.length;i++) {
			System.out.println(profesNuevos[i]);//profesNuevos y profes tienen el mismo contenido
		}
		*/
		profesNuevos[2]="yago";//sustituyendo eduardo
		//si se recorre sale lo mismo por que son dos variables apuntado a la misma celda dde memoria
		for(int i=0;i<profesNuevos.length;i++) { 
			System.out.println(profesNuevos[i]);
		}
		for(int i=0;i<profes.length;i++) {
			System.out.println(profes[i]);
		}
		//TODO ··· HACIENDO COPIAS  
		//hacemos una copia TOTAL de profes
		String[] copiaProfes=Arrays.copyOf(profes,profes.length); 
		//quita eduardo por que quitas una celda
		String[] copiaProfesMenos1=Arrays.copyOf(profes,profes.length-1);
		//hacemos una copia pero con dos espacios vacios nuevos
		String[] copiaProfesMas2=Arrays.copyOf(profes,profes.length+2); 

		//RECORRIENDO UN ARRAY
		for(int i=0;i<profes.length;i++) { 
			System.out.println(i+" - "+profes[i]); //para mostrar las posiciones
		}
		//TODO ··· RECORRIENDO UN ARRAY CUANDO SOLO ME INTERESA EL CONTENIDO Y NO LAS POSICIONES
		for(String nombre:profes) {
			System.out.println(nombre);
		
		}
		
		
		
		if(profes.equals(copiaProfesMas2)) {//comparacion de arrays
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		
		Arrays.sort(profes);//ordena alfabeticamente
		Arrays.sort(numerosDecimales);//tambien vale si son numeros
		
		//EL SIGUIENTE METODO FUNCIONA SOLO SI EL ARRAY ESTA ORDENADO ASCENDENTEMENTE --> SORT()
		//SIRVE PARA BUSCAR EL DATO ESTA EN EL ARRAY
		
		if(Arrays.binarySearch(profes, "victor")<0) {//si es menor que 0 no lo encuentra
			System.out.println("no esta en el array");
		}else {
			System.out.println("esta en el array");
		}
		//con esto estamos haciendo si 
		int posicion =Arrays.binarySearch(profes, "victor"); //si encuentra lo encuentra devuelve su posiciones
		//si no lo encuentra devuelve un numero negativo
		if(posicion >=0) {
			profes[posicion]="geraldo";
		}else {
			System.out.println("no esta ");
		}
		
		
		int diasDelMes[]= new int[12];//12 espacios
		Arrays.fill(diasDelMes, 30);//rellena todas sus posiciones con la segunda posicion -->30
		for(int mes:diasDelMes) {
			System.out.print(mes +"  ");
		}
		
		//toString 
		String texto= Arrays.toString(diasDelMes);//para convertir un array a texto
		texto=texto.replace("[", "");
		texto=texto.replace("]", "");
		System.out.println(texto);
		
		
		
	}
}
