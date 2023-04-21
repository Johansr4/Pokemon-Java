package principal;

import java.util.Scanner;

import principal.MovimientoPokemon.Estado;
import principal.MovimientoPokemon.Mejora;
import principal.MovimientoPokemon.TipoMovimiento;

public class Main {

	public static void main(String[] args) {

		Objeto objeto1 = new Objeto("palo pokemon", 1);

		// Movimientos de prueba pre-establecidos

		TablaTipoPokemon tablaTipoPokemon = new TablaTipoPokemon();

		MovimientoPokemon movimientoPokemon = new MovimientoPokemon("ATAQUE1", 50, TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon2 = new MovimientoPokemon("ATAQUE2", Mejora.DEFENSA, 4,
				TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon3 = new MovimientoPokemon("ATAQUE3", 5, TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon4 = new MovimientoPokemon("ATAQUE4", Estado.CONGELADO, 0,
				TipoMovimiento.ATAQUE);
		MovimientoPokemon movimientoPokemon5 = new MovimientoPokemon("ATAQUE5", Mejora.VELOCIDAD, 4,
				TipoMovimiento.ATAQUE);

		// TU POKEMON

		Pokemon pokemon = new Pokemon(40, "charmander", "charrrr", 400, 30, 20, 0, 0, 0, 100, 4, 0, 'h',
				TipoPokemon.PLANTA, movimientoPokemon, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4,
				Estado.CONGELADO, objeto1);

		// POKEMON RIVAL
		Pokemon pokemon2 = new Pokemon(40, "squirtle", "sssql", 400, 30, 20, 0, 0, 0, 100, 4, 0, 'h',
				TipoPokemon.AGUA, movimientoPokemon, movimientoPokemon2, movimientoPokemon3, movimientoPokemon4, null,
				objeto1);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Selecciona el movimiento para usar contra el rival:");
			pokemon.atacar(pokemon2, movimientoPokemon);
		}

		pokemon.getTipo();
		System.out.println("El pokemon del rival tiene estos puntos de vitalidad:");
		System.out.println(pokemon2.getVitalidad());
		System.out.println(tablaTipoPokemon.mostrarEficaciaTipo(pokemon.getTipo(), pokemon2.getTipo()));
		System.out.println(pokemon.getEstamina());

	}
}
