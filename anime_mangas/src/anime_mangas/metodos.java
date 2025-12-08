package anime_mangas;

public class metodos {
	public  manga compraManga(manga[] estanteria, manga libro1) {//añadir al inventario

		for(int i=0;i<estanteria.length;i++) {
			if(estanteria[i]==null) {
				estanteria[i]=libro1;
			}	
		}
		return libro1;
//		return this.estanteria[0]=m1;
	}
	public void librosComprados(manga[] estanteria) {
		for(int i=0;i<estanteria.length;i++) {
			if(estanteria[i]!=null) {
			System.out.println(estanteria[i].getAutor());
			System.out.println( estanteria[i].getTitulo());
			System.out.println(estanteria[i].getGenero());
			System.out.println(estanteria[i].getUltNumeroColeccion());
			}
		}
	}
}
