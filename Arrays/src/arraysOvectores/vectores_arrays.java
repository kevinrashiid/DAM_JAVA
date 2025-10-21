package arraysOvectores;

public class vectores_arrays {

	public static void main(String[] args) {
		// |2|14|7|5|9| array de enteros
		// |0| 1|2|3|4| posiciones
		int lista[] =new int [6];//6 casillas tipo int
		String texto[]	=new String[10]; //10 casillas tipo string
		int[] vector;//vector vacio //como esta ahora mismo cualquier referencia a el dara error
		//array de 5 valores
		double[] notas= {7.3,8.5,9,10,3,3,4};//vector con contenido DECIMALES
		lista[2]=5;// metemos un 5 en la posicion 2
		System.out.println(notas[2]); //recuperando contenido de la posicion 2
		notas[1]=9.2; //modificamos el contenido de la posicion 1 de notas
		System.out.println(notas[1]);
		System.out.println(notas);// [D@378fd1ac <-- Referencia de la direccion de memoria
		System.out.println(notas[20]);//no puede apuntar a una variable que no existe
		
		//array de dos dimensiones MATRIZ
		int[][] matriz=new int[2][3];//matriz de 2 filas y 3 columnas //ORDEN FILA-COLUMNA
		matriz[1][2]=99;//[1][2] --> coordenadas de donde queremos meter el 99 FILA[1] COLUMNA[2]
		System.out.println(matriz[1][2]);
		
		//una MATRIZ DE DOS FILAS Y DOS COLUMNAS
		String[][] alumnos= {{"ana","lopez"},{"mario","perez"},{"kevin","mejia"}};
		System.out.println(alumnos[1][1]); //fila[1]columna[]
	}
}


