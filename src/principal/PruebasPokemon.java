package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebasPokemon {

	public static void main(String[] args) {

		Objeto objeto = new Objeto("Poción");
		Pokemon pokemon = new Pokemon("Charmander", "Exterminador", 39, 52, 43, 60, 50, 65, 60, 5, 70, 'M', null, null,
				Estado.NORMAL, objeto);
		System.out.println(pokemon.toString());

	}

}
