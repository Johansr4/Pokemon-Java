package principal;



import principal.MovimientoPokemon.Estado;
import principal.MovimientoPokemon.Mejora;
import principal.MovimientoPokemon.TipoMovimiento;



public class Main {

	public static void main(String[] args) {

		Objeto objeto1 = new Objeto("palo pokemon", 1);

		// Movimientos de prueba pre-establecidos

		MovimientoPokemon movimientoPokemon = new MovimientoPokemon("holasoyunataque", 0, TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon2 = new MovimientoPokemon("holasoyunamejora", Mejora.DEFENSA, 4, null);
		MovimientoPokemon movimientoPokemon3 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);
		MovimientoPokemon movimientoPokemon4 = new MovimientoPokemon("holasoyunestado", Estado.CONGELADO, 0, null);
		MovimientoPokemon movimientoPokemon5 = new MovimientoPokemon("holasoyunamejora", Mejora.VELOCIDAD, 4, null);

		Pokemon pokemon = new Pokemon(40, "charmander", "charrrr", 4, 30, 20, 0, 0, 0, 100, 4, 0, 'h',
				TipoPokemon.FUEGO,
				movimientoPokemon, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null, objeto1);

		Pokemon pokemon2 = new Pokemon(40, "squirtle", "sssql", 4, 30, 20, 0, 0, 0, 100, 4, 0, 'h', TipoPokemon.AGUA,
				movimientoPokemon, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null, objeto1);


		System.out.println(pokemon.toString());
		System.out.println();
		System.out.println(pokemon2.toString());












		

		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();

		System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(TipoPokemon.FUEGO, TipoPokemon.TIERRA));

	}
}
