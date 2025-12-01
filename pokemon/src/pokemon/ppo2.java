package pokemon;

public class ppo2 {

	public static void main(String[] args) {
		//pokemon de un solo tipo
		Pokemon gastly=new Pokemon("gastly",292,"Fastasma","Hunter");
		//pokemon de dos tipos

		Pokemon[] pokedex=new Pokemon[151];//array de pokemon
		pokedex[0]=gastly;//añadiendo un pokemon a
		
		gastly.infoPokemon();
	}
}
