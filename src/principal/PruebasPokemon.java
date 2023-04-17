package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import principal.MovimientoPokemon.Estado;
import principal.MovimientoPokemon.Mejora;
import principal.MovimientoPokemon.TipoMovimiento;

public class PruebasPokemon {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Objeto objeto1 = new Objeto("palo pokemon", 1);




		




		MovimientoPokemon movimientoPokemon1 = new MovimientoPokemon(null, Estado.CONGELADO, 0, null);
		MovimientoPokemon movimientoPokemon2= new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);										

		Pokemon pokemon = new Pokemon("Charmander", "Exterminador", 39, 52, 43, 60, 50, 65, 60, 5, 70, 'M',
				TipoPokemon.ACERO, movimientoPokemon2, null, objeto1);

		








				System.out.println(pokemon.toString());

		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();

		System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(TipoPokemon.FUEGO, TipoPokemon.TIERRA));

	}

}
