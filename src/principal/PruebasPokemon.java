package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebasPokemon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Objeto objeto1= new Objeto("palo pokemon",1);

		
		Pokemon pokemon = new Pokemon("Charmander", "Exterminador", 39, 52, 43, 60, 50, 65, 60, 5, 70, 'M', null, null,
				Estado.NORMAL,objeto1);
				
		System.out.println(pokemon.toString());


	}

}
