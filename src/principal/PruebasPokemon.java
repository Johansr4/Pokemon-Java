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

		// Movimientos de prueba pre-establecidos
		MovimientoPokemon movimientoPokemon = new MovimientoPokemon(null, Estado.CONGELADO, 0, null);
		MovimientoPokemon movimientoPokemon2 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);
		MovimientoPokemon movimientoPokemon3 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);
		MovimientoPokemon movimientoPokemon4 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);

		MovimientoPokemon movimientoPokemon5 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);

		Pokemon pokemon = new Pokemon(0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'h', null,
				movimientoPokemon, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null, objeto1);

		pokemon.setMovimiento(movimientoPokemon5);

		System.out.println(pokemon.toString());

		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();

		System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(TipoPokemon.FUEGO, TipoPokemon.TIERRA));

	}

}
