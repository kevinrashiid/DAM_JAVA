package anime_mangas;

public class comprasMain {

	public static void main(String[] args) {

			manga manga1=new manga("kevin", "Doraemon", "isekai", 1);
			manga[] estanteria=new manga[2];
			
			//CREANDO UN OBJETO DE LA CLASE METODOS
			//PARA PODER UTILIZAR SUS METODOS
			metodos metodos=new metodos();
			metodos.compraManga(estanteria,manga1);
			metodos.librosComprados(estanteria);
	}
}
