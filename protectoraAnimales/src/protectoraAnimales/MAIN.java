package protectoraAnimales;

public class MAIN {

	public static void main(String[] args) {
		
		//ANIMALES
		perros zeus=new perros(2005,"Zeus",false);
		gatos garfield=new gatos(2008, "Garfield", true);
		
		//CLIENTES
		clientes kevin=new clientes("Kevin", "Villarroel", 25, 622333444);
		
		animales[] adoptados=new animales[1];
		
		kevin.adoptarAnimal(garfield,adoptados);
		kevin.adoptarAnimal(zeus,adoptados);
		
		
		
	}

}
